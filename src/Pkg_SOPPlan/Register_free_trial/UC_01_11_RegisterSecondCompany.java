package Pkg_SOPPlan.Register_free_trial;

import Pkg_SOPPlan.commonLibrary;

public class UC_01_11_RegisterSecondCompany 
{
	public static void main(String[] args) 
	{
		commonLibrary cl = new commonLibrary();
		cl.packageName = "01_Register_free_trial";
		cl.testCaseName = "TC002_RegisterFreeTrial";
		cl.tableName = "tbl_register_free_trial";
		cl.useCaseName = "UC_01_11_RegisterSecondCompany";
		cl.readXML();
		cl.loadTestData();	
		
		//Page 1
		cl.loadURL("");
		
		cl.executeTestStep("rfc_register_free_trial", "click");
		cl.executeTestStep("rfc_email", "set");
		cl.executeTestStep("rfc_confirm_email", "set");
		cl.executeTestStep("rfc_first_name", "set");
		cl.executeTestStep("rfc_last_name", "set");
		cl.executeTestStep("rfc_company_name", "set");
		cl.executeTestStep("rfc_continue", "click");
				
		//Page 2
		cl.executeTestStep("rfc_country", "select");
		cl.executeTestStep("rfc_password", "set");
		cl.executeTestStep("rfc_confirm_password", "set");
		cl.executeTestStep("rfc_security_question", "select");
		cl.executeTestStep("rfc_security_answer", "set");
		cl.executeTestStep("rfc_accept_terms", "click");
		cl.executeTestStep("rfc_begin_free_trial", "click");
		
		cl.validateAlert("An activation e-mail has been sent to the address that you provided. Please follow the link in that message to activate your account. \n\n If you have not received the message within the next 5 minutes please check your spam folder.");
		cl.clickAlert("ok");
		
		cl.resultfinal();
		
		cl.exitCurrentTest();
		
	}
}
