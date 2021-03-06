package Pkg_SOPPlan.Manage_Users;

import java.awt.AWTException;

import Pkg_SOPPlan.commonLibrary;

public class UC_03_39_ValidateExcelTitleChangedError {

	public static void main(String[] args) throws InterruptedException, AWTException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "03_Manage_Users";
		cl.testCaseName = "UC_03_39_ValidateExcelTitleChangedError";
		cl.tableName = "tbl_manage_users";
		cl.useCaseName = "UC_03_39_ValidateExcelTitleChangedError";
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
		
		cl.validateAlert("The data in this file is not correctly laid out. Please correct it and try again. Please note that the headings in row 1 must be exactly the same as the ones in the downloaded spreadsheet template.");
		cl.clickAlert("ok");
		
		cl.resultfinal();
	}
}
