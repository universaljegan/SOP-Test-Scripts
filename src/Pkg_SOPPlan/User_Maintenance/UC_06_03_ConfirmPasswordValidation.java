package Pkg_SOPPlan.User_Maintenance;

import Pkg_SOPPlan.commonLibrary;

public class UC_06_03_ConfirmPasswordValidation {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "06_User_Maintenance";
		cl.testCaseName = "UC_06_03_ConfirmPasswordValidation";
		cl.tableName = "tbl_user_maintenance";
		cl.useCaseName = "UC_06_03_ConfirmPasswordValidation";
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
		cl.executeTestStep("hdp_confirm_password", "tab");
		
		cl.executeTestStep("hdp_confirm_password_validation", "validate");
		cl.executeTestStep("hdp_save_password", "click");
		cl.validateAlert("Password confirmation must match the password entered!");		
		cl.clickAlert("ok");
		cl.resultfinal();
	}
}
