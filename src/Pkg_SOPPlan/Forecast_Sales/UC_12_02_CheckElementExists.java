package Pkg_SOPPlan.Forecast_Sales;

import Pkg_SOPPlan.commonLibrary;

public class UC_12_02_CheckElementExists {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "12_Forecast_Sales";
		cl.testCaseName = "UC_12_02_CheckElementExists";
		cl.tableName = "tbl_forecast_sales";
		cl.useCaseName = "UC_12_02_CheckElementExists";
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
			cl.executeTestStep("fsl_menu", "mouseover");
			cl.executeTestStep("fsl_menu", "click");
		}
		
		cl.switchToNewWindow();
		
		cl.executeTestStep("fsl_forecast_by", "exist");
		cl.executeTestStep("fsl_product_category", "exist");
		cl.executeTestStep("fsl_forecast_type", "exist");
		cl.executeTestStep("fsl_customer", "exist");
		
		cl.executeTestStep("fsl_reset_forecast", "exist");
		cl.executeTestStep("fsl_statistical_forecast", "exist");
		
		cl.closeNewWindow();
				
		cl.resultfinal();
	}
}
