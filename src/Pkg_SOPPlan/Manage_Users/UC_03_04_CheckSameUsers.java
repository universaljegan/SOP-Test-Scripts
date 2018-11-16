package Pkg_SOPPlan.Manage_Users;

import Pkg_SOPPlan.commonLibrary;

public class UC_03_04_CheckSameUsers {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "03_Manage_Users";
		cl.testCaseName = "UC_03_04_CheckSameUsers";
		cl.tableName = "tbl_manage_users";
		cl.useCaseName = "UC_03_04_CheckSameUsers";
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
		cl.validateAlert("Some rows of data had errors and were not uploaded. The rest of the data was successfully uploaded.See the table below for more information.");	
		cl.clickAlert("ok");
		
		cl.executeTestStep("mus_edit_users_menu", "click");
		commonLibrary.curTableRow = "1";
		
//		Check added users in data table
		cl.tableValidationDynamic("ctl00_ContentMenu_dgEditUsersInfo_ctl", "_txtEditUsersEmail", "03", "ctl00_ContentMenu_dgEditUsersInfo", "mus_email_id", "ctl00_ContentMenu_ddlSelectPage", "", "", "");
		cl.resultfinal();
	}
}
