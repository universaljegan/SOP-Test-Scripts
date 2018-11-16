package Pkg_SOPPlan.Download_Forecast;

import Pkg_SOPPlan.commonLibrary;

public class UC_14_03_ValidateNonSelectionAlert {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "14_Download_Forecast";
		cl.testCaseName = "UC_14_03_ValidateNonSelectionAlert";
		cl.tableName = "tbl_download_forecast";
		cl.useCaseName = "UC_14_03_ValidateNonSelectionAlert";
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
		
		cl.executeTestStep("dsf_download", "click");
		
		cl.validateAlert("Please select product category and customers");
		
		cl.clickAlert("ok");
				
		cl.resultfinal();
	}
}
