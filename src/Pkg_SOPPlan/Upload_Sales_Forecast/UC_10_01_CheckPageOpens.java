package Pkg_SOPPlan.Upload_Sales_Forecast;

import Pkg_SOPPlan.commonLibrary;

public class UC_10_01_CheckPageOpens {

	public static void main(String[] args) {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "10_Upload_Sales_Forecast";
		cl.testCaseName = "UC_10_01_CheckPageOpens";
		cl.tableName = "tbl_upload_sales_forecast";
		cl.useCaseName = "UC_10_01_CheckPageOpens";
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
		
		cl.executeTestStep("upl_see_an_example", "click");
		
		cl.switchToNewWindow();
		
		cl.validateCurrentURL("http://www.so-plan.info/images/Sales%20History%20Data%20Upload%20Monthly%20mdy_New.jpg");
		
		cl.closeNewWindow();
		cl.resultfinal();
	}
}