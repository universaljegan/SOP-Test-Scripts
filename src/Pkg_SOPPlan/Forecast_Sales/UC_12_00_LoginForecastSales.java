package Pkg_SOPPlan.Forecast_Sales;

import Pkg_SOPPlan.commonLibrary;

public class UC_12_00_LoginForecastSales {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "12_Forecast_Sales";
		cl.testCaseName = "UC_12_00_LoginForecastSales";
		cl.tableName = "tbl_forecast_sales";
		cl.useCaseName = "UC_12_00_LoginForecastSales";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("");
		cl.login();
		
		cl.executeTestStep("fsl_menu", "mouseover");
		cl.executeTestStep("fsl_menu", "click");
		
		Thread.sleep(2000);
		cl.resultfinal();
	}
}