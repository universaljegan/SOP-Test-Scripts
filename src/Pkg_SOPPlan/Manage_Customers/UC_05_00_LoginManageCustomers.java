package Pkg_SOPPlan.Manage_Customers;

import Pkg_SOPPlan.commonLibrary;

public class UC_05_00_LoginManageCustomers {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "05_Manage_Customers";
		cl.testCaseName = "UC_05_00_LoginManageCustomers";
		cl.tableName = "tbl_manage_customers";
		cl.useCaseName = "UC_05_00_LoginManageCustomers";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("");
		cl.login();
		
		cl.executeTestStep("mci_administrator_menu", "mouseover");
		cl.executeTestStep("mcu_manage_customers_menu", "click");
		cl.resultfinal();
	}
}
