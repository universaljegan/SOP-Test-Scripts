package Pkg_SOPPlan.Allocate_Forecaster_Products;

import Pkg_SOPPlan.commonLibrary;

public class UC_08_00_LoginAllocateForecaster {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "08_Allocate_Forecaster_Products";
		cl.testCaseName = "UC_08_00_LoginAllocateForecaster";
		cl.tableName = "tbl_allocate_forecaster_to_proudcts";
		cl.useCaseName = "UC_08_00_LoginAllocateForecaster";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("");
		cl.login();
		
		cl.executeTestStep("mci_administrator_menu", "mouseover");
		cl.executeTestStep("afp_allocate_forcaster_menu", "click");
		cl.resultfinal();
	}
}
