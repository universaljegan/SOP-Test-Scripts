package Pkg_SOPPlan.Manage_Customers;

import Pkg_SOPPlan.commonLibrary;

public class UC_05_04_SaveWithErrorsCusGroups {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "05_Manage_Customers";
		cl.testCaseName = "UC_05_04_SaveWithErrorsCusGroups";
		cl.tableName = "tbl_manage_customers";
		cl.useCaseName = "UC_05_04_SaveWithErrorsCusGroups";
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
		
		commonLibrary.curTableRow = "1";
		cl.executeTestStep("mcu_add_customer_group", "set");
		cl.executeTestStep("mcu_add_customer_account_manager", "select");
		cl.executeTestStep("mcu_add_customer_description", "set");

		commonLibrary.curTableRow = "2";
		cl.executeTestStep("mcu_add_customer_group", "set");
		cl.executeTestStep("mcu_add_customer_account_manager", "select");
		cl.executeTestStep("mcu_add_customer_description", "set");
		
		commonLibrary.curTableRow = "3";
		cl.executeTestStep("mcu_add_customer_group", "set");
		cl.executeTestStep("mcu_add_customer_account_manager", "select");
		cl.executeTestStep("mcu_add_customer_description", "set");

		commonLibrary.curTableRow = "4";
		cl.executeTestStep("mcu_add_customer_group", "set");
		cl.executeTestStep("mcu_add_customer_account_manager", "select");
		cl.executeTestStep("mcu_add_customer_description", "set");

		commonLibrary.curTableRow = "5";
		cl.executeTestStep("mcu_add_customer_group", "set");
		cl.executeTestStep("mcu_add_customer_account_manager", "select");
		cl.executeTestStep("mcu_add_customer_description", "set");
		
		cl.executeTestStep("mcu_save_manage_customers", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.clickAlert("ok"); //For Leave page alert, need to remove this line
		Thread.sleep(2000);
		cl.validateAlert("Some rows of data had errors and were not uploaded. The rest of the data was successfully uploaded. See the table below for more information.");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		commonLibrary.curTableRow = "1";
		cl.executeTestStep("mcu_customer_group_existing_error", "validate");
				
		commonLibrary.curTableRow = "2";
		cl.executeTestStep("mcu_customer_group_empty_error", "validate");
		
		commonLibrary.curTableRow = "3";
		cl.executeTestStep("mcu_customer_group_empty_error", "validate");		
		
		cl.executeTestStep("mcu_clear_all_data_cus_groups", "click");
		
		
		//In Edit Page
		cl.executeTestStep("mcu_edit_customer_groups_menu", "click");
		
//		cl.tableValidationDynamic("ctl00_ContentMenu_dgEditCustomerGroup_ctl", "_txtEditCustomerGroup", "03", "ctl00_ContentMenu_dgEditCustomerGroup", "mcu_edit_customer_groups", "ctl00_ContentMenu_ddlCustGroups", "", "", "");

		
		//Page 1 Delete
		cl.executeTestStep("mcu_select_all_for_delete", "click");
		
		cl.executeTestStep("mcu_save_manage_customers_edit", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.clickAlert("ok"); //For Leave page alert, need to remove this line
		Thread.sleep(2000);
		cl.validateAlert("Customer groups have been successfully updated");
		Thread.sleep(2000);		
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		//Page 2 Delete
		cl.executeTestStep("mcu_select_all_for_delete", "click");
		
		cl.executeTestStep("mcu_save_manage_customers_edit", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.clickAlert("ok"); //For Leave page alert, need to remove this line
		Thread.sleep(2000);
		cl.validateAlert("Customer groups have been successfully updated");
		Thread.sleep(2000);		
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		cl.resultfinal();
	}
}