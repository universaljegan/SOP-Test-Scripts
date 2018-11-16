package Pkg_SOPPlan.Manage_Users;

import java.awt.AWTException;

import Pkg_SOPPlan.commonLibrary;

public class UC_03_30_AddUsersUsingExcel_2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "03_Manage_Users";
		cl.testCaseName = "UC_03_30_AddUsersUsingExcel_2";
		cl.tableName = "tbl_manage_users";
		cl.useCaseName = "UC_03_30_AddUsersUsingExcel_2";
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
		
		cl.executeTestStep("mus_edit_users_menu", "click");
		
//		Check added users in data table
		cl.tableValidationDynamic("ctl00_ContentMenu_dgEditUsersInfo_ctl", "_txtEditUsersEmail", "03", "ctl00_ContentMenu_dgEditUsersInfo", "mus_email_id", "ctl00_ContentMenu_ddlSelectPage", "", "", "");
		
		cl.resultfinal();
	}
}
