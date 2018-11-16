package Pkg_SOPPlan.Register_free_trial;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import Pkg_SOPPlan.commonLibrary;

public class UC_01_08_ActivateAccount {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		commonLibrary cl = new commonLibrary();
		cl.packageName = "01_Register_free_trial";
		cl.testCaseName = "UC_01_08_ActivateAccount";
		cl.tableName = "tbl_account_activation";
		cl.useCaseName = "UC_01_08_ActivateAccount";
		cl.readXML();
		cl.loadTestData();
		
//		cl.loadURL("http://localhost:1681/CompanyActivation.aspx");
		cl.loadURL("http://google.com");
		cl.executeTestStep("aac_gmail_link", "click");
		cl.executeTestStep("aac_gmail_id", "set");
		cl.executeTestStep("aac_gmail_next", "click");
		cl.executeTestStep("aac_gmail_password", "set");
		cl.executeTestStep("aac_sign_in", "click");
		cl.executeTestStep("aac_open_activation_mail", "click");
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
			
			cl.executeTestStep("aac_open_activation_mail", "click");
		}
		cl.executeTestStep("aac_click_activation_link", "click");
		
		Thread.sleep(5000);
		
		cl.switchToNewWindow();
		
		Thread.sleep(2000);
		
		//Press Alt+Tab to show the newly opened page, bcz switch window makes the view of GMail page again.
		Robot robot = new Robot();
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_ALT);
		
//		cl.executeTestStep("aac_click_activation_link", "alttab");
		
//		cl.switchToNewWindow();
//		
//		cl.refreshBrowser();
		
		Thread.sleep(2000);

//		cl.validateAlert("Your account has been activated");
		Thread.sleep(2000);	
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
//		cl.clickAlert("ok");
		
		cl.takeScreenShot("aac_Check is account activated");
		
		cl.executeTestStep("aac_validate_display_name", "validate");
		
		//Download setup guide 
		cl.executeTestStep("aac_download_setup_guide", "click");
		Thread.sleep(3000);
//		cl.clickAlert("ok");
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//Send EMail to Admin
		cl.executeTestStep("aac_instruct_us_to_set_up_your_system", "click");
		
		cl.executeTestStep("aac_contact_full_name", "set");
		
		cl.executeTestStep("aac_contact_email", "set");
		
		cl.executeTestStep("aac_contact_number", "set");
		
		cl.executeTestStep("aac_contact_message", "set");
		
		cl.executeTestStep("aac_send_mail", "click");
		
		Thread.sleep(3000);
		
		//Activate Account
		cl.executeTestStep("aac_start_setting_up_your_system", "click");
		
		cl.resultfinal();
		cl.exitCurrentTest();
	}
}
