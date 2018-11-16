package Pkg_SOPPlan.Upload_Budget;

import Pkg_SOPPlan.commonLibrary;

public class UC_11_01_CheckPageOpens {

	public static void main(String[] args) {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "11_Upload_Budget_Target";
		cl.testCaseName = "UC_11_01_CheckPageOpens";
		cl.tableName = "tbl_upload_buget_target";
		cl.useCaseName = "UC_11_01_CheckPageOpens";
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
			cl.executeTestStep("upl_upload_buget_target_menu", "click");
		}
		
		cl.executeTestStep("upl_see_an_example_budget", "click");
		
		cl.switchToNewWindow();
		
		cl.validateCurrentURL("http://www.so-plan.info/images/Sales%20History%20Data%20Upload%20Monthly%20mdy_New.jpg");
		
		//cl.closeNewWindow();
		cl.resultfinal();
	}
}