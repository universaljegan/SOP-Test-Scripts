package Pkg_SOPPlan.Manage_Customers;

import Pkg_SOPPlan.commonLibrary;

public class UC_05_01_CheckPageOpens {

	public static void main(String[] args) {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "05_Manage_Customers";
		cl.testCaseName = "UC_05_01_CheckPageOpens";
		cl.tableName = "tbl_manage_customers";
		cl.useCaseName = "UC_05_01_CheckPageOpens";
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
		
		if(cl.isMenuNavigationRequired.equals("YES"))
		{
			cl.executeTestStep("mci_administrator_menu", "mouseover");
			cl.executeTestStep("mcu_manage_customers_menu", "click");
		}
		
		cl.executeTestStep("mcu_add_customer_groups_menu", "click");
		cl.executeTestStep("mcu_what_are_customer_groups_link", "click");
		
		cl.switchToNewWindow();
		
		cl.executeTestStep("mcu_new_window_customer_groups_title", "validate");
		cl.executeTestStep("mcu_new_window_customer_groups_content", "validate");
		
		cl.closeNewWindow();
		cl.resultfinal();
	}
}


