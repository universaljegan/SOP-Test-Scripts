package Pkg_SOPPlan.SOPPlanOwner;

import Pkg_SOPPlan.commonLibrary;

public class UC_00_01_DeleteUser {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "00_SOPPlan_Owner";
		cl.testCaseName = "UC_03_15_ActivateAccount";
		cl.tableName = "tbl_account_activation";
		cl.useCaseName = "UC_03_15_ActivateAccount";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("");
		
		cl.executeTestStep("lgi_login_link", "click");
		Thread.sleep(10000);
		cl.executeTestStep("lgi_login_button", "click");
		
		cl.executeTestStep("sow_system_owner_menu", "mouseover");
		cl.executeTestStep("sow_menu_user_management", "click");
		
		cl.executeTestStep("sow_client_company_status", "click");
		
		String emailId = "test@test.com";
		cl.deleteUserBySystemOwner(emailId);
	}
}
