package Pkg_SOPPlan.User_Maintenance;

import Pkg_SOPPlan.commonLibrary;

public class UC_06_12_ChangePassword2 {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "06_User_Maintenance";
		cl.testCaseName = "UC_06_12_ChangePassword2";
		cl.tableName = "tbl_user_maintenance";
		cl.useCaseName = "UC_06_12_ChangePassword2";
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
		cl.executeTestStep("hdp_current_password", "set");
		cl.executeTestStep("hdp_new_password", "set");
		cl.executeTestStep("hdp_confirm_password", "set");
		cl.executeTestStep("hdp_save_password", "click");
		cl.clickAlert("ok");
		cl.validateAlert("Your password has been successfully changed");
		cl.clickAlert("ok");
		
		//Logout and login with new password
		cl.executeTestStep("hdp_logout", "click");
		cl.loadTestData();
		cl.loginDirect();		
		cl.executeTestStep("hdp_logout", "click");
		
		cl.resultfinal();
	}
}
