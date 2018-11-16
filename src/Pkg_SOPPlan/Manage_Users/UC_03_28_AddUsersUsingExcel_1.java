package Pkg_SOPPlan.Manage_Users;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;

import Pkg_SOPPlan.commonLibrary;

public class UC_03_28_AddUsersUsingExcel_1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "03_Manage_Users";
		cl.testCaseName = "UC_03_28_AddUsersUsingExcel_1";
		cl.tableName = "tbl_manage_users";
		cl.useCaseName = "UC_03_28_AddUsersUsingExcel_1";
		cl.readXML();
		cl.loadTestData();
		
		if(cl.isLoginRequired.equals("YES"))
		{
			cl.loadURL("");
			cl.login();
		}
		else
		{
			cl.createResultFolder();
		}
		
		if(cl.isMenuNavigationRequired.equals("YES"))
		{
			cl.executeTestStep("mci_administrator_menu", "mouseover");
			cl.executeTestStep("mus_manage_users_menu", "click");
		}
		
		cl.executeTestStep("mus_add_users_excel_menu", "click");
		Thread.sleep(2000);
		
		//Validate CSV alert
//		cl.executeTestStep("mus_browse_excel_file", "click");
//		cl.selectFile("mus_browse_excel_file");
//		
//		Thread.sleep(2000);
//		cl.executeTestStep("mus_upload_excel", "click");
//		Thread.sleep(2000);
//		cl.clickAlert("ok");
//		Thread.sleep(1000);
//		cl.validateAlert("Please upload the file in csv format");
//		Thread.sleep(1000);
//		cl.clickAlert("ok");
//		Thread.sleep(3000);
		
		//Upload Excel File
		cl.executeTestStep("mus_browse_excel_file", "click");
		Thread.sleep(1000);
		cl.selectFile("mus_browse_csv_file");
		Thread.sleep(2000);
		cl.executeTestStep("mus_upload_excel", "click");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		
		cl.mus_excel_upload_error_validation("2", "2", "e-mail address is invalid");
		cl.mus_excel_upload_error_validation("3", "2", "Enter the first name / e-mail address is already registered as a user on the system");
		cl.mus_excel_upload_error_validation("4", "2", "Enter the last name");
		cl.mus_excel_upload_error_validation("5", "2", "Enter the last name / Enter the e-mail address");
		cl.mus_excel_upload_error_validation("7", "2", "e-mail address already registered as a user with another company");
		cl.mus_excel_upload_error_validation("8", "2", "e-mail address already registered as a user with another company");
		cl.mus_excel_upload_error_validation("11", "2", "e-mail address already exists on the system");
		cl.mus_excel_upload_error_validation("12", "2", "e-mail address already exists on the system");
		cl.mus_excel_upload_error_validation("13", "2", "Enter the last name / Enter the e-mail address");
		cl.resultfinal();
	}
}
