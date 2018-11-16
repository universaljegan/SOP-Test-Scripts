package Pkg_SOPPlan.User_Maintenance;

import Pkg_SOPPlan.commonLibrary;

public class UC_06_09_LoginWithNewPassword {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "06_User_Maintenance";
		cl.testCaseName = "UC_06_09_LoginWithNewPassword";
		cl.tableName = "tbl_user_maintenance";
		cl.useCaseName = "UC_06_09_LoginWithNewPassword";
		cl.readXML();
		cl.loadTestData();
		
		cl.executeTestStep("lgi_login_link", "click");
		cl.loginDirect();
		cl.executeTestStep("hdp_logout", "click");
		
		cl.resultfinal();
	}
}
