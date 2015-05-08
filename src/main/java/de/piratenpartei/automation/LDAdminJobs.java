package de.piratenpartei.automation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.liquidfeedback.generated.tables.pojos.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import de.piratenpartei.Constants;
import de.piratenpartei.model.lf.LFMember;
import de.piratenpartei.service.LFMemberService;
import de.piratenpartei.service.impl.LFMemberServiceImpl;

@Component("jobBean")
@PropertySource("classpath:application.properties")
public class LDAdminJobs {
	protected final transient Log log = LogFactory.getLog(getClass());

	LFMemberService lFMemberService = null;

	@Resource
	public Environment environment;

	public synchronized void autoexecNewMembersList() {
		File automateDir = new File(
				environment.getRequiredProperty("ldadmin.files.members.new"),
				Constants.AUTOMATED);
		File doneDir = new File(automateDir, "done");
		File protocolDir = new File(automateDir, Constants.PROTOCOL);
		File csvFile = null;
		boolean sendReport = true;
		if (Boolean.parseBoolean(environment.getProperty(
				"ldadmin.lf.automatic.list.processing.new", "false"))) {
			log.trace("Start");

			// get the LF Memberlist File ldadmin.files.members.new

			if (!protocolDir.exists()) {
				protocolDir.mkdirs();
				log.warn("direcotory was not present, created "
						+ protocolDir.getAbsolutePath());

			}
			if (!automateDir.exists()) {
				automateDir.mkdirs();
				log.warn("direcotory was not present, created "
						+ automateDir.getAbsolutePath());

			}

			// verify only one file for autoexec exists, else email
			FileFilter csvFilesOnlyFilter = new FileFilter() {
				public boolean accept(File file) {
					return (file.isFile() && file.getName().endsWith(".csv"));
				}
			};
			File[] autoExecList = automateDir.listFiles(csvFilesOnlyFilter);
			SimpleDateFormat sdf = new SimpleDateFormat(environment
					.getRequiredProperty("ldadmin.files.date").replace(":", "")
					.replace(" ", "_"));
			switch (autoExecList.length) {
			case 0:
				// msg += lFMemberService.getText("ldadmin.automate.dir.empty",
				// automateDir.getAbsolutePath(), new Locale("de"));
				log.trace("");
				// message(lFMemberService.getText("ldadmin.automate.dir.empty",
				// new Locale("de")));

				return;
			case 1:
				// RandomAccessFile randomAccessFile = null;
				try {
					csvFile = autoExecList[0];
					log.info(csvFile);
					// time to get started?
					long delta = (System.currentTimeMillis() - csvFile
							.lastModified());
					// ldadmin.lf.automatic.list.processing.intervall.ms
					long delay = Long
							.parseLong(environment
									.getRequiredProperty("ldadmin.lf.automatic.list.processing.intervall.ms"));
					if (delta > delay) {
						// TODO file locking for long file uploads?
						// do sth
						ArrayList<LFMember> futureMembers = null;
						try {
							// get the list
							futureMembers = lFMemberService.csvToLFMemberlist(
									csvFile,
									lFMemberService.getNewProcessors(),
									lFMemberService.getNewHeader(), null);
							// check, invite, recheck
							if (lFMemberService
									.checkMembersExistInLiquidFeedback(
											futureMembers, true, null)) {
								lFMemberService.preRegisterAndInvite(
										futureMembers, null);
								if (!lFMemberService
										.checkMembersExistInLiquidFeedback(
												futureMembers, false, null)) {
									error(lFMemberService
											.getText(
													"ldadmin.members.submit.new.failed",
													new Locale("de")));
								}
							}

						} catch (org.supercsv.exception.SuperCsvConstraintViolationException csvex) {
							error(csvex.getLocalizedMessage());
							log.error(csvex);
							break;
						} catch (IllegalArgumentException iaex) {
							log.warn(iaex + "File not accepted");
							iaex.printStackTrace();

						} catch (Exception ex) {
							error(ex.getLocalizedMessage());
							log.error(ex);

							break;
						}
						// release
						// lock.close();
						// randomAccessFile.close();
						// msg += lFMemberService.getText(
						// "ldadmin.automate.file.released", new Locale(
						// "de"));

						// move

						FileUtils.moveFile(
								csvFile,
								new File(doneDir.getAbsolutePath(), sdf
										.format(new Date())
										+ "_"
										+ csvFile.getName()));

					} else {
						log.info("" + delta + "  " + delay);
						sendReport = false;
					}
				} catch (IOException e) {
					e.printStackTrace();
					error(lFMemberService.getText("ldadmin.automate.dir.empty",
							new Locale("de")));
					sendReport = true;

				}
				break;
			default:

				error(lFMemberService.getText(
						"ldadmin.automate.only.one.file.allowed", new Locale(
								"de")));
				log.error("");
				sendReport = true;

			}

		} else {
			log.debug("ldadmin.lf.automatic.list.processing.new not set");
			message(lFMemberService.getText(
					"ldadmin.lf.automatic.list.processing.new not set",
					new Locale("de")));
		}
		String s = csvFile == null ? "invalid-setup" : csvFile.getName();
		SimpleDateFormat sdf = new SimpleDateFormat(environment
				.getRequiredProperty("ldadmin.files.date").replace(":", "")
				.replace(" ", "_"));
		File protocolFile = new File(protocolDir, "autoexec-report-new-"
				+ sdf.format(new Date()) + "-" + s + ".txt");
		try {

			FileWriter fw = new FileWriter(protocolFile);
			BufferedWriter bw = new BufferedWriter(fw);
			lFMemberService.writeServiceExecutionLogAndWipe(bw);
			bw.close();
			if (sendReport) {
				lFMemberService.sendServiceUserMessage(environment
						.getRequiredProperty("ldadmin.lf.protocol.recipient"),
						protocolFile, environment
								.getRequiredProperty("ldadmin.lf.url"),
						lFMemberService.getText(
								"ldadmin.members.submit.new.report",
								new Locale("de")));
			}
		} catch (IOException e) {
			e.printStackTrace();
			log.error(e.getLocalizedMessage());
		}

		log.debug("End\n");
	}

	/**
	 * @see LFMemberServiceImpl#setPseudonymsToMembers(ArrayList,
	 *      javax.servlet.http.HttpServletRequest)
	 */
	public synchronized void autoexecPseudonymisationMembersList() {
		File automateDir = new File(
				environment
						.getRequiredProperty("ldadmin.files.members.pseudonym"),
				Constants.AUTOMATED);
		File doneDir = new File(automateDir, "done");
		File protocolDir = new File(automateDir, Constants.PROTOCOL);
		File csvFile = null;
		if (Boolean.parseBoolean(environment.getProperty(
				"ldadmin.lf.automatic.list.processing.pseudonym", "false"))) {
			log.trace("Start");

			// get the LF Memberlist File ldadmin.files.members.new

			if (!protocolDir.exists()) {
				protocolDir.mkdirs();
				log.warn("direcotory was not present, created "
						+ protocolDir.getAbsolutePath());

			}
			if (!automateDir.exists()) {
				automateDir.mkdirs();
				log.warn("direcotory was not present, created "
						+ automateDir.getAbsolutePath());

			}

			// verify only one file for autoexec exists, else email
			FileFilter csvFilesOnlyFilter = new FileFilter() {
				public boolean accept(File file) {
					return (file.isFile() && file.getName().endsWith(".csv"));
				}
			};
			File[] autoExecList = automateDir.listFiles(csvFilesOnlyFilter);
			SimpleDateFormat sdf = new SimpleDateFormat(environment
					.getRequiredProperty("ldadmin.files.date").replace(":", "")
					.replace(" ", "_"));
			switch (autoExecList.length) {
			case 0:
				log.trace("");
				return;
			case 1:
				try {
					csvFile = autoExecList[0];
					log.info(csvFile);
					// time to get started?
					long delta = (System.currentTimeMillis() - csvFile
							.lastModified());
					// ldadmin.lf.automatic.list.processing.intervall.ms
					long delay = Long
							.parseLong(environment
									.getRequiredProperty("ldadmin.lf.automatic.list.processing.intervall.ms"));
					if (delta > delay) {
						// do sth
						ArrayList<LFMember> pseudoMembers = null;
						try {
							// get the list
							pseudoMembers = lFMemberService.csvToLFMemberlist(
									csvFile, lFMemberService.getProcessors(),
									lFMemberService.getHeader(), null);
							// check, invite, recheck
							if (lFMemberService
									.checkMembersIdentifiableInLiquidFeedback(
											pseudoMembers, true, null,
											"pseudonym")) {
								log.info("");
								lFMemberService.setPseudonymsToMembers(
										pseudoMembers, null);
								log.info("");
								if (!lFMemberService
										.checkMembersIdentifiableInLiquidFeedback(
												pseudoMembers, false, null,
												"pseudonym")) {
									log.info("");
									error(lFMemberService
											.getText(
													"ldadmin.members.submit.pseudonym.failed",
													new Locale("de")));
								}
							}

						} catch (org.supercsv.exception.SuperCsvConstraintViolationException csvex) {
							error(csvex.getLocalizedMessage());
							log.error(csvex);
							break;
						} catch (IllegalArgumentException iaex) {
							log.warn(iaex + "File not accepted");
							iaex.printStackTrace();

						} catch (Exception ex) {
							error(ex.getLocalizedMessage());
							log.error(ex);

							break;
						}

						// move

						FileUtils.moveFile(
								csvFile,
								new File(doneDir.getAbsolutePath(), sdf
										.format(new Date())
										+ "_"
										+ csvFile.getName()));

					} else {
						log.info("" + delta + "  " + delay);
					}
				} catch (IOException e) {
					e.printStackTrace();
					error(lFMemberService.getText("ldadmin.automate.dir.empty",
							new Locale("de")));

				}
				break;
			default:

				error(lFMemberService.getText(
						"ldadmin.automate.only.one.file.allowed", new Locale(
								"de")));
				log.error("");
			}

		} else {
			log.debug("ldadmin.lf.automatic.list.processing.pseudonym not set");
			message(lFMemberService.getText(
					"ldadmin.lf.automatic.list.processing.pseudonym not set",
					new Locale("de")));
		}
		String s = csvFile == null ? "invalid-setup" : csvFile.getName();
		SimpleDateFormat sdf = new SimpleDateFormat(environment
				.getRequiredProperty("ldadmin.files.date").replace(":", "")
				.replace(" ", "_"));
		File protocolFile = new File(protocolDir, "autoexec-report-pseudonym-"
				+ sdf.format(new Date()) + "-" + s + ".txt");
		try {

			FileWriter fw = new FileWriter(protocolFile);
			BufferedWriter bw = new BufferedWriter(fw);
			lFMemberService.writeServiceExecutionLogAndWipe(bw);
			bw.close();
			lFMemberService.sendServiceUserMessage(environment
					.getRequiredProperty("ldadmin.lf.protocol.recipient"),
					protocolFile, environment
							.getRequiredProperty("ldadmin.lf.url"),
					lFMemberService.getText(
							"ldadmin.members.submit.pseudonym.report",
							new Locale("de")));
		} catch (IOException e) {
			e.printStackTrace();
			log.error(e.getLocalizedMessage());
		}

		log.debug("End\n");
	}

	public synchronized void autoexecIssuesCleaning() {
		log.debug("Start");
		// check if last day of month
		// workaround, as spring scheduled cron expressions do not support last
		// day of month (L)
		boolean sendEmail = true;
		Calendar c = Calendar.getInstance();
		if (c.get(Calendar.DAY_OF_MONTH) == c
				.getActualMaximum(Calendar.DAY_OF_MONTH)) {
			sendEmail = lFMemberService.cleanIssues();
		} else {
			log.warn("last day of month not reached, issues not cleaned");
			lFMemberService.saveMessage(null,
					"last day of month not reached, issues not cleaned");
			return;
		}

		File protocolDir = new File(
				environment.getRequiredProperty("ldadmin.files.cleaning"));
		if (!protocolDir.exists())
			protocolDir.mkdirs();
		SimpleDateFormat sdf = new SimpleDateFormat(environment
				.getRequiredProperty("ldadmin.files.date").replace(":", "")
				.replace(" ", "_"));
		File protocolFile = new File(protocolDir,
				"autoexec-scheduled-cleaning-" + sdf.format(new Date())
						+ ".txt");
		try {

			FileWriter fw = new FileWriter(protocolFile);
			BufferedWriter bw = new BufferedWriter(fw);
			if (!sendEmail) {
				lFMemberService.saveMessage(null, "nothing done");
			}
			lFMemberService.writeServiceExecutionLogAndWipe(bw);
			bw.close();
			if (sendEmail) {
				lFMemberService.sendServiceUserMessage(environment
						.getRequiredProperty("ldadmin.lf.protocol.recipient"),
						protocolFile, environment
								.getRequiredProperty("ldadmin.lf.url"),
						lFMemberService.getText(
								"ldadmin.automate.cleaning.report", new Locale(
										"de")));
			}
		} catch (IOException e) {
			e.printStackTrace();
			log.error(e.getLocalizedMessage());
		}
		log.debug("End");
	}

	/**
	 * writes report http://wiki.piratenpartei.de/Vorlage:SMVBErgebnis
	 * [PP#100103031] SMVB - Supportticket 2015-06 - Datenbankreport
	 * Ticketnummer - 2015-06 Ticketanliegen - Derzeit bekommen wir die bereits
	 * wikiformatierten Reports über Beschlüsse erst zu derren Löschung. Um die
	 * Dkoumentation zu beschleunigen, brauchen wir einen weiteren Report an uns
	 * zu einem früheren Zeitpunkt. in diesem Fall nach Abschluss einer
	 * Initiative.
	 */
	public synchronized void autoexecFinishedInitiativesDocumentation() {
		log.debug("Start");
		boolean sendEmail = true;
		sendEmail = lFMemberService.documentInitiatives();

		File protocolDir = new File(
				environment.getRequiredProperty("ldadmin.files.documentation"));
		if (!protocolDir.exists())
			protocolDir.mkdirs();
		SimpleDateFormat sdf = new SimpleDateFormat(environment
				.getRequiredProperty("ldadmin.files.date").replace(":", "")
				.replace(" ", "_"));
		File protocolFile = new File(protocolDir,
				"autoexec-scheduled-documentation-" + sdf.format(new Date())
						+ ".txt");
		try {

			FileWriter fw = new FileWriter(protocolFile);
			BufferedWriter bw = new BufferedWriter(fw);
			if (!sendEmail) {
				lFMemberService.saveMessage(null, "nothing done");
				log.debug("");
			}
			lFMemberService.writeServiceExecutionLogAndWipe(bw);
			bw.close();
			if (sendEmail) {
				log.debug("");
				lFMemberService.sendServiceUserMessage(environment
						.getRequiredProperty("ldadmin.lf.protocol.recipient"),
						protocolFile, environment
								.getRequiredProperty("ldadmin.lf.url"),
						lFMemberService.getText(
								"ldadmin.automate.documentation.report",
								new Locale("de")));
			}
		} catch (IOException e) {
			e.printStackTrace();
			log.error(e.getLocalizedMessage());
		}
		log.debug("End");
	}

	/**
	 * get list of members, that have passed the revision period and delete
	 * those members finally
	 * 
	 * @see LFMemberServiceImpl#setPseudonymsToMembers(ArrayList,
	 *      javax.servlet.http.HttpServletRequest)
	 * @return whether to send email
	 */
	public synchronized boolean autoexecMemberDeletion() {

		log.info("Start");
		// get list of members, that have passed the revision period

		// delete the members finally
		ArrayList<Member> futureExMembers = lFMemberService
				.getMembersScheduledForDeletion();

		try {
			if (futureExMembers != null && futureExMembers.size() > 0) {
				lFMemberService
						.deleteMembersScheduledForDeletion(futureExMembers);
			} else {
				message(lFMemberService
						.getText(
								"ldadmin.automate.members.deletion.report.nothing",
								environment
										.getRequiredProperty("ldadmin.lf.automatic.deletion.revison.period.minutes"),
								new Locale("de")));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		File automateDir = new File(
				environment
						.getRequiredProperty("ldadmin.files.members.leaving"),
				Constants.AUTOMATED);
		File protocolDir = new File(automateDir, Constants.PROTOCOL);
		SimpleDateFormat sdf = new SimpleDateFormat(environment
				.getRequiredProperty("ldadmin.files.date").replace(":", "")
				.replace(" ", "_"));
		File protocolFile = new File(protocolDir,
				"autoexec-scheduled-deletion-" + sdf.format(new Date())
						+ ".txt");
		try {

			FileWriter fw = new FileWriter(protocolFile);
			BufferedWriter bw = new BufferedWriter(fw);
			lFMemberService.writeServiceExecutionLogAndWipe(bw);
			bw.close();
			if (futureExMembers != null && futureExMembers.size() > 0) {
				lFMemberService.sendServiceUserMessage(environment
						.getRequiredProperty("ldadmin.lf.protocol.recipient"),
						protocolFile, environment
								.getRequiredProperty("ldadmin.lf.url"),
						lFMemberService.getText(
								"ldadmin.automate.members.deletion.report",
								new Locale("de")));
			}
		} catch (IOException e) {
			e.printStackTrace();
			log.error(e.getLocalizedMessage());
		}
		log.debug("End");
		return true;
	}

	/**
	 * execeuted at end of months if a member is pseudonymized, the member has
	 * to be deleted after a given period. end of revision period stored during
	 * pseudonymisation in hidden field member.admin_comment
	 * ldadmin.lf.automatic.deletion.revison.period.minutes 60 days= 86400
	 * minutes
	 */
	public synchronized void autoexecLeavingMembersList() {

		File automateDir = new File(
				environment
						.getRequiredProperty("ldadmin.files.members.leaving"),
				Constants.AUTOMATED);
		File doneDir = new File(automateDir, "done");
		File protocolDir = new File(automateDir, Constants.PROTOCOL);
		File csvFile = null;
		if (Boolean.parseBoolean(environment.getProperty(
				"ldadmin.lf.automatic.list.processing.leaving", "false"))) {
			log.trace("Start");

			// get the LF Memberlist File ldadmin.files.members.new

			if (!protocolDir.exists()) {
				protocolDir.mkdirs();
				log.warn("direcotory was not present, created "
						+ protocolDir.getAbsolutePath());

			}
			if (!automateDir.exists()) {
				automateDir.mkdirs();
				log.warn("direcotory was not present, created "
						+ automateDir.getAbsolutePath());

			}

			// verify only one file for autoexec exists, else email
			FileFilter csvFilesOnlyFilter = new FileFilter() {
				public boolean accept(File file) {
					return (file.isFile() && file.getName().endsWith(".csv"));
				}
			};
			File[] autoExecList = automateDir.listFiles(csvFilesOnlyFilter);
			SimpleDateFormat sdf = new SimpleDateFormat(environment
					.getRequiredProperty("ldadmin.files.date").replace(":", "")
					.replace(" ", "_"));
			switch (autoExecList.length) {
			case 0:
				log.trace("");
				return;
			case 1:
				try {
					csvFile = autoExecList[0];
					log.info(csvFile);
					// time to get started?
					long delta = (System.currentTimeMillis() - csvFile
							.lastModified());
					// ldadmin.lf.automatic.list.processing.intervall.ms
					long delay = Long
							.parseLong(environment
									.getRequiredProperty("ldadmin.lf.automatic.list.processing.intervall.ms"));
					if (delta > delay) {
						// do sth
						ArrayList<LFMember> futureExMembers = null;
						try {
							// get the list
							futureExMembers = lFMemberService
									.csvToLFMemberlist(csvFile,
											lFMemberService.getProcessors(),
											lFMemberService.getHeader(), null);
							// check, delete, recheck
							if (lFMemberService
									.checkMembersIdentifiableInLiquidFeedback(
											futureExMembers, true, null,
											"leaving")) {
								log.info("");
								lFMemberService.deleteMembers(futureExMembers,
										null);
								log.info("");
								if (!lFMemberService
										.checkMembersIdentifiableInLiquidFeedback(
												futureExMembers, false, null,
												"leaving")) {
									log.info("");
									error(lFMemberService
											.getText(
													"ldadmin.members.submit.leaving.failed",
													new Locale("de")));
								}
							}

						} catch (org.supercsv.exception.SuperCsvConstraintViolationException csvex) {
							error(csvex.getLocalizedMessage());
							log.error(csvex);
							break;
						} catch (IllegalArgumentException iaex) {
							log.warn(iaex + "File not accepted");
							iaex.printStackTrace();

						} catch (Exception ex) {
							error(ex.getLocalizedMessage());
							log.error(ex);

							break;
						}

						// move

						FileUtils.moveFile(
								csvFile,
								new File(doneDir.getAbsolutePath(), sdf
										.format(new Date())
										+ "_"
										+ csvFile.getName()));

					} else {
						log.info("" + delta + "  " + delay);
					}
				} catch (IOException e) {
					e.printStackTrace();
					error(lFMemberService.getText("ldadmin.automate.dir.empty",
							new Locale("de")));

				}
				break;
			default:

				error(lFMemberService.getText(
						"ldadmin.automate.only.one.file.allowed", new Locale(
								"de")));
				log.error("");
			}

		} else {
			log.debug("ldadmin.lf.automatic.list.processing.leaving not set");
			message(lFMemberService.getText(
					"ldadmin.lf.automatic.list.processing.leaving not set",
					new Locale("de")));
		}
		String s = csvFile == null ? "invalid-setup" : csvFile.getName();
		SimpleDateFormat sdf = new SimpleDateFormat(environment
				.getRequiredProperty("ldadmin.files.date").replace(":", "")
				.replace(" ", "_"));
		File protocolFile = new File(protocolDir, "autoexec-report-leaving-"
				+ sdf.format(new Date()) + "-" + s + ".txt");
		try {

			FileWriter fw = new FileWriter(protocolFile);
			BufferedWriter bw = new BufferedWriter(fw);
			lFMemberService.writeServiceExecutionLogAndWipe(bw);
			bw.close();
			lFMemberService.sendServiceUserMessage(environment
					.getRequiredProperty("ldadmin.lf.protocol.recipient"),
					protocolFile, environment
							.getRequiredProperty("ldadmin.lf.url"),
					lFMemberService.getText(
							"ldadmin.members.submit.leaving.report",
							new Locale("de")));
		} catch (IOException e) {
			e.printStackTrace();
			log.error(e.getLocalizedMessage());
		}

		log.debug("End\n");
	}

	private void error(String e) {
		lFMemberService.saveError(null, e);
	}

	private void message(String e) {
		lFMemberService.saveMessage(null, e);
	}

	/**
	 * recursive deltion of files only
	 * 
	 * @param f
	 * @param daysAgo
	 */
	private synchronized void delete(File f, long daysAgo) {
		if (f.isDirectory()) {
			log.trace("Checking " + f.getAbsolutePath());
			for (File l : f.listFiles()) {
				delete(l, daysAgo);
			}
		}
		if (f.lastModified() <= daysAgo) {
			if (f.isFile()) {
				f.delete();
				log.info("Deleting " + f.getAbsolutePath());
			}
		}
	}

	/**
	 * deletes protocol and other files older than
	 * <code>ldadmin.lf.log.dispose.after.days</code>
	 */
	public synchronized void deleteProtocolsAndWorkLists() {
		Integer days = Integer.parseInt(environment
				.getRequiredProperty("ldadmin.lf.log.dispose.after.days"));

		log.info("hindsight days : " + days);
		File dir = new File(
				environment.getRequiredProperty("ldadmin.files.members.new"));
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, -1 * new Integer(days));
		long daysAgo = cal.getTimeInMillis();
		delete(dir, daysAgo);
		dir = new File(
				environment
						.getRequiredProperty("ldadmin.files.members.leaving"));
		delete(dir, daysAgo);
		dir = new File(
				environment
						.getRequiredProperty("ldadmin.files.members.pseudonym"));
		delete(dir, daysAgo);

		dir = new File(
				environment.getRequiredProperty("ldadmin.files.cleaning"));
		delete(dir, daysAgo);
	}

	@Autowired
	public void setLFMemberService(LFMemberService lFMemberService) {
		this.lFMemberService = lFMemberService;
	}

}
