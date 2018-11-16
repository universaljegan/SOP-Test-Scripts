package Pkg_SOPPlan.Upload_Sales_History;

import Pkg_SOPPlan.commonLibrary;

public class UC_09_01_CheckPageOpens {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "09_Upload_Sales_History";
		cl.testCaseName = "UC_09_01_CheckPageOpens";
		cl.tableName = "tbl_upload_sales_history";
		cl.useCaseName = "UC_09_01_CheckPageOpens";
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
			cl.executeTestStep("upl_upload_sales_history_menu", "click");
		}
		
		Thread.sleep(2000);
		
		cl.executeTestStep("upl_see_an_example", "click");
		
		cl.switchToNewWindow();
		
		cl.validateCurrentURL("http://www.so-plan.info/images/Sales%20History%20Data%20Upload%20Monthly%20dmy_New.jpg");
		
		cl.closeNewWindow();
		cl.resultfinal();
	}
}