package Pkg_SOPPlan.Manage_Company_Information;

import Pkg_SOPPlan.commonLibrary;

public class UC_02_03_ValidateSupportInformations {

	public static void main(String[] args) {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "02_Manage_Company_Information";
		cl.testCaseName = "UC_02_03_ValidateSupportInformations";
		cl.tableName = "tbl_manage_company_information";
		cl.useCaseName = "UC_02_03_ValidateSupportInformations";
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
		
		cl.executeTestStep("mci_admin_display_name_help", "mouseover");
		cl.executeTestStep("mci_admin_display_name_help", "hover_validate");
		cl.executeTestStep("mci_what_is_this", "click");
		
		cl.switchToNewWindow();
		
		cl.executeTestStep("mci_new_window_sales_volume_indicator", "validate");
		cl.executeTestStep("mci_conversion_factor", "click");
		cl.executeTestStep("mci_new_window_conversion_factor", "validate");
				
		cl.closeNewWindow();
		
		cl.resultfinal();
	}
}
