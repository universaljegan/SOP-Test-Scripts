package Pkg_SOPPlan.Upload_Sales_History;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;

import Pkg_SOPPlan.commonLibrary;

public class UC_09_04_UploadWithErrors {

	public static void main(String[] args) throws InterruptedException, AWTException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "09_Upload_Sales_History";
		cl.testCaseName = "UC_09_04_UploadWithErrors";
		cl.tableName = "tbl_upload_sales_history";
		cl.useCaseName = "UC_09_04_UploadWithErrors";
		cl.readXML();
		cl.loadTestData();
		
		if(cl.isLoginRequired.equals("YES"))
		{
			cl.loadURL("");
			cl.login3();
		}
		else
		{
			cl.createResultFolder();
		}
		
		if(cl.isMenuNavigationRequired.equals("YES"))
		{
			cl.executeTestStep("upl_upload_data_menu", "mouseover");
			cl.executeTestStep("upl_upload_sales_history_menu", "click");
		}
		
		Thread.sleep(2000);
		
		//Upload CSV File
		cl.executeTestStep("mus_browse_excel_file", "click");
		Thread.sleep(1000);
		cl.selectFile("mus_browse_csv_file");
		Thread.sleep(2000);
		cl.executeTestStep("upl_upload_excel_sales_history", "click");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		
		cl.mpc_excel_upload_error_validation_sales_history("2", "2", "Date omitted");
		cl.mpc_excel_upload_error_validation_sales_history("3", "2", "Invalid date format");
		cl.mpc_excel_upload_error_validation_sales_history("4", "2", "Two dates in same month");
		cl.mpc_excel_upload_error_validation_sales_history("5", "2", "Sales history cannot be future date, Please remove all Future Dates.");
		cl.mpc_excel_upload_error_validation_sales_history("6", "2", "Sales history cannot be future date, Please remove all Future Dates.");
		cl.mpc_excel_upload_error_validation_sales_history("7", "2", "No product number");
		cl.mpc_excel_upload_error_validation_sales_history("8", "2", "No customer");
		cl.mpc_excel_upload_error_validation_sales_history("9", "2", "Data not in numeric format");
		cl.mpc_excel_upload_error_validation_sales_history("10", "2", "Product number not recognized");
		cl.mpc_excel_upload_error_validation_sales_history("11", "2", "Customer not recognized");
		cl.mpc_excel_upload_error_validation_sales_history("12", "2", "Sales history cannot have a negative value");
		cl.mpc_excel_upload_error_validation_sales_history("13", "2", "No customer");
		cl.mpc_excel_upload_error_validation_sales_history("14", "2", "Duplicated Product / customer");
		
		cl.resultfinal();
	}
}
