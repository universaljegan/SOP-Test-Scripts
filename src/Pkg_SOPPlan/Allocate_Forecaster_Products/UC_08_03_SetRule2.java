package Pkg_SOPPlan.Allocate_Forecaster_Products;

import Pkg_SOPPlan.commonLibrary;

public class UC_08_03_SetRule2 {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "08_Allocate_Forecaster_Products";
		cl.testCaseName = "UC_08_03_SetRule2";
		cl.tableName = "tbl_allocate_forecaster_to_proudcts";
		cl.useCaseName = "UC_08_03_SetRule2";
		cl.readXML();
		cl.loadTestData();
		
		//No need to validate login directly or not, since this for second login, only one use case
		cl.loadURL("");
		cl.login2();
		
		cl.executeTestStep("mci_administrator_menu", "mouseover");
		cl.executeTestStep("afp_allocate_forcaster_menu", "click");

		cl.executeTestStep("afp_set_the_rule_forcaster_menu", "click");
		
		cl.executeTestStep("afp_change_allocation_rule_to", "select");
		cl.executeTestStep("afp_save_changes_set_rule", "click");
		Thread.sleep(2000);
		cl.executeTestStep("afp_save_continue", "click");
		Thread.sleep(2000);
		cl.validateAlert("Forecaster allocation rule has been successfully changed");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		cl.resultfinal();
	}
}
