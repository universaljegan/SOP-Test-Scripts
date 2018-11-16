package Pkg_SOPPlan.Manage_Customers;

import Pkg_SOPPlan.commonLibrary;

public class UC_05_05_AddSomeMoreCustomerGroup {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "05_Manage_Customers";
		cl.testCaseName = "UC_05_05_AddSomeMoreCustomerGroup";
		cl.tableName = "tbl_manage_customers";
		cl.useCaseName = "UC_05_05_AddSomeMoreCustomerGroup";
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
		cl.validateAlert("Customer groups successfully added");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		commonLibrary.curTableRow = "1";
		cl.executeTestStep("mcu_add_customer_group_2", "set");
		cl.executeTestStep("mcu_add_customer_account_manager_2", "select");
		cl.executeTestStep("mcu_add_customer_description_2", "set");

		commonLibrary.curTableRow = "2";
		cl.executeTestStep("mcu_add_customer_group_2", "set");
		cl.executeTestStep("mcu_add_customer_account_manager_2", "select");
		cl.executeTestStep("mcu_add_customer_description_2", "set");
		
		commonLibrary.curTableRow = "3";
		cl.executeTestStep("mcu_add_customer_group_2", "set");
		cl.executeTestStep("mcu_add_customer_account_manager_2", "select");
		cl.executeTestStep("mcu_add_customer_description_2", "set");
		
		cl.executeTestStep("mcu_save_manage_customers", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.clickAlert("ok"); //For Leave page alert, need to remove this line
		Thread.sleep(2000);
		cl.validateAlert("Customer groups successfully added");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		cl.resultfinal();
	}
}