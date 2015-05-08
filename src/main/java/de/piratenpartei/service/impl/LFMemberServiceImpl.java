package de.piratenpartei.service.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigInteger;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.helpers.FileWatchdog;
import org.apache.velocity.app.VelocityEngine;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.exception.DataAccessException;
import org.jooq.impl.DSL;
import org.liquidfeedback.generated.Tables;
import org.liquidfeedback.generated.routines.CleanIssue;
import org.liquidfeedback.generated.routines.DeleteMember;
import org.liquidfeedback.generated.tables.daos.InitiativeDao;
import org.liquidfeedback.generated.tables.daos.IssueDao;
import org.liquidfeedback.generated.tables.daos.MemberDao;
import org.liquidfeedback.generated.tables.pojos.Draft;
import org.liquidfeedback.generated.tables.pojos.Initiative;
import org.liquidfeedback.generated.tables.pojos.Issue;
import org.liquidfeedback.generated.tables.pojos.Member;
import org.liquidfeedback.generated.tables.records.ContactRecord;
import org.liquidfeedback.generated.tables.records.MemberImageRecord;
import org.liquidfeedback.generated.tables.records.MemberRecord;
import org.liquidfeedback.generated.tables.records.SessionRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.velocity.VelocityEngineUtils;
import org.supercsv.cellprocessor.constraint.StrRegEx;
import org.supercsv.cellprocessor.constraint.Unique;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;

import de.piratenpartei.Constants;
import de.piratenpartei.model.lf.LFMember;
import de.piratenpartei.service.LFMemberService;
import de.piratenpartei.service.MailEngine;

@Component
@Service("lFMemberService")
@PropertySource("classpath:application.properties")
public class LFMemberServiceImpl implements LFMemberService {
	Connection conn = null;
	DSLContext dsl = null;
	Locale lang = new Locale("de");
	String userName = null;
	String password = null;
	String url = null;
	private VelocityEngine velocityEngine;

	List<String> serviceMessages = new ArrayList<String>();
	List<String> serviceErrors = new ArrayList<String>();

	protected MailEngine mailEngine = null;
	protected SimpleMailMessage message = null;

	protected String templateName = "serviceMail.vm";
	protected String wikiTemplateName = "iniResultMediaWiki.vm";

	public void setMailEngine(MailEngine mailEngine) {
		this.mailEngine = mailEngine;
	}

	public void setVelocityEngine(VelocityEngine velocityEngine) {
		this.velocityEngine = velocityEngine;
	}

	@Autowired
	public void setMessage(SimpleMailMessage message) {
		this.message = message;
	}

	private MessageSourceAccessor messages;

	@Autowired
	public void setMessages(MessageSource messageSource) {
		messages = new MessageSourceAccessor(messageSource);
	}

	@Resource
	public Environment environment = null;

	final Log log = LogFactory.getLog(LFMemberServiceImpl.class);

	public LFMemberServiceImpl() {

		serviceMessages = new ArrayList<String>();
		serviceErrors = new ArrayList<String>();
	}

	@Autowired(required = true)
	public DSLContext getDsl() throws SQLException, IllegalStateException,
			InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		log.trace(conn);
		if (conn == null) {
			conn = getConnection();
		}
		if (conn.isClosed()) {
			conn = getConnection();
		}
		if (dsl == null) {
			getConnection();
		}
		return dsl;
	}

	/*
	 * @see de.piratenpartei.service.impl.LFMemberService#getConnection()
	 */
	@PostConstruct
	@Autowired(required = true)
	public Connection getConnection() throws IllegalStateException,
			InstantiationException, IllegalAccessException,
			ClassNotFoundException, SQLException {
		if (conn == null || conn.isClosed()) {
			log.warn("first call");

			userName = environment.getRequiredProperty("ldadmin.lf.db.user");
			password = environment
					.getRequiredProperty("ldadmin.lf.db.password");
			url = environment.getRequiredProperty("ldadmin.lf.db.url");
			log.info(userName + "  " + url);
			Class.forName("org.postgresql.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);
			dsl = DSL.using(conn, SQLDialect.POSTGRES);
		} else {
			log.info("conn is active");
			if (conn.isClosed()) {
				conn = DriverManager.getConnection(url, userName, password);
				dsl = DSL.using(conn, SQLDialect.POSTGRES);
			}
		}

		return conn;
	}

	public ArrayList<LFMember> csvToLFMemberlist(File csvFile,
			CellProcessor[] cellProcessor, String[] header,
			HttpServletRequest request) {
		log.info("start");
		ArrayList<LFMember> result = new ArrayList<LFMember>();

		try {
			// foo readahead to get check size
			ICsvBeanReader beanReader = null;
			beanReader = new CsvBeanReader(new FileReader(
					csvFile.getAbsolutePath()),
					CsvPreference.STANDARD_PREFERENCE);
			// the header elements are used to map the values to the bean
			// (names must match)
			log.trace("names must match : " + header.length);
			try {
				LFMember member;
				while ((member = beanReader.read(LFMember.class, header,
						cellProcessor)) != null) {
					log.info(String.format("lineNo=%s, rowNo=%s, member=%s",
							beanReader.getLineNumber(),
							beanReader.getRowNumber(), member));
					result.add(member);
				}
				if (beanReader != null) {
					beanReader.close();
				}
			} catch (org.supercsv.exception.SuperCsvConstraintViolationException e) {
				// catch here and close reader for moving
				beanReader.close();
				saveError(
						request,
						getText("ldadmin.members.submit.new.warn.some.invalid",
								new String[] {
										"" + e.getCsvContext().getRowNumber(),
										e.getLocalizedMessage() }, lang));
				log.error(e);
				return null;
			} catch (IllegalArgumentException e) {
				// catch here and close reader for moving
				beanReader.close();
				saveError(request, e.getLocalizedMessage());
				log.error(e);

				return null;
			}
		} catch (IOException e) {
			saveError(
					request,
					getText("ldadmin.members.submit.failed.io",
							new String[] { e.getLocalizedMessage() }, lang));
			e.printStackTrace();

		}
		log.info("end");
		return result;
	}

	public void sendServiceUserMessage(String email, String msg, String url,
			String subject) {
		log.info("sending e-mail to user [" + email + "]...");

		message.setTo(email);
		message.setSubject(subject);
		Map<String, Serializable> model = new HashMap<String, Serializable>();

		// TODO: once you figure out how to get the global resource bundle in
		// WebWork, then figure it out here too. In the meantime, the Username
		// and Password labels are hard-coded into the template.
		// model.put("bundle", getTexts());
		model.put("message", msg);
		model.put("applicationURL", url);
		mailEngine.sendMessage(message, templateName, model);
	}

	public boolean checkMembersIdentifiableInLiquidFeedback(
			ArrayList<LFMember> memberlist, boolean preTry,
			HttpServletRequest request, String method) {
		if (request != null)
			lang = request.getLocale();
		log.info("preTry? : " + preTry);
		boolean pass = false;

		try {

			this.getConnection();
			MemberDao mdao = new MemberDao();
			mdao.setConfiguration(this.getDsl().configuration());
			for (LFMember lfMember : memberlist) {
				log.info(lfMember.getAccreditation() + "   :  "
						+ composeIdentification(lfMember));
				List<Member> mbrs = mdao
						.fetchByIdentification(composeIdentification(lfMember));
				Member membr = mbrs.size() == 0 ? null : mbrs.get(0);
				if (membr == null) {
					if (!preTry) {
						log.info("");
						pass = true;
					} else {
						log.error("");
						saveError(
								request,
								getText("ldadmin.members.submit." + method
										+ ".failed.not.in.lf",
										lfMember.accreditation, lang));
						return false;
					}
				} else {
					if (!preTry) {
						log.error("exists : ");
						// TODO plausibilitätscheck member anonymisiert
						// emails weg aber search data und ident-string noch da.
						if (membr.getEmail() != null) {
							saveError(
									request,
									getText("ldadmin.members.submit." + method
											+ ".failed.not.deleted",
											lfMember.accreditation, lang));
							return false;
						} else {
							pass = true;
						}
					} else {
						log.info("" + lfMember.accreditation);
						// saveMessage(
						// request,
						// getText("ldadmin.members.submit.leaving.check.exists",
						// lfMember.identification,
						// request.getLocale()));
						pass = true;
					}
				}

			}
			this.getConnection().close();
		} catch (Exception e) {
			saveError(request, e.getLocalizedMessage());
			e.printStackTrace();
			log.error(e);
		}
		log.info(pass);
		if (serviceErrors.size() > 0) {
			pass = false;
			log.error(serviceErrors);
		}

		log.info(pass);
		return pass;
	}

	/**
	 * After sending the emails we check, whether the users exist in the
	 * database. was: email. now: accreditation
	 * 
	 * @param memberlist
	 */
	public boolean checkMembersExistInLiquidFeedback(
			ArrayList<LFMember> memberlist, boolean preTry,
			HttpServletRequest request) {
		if (request != null) {
			lang = request.getLocale();
		}
		log.info("");
		boolean pass = false;

		try {

			MemberDao mdao = new MemberDao();
			mdao.setConfiguration(this.getDsl().configuration());
			for (LFMember lfMember : memberlist) {
				log.info(lfMember.getAccreditation());
				log.info(composeIdentification(lfMember));
				List<Member> mbrs = mdao
						.fetchByIdentification(composeIdentification(lfMember));
				Member membr = mbrs.size() == 0 ? null : mbrs.get(0);
				if (membr == null) {
					if (preTry) {
						log.info("");
						pass = true;

					} else {
						log.error("");
						saveError(
								request,
								getText("ldadmin.members.submit.new.failed.not.preregistered.in.lf",
										lfMember.accreditation, lang));
						return false;
					}
				} else {
					if (preTry) {
						log.error("");
						saveError(
								request,
								getText("ldadmin.members.submit.new.failed.already.preregistered.in.lf",
										lfMember.accreditation, lang));
						return false;
					} else {
						log.info("");
						saveMessage(
								request,
								getText("ldadmin.members.submit.new.success.preregistered.in.lf",
										lfMember.accreditation, lang));
						pass = true;
					}
				}
			}
			this.getConnection().close();

		} catch (SQLException e) {
			saveError(request, e.getLocalizedMessage());
			log.error(e.getLocalizedMessage());
			pass = false;
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
			saveError(request, e.getLocalizedMessage());
			e.printStackTrace();
			pass = false;
		}
		return pass;
	}

	/**
	 * used for pseudonymisation of users
	 * 
	 * @return
	 */
	public String createRandom() {
		SecureRandom random = new SecureRandom();
		return new BigInteger(130, random).toString(32);
	}

	public void saveMessage(HttpServletRequest request, String text) {
		log.info(text);
		if (request != null) {
			List<String> messages = (List<String>) request.getSession()
					.getAttribute(Constants.SUCCESS_MESSAGES_KEY);

			if (messages == null) {
				messages = new ArrayList<String>();
			}
			messages.add(text);
			serviceMessages.add(text);
			request.getSession().setAttribute(Constants.SUCCESS_MESSAGES_KEY,
					messages);
		} else {

			serviceMessages.add(text + "\n");
		}
	}

	public void saveError(HttpServletRequest request, String text) {
		log.error(text);
		if (request != null) {
			List<String> errors = (List<String>) request.getSession()
					.getAttribute(Constants.ERRORS_MESSAGES_KEY);
			if (errors == null) {
				errors = new ArrayList<String>();
			}
			errors.add(text);
			serviceErrors.add(text);
			request.getSession().setAttribute(Constants.ERRORS_MESSAGES_KEY,
					errors);
		} else {

			serviceErrors.add(text);
		}
	}

	@Override
	public String getText(String msgKey, Locale locale) {
		return messages.getMessage(msgKey, locale);
	}

	/**
	 * Convenient method for getting a i18n key's value with a single string
	 * argument.
	 *
	 * @param msgKey
	 * @param arg
	 * @param locale
	 *            the current locale
	 * @return
	 */
	@Override
	public String getText(String msgKey, String arg, Locale locale) {
		return getText(msgKey, new Object[] { arg }, locale);
	}

	/**
	 * Convenience method for getting a i18n key's value with arguments.
	 *
	 * @param msgKey
	 * @param args
	 * @param locale
	 *            the current locale
	 * @return
	 */
	@Override
	public String getText(String msgKey, Object[] args, Locale locale) {
		log.trace(messages);
		log.trace(msgKey);
		log.trace(args);
		log.trace(locale);
		log.trace(messages.getMessage(msgKey, args, locale));
		return messages.getMessage(msgKey, args, locale) + "\n";
	}

	public void preRegisterAndInvite(ArrayList<LFMember> memberlist,
			HttpServletRequest request) throws Exception {
		// login
		WebClient webClient = new WebClient(BrowserVersion.FIREFOX_24);
		webClient.getOptions().setCssEnabled(false);
		webClient.getOptions().setJavaScriptEnabled(false);
		webClient.getOptions().setThrowExceptionOnScriptError(false);
		webClient.getOptions().setTimeout(
				Integer.parseInt(environment
						.getRequiredProperty("ldadmin.lf.timeout.ms")));
		HtmlPage page = webClient.getPage(environment
				.getRequiredProperty("ldadmin.lf.url")
				+ "index/login.html?redirect_module=index&redirect_view=index");

		log.info(environment.getRequiredProperty("ldadmin.lf.url"));

		log.info(environment.getRequiredProperty("ldadmin.lf.adminuser"));

		page.getForms().get(0);

		HtmlInput username = (HtmlInput) page.getElementById("username_field");
		HtmlInput password = page.getElementByName("password");
		username.setValueAttribute(environment
				.getRequiredProperty("ldadmin.lf.adminuser"));
		password.setValueAttribute(environment
				.getRequiredProperty("ldadmin.lf.adminpassword"));

		HtmlSubmitInput submit = (HtmlSubmitInput) page
				.getByXPath(
						"/html/body/div[2]/div[9]/div[2]/div/div/form/div/div[3]/input")
				.get(0);
		submit.click();

		// invite

		log.info("Processing " + memberlist.size());
		for (LFMember lfMember : memberlist) {
			try {

				webClient.getOptions().setTimeout(
						Integer.parseInt(environment
								.getRequiredProperty("ldadmin.lf.timeout.ms")));
				log.info("Member " + lfMember.getEmail());
				log.info(environment.getRequiredProperty("ldadmin.lf.url")
						+ "admin/member_edit.html");
				page = webClient.getPage(environment
						.getRequiredProperty("ldadmin.lf.url")
						+ "admin/member_edit.html");
				log.info(page);
				log.info(page.getTextContent());
				HtmlInput identification = page
						.getElementByName("identification");
				HtmlInput email = page.getElementByName("notify_email");
				HtmlInput unit = page.getElementByName(environment
						.getRequiredProperty("ldadmin.lf.unit.default"));
				HtmlInput invite = page.getElementByName("invite_member");
				identification
						.setValueAttribute(composeIdentification(lfMember));
				email.setValueAttribute(lfMember.getEmail());
				invite.setChecked(true);
				unit.setChecked(true);
				submit = (HtmlSubmitInput) page
						.getByXPath(
								"/html/body/div[2]/div[9]/div[2]/div/form/div[2]/input")
						.get(0);
				submit.click();

			} catch (SocketTimeoutException ste) {
				ste.printStackTrace();
				saveMessage(
						request,
						getText("ldadmin.members.submit.new.timeout",
								new String[] {
										lfMember.accreditation,
										environment
												.getRequiredProperty("ldadmin.lf.timeout.ms") },
								lang));
			}

			catch (Exception e) {
				e.printStackTrace();
				saveError(
						request,
						getText("ldadmin.members.submit.new.failed.not.invited.to.lf",
								lfMember.accreditation, lang));

			}
		}

	}

	private String composeIdentification(LFMember lfMember) {
		return lfMember.getLastname() + ", " + lfMember.getFirstname() + ", "
				+ lfMember.getMembernumber() + ", "
				+ lfMember.getAccreditation();
	}

	/**
	 * See comments in LF / postgres functions delete_private data:
	 * 
	 * "Used by lf_export script. DO NOT USE on productive database, but only on
	 * a copy! This function deletes all data which should not be publicly
	 * available, and can be used to create a database dump for publication. See
	 * source code to see which data is deleted. If you need a different
	 * behaviour, copy this function and modify lf_export accordingly, to avoid
	 * data-leaks after updating."
	 * 
	 * and delete_member:
	 * 
	 * "Deactivate member and clear certain settings and data of this member
	 * (data protection)"
	 * 
	 * @param memberlist
	 */
	public void deleteMembers(ArrayList<LFMember> memberlist,
			HttpServletRequest request) {
		try {
			log.info("start");
			getConnection();
			MemberDao mdao = new MemberDao();
			mdao.setConfiguration(getDsl().configuration());

			for (LFMember lfMember : memberlist) {
				log.info(lfMember.getAccreditation());
				log.info(composeIdentification(lfMember));
				Member mbr = mdao
						.fetchOneByIdentification(composeIdentification(lfMember));
				DeleteMember dm = new DeleteMember();
				dm.setMemberIdP(mbr.getId());
				log.info(dm.execute(getDsl().configuration()) + mbr.getEmail()
						+ lfMember.getAccreditation());
				saveMessage(
						request,
						getText("ldadmin.members.submit.leaving.delete.done",
								lfMember.accreditation, lang));
			}
			getConnection().close();
			log.info("end");
		} catch (Exception e) {
			saveError(request, "database.error :" + e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Beim Verlassen des Systems wird der Nickname pseudonymisiert. Name,
	 * Emailadresse, Mitgliedsnummer, Akkreditierungsdatum, Kontakte, Profiltext
	 * und Bild werden gelöscht. Koppelungen des Stimmgewichts bleiben bestehen
	 * und werden , tbd, erst nach Ablauf der Nachvollziehbarkeitsfrist
	 * gelöscht. ldadmin.lf.automatic.deletion.revison.period.minutes Wert
	 * gesetz in member.admin_comment 60 days= 86400 minutes
	 */
	public void setPseudonymsToMembers(ArrayList<LFMember> memberlist,
			HttpServletRequest request) {
		try {
			log.info("start");
			if (request != null) {
				lang = request.getLocale();
			}
			getConnection();
			DSLContext create = getDsl();
			MemberDao mdao = new MemberDao();
			mdao.setConfiguration(create.configuration());
			for (LFMember lfMember : memberlist) {
				// MemberTable
				MemberRecord mrecord = (MemberRecord) create.fetchOne(create
						.select()
						.from(Tables.MEMBER)
						.where(Tables.MEMBER.IDENTIFICATION
								.eq(composeIdentification(lfMember))));
				String random = createRandom();
				Integer mid = mrecord.getId();
				mrecord.setRealname(random);
				mrecord.setLastLogin(null);
				mrecord.setLogin(random);
				mrecord.setName(random);
				mrecord.setEmail(null);
				mrecord.setPassword(null);
				mrecord.setNotifyEmail(null);
				mrecord.setAuthorityUid(null);
				mrecord.setAuthorityLogin(null);
				mrecord.setLocked(true);
				mrecord.setActive(false);
				mrecord.setLastActivity(null);
				mrecord.setActivated(null);
				mrecord.setNotifyEmailUnconfirmed(null);
				mrecord.setNotifyEmailSecret(null);
				mrecord.setNotifyEmailSecretExpiry(null);
				mrecord.setLoginRecoveryExpiry(null);
				mrecord.setPasswordResetSecret(null);
				mrecord.setPasswordResetSecretExpiry(null);
				mrecord.setOrganizationalUnit(null);
				mrecord.setInternalPosts(null);
				mrecord.setBirthday(null);
				mrecord.setAddress(null);
				mrecord.setMobilePhone(null);
				mrecord.setXmppAddress(null);
				mrecord.setWebsite(null);
				mrecord.setPhone(null);
				mrecord.setProfession(null);
				mrecord.setExternalMemberships(null);
				mrecord.setExternalPosts(null);
				mrecord.setStatement(null);

				mrecord.setIdentification(null);
				mrecord.setInviteCode(createRandom());
				// mrecord.setPassword(createRandomPseudonym());

				// store tobedeletetat in lang field
				mrecord.setAdminComment("deleteAt:"
						+ (System.currentTimeMillis() + (1000l * 60 * Long.parseLong(environment
								.getRequiredProperty("ldadmin.lf.automatic.deletion.revison.period.minutes")))));
				mrecord.changed(true);
				mrecord.update();
				// check
				Member mbr = mdao.fetchOneById(mid);

				// remove active session
				Result<Record> sessions = create.fetch(create.select()
						.from(Tables.SESSION)
						.where(Tables.SESSION.MEMBER_ID.eq(mid.longValue())));
				for (Record r : sessions) {
					log.trace("" + r.toString());
					SessionRecord sessRecord = r.into(SessionRecord.class);
					log.warn("deleted active session for user " + mid + "  "
							+ sessRecord.delete());
				}

				// vote table: nothing to do as this is a ref to member table
				// contacts
				Result<Record> contacts = create.fetch(create.select()
						.from(Tables.CONTACT)
						.where(Tables.CONTACT.MEMBER_ID.eq(mid)));

				for (Record r : contacts) {
					log.trace("" + r.toString());
					ContactRecord contactRecord = r.into(ContactRecord.class);
					log.warn("deleted contact for  user " + mid + "  "
							+ contactRecord.delete());
				}
				// image
				Result<Record> images = create.fetch(create.select()
						.from(Tables.MEMBER_IMAGE)
						.where(Tables.MEMBER_IMAGE.MEMBER_ID.eq(mid)));

				for (Record r : images) {
					log.trace("" + r.toString());
					MemberImageRecord imageRecord = r
							.into(MemberImageRecord.class);
					log.warn("deleted image for  user " + mid + "  "
							+ imageRecord.delete());

				}

				saveMessage(
						request,
						getText("ldadmin.members.submit.pseudonym.change.done",
								new String[] {
										lfMember.accreditation
												+ " internal ID " + mbr.getId()
												+ "\n", mbr.getAdminComment() },
								lang));
			}
			getConnection().close();
		} catch (Exception e) {
			saveError(request, "database.error");
			e.printStackTrace();
			log.error(e);
		}
	}

	/**
	 * not in use
	 * 
	 * @param memberlist
	 * @param request
	 */
	public void setPseudonymsToMembersAndKeep(ArrayList<LFMember> memberlist,
			HttpServletRequest request) {
		try {
			log.info("start");
			if (request != null) {
				lang = request.getLocale();
			}
			getConnection();
			DSLContext create = getDsl();
			MemberDao mdao = new MemberDao();
			mdao.setConfiguration(create.configuration());

			for (LFMember lfMember : memberlist) {
				MemberRecord mrecord = (MemberRecord) create.fetchOne(create
						.select()
						.from(Tables.MEMBER)
						.where(Tables.MEMBER.IDENTIFICATION
								.eq(composeIdentification(lfMember))));
				String ra = createRandom();
				mrecord.setRealname(ra);
				mrecord.setLogin(ra);
				// mrecord.setPassword(createRandomPseudonym());
				mrecord.update();
				// check
				Member mbr = mdao
						.fetchOneByIdentification(composeIdentification(lfMember));
				log.info(mbr.getLogin());
				log.info(mbr.getRealname());

				saveMessage(
						request,
						getText("ldadmin.members.submit.pseudonym.change.done",
								lfMember.accreditation
										+ " testing - new login / display name: "
										+ mbr.getLogin() + " realname "
										+ mbr.getRealname() + "\n", lang));
			}
			getConnection().close();
		} catch (Exception e) {
			saveError(request, "database.error");
			e.printStackTrace();
		}
	}

	/**
	 * used for reading new cvs files
	 */
	public CellProcessor[] getNewProcessors() {

		final String emailRegex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		StrRegEx.registerMessage(emailRegex, "must be a valid email address");

		final CellProcessor[] processors = new CellProcessor[] { new Unique(), // email
				null, // lastname no conditions apply
				null, // firstname no conditions apply
				new Unique(), // memberNumber
				new Unique() // accreditation
		};

		return processors;
	}

	/**
	 * used for reading leaving and to be pseudonymized member cvs files
	 */
	public CellProcessor[] getProcessors() {

		final CellProcessor[] processors = new CellProcessor[] { null, // lastname
																		// no
																		// conditions
																		// apply
				null, // firstname no conditions apply
				new Unique(), // memberNumber
				new Unique() // accreditation
		};

		return processors;
	}

	public String[] getNewHeader() {
		return new String[] { "email", "lastname", "firstname", "membernumber",
				"accreditation" };
	}

	public String[] getHeader() {
		return new String[] { "lastname", "firstname", "membernumber",
				"accreditation" };
	}

	@Override
	public void writeServiceExecutionLogAndWipe(BufferedWriter bw)
			throws IOException {

		for (String string : serviceMessages) {
			bw.write(string);
		}
		for (String string : serviceErrors) {
			bw.write(string);
		}

		serviceErrors = new ArrayList<String>();

		serviceMessages = new ArrayList<String>();
	}

	public void sendServiceUserMessage(String email, File msg, String url,
			String subject) throws IOException {
		String txt = "";
		List<String> lines = Files.readAllLines(
				Paths.get(msg.getAbsolutePath()), StandardCharsets.UTF_8);
		for (String string : lines) {
			txt += string + System.getProperty("line.separator");
		}
		sendServiceUserMessage(email, txt, url, subject);
		this.serviceErrors = new ArrayList<String>();
		this.serviceMessages = new ArrayList<String>();
	}

	/**
	 * fetches those members whose revision period has expired
	 * 
	 * @see LFMemberServiceImpl#setPseudonymsToMembers(ArrayList,
	 *      javax.servlet.http.HttpServletRequest)
	 */
	public ArrayList<Member> getMembersScheduledForDeletion() {

		log.info("start");
		ArrayList<Member> membersToBeDeleted = new ArrayList<Member>();
		try {
			DSLContext create = getDsl();
			Result<Record> meberRecords = (Result<Record>) create
					.fetch(create
							.select()
							.from(Tables.MEMBER)
							.where(Tables.MEMBER.ADMIN_COMMENT
									.startsWith("deleteAt:")));
			for (Record record : meberRecords) {
				Member m = record.into(Member.class);
				String dte = m.getAdminComment().substring(9);
				log.info(dte);
				Long endOfRevision = Long.parseLong(dte);
				log.info(endOfRevision);
				log.info(System.currentTimeMillis());
				if (System.currentTimeMillis() > endOfRevision) {
					log.info("Time has come");
					membersToBeDeleted.add(m);
				} else {
					log.info("Time has not yet come");
				}
			}
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (DataAccessException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		log.info("end");
		return membersToBeDeleted;
	}

	/**
	 * @return whether to send email or not (non-Javadoc)
	 * @see de.piratenpartei.service.LFMemberService#cleanIssues()
	 * 
	 */
	public boolean cleanIssues() {
		log.info("start");
		try {
			DSLContext create = getDsl();
			Timestamp cleanMeIfIWasClosedBefore = new Timestamp(
					(System.currentTimeMillis() - (1000l * 60l * Long.parseLong(environment
							.getRequiredProperty("ldadmin.lf.automatic.deletion.revison.period.minutes")))));

			log.info("" + cleanMeIfIWasClosedBefore);
			Result<Record> issueRecords = (Result<Record>) create.fetch(create
					.select()
					.from(Tables.ISSUE)
					.where(Tables.ISSUE.CLOSED.lessOrEqual(
							cleanMeIfIWasClosedBefore).and(
							Tables.ISSUE.CLEANED.isNull())));

			log.info("Issues to clean " + issueRecords.size());
			if (issueRecords.size() == 0) {
				// saveMessage(
				// null,
				// getText("ldadmin.automate.cleaning.issue.nothing.todo",
				// lang));
				return false;
			}
			for (Record record : issueRecords) {
				Issue iss = record.into(Issue.class);

				// well all of those ...
				if (iss.getCleaned() == null) {
					log.info("Time has come for issue " + iss.getId()
							+ "   state : " + iss.getState() + " policy : "
							+ iss.getPolicyId());
					CleanIssue ci = new CleanIssue();
					ci.setIssueIdP(iss.getId());
					log.info(ci.execute(getDsl().configuration()) + iss.getId());
					log.info(iss.getClosed().compareTo(
							cleanMeIfIWasClosedBefore));
					log.info("Limit \t\t" + cleanMeIfIWasClosedBefore);
					log.info("Issue closed \t" + iss.getClosed());
				} else {
					// unreachable
					log.warn("Already cleaned : " + iss.getId() + " at "
							+ iss.getCleaned());
				}

				IssueDao idao = new IssueDao(create.configuration());
				Issue justCleaned = idao.fetchOneById(iss.getId());
				log.info(justCleaned.getCleaned());
				if (justCleaned.getCleaned() != null) {
					// retrieve winner ini
					InitiativeDao iniDao = new InitiativeDao(
							create.configuration());
					List<Initiative> inis = iniDao.fetchByIssueId(justCleaned
							.getId());

					Map<String, Object> valuesForWiki = new HashMap<String, Object>();
					valuesForWiki.put("issueId", "" + justCleaned.getId());

					valuesForWiki.put("result", justCleaned.getState());

					valuesForWiki.put("discussed",
							justCleaned.getDiscussionTime());

					valuesForWiki.put("frozen", justCleaned.getFullyFrozen());

					valuesForWiki
							.put("halffrozen", justCleaned.getHalfFrozen());

					valuesForWiki.put("voted", justCleaned.getVotingTime());

					valuesForWiki.put("end", justCleaned.getClosed());

					valuesForWiki.put("issueSchulze",
							justCleaned.getStatusQuoSchulzeRank());

					for (Initiative initiative : inis) {
						if (initiative.getWinner()!=null) {
							log.info("The winnner is: " + initiative.getId());

							valuesForWiki.put("iniTitle", initiative.getName());
							valuesForWiki.put("yes",
									"" + initiative.getPositiveVotes());
							valuesForWiki.put("no",
									"" + initiative.getNegativeVotes());
							valuesForWiki
									.put("abstention",
											(justCleaned.getVoterCount()
													- initiative
															.getPositiveVotes() - initiative
														.getNegativeVotes())
													+ "");
							valuesForWiki.put("created",
									initiative.getCreated());
							if (initiative.getRevoked() != null) {
								valuesForWiki.put("canceled",
										initiative.getRevoked());
							}

							if (initiative.getSchulzeRank() != null) {
								valuesForWiki.put("iniSchulze",
										initiative.getSchulzeRank());
							}
							// get the Antragstext
							Record draftRec = create.fetchOne(create
									.select()
									.from(Tables.DRAFT)
									.where(Tables.DRAFT.INITIATIVE_ID
											.equal(initiative.getId()))
									.orderBy(Tables.DRAFT.INITIATIVE_ID.desc(),
											Tables.DRAFT.ID.desc()).limit(1)
									.offset(0));

							Draft draf = draftRec.into(Draft.class);
							log.info(draf.getContent());
							valuesForWiki.put("description", draf.getContent());
						} else {

							log.info("no winner info");
						}
						// document the drafts
						Result<Record> draftRecords = (Result<Record>) create
								.fetch(create
										.select()
										.from(Tables.DRAFT)
										.where(Tables.DRAFT.INITIATIVE_ID
												.equal(initiative.getId()))
										.orderBy(
												Tables.DRAFT.INITIATIVE_ID
														.desc(),
												Tables.DRAFT.ID.desc()));
						String drafs = "";
						for (Record draftRec : draftRecords) {
							Draft draf = draftRec.into(Draft.class);
							log.info(draf.getContent());
							drafs = drafs + "\n " + draf.getId() + " zu Ini "
									+ draf.getInitiativeId() + "  \n"
									+ draf.getContent() + "\n\n\n";
						}

						valuesForWiki.put("description", drafs);

					}
					String wikiDoc = VelocityEngineUtils
							.mergeTemplateIntoString(velocityEngine,
									wikiTemplateName, "UTF-8", valuesForWiki);

					saveMessage(
							null,
							getText("ldadmin.automate.cleaning.issue.done",
									new String[] {
											iss.getId() + "",
											justCleaned.getCleaned().toString(),
											wikiDoc }, lang));
				} else {
					saveError(
							null,
							getText("ldadmin.automate.cleaning.issue.failed",
									iss.getId() + "", lang));
				}

			}

			getConnection().close();
			return true;
		} catch (NullPointerException | IllegalStateException
				| InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			saveError(
					null,
					getText("ldadmin.automate.cleaning.issue.failed.other",
							e.getLocalizedMessage(), lang));

		}
		log.debug("end");
		return true;
	}

	@Override
	public void deleteMembersScheduledForDeletion(
			ArrayList<Member> futureExMembers) {

		log.debug("start");

		for (Member member : futureExMembers) {
			DeleteMember dm = new DeleteMember();
			dm.setMemberIdP(member.getId());
			try {
				String s = dm.execute(getDsl().configuration()) + " "
						+ member.getAdminComment();
				log.warn(s);
				getDsl().update(Tables.MEMBER)
						.set(Tables.MEMBER.ADMIN_COMMENT,
								"Member exit : "
										+ new Date(System.currentTimeMillis()))
						.where(Tables.MEMBER.ID.equal(member.getId()))
						.execute();
				saveMessage(null, s);

			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		log.debug("end");

	}

	@Override
	public boolean documentInitiatives() {
		log.info("start");
		try {
			DSLContext create = getDsl();
			Timestamp cleanMeIfIWasClosedBeforeNow = new Timestamp(
					(System.currentTimeMillis()));

			log.info("" + cleanMeIfIWasClosedBeforeNow);
			Result<Record> issueRecords = (Result<Record>) create.fetch(create
					.select()
					.from(Tables.ISSUE)
					.where(Tables.ISSUE.CLOSED
							.lessOrEqual(cleanMeIfIWasClosedBeforeNow)));

			log.info("Issues to document " + issueRecords.size());
			if (issueRecords.size() == 0) {
				log.debug("");
				return false;
			}
			for (Record record : issueRecords) {
				Issue iss = record.into(Issue.class);

				// well all of those ...
				log.info("Documenting " + iss.getId() + "   state : "
						+ iss.getState() + " policy : " + iss.getPolicyId());
				IssueDao idao = new IssueDao(create.configuration());
				Issue wikiMe = idao.fetchOneById(iss.getId());
				log.info(wikiMe.getCleaned());
				if (wikiMe.getCleaned() != null) {
					// retrieve winner ini
					InitiativeDao iniDao = new InitiativeDao(
							create.configuration());
					List<Initiative> inis = iniDao.fetchByIssueId(wikiMe
							.getId());

					Map<String, Object> valuesForWiki = new HashMap<String, Object>();
					valuesForWiki.put("issueId", "" + wikiMe.getId());

					valuesForWiki.put("result", wikiMe.getState());

					valuesForWiki.put("discussed", wikiMe.getDiscussionTime());

					valuesForWiki.put("frozen", wikiMe.getFullyFrozen());

					valuesForWiki.put("halffrozen", wikiMe.getHalfFrozen());

					valuesForWiki.put("voted", wikiMe.getVotingTime());

					valuesForWiki.put("end", wikiMe.getClosed());

					valuesForWiki.put("issueSchulze",
							wikiMe.getStatusQuoSchulzeRank());

					for (Initiative initiative : inis) {
						if (initiative.getWinner()!=null) {
							log.info("The winnner is: " + initiative.getId());

							valuesForWiki.put("iniTitle", initiative.getName());
							valuesForWiki.put("yes",
									"" + initiative.getPositiveVotes());
							valuesForWiki.put("no",
									"" + initiative.getNegativeVotes());
							valuesForWiki
									.put("abstention",
											(wikiMe.getVoterCount()
													- initiative
															.getPositiveVotes() - initiative
														.getNegativeVotes())
													+ "");
							valuesForWiki.put("created",
									initiative.getCreated());
							if (initiative.getRevoked() != null) {
								valuesForWiki.put("canceled",
										initiative.getRevoked());
							}

							if (initiative.getSchulzeRank() != null) {
								valuesForWiki.put("iniSchulze",
										initiative.getSchulzeRank());
							}
							// get the Antragstext
							Record draftRec = create.fetchOne(create
									.select()
									.from(Tables.DRAFT)
									.where(Tables.DRAFT.INITIATIVE_ID
											.equal(initiative.getId()))
									.orderBy(Tables.DRAFT.INITIATIVE_ID.desc(),
											Tables.DRAFT.ID.desc()).limit(1)
									.offset(0));

							Draft draf = draftRec.into(Draft.class);
							log.info(draf.getContent());
							valuesForWiki.put("description", draf.getContent());
						} else {

							log.info("no winner info");
						}
						// document the drafts
						Result<Record> draftRecords = (Result<Record>) create
								.fetch(create
										.select()
										.from(Tables.DRAFT)
										.where(Tables.DRAFT.INITIATIVE_ID
												.equal(initiative.getId()))
										.orderBy(
												Tables.DRAFT.INITIATIVE_ID
														.desc(),
												Tables.DRAFT.ID.desc()));
						String drafs = "";
						for (Record draftRec : draftRecords) {
							Draft draf = draftRec.into(Draft.class);
							log.info(draf.getContent());
							drafs = drafs + "\n " + draf.getId() + " zu Ini "
									+ draf.getInitiativeId() + "  \n"
									+ draf.getContent() + "\n\n\n";
						}

						valuesForWiki.put("description", drafs);

					}
					String wikiDoc = VelocityEngineUtils
							.mergeTemplateIntoString(velocityEngine,
									wikiTemplateName, "UTF-8", valuesForWiki);
					
					saveMessage(
							null,
							getText("ldadmin.automate.documentation.initiative.done",

							iss.getId() + "", lang));
				} else {
					saveError(
							null,
							getText("ldadmin.automate.documentation.initiative.failed",
									iss.getId() + "", lang));
				}

			}

			getConnection().close();
			return true;
		} catch (NullPointerException | IllegalStateException
				| InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			saveError(
					null,
					getText("ldadmin.automate.cleaning.issue.failed.other",
							e.getLocalizedMessage(), lang));

		}
		log.debug("end");

		return false;
	}
}
