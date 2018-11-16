package Pkg_SOPPlan.Manage_Products;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;

import Pkg_SOPPlan.commonLibrary;

public class UC_04_13_AddProductsUsingExcel {

	public static void main(String[] args) throws InterruptedException, AWTException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "04_Manage_Products";
		cl.testCaseName = "UC_04_13_AddProductsUsingExcel";
		cl.tableName = "tbl_manage_products";
		cl.useCaseName = "UC_04_13_AddProductsUsingExcel";
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
			cl.executeTestStep("mpc_manage_products_menu", "click");
		}
		
		cl.executeTestStep("mpc_add_products_using_excel_menu", "click");
		Thread.sleep(2000);
		
		//Validate CSV alert
		cl.executeTestStep("mus_browse_excel_file", "click");
		cl.selectFile("mus_browse_excel_file");
		
		Thread.sleep(2000);
		cl.executeTestStep("mus_upload_excel", "click");
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
		cl.executeTestStep("mus_upload_excel", "click");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		
		cl.mpc_excel_upload_error_validation("3", "2", "Product number already exists / Product category is not valid");
		cl.mpc_excel_upload_error_validation("6", "2", "Product category is not valid");
		cl.mpc_excel_upload_error_validation("7", "2", "Volume indicator conversion factor cannot be zero");
		cl.mpc_excel_upload_error_validation("8", "2", "Product number already exists / Selling price must be a number / Volume indicator conversion factor must be a positive number");
		cl.mpc_excel_upload_error_validation("9", "2", "Volume indicator conversion factor must be a positive number");
		cl.mpc_excel_upload_error_validation("12", "2", "Duplicated product number");
		cl.mpc_excel_upload_error_validation("13", "2", "Selling price must be a number");
		cl.mpc_excel_upload_error_validation("16", "2", "Enter product number / Selling Price cannot be negative");
		cl.mpc_excel_upload_error_validation("18", "2", "Enter product name");
		
		cl.resultfinal();
	}
}
