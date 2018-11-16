package Pkg_SOPPlan.User_Maintenance;

import Pkg_SOPPlan.commonLibrary;

public class UC_06_07_RetrievePassword {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "06_User_Maintenance";
		cl.testCaseName = "UC_06_07_RetrievePassword";
		cl.tableName = "tbl_user_maintenance";
		cl.useCaseName = "UC_06_07_RetrievePassword";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("");
		
		cl.executeTestStep("lgi_login_link", "click");
		cl.executeTestStep("lgi_forget_password", "click");
		
		//The answer you entered for the CAPTCHA was not correct,please try again.
		cl.executeTestStep("lgi_forget_password_email_1", "set");
//		cl.executeTestStep("lgi_captcha_box", "click");
		Thread.sleep(20000); //Type the CAPTCHA word, within 5 Secs
		
		cl.executeTestStep("lgi_forget_password_next_step", "click");		
		cl.validateAlert("That username is not registered on the system. Please try again");
		cl.clickAlert("OK");
		
		cl.executeTestStep("lgi_forget_password_email_2", "set");
//		cl.executeTestStep("lgi_captcha_box", "click");
		Thread.sleep(20000); //Type the CAPTCHA word, within 5 Secs
		cl.executeTestStep("lgi_forget_password_next_step", "click");
		
		cl.executeTestStep("lgi_security_answer_1", "set");
		cl.executeTestStep("lgi_security_answer_next_step", "set");
		cl.validateAlert("That is not the correct answer – please try again");
		cl.clickAlert("OK");
		cl.executeTestStep("lgi_security_answer_2", "set");
		cl.executeTestStep("lgi_security_answer_next_step", "set");
		cl.validateAlert("We have sent an e-mail to you with a link that will allow ou to log in and change your password. This link is valid for the next 2 hours");
		cl.clickAlert("OK");
		
		cl.resultfinal();
	}
}
