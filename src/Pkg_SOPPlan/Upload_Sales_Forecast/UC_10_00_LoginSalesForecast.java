package Pkg_SOPPlan.Upload_Sales_Forecast;

import Pkg_SOPPlan.commonLibrary;

public class UC_10_00_LoginSalesForecast {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "10_Upload_Sales_Forecast";
		cl.testCaseName = "UC_10_00_LoginSalesForecast";
		cl.tableName = "tbl_upload_sales_forecast";
		cl.useCaseName = "UC_10_00_LoginSalesForecast";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("");
		cl.login3();
		
		cl.executeTestStep("upl_upload_data_menu", "mouseover");
		cl.executeTestStep("upl_upload_sales_forecast_menu", "click");
		
		Thread.sleep(2000);
		cl.resultfinal();
	}
}