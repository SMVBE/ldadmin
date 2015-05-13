package org.liquidfeedback.remotecontrol;

import java.io.File;
import java.io.FileWriter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;

public class PreRegisterAndInvite {
	HtmlUnitDriver driver;
	String baseUrl;
	protected final transient Log log = LogFactory.getLog(getClass());

	@Before
	public void setUp() throws Exception {
		baseUrl = "http://136.243.4.158:88";

	}

	@Test
	public void testPreRegisterAndInvite() throws Exception {
		// login
		WebClient webClient = new WebClient(BrowserVersion.FIREFOX_24);
		webClient.getOptions().setCssEnabled(false);
		webClient.getOptions().setJavaScriptEnabled(false);
		webClient.getOptions().setThrowExceptionOnScriptError(false);
		webClient.getOptions().setTimeout(Integer.parseInt(10040+""));
		HtmlPage page = webClient
				.getPage(baseUrl
						+ "/lf/index/login.html?redirect_module=index&redirect_view=index");
		log.trace(page.asText());

		HtmlForm loginForm = page.getForms().get(0);
		log.info(loginForm.asXml());
		HtmlInput secret = loginForm.getInputByName("_webmcp_csrf_secret");
		log.info(secret);
		HtmlInput username = (HtmlInput) page.getElementById("username_field");
		log.info(username);
		HtmlInput password = page.getElementByName("password");
		log.info(password);
		username.setValueAttribute("admin");
		password.setValueAttribute("as23452%%$$12313sddsPERfdv");

		log.error(secret.getValueAttribute());

		HtmlSubmitInput submit = (HtmlSubmitInput) page
				.getByXPath(
						"/html/body/div[2]/div[9]/div[2]/div/div/form/div/div[3]/input")
				.get(0);
		HtmlPage result = submit.click();

		// 
		page = webClient.getPage(baseUrl+"/lf/admin/member_edit.html");
		log.info(page);
		log.info(page.getTextContent());
		HtmlInput identification = page.getElementByName("identification");
		HtmlInput email=page.getElementByName("notify_email");
		HtmlInput unit=page.getElementByName("unit_1");
		HtmlInput invite=page.getElementByName("invite_member");
		identification.setValueAttribute(System.currentTimeMillis()+"");
		email.setValueAttribute(System.currentTimeMillis()+"@xitio.de");
		invite.setChecked(true);
		unit.setValueAttribute("unit_1");
		submit =  (HtmlSubmitInput) page
				.getByXPath("/html/body/div[2]/div[9]/div[2]/div/form/div[2]/input").get(0);
		result = submit.click();
		FileWriter writer = new FileWriter(new File(
				System.getProperty("user.dir")
						+ System.getProperty("file.separator") + "mofang.html"));
		log.error("");
		writer.write(result.getWebResponse().getContentAsString());
		writer.close();
	}

	@After
	public void tearDown() throws Exception {
	}
}
