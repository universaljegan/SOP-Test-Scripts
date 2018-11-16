package Pkg_SOPPlan.Manage_Users;

import Pkg_SOPPlan.commonLibrary;

public class UC_03_17_ActivateExistingAccount {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "03_Manage_Users";
		cl.testCaseName = "UC_03_15_ActivateAccount";
		cl.tableName = "tbl_account_activation";
		cl.useCaseName = "UC_03_17_ActivateExistingAccount";
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
		cl.executeTestStep("aac_open_new_forecasting_system_mail", "click");
		
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
		cl.executeTestStep("aac_activation_link_new_forecasting_system", "click");
		
		//Thread.sleep(5000);		
		
		cl.switchToNewWindow();
		Thread.sleep(5000);
		
		cl.refreshBrowser();
		cl.clickAlert("ok");
		
		//Validate the Error Alert
		cl.validateAlert("Your account has already been activated. Please enter the username and password to login");
		Thread.sleep(2000);		
		cl.clickAlert("ok");
		
		cl.resultfinal();
		
		cl.exitCurrentTest();
	}
}
