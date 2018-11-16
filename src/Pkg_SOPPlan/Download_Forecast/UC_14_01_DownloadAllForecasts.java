package Pkg_SOPPlan.Download_Forecast;

import Pkg_SOPPlan.commonLibrary;

public class UC_14_01_DownloadAllForecasts {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "14_Download_Forecast";
		cl.testCaseName = "UC_14_01_DownloadAllForecasts";
		cl.tableName = "tbl_download_forecast";
		cl.useCaseName = "UC_14_01_DownloadAllForecasts";
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
			cl.executeTestStep("dsf_menu", "mouseover");
			cl.executeTestStep("dsf_menu", "click");
		}
		
		cl.executeTestStep("dsf_download_all_forecasts", "click");
		
		cl.validateAlert("We are extracting the data and will e-mail it to you within 1hour");
		
		cl.clickAlert("ok");
				
		cl.resultfinal();
	}
}
