package de.piratenpartei.webapp.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import de.piratenpartei.Constants;

@Controller
@RequestMapping("/admin/upload/pseudonym*")
public class PseudonymMemberFileUploadController extends BaseFormController {

	public PseudonymMemberFileUploadController() {
		super();
		setCancelView("redirect:/home");
		setSuccessView("redirect:/admin/pseudonymMembers");
	}

	@ModelAttribute
	@RequestMapping(method = RequestMethod.GET)
	public FileUpload showForm() {
		return new FileUpload();
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(FileUpload fileUpload, BindingResult errors,
			HttpServletRequest request) throws Exception {
		this.request=request;

		if (request.getParameter("cancel") != null) {
			return getCancelView();
		}

		if (validator != null) { // validator is null during testing
			validator.validate(fileUpload, errors);

			if (errors.hasErrors()) {
				log.info("");

				return "admin/upload/pseudonym";
			}
		}

		// validate a file was entered
		if (fileUpload.getFile().length == 0) {
			Object[] args = new Object[] { getText("uploadForm.file",
					request.getLocale()) };
			errors.rejectValue("file", "errors.required", args, "File");
			log.info("");

			return "admin/upload/pseudonym";
		}

		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		CommonsMultipartFile file = (CommonsMultipartFile) multipartRequest
				.getFile("file");

		log.info(file.getName());
		log.info(file.getOriginalFilename());
		if (!file.getOriginalFilename().endsWith(".csv")) {
			Object[] args = new Object[] { getText("uploadForm.file",
					request.getLocale()) };
			errors.rejectValue("file", "ldadmin.file.csv.only", args, "File");
			log.info("");

			return "admin/upload/pseudonym";
		}
		// the directory to upload to
		String uploadDir = environment
				.getRequiredProperty("ldadmin.files.members.pseudonym");

		uploadDir += "/";
		log.info("" + uploadDir);

		// Create the directory if it doesn't exist
		File dirPath = new File(uploadDir);

		if (!dirPath.exists()) {
			dirPath.mkdirs();
			log.info("");

		}

		// retrieve the file data
		InputStream stream = file.getInputStream();

		// write the file to the file specified
		OutputStream bos = new FileOutputStream(uploadDir
				+ file.getOriginalFilename());
		int bytesRead;
		byte[] buffer = new byte[8192];
		log.info("");

		while ((bytesRead = stream.read(buffer, 0, 8192)) != -1) {
			bos.write(buffer, 0, bytesRead);
		}

		bos.close();

		// close the stream
		stream.close();
		log.info("");

		// place the data into the request for retrieval on next page
		request.setAttribute("friendlyName", fileUpload.getName());
		request.setAttribute("fileName", file.getOriginalFilename());
		request.setAttribute("contentType", file.getContentType());
		request.setAttribute("size", file.getSize() + " bytes");
		request.setAttribute("location", dirPath.getAbsolutePath()
				+ Constants.FILE_SEP + file.getOriginalFilename());

		String link = "/admin/pseudonymMembersSubmit?file=";
		request.setAttribute("link", link + file.getOriginalFilename());
		log.info("" + getSuccessView());
		return getSuccessView();
	}
}
