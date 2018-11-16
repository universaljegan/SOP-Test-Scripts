package Pkg_SOPPlan.Allocate_Forecaster_Products;

import Pkg_SOPPlan.commonLibrary;

public class UC_08_02_ManuallyAllocateForecaster {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "08_Allocate_Forecaster_Products";
		cl.testCaseName = "UC_08_02_ManuallyAllocateForecaster";
		cl.tableName = "tbl_allocate_forecaster_to_proudcts";
		cl.useCaseName = "UC_08_02_ManuallyAllocateForecaster";
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
			cl.executeTestStep("afp_allocate_forcaster_menu", "click");
		}
		
		cl.executeTestStep("afp_manually_adjust_forcaster_menu", "click");
		
		cl.executeTestStep("afp_product_category", "select");
		cl.executeTestStep("afp_customer", "select");
		cl.executeTestStep("afp_forecaster", "select");
				
		//Select Product
		cl.checkTableValuesTD("ctl00_ContentMenu_dgAllocate", "afp_product_name", "checkbox", "ctl00_ContentMenu_dgAllocate_ctl", "_chkSelect", "02");
		
		cl.executeTestStep("afp_allocate_forecaster", "click");
		Thread.sleep(2000);
		cl.validateAlert("Changes have been successfully saved"); //Forecaster allocation rule has been successfully changed
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		cl.resultfinal();
	}
}
