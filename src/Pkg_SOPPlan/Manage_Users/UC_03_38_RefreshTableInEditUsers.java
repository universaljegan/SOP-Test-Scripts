package Pkg_SOPPlan.Manage_Users;

import Pkg_SOPPlan.commonLibrary;

public class UC_03_38_RefreshTableInEditUsers {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "03_Manage_Users";
		cl.testCaseName = "UC_03_38_RefreshTableInEditUsers";
		cl.tableName = "tbl_manage_users";
		cl.useCaseName = "UC_03_38_RefreshTableInEditUsers";
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
		
		commonLibrary.curTableRow = "01";
		cl.executeTestStep("mus_edit_first_name", "set"); //Empty set
		cl.executeTestStep("mus_edit_last_name", "set"); //Empty set
		
		cl.executeTestStep("mus_update_changes", "click");		
		cl.clickAlert("ok");
		Thread.sleep(2000);	
		cl.clickAlert("ok");
		Thread.sleep(2000);	
		
		cl.executeTestStep("mus_refresh", "click");
		
		commonLibrary.curTableRow = "01";
		cl.executeTestStep("mus_edit_first_name_error", "notexist");
		cl.executeTestStep("mus_edit_last_name_error", "notexist");
		
		cl.resultfinal();
	}
}
