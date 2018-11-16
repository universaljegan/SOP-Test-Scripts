package Pkg_SOPPlan.User_Maintenance;

import Pkg_SOPPlan.commonLibrary;

public class UC_06_01_OpenChangePassword {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "06_User_Maintenance";
		cl.testCaseName = "UC_06_01_OpenChangePassword";
		cl.tableName = "tbl_user_maintenance";
		cl.useCaseName = "UC_06_01_OpenChangePassword";
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
		
		cl.executeTestStep("hdp_change_password", "click");
		cl.resultfinal();
	}
}
