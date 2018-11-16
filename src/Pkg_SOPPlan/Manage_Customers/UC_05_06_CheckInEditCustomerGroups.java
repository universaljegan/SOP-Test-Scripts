package Pkg_SOPPlan.Manage_Customers;

import Pkg_SOPPlan.commonLibrary;

public class UC_05_06_CheckInEditCustomerGroups {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "05_Manage_Customers";
		cl.testCaseName = "UC_05_06_CheckInEditCustomerGroups";
		cl.tableName = "tbl_manage_customers";
		cl.useCaseName = "UC_05_06_CheckInEditCustomerGroups";
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
		
		commonLibrary.curTableRow = "1";
		cl.checkSelectBoxValues("ctl00_ContentMenu_dgEditCustomerGroup_ctl03_ddlCustomerGroupManager", "mcu_edit_account_manager");
		
		commonLibrary.curTableRow = "2";
		cl.checkSelectBoxValues("ctl00_ContentMenu_dgEditCustomerGroup_ctl03_ddlCustomerGroupManager", "mcu_edit_account_manager");

		commonLibrary.curTableRow = "3";
		cl.checkSelectBoxValues("ctl00_ContentMenu_dgEditCustomerGroup_ctl03_ddlCustomerGroupManager", "mcu_edit_account_manager");

		commonLibrary.curTableRow = "4";
		cl.checkSelectBoxValues("ctl00_ContentMenu_dgEditCustomerGroup_ctl03_ddlCustomerGroupManager", "mcu_edit_account_manager");

		commonLibrary.curTableRow = "5";
		cl.checkSelectBoxValues("ctl00_ContentMenu_dgEditCustomerGroup_ctl03_ddlCustomerGroupManager", "mcu_edit_account_manager");

		commonLibrary.curTableRow = "6";
		cl.checkSelectBoxValues("ctl00_ContentMenu_dgEditCustomerGroup_ctl03_ddlCustomerGroupManager", "mcu_edit_account_manager");

		commonLibrary.curTableRow = "7";
		cl.checkSelectBoxValues("ctl00_ContentMenu_dgEditCustomerGroup_ctl03_ddlCustomerGroupManager", "mcu_edit_account_manager");

		commonLibrary.curTableRow = "8";
		cl.checkSelectBoxValues("ctl00_ContentMenu_dgEditCustomerGroup_ctl03_ddlCustomerGroupManager", "mcu_edit_account_manager");
		
		cl.resultfinal();
	}
}