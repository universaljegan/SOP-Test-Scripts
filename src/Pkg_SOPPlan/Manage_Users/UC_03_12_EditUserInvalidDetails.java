package Pkg_SOPPlan.Manage_Users;

import Pkg_SOPPlan.commonLibrary;

public class UC_03_12_EditUserInvalidDetails {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "03_Manage_Users";
		cl.testCaseName = "UC_03_12_EditUserInvalidDetails";
		cl.tableName = "tbl_manage_users";
		cl.useCaseName = "UC_03_12_EditUserInvalidDetails";
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
		Thread.sleep(2000);
		
		cl.executeTestStep("mus_edit_users_menu", "click");
		
		commonLibrary.curTableRow = "1";
		cl.executeTestStep("mus_edit_first_name", "set");

		commonLibrary.curTableRow = "2";
		cl.executeTestStep("mus_edit_last_name", "set");

		commonLibrary.curTableRow = "3";
		cl.executeTestStep("mus_edit_display_name", "set");
		
		commonLibrary.curTableRow = "4";
		cl.executeTestStep("mus_edit_last_name", "set");
		
		cl.executeTestStep("mus_update_changes", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.validateAlert("Some rows of data had errors and were not uploaded. The rest of the data was successfully uploaded.See the table below for more information.");
		Thread.sleep(2000);		
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		//Validate Error Messages
		commonLibrary.curTableRow = "1";
		cl.executeTestStep("mus_edit_empty_first_name_validator", "validate");
		
		commonLibrary.curTableRow = "4";
		cl.executeTestStep("mus_edit_empty_last_name_validator", "validate");
		
		//Navigate away now showing, if form submitted, so change once again
		commonLibrary.curTableRow = "1";
		cl.executeTestStep("mus_edit_first_name", "set");
		
		//Navigate Away
		cl.executeTestStep("mus_add_users_manually", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		cl.executeTestStep("mus_edit_users_menu", "click");
		
		cl.takeScreenShot("mus_check_users_after_navigate_away");
		
		cl.resultfinal();
	}
}
