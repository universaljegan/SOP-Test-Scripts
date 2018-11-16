package Pkg_SOPPlan.Manage_Forecast_Groups;

import Pkg_SOPPlan.commonLibrary;

public class UC_15_01_AddForecastingGroups {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "15_Manage_Forecast_Groups";
		cl.testCaseName = "UC_15_01_AddForecastingGroups";
		cl.tableName = "tbl_manage_forecast_groups";
		cl.useCaseName = "UC_15_01_AddForecastingGroups";
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
			cl.executeTestStep("mfg_menu", "click");
		}
		
		cl.executeTestStep("mfg_add_forecasting_groups", "click");		
		
		commonLibrary.curTableRow = "1";
		cl.executeTestStep("mfg_forecast_group_name", "set");
		
		commonLibrary.curTableRow = "2";
		cl.executeTestStep("mfg_forecast_group_name", "set");
		
		cl.executeTestStep("mfg_add_groups_save", "click");
		
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.validateAlert("Group names added successfully");
		Thread.sleep(2000);		
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		cl.resultfinal();
	}
}
