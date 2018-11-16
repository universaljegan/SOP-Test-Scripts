package Pkg_SOPPlan.Manage_Users;

import Pkg_SOPPlan.commonLibrary;

public class UC_03_18_LoginToAccount {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "03_Manage_Users";
		cl.testCaseName = "UC_03_15_ActivateAccount";
		cl.tableName = "tbl_account_activation";
		cl.useCaseName = "UC_03_18_LoginToAccount";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("");
		cl.executeTestStep("lgi_login_link", "click");
		cl.executeTestStep("lgi_sop_username", "set");
		cl.executeTestStep("lgi_sop_password", "set");
		cl.executeTestStep("lgi_login_button", "click");
		
		cl.executeTestStep("hdp_change_password", "exist");
		
		cl.resultfinal();
		
		cl.exitCurrentTest();
	}
}
