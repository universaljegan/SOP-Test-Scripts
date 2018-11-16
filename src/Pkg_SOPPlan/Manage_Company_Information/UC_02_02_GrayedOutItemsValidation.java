package Pkg_SOPPlan.Manage_Company_Information;

import Pkg_SOPPlan.commonLibrary;

public class UC_02_02_GrayedOutItemsValidation {

	public static void main(String[] args) {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "02_Manage_Company_Information";
		cl.testCaseName = "UC_02_02_GrayedOutItemsValidation";
		cl.tableName = "tbl_manage_company_information";
		cl.useCaseName = "UC_02_02_GrayedOutItemsValidation";
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
		
		cl.executeTestStep("mci_administrator_menu", "mouseover");
		cl.executeTestStep("mci_manage_company_info_menu", "click");

		cl.executeTestStep("mci_company_name", "readonly");
		cl.executeTestStep("mci_country", "readonly");
		
//		cl.executeTestStep("mci_manage_administrator", "click");
		
//		cl.executeTestStep("mci_admin_first_name", "readonly");
//		cl.executeTestStep("mci_admin_last_name", "readonly");
//		cl.executeTestStep("mci_admin_email", "readonly");
		
		cl.resultfinal();
	}
}
