package Pkg_SOPPlan.Manage_Customers;

import java.awt.AWTException;

import Pkg_SOPPlan.commonLibrary;

public class UC_05_16_DeleteAllAndAddCustomers {

	public static void main(String[] args) throws InterruptedException, AWTException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "05_Manage_Customers";
		cl.testCaseName = "UC_05_16_DeleteAllAndAddCustomers";
		cl.tableName = "tbl_manage_customers";
		cl.useCaseName = "UC_05_16_DeleteAllAndAddCustomers";
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
		
		cl.deleteAllProducts("ctl00_ContentMenu_dgEditSalesArea", "ctl00_ContentMenu_chkSelectCustomers", "ctl00_ContentMenu_btnEditAddSalesArea");
		
		Thread.sleep(2000);
		
		cl.executeTestStep("mcu_add_customers_using_excel_menu", "click");
		Thread.sleep(2000);
				
		//Upload CSV File
		cl.executeTestStep("mus_browse_excel_file", "click");
		Thread.sleep(1000);
		cl.selectFile("mus_browse_csv_file");
		Thread.sleep(2000);
		cl.executeTestStep("mus_upload_excel_customers", "click");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(4000);
		cl.executeTestStep("mus_upload_excel_customers", "click");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		
		
		cl.resultfinal();
		
		cl.exitCurrentTest();
	}
}