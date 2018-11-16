package Pkg_SOPPlan.Upload_Budget;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;

import Pkg_SOPPlan.commonLibrary;

public class UC_11_07_UploadCorrectData {

	public static void main(String[] args) throws InterruptedException, AWTException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "11_Upload_Budget_Target";
		cl.testCaseName = "UC_11_07_UploadCorrectData";
		cl.tableName = "tbl_upload_buget_target";
		cl.useCaseName = "UC_11_07_UploadCorrectData";
		cl.readXML();
		cl.loadTestData();
		
		if(cl.isLoginRequired.equals("YES"))
		{
			cl.loadURL("");
			cl.login3();
		}
		else
		{
			cl.createResultFolder();
		}
		
		if(cl.isMenuNavigationRequired.equals("YES"))
		{
			cl.executeTestStep("upl_upload_data_menu", "mouseover");
			cl.executeTestStep("upl_upload_buget_target_menu", "click");
		}
		
		Thread.sleep(2000);
		
		//Upload CSV File
		cl.executeTestStep("mus_browse_excel_file", "click");
		Thread.sleep(1000);
		cl.selectFile("mus_browse_csv_file");
		Thread.sleep(2000);
		cl.executeTestStep("upl_upload_excel_budget_target", "click");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		
//		Thread.sleep(60000);
//		
//		cl.tableName = "tbl_account_activation";
//		cl.loadTestData();
//
//		cl.loadURL("http://www.google.com");
//		cl.executeTestStep("aac_gmail_link", "click");
//		cl.executeTestStep("aac_gmail_id", "set");
//		cl.executeTestStep("aac_gmail_next", "click");
//		cl.executeTestStep("aac_gmail_password", "set");
//		cl.executeTestStep("aac_sign_in", "click");
//		
//		Thread.sleep(3000);
//		
//		cl.executeTestStep("upl_open_upload_sales_data_success_mail", "click");
//		//If not found in Inbox, check in Spam
//		if(cl.tcStatus.replaceAll("\\s+","").equalsIgnoreCase("Fail".replaceAll("\\s+","")))
//		{
//			cl.tcStatus = "Pass";
//			System.out.println("Inside condition.");
//			commonLibrary.LinkText = "Starred";
//			cl.executeTestStep("common_mail_link_identifier", "mouseover");
//			Thread.sleep(1000);
//			cl.executeTestStep("aac_more_link_in_mail", "click");
//			
//			Thread.sleep(3000);
//			
//			commonLibrary.LinkText = "Starred";
//			cl.executeTestStep("common_mail_link_identifier", "mouseover");
//			
//			Thread.sleep(1000);
//			commonLibrary.LinkText = "Spam";
//			cl.executeTestStep("common_mail_link_identifier", "click");
//			
//			cl.executeTestStep("upl_open_upload_sales_data_success_mail", "click");
//		}
//		
//		Thread.sleep(3000);
//		
//		String expectedText = "We are pleased to advise you that your data was correctly uploaded to MYSOPPLAN.com Your uploaded file name is :SOPPLAN_budget_target_data_upload_11_07.csv";
//		
//		cl.mpc_excel_upload_success_validation_in_mail("2", "2", expectedText);
		
		cl.resultfinal();
	}
}
