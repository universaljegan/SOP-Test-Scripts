package Pkg_SOPPlan.Manage_Forecast_Groups;

import Pkg_SOPPlan.commonLibrary;

public class UC_15_00_LoginManageForecastGroups {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "15_Manage_Forecast_Groups";
		cl.testCaseName = "UC_15_00_LoginManageForecastGroups";
		cl.tableName = "tbl_manage_forecast_groups";
		cl.useCaseName = "UC_15_00_LoginManageForecastGroups";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("");
		cl.login();
		
		cl.executeTestStep("mci_administrator_menu", "mouseover");
		cl.executeTestStep("mfg_menu", "click");
		cl.resultfinal();
	}
}
