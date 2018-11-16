package Pkg_SOPPlan.Download_Forecast;

import Pkg_SOPPlan.commonLibrary;

public class UC_14_00_LoginDownloadForecast {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "14_Download_Forecast";
		cl.testCaseName = "UC_14_00_LoginDownloadForecast";
		cl.tableName = "tbl_download_forecast";
		cl.useCaseName = "UC_14_00_LoginDownloadForecast";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("");
		cl.login();
		
		cl.executeTestStep("dsf_menu", "mouseover");
		cl.executeTestStep("dsf_menu", "click");
		
		Thread.sleep(2000);
		cl.resultfinal();
	}
}