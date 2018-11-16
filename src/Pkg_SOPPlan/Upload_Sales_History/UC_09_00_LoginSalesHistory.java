package Pkg_SOPPlan.Upload_Sales_History;

import Pkg_SOPPlan.commonLibrary;

public class UC_09_00_LoginSalesHistory {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "09_Upload_Sales_History";
		cl.testCaseName = "UC_09_00_LoginSalesHistory";
		cl.tableName = "tbl_upload_sales_history";
		cl.useCaseName = "UC_09_00_LoginSalesHistory";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("");
		cl.login3();
		
		Thread.sleep(2000);
		
		cl.executeTestStep("upl_upload_data_menu", "mouseover");
		cl.executeTestStep("upl_upload_sales_history_menu", "click");
		
		Thread.sleep(2000);
		cl.resultfinal();
	}
}