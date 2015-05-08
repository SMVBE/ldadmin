package de.piratenpartei.webapp.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;

import de.piratenpartei.Constants;
import de.piratenpartei.model.lf.LFMember;
import de.piratenpartei.service.LFMemberService;

@Controller
@RequestMapping("/admin/newMembersSubmit")
public class NewMembersSubmitController extends BaseFormController {

	public NewMembersSubmitController() {
		super();
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request,
			@RequestParam(required = true, value = "file") String filename,
			@RequestParam(required = false, value = "go") boolean go)
			throws Exception {

		this.request = request;
		ArrayList<LFMember> memberlist = new ArrayList<LFMember>();
		File dir = new File(
				environment.getRequiredProperty("ldadmin.files.members.new"));
		if (!dir.exists())
			dir.mkdirs();
		File workList = new File(dir, filename);
		try {
			memberlist = lFMemberService.csvToLFMemberlist(workList,
					lFMemberService.getNewProcessors(),
					lFMemberService.getNewHeader(), request);
		} catch (org.supercsv.exception.SuperCsvConstraintViolationException csvex) {
			saveError(request, csvex.getLocalizedMessage());
			csvex.printStackTrace();
			return new ModelAndView("redirect:/admin/newMembers");
		} catch (Exception ex) {
			saveError(request, ex.getLocalizedMessage());
			ex.printStackTrace();
			return new ModelAndView("redirect:/admin/newMembers");
		}
		if (memberlist != null) {
			log.info(memberlist.size());
		} else {
			log.error("Memberlist not loaded");
		}
		model.addAttribute("memberList", memberlist);
		model.addAttribute("fileName", filename);

		// Process the list?
		if (go) {

			if (lFMemberService.checkMembersExistInLiquidFeedback(memberlist,
					true, request)) {
				lFMemberService.preRegisterAndInvite(memberlist, request);
				if (!lFMemberService.checkMembersExistInLiquidFeedback(
						memberlist, false, request)) {
					saveError(
							request,
							getText("ldadmin.members.submit.new.failed",
									request.getLocale()));
				}
			}
			// User user = getUserManager().getUser("1");

			log.error(request);
			sendUserMessage(
					environment
							.getRequiredProperty("ldadmin.lf.protocol.recipient"),
					writeReport(filename),
					environment.getRequiredProperty("ldadmin.lf.url"),
					getText("ldadmin.members.submit.new.report",
							request.getLocale()));

		} else {
			log.info("no go");
		}

		return new ModelAndView("admin/newMembersSubmit", model.asMap());
	}

	private String writeReport(String processedListName) {
		try {
			log.error(processedListName);
			ArrayList<String> messgs = null;
			if(request.getSession()!=null){
				if(request.getSession().getAttribute(Constants.SUCCESS_MESSAGES_KEY)!=null){
					messgs =(ArrayList<String>) request.getSession()
					.getAttribute(Constants.SUCCESS_MESSAGES_KEY);
				}else{
					log.error("");
				}
			}else{
				log.error("");
				messgs = new ArrayList<String>();
				messgs.add("Running as Service");
			}
					

			ArrayList<String> errors = null;
			
			if(request.getSession()!=null){
				if(request.getSession().getAttribute(Constants.ERRORS_MESSAGES_KEY)!=null){
					errors =(ArrayList<String>) request.getSession()
					.getAttribute(Constants.ERRORS_MESSAGES_KEY);
				}else{
					log.error("");
				}
			}else{
				log.error("");
				errors = new ArrayList<String>();
				errors.add("Running as Service");
			}
			File dir = new File(
					environment
							.getRequiredProperty("ldadmin.files.members.new")
							+ System.getProperty("file.separator")
							+ Constants.PROTOCOL);
			if (!dir.exists())
				dir.mkdirs();
			SimpleDateFormat sdf = new SimpleDateFormat(environment
					.getRequiredProperty("ldadmin.files.date").replace(":", "")
					.replace(" ", "_"));
			File workListProtocol = new File(dir, processedListName + "-"
					+ sdf.format(new Date()) + "-report.txt");
			FileWriter fw = new FileWriter(workListProtocol.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			String s = "";
			if (errors != null) {
				for (String string : errors) {
					bw.write(string + System.getProperty("line.separator"));
					s += string;
				}
			}
			if (messgs != null) {
				for (String string : messgs) {
					bw.write(string + System.getProperty("line.separator"));
					s += string;
				}
			}

			bw.close();
			return s;
		} catch (IllegalStateException e) {
			log.error(e);
		} catch (IOException e) {
			log.error(e);
		}

		return null;
	}
}
