package Pkg_SOPPlan.Register_free_trial;

import Pkg_SOPPlan.commonLibrary;

public class UC_01_07_A_ValidateStep2 {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "01_Register_free_trial";
		cl.testCaseName = "TC001_RegisterFreeTrial";
		cl.tableName = "tbl_register_free_trial";
		cl.useCaseName = "UC_01_07_A_ValidateStep2";
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
		
		//Validate Empty message for Country, Password, Security Answer
		cl.executeTestStep("rfc_begin_free_trial", "click");
		cl.clickAlert("ok");
		
		cl.executeTestStep("rfc_country_empty_validator", "validate");
		cl.executeTestStep("rfc_password_empty_validator", "validate");
		cl.executeTestStep("rfc_security_answer_empty_validator", "validate");
		
		//Validate Password Length and Confirm password
		cl.executeTestStep("rfc_country", "select");
		
		cl.map.put("rfc_password", "limit"); //Change
		cl.executeTestStep("rfc_password", "set");
		cl.executeTestStep("rfc_password", "tab");
		Thread.sleep(2000);
		cl.executeTestStep("rfc_password_length_validator", "validate");
		
		cl.map.put("rfc_confirm_password", "different"); //Change
		cl.executeTestStep("rfc_confirm_password", "set");
		cl.executeTestStep("rfc_confirm_password", "tab");
		Thread.sleep(2000);
		cl.executeTestStep("rfc_confirm_password_validator", "validate");
				
		//Validate - Accept Terms and Conditions
		cl.map.put("rfc_password", "correctPassword"); //Change
		cl.executeTestStep("rfc_password", "set");
		cl.map.put("rfc_confirm_password", "correctPassword"); //Change
		cl.executeTestStep("rfc_confirm_password", "set");
		
		cl.executeTestStep("rfc_security_question", "select");
		cl.executeTestStep("rfc_security_answer", "set");
		
		cl.executeTestStep("rfc_begin_free_trial", "click");
		cl.validateAlert("Please accept the terms of use before proceeding");
		
		cl.clickAlert("ok");
		
		cl.resultfinal();
		
		cl.exitCurrentTest();
	}
}
