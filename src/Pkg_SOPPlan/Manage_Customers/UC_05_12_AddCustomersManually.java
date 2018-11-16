package Pkg_SOPPlan.Manage_Customers;

import Pkg_SOPPlan.commonLibrary;

public class UC_05_12_AddCustomersManually {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "05_Manage_Customers";
		cl.testCaseName = "UC_05_12_AddCustomersManually";
		cl.tableName = "tbl_manage_customers";
		cl.useCaseName = "UC_05_12_AddCustomersManually";
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
		
		cl.executeTestStep("mcu_add_customers_manually_menu", "click");
		
		commonLibrary.curTableRow = "1";
		cl.executeTestStep("mcu_customer_name", "set");
		cl.executeTestStep("mcu_customer_rel_manager", "select");
		cl.executeTestStep("mcu_customer_group", "select");
		cl.executeTestStep("mcu_customer_description", "set");
		
		commonLibrary.curTableRow = "2";
		cl.executeTestStep("mcu_customer_name", "set");
		cl.executeTestStep("mcu_customer_rel_manager", "select");
		cl.executeTestStep("mcu_customer_group", "select");
		cl.executeTestStep("mcu_customer_description", "set");

		commonLibrary.curTableRow = "3";
		cl.executeTestStep("mcu_customer_name", "set");
		cl.executeTestStep("mcu_customer_rel_manager", "select");
		cl.executeTestStep("mcu_customer_group", "select");
		cl.executeTestStep("mcu_customer_description", "set");

		commonLibrary.curTableRow = "4";
		cl.executeTestStep("mcu_customer_name", "set");
		cl.executeTestStep("mcu_customer_rel_manager", "select");
		cl.executeTestStep("mcu_customer_group", "select");
		cl.executeTestStep("mcu_customer_description", "set");

		commonLibrary.curTableRow = "5";
		cl.executeTestStep("mcu_customer_name", "set");
		cl.executeTestStep("mcu_customer_rel_manager", "select");
		cl.executeTestStep("mcu_customer_group", "select");
		cl.executeTestStep("mcu_customer_description", "set");

		cl.executeTestStep("mcu_customers_save", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.clickAlert("ok"); //For Leave page alert, need to remove this line
		Thread.sleep(2000);
		cl.validateAlert("Some rows of data had errors and were not uploaded. The rest of the data was successfully uploaded. See the table below for more information.");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		commonLibrary.curTableRow = "4";
		cl.executeTestStep("mcu_customer_empty_error", "validate");
		
		cl.resultfinal();
	}
}