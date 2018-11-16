package Pkg_SOPPlan.Manage_Company_Information;

import Pkg_SOPPlan.commonLibrary;

public class UC_02_01_CheckInitialData {

	public static void main(String[] args) {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "02_Manage_Company_Information";
		cl.testCaseName = "UC_02_01_CheckInitialData";
		cl.tableName = "tbl_manage_company_information";
		cl.useCaseName = "UC_02_01_CheckInitialData";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("");
		
		cl.executeTestStep("lgi_login_link", "click");
		cl.executeTestStep("lgi_sop_username", "set");
		cl.executeTestStep("lgi_sop_password", "set");
		cl.executeTestStep("lgi_login_button", "click");
		
		cl.executeTestStep("mci_administrator_menu", "mouseover");
		cl.executeTestStep("mci_manage_company_info_menu", "click");
		
		cl.executeTestStep("mci_company_name", "get");
		cl.executeTestStep("mci_country", "get");
		cl.executeTestStep("mci_currency", "get");
		cl.executeTestStep("mci_decimal_value", "get");
		cl.executeTestStep("mci_company_timezone", "get");
//		cl.executeTestStep("mci_period", "getSelectedText");
		cl.executeTestStep("mci_sales_volume_indicator", "get");
		
		cl.executeTestStep("mci_manage_administrator", "click");
		
		cl.executeTestStep("mci_admin_first_name", "innerHTML");
		cl.executeTestStep("mci_admin_last_name", "innerHTML");
		cl.executeTestStep("mci_admin_display_name", "innerHTML");
		cl.executeTestStep("mci_admin_email", "innerHTML");
		
		cl.resultfinal();
	}
}
