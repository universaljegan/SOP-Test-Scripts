package Pkg_SOPPlan.Register_free_trial;

import Pkg_SOPPlan.commonLibrary;

public class UC_01_03_ValidateRegisterFreeTrialStep1 {

	public static void main(String[] args) {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "01_Register_free_trial";
		cl.testCaseName = "TC001_RegisterFreeTrial";
		cl.tableName = "tbl_register_free_trial";
		cl.useCaseName = "UC_01_03_ValidateRegisterFreeTrialStep1";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("");
		
		cl.executeTestStep("rfc_register_free_trial", "click");
		
		//Validate Invalid mail id
		cl.map.put("rfc_email", "invalid_mail_id"); //Change
		cl.executeTestStep("rfc_email", "set");
		
		cl.map.put("rfc_email", "presstab");
		cl.executeTestStep("rfc_email", "set");
		
		cl.executeTestStep("rfc_email_validator", "validate");
		 
		//Validate Confirm mail id
		cl.map.put("rfc_email", "FSAdminLogin@gmail.com"); //Change
		cl.executeTestStep("rfc_email", "focus");
		cl.executeTestStep("rfc_email", "set");
		
		cl.map.put("rfc_confirm_email", "unmatch_mail_id@gmail.com"); //Change
		cl.executeTestStep("rfc_confirm_email", "set");
		
		cl.map.put("rfc_confirm_email", "presstab");
		cl.executeTestStep("rfc_confirm_email", "set");
		
		cl.executeTestStep("rfc_confirm_email_validator", "validate");
		
		//Validate First name, Last name, Company name
		cl.executeTestStep("rfc_continue", "click");
		cl.clickAlert("ok");
		
		cl.executeTestStep("rfc_first_name_validator", "validate");
		cl.executeTestStep("rfc_last_name_validator", "validate");
		cl.executeTestStep("rfc_company_name_validator", "validate");
		cl.resultfinal();
		
		cl.exitCurrentTest();
	}
}
