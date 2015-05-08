package de.piratenpartei.webapp.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import de.piratenpartei.Constants;
import de.piratenpartei.dao.SearchException;

@Controller
@RequestMapping("/admin/newMembers")
public class NewMembersFileController extends BaseFormController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request,
			@RequestParam(required = false, value = "deleteFile") String fileName,
			@RequestParam(required = false, value = "protocol") String protocolFileName) {
		Model model = new ExtendedModelMap();
		this.request = request;

		try {
			File dir = new File(
					environment.getRequiredProperty("ldadmin.files.members.new"));
			if (!dir.exists())
				dir.mkdirs();

			fetchProtocols(protocolFileName, model, dir);

			if (fileName != null) {

				File workList = new File(dir, fileName);
				if (workList.exists()) {
					workList.delete();
					saveMessage(
							request,
							getText("ldadmin.files.deleted", fileName,
									request.getLocale()));
				} else {
					saveError(
							request,
							getText("ldadmin.files.notFound", fileName,
									request.getLocale()));
				}
			}

			SimpleDateFormat sdf = new SimpleDateFormat(
					environment.getRequiredProperty("ldadmin.files.date"));
			File[] fList = dir.listFiles();
			ArrayList<FileUpload> fqlist = new ArrayList<FileUpload>();
			if (fList != null && fList.length > 0) {
				for (File f : fList) {
					if (!f.isDirectory()) {
						fqlist.add(new FileUpload(f.getName(), f
								.getAbsolutePath(), sdf.format(new Date(f
								.lastModified())), (float) f.length() / 1000));
					}
				}
			}

			model.addAttribute(Constants.PROTOCOL_LIST, getProtocols(dir));
			model.addAttribute(Constants.FILE_LIST, fqlist);
		} catch (SearchException se) {
			model.addAttribute("searchError", se.getMessage());
			saveError(request, se.getLocalizedMessage());

		} catch (Exception e) {
			saveError(request, e.getLocalizedMessage());

		}
		return new ModelAndView("admin/newMembers", model.asMap());
	}
}
