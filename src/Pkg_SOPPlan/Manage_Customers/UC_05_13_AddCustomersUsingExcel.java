package Pkg_SOPPlan.Manage_Customers;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;

import Pkg_SOPPlan.commonLibrary;

public class UC_05_13_AddCustomersUsingExcel {

	public static void main(String[] args) throws InterruptedException, AWTException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "05_Manage_Customers";
		cl.testCaseName = "UC_05_13_AddCustomersUsingExcel";
		cl.tableName = "tbl_manage_customers";
		cl.useCaseName = "UC_05_13_AddCustomersUsingExcel";
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
		
		cl.executeTestStep("mcu_add_customers_using_excel_menu", "click");
		Thread.sleep(2000);
		
		//Validate CSV alert
		cl.executeTestStep("mus_browse_excel_file", "click");
		Thread.sleep(1000);
		cl.selectFile("mus_browse_excel_file");
		
		Thread.sleep(2000);
		cl.executeTestStep("mus_upload_excel_customers", "click");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(1000);
		cl.validateAlert("Please upload the file in csv format");
		Thread.sleep(1000);
		cl.clickAlert("ok");
		Thread.sleep(3000);
		
		//Upload Excel File
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
		
		cl.mpc_excel_upload_error_validation_customers("2", "2", "Customer already exists in the system");
		cl.mpc_excel_upload_error_validation_customers("4", "2", "Customer already exists in the system");
		cl.mpc_excel_upload_error_validation_customers("11", "2", "Customer relationship manager is not valid");
		cl.mpc_excel_upload_error_validation_customers("14", "2", "Customer group name is not valid");
		cl.mpc_excel_upload_error_validation_customers("18", "2", "Duplicated customer name");
		
		cl.resultfinal();
	}
}
