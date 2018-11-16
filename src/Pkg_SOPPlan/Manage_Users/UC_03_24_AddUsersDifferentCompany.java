package Pkg_SOPPlan.Manage_Users;

import Pkg_SOPPlan.commonLibrary;

public class UC_03_24_AddUsersDifferentCompany {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "03_Manage_Users";
		cl.testCaseName = "UC_03_24_AddUsersDifferentCompany";
		cl.tableName = "tbl_manage_users";
		cl.useCaseName = "UC_03_24_AddUsersDifferentCompany";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("");
		cl.login2();
		
		cl.executeTestStep("mci_administrator_menu", "mouseover");
		cl.executeTestStep("mus_manage_users_menu", "click");
		cl.executeTestStep("mus_add_users_manually", "click");
		
		commonLibrary.curTableRow = "1";
		cl.executeTestStep("mus_first_name", "set");
		cl.executeTestStep("mus_last_name", "set");
		cl.executeTestStep("mus_email_id", "set");
		cl.executeTestStep("mus_display_name", "set");
		
		commonLibrary.curTableRow = "2";
		cl.executeTestStep("mus_first_name", "set");
		cl.executeTestStep("mus_last_name", "set");
		cl.executeTestStep("mus_email_id", "set");
		cl.executeTestStep("mus_display_name", "set");
		
		cl.executeTestStep("mus_save_changes", "click");		
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.validateAlert("Users have been successfully added");
		Thread.sleep(2000);		
		cl.clickAlert("ok");
		Thread.sleep(2000);	
		
		cl.executeTestStep("hdp_logout", "click");
		
		cl.resultfinal();
		
		cl.exitCurrentTest();
	}
}
