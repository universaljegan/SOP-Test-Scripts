package Pkg_SOPPlan.Manage_Users;

import Pkg_SOPPlan.commonLibrary;

public class UC_03_15_ActivateAccount {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "03_Manage_Users";
		cl.testCaseName = "UC_03_15_ActivateAccount";
		cl.tableName = "tbl_account_activation"; //This is differ from tbl_manage_users
		cl.useCaseName = "UC_03_15_ActivateAccount";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("http://www.google.com");
		cl.executeTestStep("aac_gmail_link", "click");
		
		Boolean isExist = false;
		isExist = cl.chkIsExist("html/body/nav/div/a[2]");
		
		if(isExist)
		{
			cl.executeTestStep("aac_signin_link", "click");
		}
		
		cl.executeTestStep("aac_gmail_id", "set");
		cl.executeTestStep("aac_gmail_next", "click");
		cl.executeTestStep("aac_gmail_password", "set");
		cl.executeTestStep("aac_sign_in", "click");
		
		Thread.sleep(3000);
		
		cl.executeTestStep("aac_open_new_forecasting_system_mail", "click");
		//If not found in Inbox, check in Spam
		if(cl.tcStatus.replaceAll("\\s+","").equalsIgnoreCase("Fail".replaceAll("\\s+","")))
		{
			cl.tcStatus = "Pass";
			System.out.println("Inside condition.");
			commonLibrary.LinkText = "Starred";
			cl.executeTestStep("common_mail_link_identifier", "mouseover");
			Thread.sleep(1000);
			cl.executeTestStep("aac_more_link_in_mail", "click");
			
			Thread.sleep(3000);
			
			commonLibrary.LinkText = "Starred";
			cl.executeTestStep("common_mail_link_identifier", "mouseover");
			
			Thread.sleep(1000);
			commonLibrary.LinkText = "Spam";
			cl.executeTestStep("common_mail_link_identifier", "click");
			
			cl.executeTestStep("aac_open_new_forecasting_system_mail", "click");
		}
		
		Thread.sleep(3000);
		
		cl.executeTestStep("aac_activation_link_new_forecasting_system", "click");
		
		Thread.sleep(5000);
		
		cl.switchToNewWindow();
		
		//cl.loadURL("http://www.so-plan.info/UserActivation.aspx?UID=1673&Activate=H6qB4DWtU2Ryw6Tf&Assistant=Assistant1");
		
		//Validate the Hover Text
		cl.executeTestStep("mus_security_question_icon", "mouseover");
		cl.executeTestStep("mus_security_question_icon", "hover_validate");
		cl.executeTestStep("mus_security_answer_icon", "mouseover");
		cl.executeTestStep("mus_security_answer_icon", "hover_validate");
		cl.executeTestStep("mus_display_name_icon", "mouseover");
		cl.executeTestStep("mus_display_name_icon", "hover_validate");
		
		cl.executeTestStep("mus_activate_changes", "click");
		cl.validateAlert("Choose your password Enter confirm password Enter security answer");
		Thread.sleep(2000);		
		cl.clickAlert("ok");

		//Fill Partial details
		cl.executeTestStep("mus_activation_new_password", "set");
		cl.executeTestStep("mus_activation_security_question", "select");
		cl.executeTestStep("mus_activation_security_answer", "set");
		
		//Enter different password, to get the Error message
		String actualPassword = cl.map.get("mus_activation_confirm_password");		
		cl.map.put("mus_activation_confirm_password", "differentPassword"); //Change
		cl.executeTestStep("mus_activation_confirm_password", "set");
		cl.executeTestStep("mus_activate_changes", "click");
		cl.validateAlert("Confirm password should match with your password");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		
		//Now set correct password and get Terms of Use alert
		cl.map.put("mus_activation_confirm_password", actualPassword); //Change
		cl.executeTestStep("mus_activation_confirm_password", "set");
		cl.executeTestStep("mus_activate_changes", "click");
		cl.validateAlert("Please accept the terms of use before proceeding");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		cl.executeTestStep("mus_activation_display_name", "set");		
		cl.executeTestStep("mus_accept_terms", "click");
		Thread.sleep(2000);
		cl.executeTestStep("mus_activate_changes", "click");
		Thread.sleep(2000);
		cl.validateAlert("Your account has been activated successfully.");		
		cl.clickAlert("ok");
		
		Thread.sleep(3000);
		cl.executeTestStep("aac_validate_display_name", "validate");
//		cl.executeTestStep("mus_welcome_page_opens", "exist");
//		cl.executeTestStep("mus_download_quick_start_guide", "click");
//		Thread.sleep(4000);
//		cl.takeScreenShot("Mus_Check Download Opens");
		//cl.clickAlert("ok");
		
		cl.executeTestStep("mus_press_here_to_start", "click");
		cl.executeTestStep("mus_company_user_home_message", "exist");
		cl.executeTestStep("mus_company_user_home_system_status", "exist");
		cl.takeScreenShot("Mus_Check Home Page Opens");
		
		cl.resultfinal();
		
		cl.exitCurrentTest();
	}
}
