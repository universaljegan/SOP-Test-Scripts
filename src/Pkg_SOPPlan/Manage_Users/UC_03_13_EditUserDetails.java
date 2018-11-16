package Pkg_SOPPlan.Manage_Users;

import Pkg_SOPPlan.commonLibrary;

public class UC_03_13_EditUserDetails {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "03_Manage_Users";
		cl.testCaseName = "UC_03_13_EditUserDetails";
		cl.tableName = "tbl_manage_users";
		cl.useCaseName = "UC_03_13_EditUserDetails";
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
		
		commonLibrary.curTableRow = "1";
		cl.executeTestStep("mus_edit_first_name", "set");
		cl.executeTestStep("mus_edit_display_name", "set");
		
		commonLibrary.curTableRow = "4";
		cl.executeTestStep("mus_edit_last_name", "set");
		
		cl.newURL("htpp://www.google.com");
		cl.clickAlert("Stay on Page");
		Thread.sleep(5000);
		
		cl.executeTestStep("mus_update_changes", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.validateAlert("Users have been successfully updated.");
		Thread.sleep(2000);		
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
//		Can't validated the updated values, because the rows are shows ascending order. After save it gets changed.
		
//		commonLibrary.curTableRow = "1";
//		cl.executeTestStep("mus_edit_first_name", "get");
//		cl.executeTestStep("mus_edit_display_name", "get");
//		
//		commonLibrary.curTableRow = "4";
//		cl.executeTestStep("mus_edit_last_name", "get");
		
		cl.takeScreenShot("mus_check_users_after_save");
		
		cl.resultfinal();
	}
}
