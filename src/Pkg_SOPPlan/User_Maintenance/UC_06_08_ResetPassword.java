package Pkg_SOPPlan.User_Maintenance;

import Pkg_SOPPlan.commonLibrary;

public class UC_06_08_ResetPassword {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "06_User_Maintenance";
		cl.testCaseName = "UC_06_08_ResetPassword";
		cl.tableName = "tbl_account_activation"; //This is differ from tbl_manage_users
		cl.useCaseName = "UC_06_08_ResetPassword";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("http://www.google.com");
		cl.executeTestStep("aac_gmail_link", "click");
		cl.executeTestStep("aac_gmail_id", "set");
		cl.executeTestStep("aac_gmail_next", "click");
		cl.executeTestStep("aac_gmail_password", "set");
		cl.executeTestStep("aac_sign_in", "click");
		
		Thread.sleep(3000);
		
		cl.executeTestStep("aac_reset_password_mail", "click");
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
			
			cl.executeTestStep("aac_reset_password_mail", "click");
		}
		
		Thread.sleep(3000);
		
		cl.executeTestStep("aac_activation_link_new_forecasting_system", "click");
		
		Thread.sleep(5000);
		
		cl.switchToNewWindow();
		
		//Change password
		cl.executeTestStep("hdp_new_password", "set");
		cl.executeTestStep("hdp_confirm_password", "set");
		cl.executeTestStep("mus_security_answer_icon", "mouseover");
		cl.takeScreenShot("Mus_Reset password");
		
		cl.executeTestStep("hdp_save_password", "click");
		cl.clickAlert("ok");
		cl.validateAlert("Your password has been successfully changed");
		cl.clickAlert("ok");
		
		cl.resultfinal();
		
		cl.exitCurrentTest();
	}
}
