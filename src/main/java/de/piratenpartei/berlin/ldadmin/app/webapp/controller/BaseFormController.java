package de.piratenpartei.berlin.ldadmin.app.webapp.controller;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.validation.Validator;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;

import de.piratenpartei.berlin.ldadmin.app.Constants;
import de.piratenpartei.berlin.ldadmin.app.model.User;
import de.piratenpartei.berlin.ldadmin.app.service.LFMemberService;
import de.piratenpartei.berlin.ldadmin.app.service.MailEngine;
import de.piratenpartei.berlin.ldadmin.app.service.UserManager;

/**
 * Implementation of <strong>SimpleFormController</strong> that contains
 * convenience methods for subclasses. For example, getting the current user and
 * saving messages/errors. This class is intended to be a base class for all
 * Form controllers.
 *
 * <p>
 * <a href="BaseFormController.java.html"><i>View Source</i></a>
 * </p>
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */
@PropertySource("classpath:application.properties")
public class BaseFormController implements ServletContextAware {
	
	protected final transient Log log = LogFactory.getLog(getClass());
	private UserManager userManager = null;
	protected MailEngine mailEngine = null;
	protected SimpleMailMessage message = null;
	protected String templateName = "accountCreated.vm";
	protected String cancelView;
	protected String successView;
	private MessageSourceAccessor messages;
	private ServletContext servletContext;

	LFMemberService lFMemberService = null;

	@Autowired
	public void setLFMemberService(LFMemberService lFMemberService) {
		this.lFMemberService = lFMemberService;
	}

	@Autowired(required = false)
	Validator validator;
	protected Model model = new ExtendedModelMap();
	protected HttpServletRequest request;

	protected String userName = null;
	protected String password = null;
	protected String url = null;

	@Resource
	public Environment environment;

	@Autowired
	public void setMessages(MessageSource messageSource) {
		messages = new MessageSourceAccessor(messageSource);
	}

	@Autowired
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public UserManager getUserManager() {
		return this.userManager;
	}
	
	public File[] getProtocols(File dir){
		File protDir = new File(dir, Constants.PROTOCOL);
		if(!protDir.exists()){
			protDir.mkdirs();
		}
		//get automated protocols
		File autoProtocol = new File(dir, Constants.AUTOMATED+System.getProperty("file.separator")+Constants.PROTOCOL);
		log.info(autoProtocol.getAbsolutePath());
		FileFilter txtOnlyFilter = new FileFilter() {
			public boolean accept(File file) {
				return (file.isFile() && file.getName().endsWith(".txt"));
			}
		};
		File []autoProtocols =  autoProtocol.listFiles(txtOnlyFilter);
		return ArrayUtils.addAll(protDir.listFiles(),autoProtocols);
	}

	
	
	@SuppressWarnings("unchecked")
	public void saveError(HttpServletRequest request, String error) {
//		List errors = (List) request.getSession().getAttribute(
//				Constants.ERRORS_MESSAGES_KEY);
//		if (errors == null) {
//			errors = new ArrayList();
//		}
//		errors.add(error);
//		request.getSession().setAttribute(Constants.ERRORS_MESSAGES_KEY, errors);
		lFMemberService.saveError(request, error);
	}

	@SuppressWarnings("unchecked")
	public void saveMessage(HttpServletRequest request, String msg) {
		// List messages = (List) request.getSession().getAttribute(
		// Constants.SUCCESS_MESSAGES_KEY);
		//
		// if (messages == null) {
		// messages = new ArrayList();
		// }
		// messages.add(msg);
		// request.getSession().setAttribute(Constants.SUCCESS_MESSAGES_KEY, messages);
		lFMemberService.saveMessage(request, msg);
	}

	/**
	 * Convenience method for getting a i18n key's value. Calling
	 * getMessageSourceAccessor() is used because the RequestContext variable is
	 * not set in unit tests b/c there's no DispatchServlet Request.
	 *
	 * @param msgKey
	 * @param locale
	 *            the current locale
	 * @return
	 */
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
	public String getText(String msgKey, Object[] args, Locale locale) {
		log.info(messages);
		log.info(msgKey);
		log.info(args);
		log.info(locale);
		log.info(messages.getMessage(msgKey, args, locale));
		return messages.getMessage(msgKey, args, locale);
	}

	/**
	 * Convenience method to get the Configuration HashMap from the servlet
	 * context.
	 *
	 * @return the user's populated form from the session
	 */
	@SuppressWarnings("rawtypes")
	public Map getConfiguration() {
		Map config = (HashMap) servletContext.getAttribute(Constants.CONFIG);

		// so unit tests don't puke when nothing's been set
		if (config == null) {
			return new HashMap();
		}

		return config;
	}

	/**
	 * Set up a custom property editor for converting form inputs to real
	 * objects
	 * 
	 * @param request
	 *            the current request
	 * @param binder
	 *            the data binder
	 */
	@InitBinder
	protected void initBinder(HttpServletRequest request,
			ServletRequestDataBinder binder) {
		binder.registerCustomEditor(Integer.class, null,
				new CustomNumberEditor(Integer.class, null, true));
		binder.registerCustomEditor(Long.class, null, new CustomNumberEditor(
				Long.class, null, true));
		binder.registerCustomEditor(byte[].class,
				new ByteArrayMultipartFileEditor());
		log.trace(request.getLocale());
		log.trace(getText("date.format", request.getLocale()));
		SimpleDateFormat dateFormat = new SimpleDateFormat(getText(
				"date.format", request.getLocale()));
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, null, new CustomDateEditor(
				dateFormat, true));
	}

	/**
	 * Convenience message to send messages to users, includes app URL as
	 * footer.
	 * 
	 * @param user
	 *            the user to send a message to.
	 * @param msg
	 *            the message to send.
	 * @param url
	 *            the URL of the application.
	 */
	protected void sendUserMessage(User user, String msg, String url) {
		log.info("sending e-mail to user [" + user.getEmail() + "]...");

		message.setTo(user.getFullName() + "<" + user.getEmail() + ">");

		Map<String, Serializable> model = new HashMap<String, Serializable>();
		model.put("user", user);

		// TODO: once you figure out how to get the global resource bundle in
		// WebWork, then figure it out here too. In the meantime, the Username
		// and Password labels are hard-coded into the template.
		// model.put("bundle", getTexts());
		model.put("message", msg);
		model.put("applicationURL", url);
		mailEngine.sendMessage(message, templateName, model);
	}

	protected void sendUserMessage(String email, String msg, String url,
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

	@Autowired
	public void setMailEngine(MailEngine mailEngine) {
		this.mailEngine = mailEngine;
	}

	@Autowired
	public void setMessage(SimpleMailMessage message) {
		this.message = message;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public final BaseFormController setCancelView(String cancelView) {
		this.cancelView = cancelView;
		return this;
	}

	public final String getCancelView() {
		// Default to successView if cancelView is invalid
		if (this.cancelView == null || this.cancelView.length() == 0) {
			return getSuccessView();
		}
		return this.cancelView;
	}

	public final String getSuccessView() {
		return this.successView;
	}

	public final BaseFormController setSuccessView(String successView) {
		this.successView = successView;
		return this;
	}

	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	protected ServletContext getServletContext() {
		return servletContext;
	}

	/**
	 * @param protocolFileName
	 * @param model
	 * @param dir
	 * @throws IOException
	 */
	protected void fetchProtocols(String protocolFileName, Model model, File dir)
			throws IOException {
				if (protocolFileName != null) {
					String pFile = dir.getAbsolutePath()
					+ System.getProperty("file.separator") + Constants.PROTOCOL
					+ System.getProperty("file.separator")
					+ protocolFileName;
					if ( !new File(pFile).exists()){
						pFile = dir.getAbsolutePath()
								+ System.getProperty("file.separator")+ Constants.AUTOMATED
								+ System.getProperty("file.separator") + Constants.PROTOCOL
								+ System.getProperty("file.separator")
								+ protocolFileName;
					}
					log.info(pFile);
					List<String> lines = Files.readAllLines(
							Paths.get(pFile), StandardCharsets.UTF_8);
					model.addAttribute(Constants.PROTOCOL, lines);
				}
			}
}
