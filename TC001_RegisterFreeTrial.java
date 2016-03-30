package Pkg_SOPPlan;

import Pkg_SOPPlan.commonLibrary;

public class TC001_RegisterFreeTrial 
{
	public static void main(String[] args) 
	{
		commonLibrary cl = new commonLibrary();
		cl.testCaseName = "TC001_RegisterFreeTrial";
		cl.tableName = "tbl_register_free_trial";
		cl.readXML();
		cl.loadTestData();		
		//System.exit(0);	
		
		//Page 1
		cl.loadURL("http://www.so-plan.info/LandingPage.aspx");
		cl.login();
		System.exit(0);
		
		cl.executeTestStep("rfc_register_free_trial", "click");
		cl.executeTestStep("rfc_email", "set");
		cl.executeTestStep("rfc_confirm_email", "set");
		cl.executeTestStep("rfc_first_name", "set");
		cl.executeTestStep("rfc_last_name", "set");
		cl.executeTestStep("rfc_company_name", "set");
		cl.executeTestStep("rfc_continue", "click");
		
		//cl.validateAlert("This username has already been used - please choose another one or else select Login to gain access to the system using this username");
				
		//Page 2
		cl.executeTestStep("rfc_country", "select");
		cl.executeTestStep("rfc_password", "set");
		cl.executeTestStep("rfc_confirm_password", "set");
		cl.executeTestStep("rfc_security_question", "select");
		cl.executeTestStep("rfc_security_answer", "set");
		cl.executeTestStep("rfc_accept_terms", "click");
		cl.executeTestStep("rfc_begin_free_trial", "click");
		
		cl.validateAlert("An activation e-mail has been sent to the address that you provided. Please follow the link in that message to activate your account. \n\n If you have not received the message within the next 5 minutes please check your spam folder.");
		
		cl.resultfinal();
		
	}
}
