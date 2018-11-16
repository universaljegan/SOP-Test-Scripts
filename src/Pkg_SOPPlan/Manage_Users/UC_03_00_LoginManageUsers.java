package Pkg_SOPPlan.Manage_Users;

import Pkg_SOPPlan.commonLibrary;

public class UC_03_00_LoginManageUsers {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "03_Manage_Users";
		cl.testCaseName = "UC_03_00_LoginManageUsers";
		cl.tableName = "tbl_manage_users";
		cl.useCaseName = "UC_03_00_LoginManageUsers";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("");
		cl.login();
		
		cl.executeTestStep("mci_administrator_menu", "mouseover");
		cl.executeTestStep("mus_manage_users_menu", "click");
		cl.resultfinal();
	}
}
