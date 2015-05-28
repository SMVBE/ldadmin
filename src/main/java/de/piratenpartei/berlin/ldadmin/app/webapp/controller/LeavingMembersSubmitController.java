package de.piratenpartei.berlin.ldadmin.app.webapp.controller;

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

import de.piratenpartei.berlin.ldadmin.app.Constants;
import de.piratenpartei.berlin.ldadmin.app.model.lf.LFMember;

@Controller
@RequestMapping("/admin/leavingMembersSubmit")
public class LeavingMembersSubmitController extends BaseFormController {

	public LeavingMembersSubmitController() {
		super();
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request,
			@RequestParam(required = true, value = "file") String filename,
			@RequestParam(required = false, value = "go") boolean go)
			throws Exception {
		ArrayList<LFMember> memberlist = new ArrayList<LFMember>();
		this.request = request;
		File dir = new File(
				environment.getRequiredProperty("ldadmin.files.members.leaving"));
		File workList = new File(dir, filename);
		try {
			memberlist = lFMemberService.csvToLFMemberlist(workList,
					lFMemberService.getProcessors(),
					lFMemberService.getHeader(),request);
		} catch (org.supercsv.exception.SuperCsvConstraintViolationException csvex) {
			saveError(request, csvex.getLocalizedMessage());
		} catch (Exception ex) {
			saveError(request, ex.getLocalizedMessage());
			ex.printStackTrace();
			return new ModelAndView("redirect:/admin/leavingMembers");
		}
		model.addAttribute("memberList", memberlist);
		model.addAttribute("fileName", filename);

		// Process the list?
		if (go) {
			log.info("go : " + go);
			if (lFMemberService.checkMembersIdentifiableInLiquidFeedback(
					memberlist, true, request, "leaving")) {
				log.info("");
				lFMemberService.deleteMembers(memberlist, request);
				log.info("");
				if (!lFMemberService.checkMembersIdentifiableInLiquidFeedback(
						memberlist, false, request, "leaving")) {
					log.info("");
					saveError(
							request,
							getText("ldadmin.members.submit.leaving.failed",
									request.getLocale()));
				}
			}
			// User user = getUserManager().getUser("1");
			sendUserMessage(
					environment
							.getRequiredProperty("ldadmin.lf.protocol.recipient"),
					writeReport(filename),
					environment.getRequiredProperty("ldadmin.lf.url"),
					getText("ldadmin.members.submit.leaving.report",
							request.getLocale()));

		} else {
			log.info("no go");
		}

		return new ModelAndView("admin/leavingMembersSubmit", model.asMap());
	}

	private String writeReport(String processedListName) {
		try {
			ArrayList<String> messgs = (ArrayList<String>) request.getSession()
					.getAttribute(Constants.SUCCESS_MESSAGES_KEY);
			ArrayList<String> errors = (ArrayList<String>) request.getSession()
					.getAttribute(Constants.ERRORS_MESSAGES_KEY);
			File dir = new File(
					environment
							.getRequiredProperty("ldadmin.files.members.leaving")
							+ System.getProperty("file.separator") + Constants.PROTOCOL);
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
