package Pkg_SOPPlan.Manage_Customers;

import Pkg_SOPPlan.commonLibrary;

public class UC_05_10_OpenAddCustomersManually {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "05_Manage_Customers";
		cl.testCaseName = "UC_05_10_OpenAddCustomersManually";
		cl.tableName = "tbl_manage_customers";
		cl.useCaseName = "UC_05_10_OpenAddCustomersManually";
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
		cl.checkSelectBoxValues("ctl00_ContentMenu_SaleGrid_Sales1_ddlSalesAreasManager1", "mcu_edit_account_manager");
		cl.checkSelectBoxValues("ctl00_ContentMenu_SaleGrid_Sales1_ddlCustomerGroups", "mcu_edit_customer_groups");
		
		commonLibrary.curTableRow = "2";
		cl.checkSelectBoxValues("ctl00_ContentMenu_SaleGrid_Sales1_ddlSalesAreasManager1", "mcu_edit_account_manager");
		cl.checkSelectBoxValues("ctl00_ContentMenu_SaleGrid_Sales1_ddlCustomerGroups", "mcu_edit_customer_groups");

		commonLibrary.curTableRow = "3";
		cl.checkSelectBoxValues("ctl00_ContentMenu_SaleGrid_Sales1_ddlSalesAreasManager1", "mcu_edit_account_manager");
		cl.checkSelectBoxValues("ctl00_ContentMenu_SaleGrid_Sales1_ddlCustomerGroups", "mcu_edit_customer_groups");

		commonLibrary.curTableRow = "4";
		cl.checkSelectBoxValues("ctl00_ContentMenu_SaleGrid_Sales1_ddlSalesAreasManager1", "mcu_edit_account_manager");
		cl.checkSelectBoxValues("ctl00_ContentMenu_SaleGrid_Sales1_ddlCustomerGroups", "mcu_edit_customer_groups");

		commonLibrary.curTableRow = "5";
		cl.checkSelectBoxValues("ctl00_ContentMenu_SaleGrid_Sales1_ddlSalesAreasManager1", "mcu_edit_account_manager");
		cl.checkSelectBoxValues("ctl00_ContentMenu_SaleGrid_Sales1_ddlCustomerGroups", "mcu_edit_customer_groups");

		commonLibrary.curTableRow = "6";
		cl.checkSelectBoxValues("ctl00_ContentMenu_SaleGrid_Sales1_ddlSalesAreasManager1", "mcu_edit_account_manager");
		cl.checkSelectBoxValues("ctl00_ContentMenu_SaleGrid_Sales1_ddlCustomerGroups", "mcu_edit_customer_groups");

		commonLibrary.curTableRow = "7";
		cl.checkSelectBoxValues("ctl00_ContentMenu_SaleGrid_Sales1_ddlSalesAreasManager1", "mcu_edit_account_manager");
		cl.checkSelectBoxValues("ctl00_ContentMenu_SaleGrid_Sales1_ddlCustomerGroups", "mcu_edit_customer_groups");

		commonLibrary.curTableRow = "8";
		cl.checkSelectBoxValues("ctl00_ContentMenu_SaleGrid_Sales1_ddlSalesAreasManager1", "mcu_edit_account_manager");
		cl.checkSelectBoxValues("ctl00_ContentMenu_SaleGrid_Sales1_ddlCustomerGroups", "mcu_edit_customer_groups");
		
		cl.resultfinal();
	}
}