package Pkg_SOPPlan.Register_free_trial;

import Pkg_SOPPlan.commonLibrary;

public class UC_01_04_CompleteRegisterFreeTrialStep1 {

	public static void main(String[] args) {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "01_Register_free_trial";
		cl.testCaseName = "TC001_RegisterFreeTrial";
		cl.tableName = "tbl_register_free_trial";
		cl.useCaseName = "UC_01_04_CompleteRegisterFreeTrialStep1";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("");
		
		cl.executeTestStep("rfc_register_free_trial", "click");
		cl.executeTestStep("rfc_email", "set");
		cl.executeTestStep("rfc_confirm_email", "set");
		cl.executeTestStep("rfc_first_name", "set");
		cl.executeTestStep("rfc_last_name", "set");
		cl.executeTestStep("rfc_company_name", "set");
		cl.executeTestStep("rfc_continue", "click");
		
		cl.executeTestStep("rfc_check_page_2_opens", "exist");
		cl.resultfinal();
		cl.exitCurrentTest();
	}
}
