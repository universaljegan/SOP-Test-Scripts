package Pkg_SOPPlan.Manage_Users;

import Pkg_SOPPlan.commonLibrary;

public class UC_03_40_ValidateIsDeleteAllChecked {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "03_Manage_Users";
		cl.testCaseName = "UC_03_40_ValidateIsDeleteAllChecked";
		cl.tableName = "tbl_manage_users";
		cl.useCaseName = "UC_03_40_ValidateIsDeleteAllChecked";
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
		Thread.sleep(5000);
		
		boolean isChecked = cl.isCheckboxChecked("ctl00_ContentMenu_chkSelectAll");
		
		if(!isChecked)
		{
			cl.updateResult("mus_is_delete_all_not_checked", "Pass");
		}
		else
		{
			cl.updateResult("mus_is_delete_all_not_checked", "Fail");
		}		
		
		cl.resultfinal();
	}
}
