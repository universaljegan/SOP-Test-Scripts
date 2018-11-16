package Pkg_SOPPlan.Manage_Customers;

import Pkg_SOPPlan.commonLibrary;

public class UC_05_07_NavigateAwayEditCusGroup {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "05_Manage_Customers";
		cl.testCaseName = "UC_05_07_NavigateAwayEditCusGroup";
		cl.tableName = "tbl_manage_customers";
		cl.useCaseName = "UC_05_07_NavigateAwayEditCusGroup";
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
		
		cl.newURL("htpp://www.cnn.com");
		Thread.sleep(2000);
		cl.clickAlert("Stay on Page");
		Thread.sleep(5000);
		
		cl.resultfinal();
	}
}