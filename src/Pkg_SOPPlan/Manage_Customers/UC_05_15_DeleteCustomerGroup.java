package Pkg_SOPPlan.Manage_Customers;

import Pkg_SOPPlan.commonLibrary;

public class UC_05_15_DeleteCustomerGroup {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "05_Manage_Customers";
		cl.testCaseName = "UC_05_15_DeleteCustomerGroup";
		cl.tableName = "tbl_manage_customers";
		cl.useCaseName = "UC_05_15_DeleteCustomerGroup";
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
		
		Thread.sleep(2000);
		cl.tableValidationStatic("ctl00_ContentMenu_dgEditCustomerGroup_ctl", "_txtEditCustomerGroup", "03", "ctl00_ContentMenu_dgEditCustomerGroup", "mcu_edit_customer_groups", "", "delete", "ctl00_ContentMenu_dgEditCustomerGroup_ctl", "_chkCustomerGroup");

		cl.executeTestStep("mcu_save_manage_customers_edit", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.clickAlert("ok"); //For Leave page alert, need to remove this line
		Thread.sleep(2000);
		cl.validateAlert("Customer groups have been successfully updated");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		cl.executeTestStep("mcu_edit_customers_menu", "click");		
		Thread.sleep(2000);
		
		cl.selectPage("ctl00_ContentMenu_ddlCustomer", "Page 3");		
		Thread.sleep(2000);
		
		cl.tableValidationStatic("ctl00_ContentMenu_dgEditSalesArea_ctl", "_txtEditSalesAreaName", "03", "ctl00_ContentMenu_dgEditSalesArea", "mcu_customer_edit_name_2", "", "", "", "");
		cl.tableValidationStatic("ctl00_ContentMenu_dgEditSalesArea_ctl", "_txtEditSalesAreaName", "03", "ctl00_ContentMenu_dgEditSalesArea", "mcu_customer_edit_group_2", "", "", "", "");
		Thread.sleep(2000);
		
		cl.resultfinal();
	}
}