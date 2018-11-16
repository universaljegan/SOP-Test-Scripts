package Pkg_SOPPlan.Manage_Users;

import Pkg_SOPPlan.commonLibrary;

public class UC_03_20_LoginToNotActivatedAccount {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "03_Manage_Users";
		cl.testCaseName = "UC_03_20_LoginToNotActivatedAccount";
		cl.tableName = "tbl_account_activation";
		cl.useCaseName = "UC_03_20_LoginToNotActivatedAccount";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("");
		cl.executeTestStep("lgi_login_link", "click");
		cl.executeTestStep("lgi_sop_username", "set");
		cl.executeTestStep("lgi_sop_password", "set");
		cl.executeTestStep("lgi_login_button", "click");
		
		cl.validateAlert("Your account has not been activated yet to use the system!");
		Thread.sleep(2000);		
		cl.clickAlert("ok");
		
		cl.resultfinal();
		
		cl.exitCurrentTest();
	}
}
