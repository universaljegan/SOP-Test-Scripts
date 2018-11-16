package Pkg_SOPPlan.Manage_Users;

import Pkg_SOPPlan.commonLibrary;
import junit.framework.TestCase;

public class UC_03_41_ChangePassword extends TestCase {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "03_Manage_Users";
		cl.testCaseName = "UC_03_41_ChangePassword";
		cl.tableName = "tbl_manage_users";
		cl.useCaseName = "UC_03_41_ChangePassword";
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
		cl.resultfinal();
	}
}
