package Pkg_SOPPlan.Manage_Customers;

import Pkg_SOPPlan.commonLibrary;

public class UC_05_08_FirstSetOfChangesCusGroups {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "05_Manage_Customers";
		cl.testCaseName = "UC_05_08_FirstSetOfChangesCusGroups";
		cl.tableName = "tbl_manage_customers";
		cl.useCaseName = "UC_05_08_FirstSetOfChangesCusGroups";
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
		
		cl.executeTestStep("mcu_edit_customer_groups_menu", "click");
		
		cl.selectPage("ctl00_ContentMenu_ddlCustGroups", "Page 2");
		
		commonLibrary.curTableRow = "1";
		cl.executeTestStep("mcu_edit_customer_groups", "set");
		cl.executeTestStep("mcu_edit_account_manager", "select");
		cl.executeTestStep("mcu_edit_description", "set");

		commonLibrary.curTableRow = "2";
		cl.executeTestStep("mcu_edit_customer_groups", "set");
		cl.executeTestStep("mcu_edit_account_manager", "select");
		cl.executeTestStep("mcu_edit_description", "set");
		
		commonLibrary.curTableRow = "3";
		cl.executeTestStep("mcu_edit_customer_groups", "set");
		cl.executeTestStep("mcu_edit_account_manager", "select");
		cl.executeTestStep("mcu_edit_description", "set");

		cl.executeTestStep("mcu_save_manage_customers_edit", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.clickAlert("ok"); //For Leave page alert, need to remove this line
		Thread.sleep(2000);
		cl.validateAlert("Some rows of data had errors and were not uploaded. The rest of the data was successfully uploaded. See the table below for more information.");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		commonLibrary.curTableRow = "1";
		cl.executeTestStep("mcu_customer_group_edit_existing_error", "validate");
		
		commonLibrary.curTableRow = "2";
		cl.executeTestStep("mcu_customer_group_edit_empty_error", "validate");		
		
		//Validate the Values after Refresh
		cl.executeTestStep("mcu_edit_refresh", "click");		
		cl.selectPage("ctl00_ContentMenu_ddlCustGroups", "Page 2");
		
		cl.tableValidationDynamic("ctl00_ContentMenu_dgEditCustomerGroup_ctl", "_txtEditCustomerGroup", "03", "ctl00_ContentMenu_dgEditCustomerGroup", "mcu_edit_customer_groups_2", "ctl00_ContentMenu_ddlCustGroups", "", "", "");
		cl.tableValidationDynamic("ctl00_ContentMenu_dgEditCustomerGroup_ctl", "_ddlCustomerGroupManager", "03", "ctl00_ContentMenu_dgEditCustomerGroup", "mcu_edit_account_manager_2", "ctl00_ContentMenu_ddlCustGroups", "", "", "");
		
		cl.resultfinal();
	}
}