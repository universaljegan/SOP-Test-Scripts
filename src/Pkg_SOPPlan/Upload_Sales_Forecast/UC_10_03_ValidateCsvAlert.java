package Pkg_SOPPlan.Upload_Sales_Forecast;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;

import Pkg_SOPPlan.commonLibrary;

public class UC_10_03_ValidateCsvAlert {

	public static void main(String[] args) throws InterruptedException, AWTException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "10_Upload_Sales_Forecast";
		cl.testCaseName = "UC_10_03_ValidateCsvAlert";
		cl.tableName = "tbl_upload_sales_forecast";
		cl.useCaseName = "UC_10_03_ValidateCsvAlert";
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
			cl.executeTestStep("upl_upload_sales_forecast_menu", "click");
		}
		
		Thread.sleep(2000);
		
		//Validate CSV alert
		cl.executeTestStep("mus_browse_excel_file", "click");
		cl.selectFile("mus_browse_excel_file");
		
		Thread.sleep(2000);
		cl.executeTestStep("upl_upload_excel_sales_forecast", "click");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(1000);
		cl.validateAlert("Please upload the file in csv format");
		Thread.sleep(1000);
		cl.clickAlert("ok");
		Thread.sleep(3000);
		
		cl.resultfinal();
	}
}
