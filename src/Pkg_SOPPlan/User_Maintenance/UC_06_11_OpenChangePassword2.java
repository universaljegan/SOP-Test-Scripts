package Pkg_SOPPlan.User_Maintenance;

import Pkg_SOPPlan.commonLibrary;

public class UC_06_11_OpenChangePassword2 {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "06_User_Maintenance";
		cl.testCaseName = "UC_06_11_OpenChangePassword2";
		cl.tableName = "tbl_user_maintenance";
		cl.useCaseName = "UC_06_11_OpenChangePassword2";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("");
		cl.login();
	
		cl.createResultFolder();
		
		
		cl.executeTestStep("hdp_change_password", "click");
		cl.resultfinal();
	}
}
