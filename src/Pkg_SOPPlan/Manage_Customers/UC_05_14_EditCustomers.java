package Pkg_SOPPlan.Manage_Customers;

import Pkg_SOPPlan.commonLibrary;

public class UC_05_14_EditCustomers {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "05_Manage_Customers";
		cl.testCaseName = "UC_05_14_EditCustomers";
		cl.tableName = "tbl_manage_customers";
		cl.useCaseName = "UC_05_14_EditCustomers";
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
		
		cl.executeTestStep("mcu_edit_customers_menu", "click");
		
		Thread.sleep(2000);
		
		cl.selectPage("ctl00_ContentMenu_ddlCustomer", "Page 4");
		
		Thread.sleep(2000);
		
		commonLibrary.curTableRow = "1";
		cl.executeTestStep("mcu_customer_edit_name", "set");
		cl.executeTestStep("mcu_customer_edit_rel_manager", "select");
		cl.executeTestStep("mcu_customer_edit_group", "select");
		cl.executeTestStep("mcu_customer_edit_description", "set");
		
		commonLibrary.curTableRow = "2";
		cl.executeTestStep("mcu_customer_edit_name", "set");
		cl.executeTestStep("mcu_customer_edit_rel_manager", "select");
		cl.executeTestStep("mcu_customer_edit_group", "select");
		cl.executeTestStep("mcu_customer_edit_description", "set");

		commonLibrary.curTableRow = "3";
		cl.executeTestStep("mcu_customer_edit_name", "set");
		cl.executeTestStep("mcu_customer_edit_rel_manager", "select");
		cl.executeTestStep("mcu_customer_edit_group", "select");
		cl.executeTestStep("mcu_customer_edit_description", "set");

		commonLibrary.curTableRow = "4";
		cl.executeTestStep("mcu_customer_edit_name", "set");
		cl.executeTestStep("mcu_customer_edit_rel_manager", "select");
		cl.executeTestStep("mcu_customer_edit_group", "select");
		cl.executeTestStep("mcu_customer_edit_description", "set");

		commonLibrary.curTableRow = "5";
		cl.executeTestStep("mcu_customer_edit_name", "set");
		cl.executeTestStep("mcu_customer_edit_rel_manager", "select");
		cl.executeTestStep("mcu_customer_edit_group", "select");
		cl.executeTestStep("mcu_customer_edit_description", "set");

		cl.executeTestStep("mcu_customer_edit_save", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.validateAlert("Some rows of data had errors and were not uploaded. The rest of the data was successfully uploaded. See the table below for more information.");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		//Error Validation
		commonLibrary.curTableRow = "2";
		cl.executeTestStep("mcu_customer_edit_empty_error", "validate");
		commonLibrary.curTableRow = "4";
		cl.executeTestStep("mcu_customer_edit_existing_error", "validate");
		
		cl.executeTestStep("mcu_customer_refresh", "click");
		
		Thread.sleep(2000);
		cl.tableValidationStatic("ctl00_ContentMenu_dgEditSalesArea_ctl", "_txtEditSalesAreaName", "03", "ctl00_ContentMenu_dgEditSalesArea", "mcu_customer_edit_name_2", "", "delete", "ctl00_ContentMenu_dgEditSalesArea_ctl", "_chkSalesArea");
		Thread.sleep(2000);
		
		cl.executeTestStep("mcu_customer_edit_save", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.validateAlert("Customers have been successfully updated");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		cl.selectPage("ctl00_ContentMenu_ddlCustomer", "Page 2");
		cl.executeTestStep("mcu_customer_select_all_delete", "click");
		
		cl.executeTestStep("mcu_customer_edit_save", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.validateAlert("Customers have been successfully updated");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		cl.resultfinal();
	}
}