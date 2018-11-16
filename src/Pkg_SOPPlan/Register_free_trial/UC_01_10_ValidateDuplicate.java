package Pkg_SOPPlan.Register_free_trial;

import Pkg_SOPPlan.commonLibrary;

public class UC_01_10_ValidateDuplicate 
{
	public static void main(String[] args)
	{
		commonLibrary cl = new commonLibrary();
		cl.packageName = "01_Register_free_trial";
		cl.testCaseName = "TC001_RegisterFreeTrial";
		cl.tableName = "tbl_register_free_trial";
		cl.useCaseName = "UC_01_07_B_ValidateRegisterFreeTrialStep2";
		cl.readXML();
		cl.loadTestData();	
		
		//Page 1
		cl.loadURL("");
		
		//Validate Duplicate Username
		cl.executeTestStep("rfc_register_free_trial", "click");
		cl.executeTestStep("rfc_email", "set");
		cl.executeTestStep("rfc_confirm_email", "set");
		cl.executeTestStep("rfc_first_name", "set");
		cl.executeTestStep("rfc_last_name", "set");
		cl.executeTestStep("rfc_company_name", "set");
		cl.executeTestStep("rfc_continue", "click");
		
		cl.validateAlert("This username has already been used - please choose another one or else select Login to gain access to the system using this username");
		cl.clickAlert("ok");
		
		//Validate Duplicate Company
		cl.executeTestStep("rfc_register_free_trial", "click");
		cl.map.put("rfc_email", "newMailId@max2cs.com"); //Change - Update new mail id, in order to validate duplicate company
		cl.executeTestStep("rfc_email", "set");
		cl.map.put("rfc_confirm_email", "newMailId@max2cs.com"); //Change
		cl.executeTestStep("rfc_confirm_email", "set");
		cl.executeTestStep("rfc_first_name", "set");
		cl.executeTestStep("rfc_last_name", "set");
		cl.executeTestStep("rfc_company_name", "set");
		cl.executeTestStep("rfc_continue", "click");
		
		cl.validateAlert("Sorry that company name already exists on the system. Please choose another name or else log into the system using your e-mail address as the username");
		cl.clickAlert("ok");
		cl.resultfinal();
		cl.exitCurrentTest();
	}
}
