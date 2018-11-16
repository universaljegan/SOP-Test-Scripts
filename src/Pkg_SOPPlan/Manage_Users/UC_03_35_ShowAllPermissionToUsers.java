package Pkg_SOPPlan.Manage_Users;

import Pkg_SOPPlan.commonLibrary;

public class UC_03_35_ShowAllPermissionToUsers {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "03_Manage_Users";
		cl.testCaseName = "UC_03_35_ShowAllPermissionToUsers";
		cl.tableName = "tbl_manage_users";
		cl.useCaseName = "UC_03_35_ShowAllPermissionToUsers";
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
		
		cl.executeTestStep("mus_edit_users_menu", "click");
		
		//Select "show all" option in data table
		cl.tableValidationDynamic("ctl00_ContentMenu_dgEditUsersInfo_ctl", "_txtEditUsersEmail", "03", "ctl00_ContentMenu_dgEditUsersInfo", "mus_edit_email_id", "ctl00_ContentMenu_ddlSelectPage", "showAll", "ctl00_ContentMenu_dgEditUsersInfo_ctl", "_chkCanShowAllPC");
		
		Thread.sleep(5000);
		
		cl.executeTestStep("mus_update_changes", "click");		
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.validateAlert("Users have been successfully updated.");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		cl.resultfinal();
		
		cl.exitCurrentTest();
	}
}
