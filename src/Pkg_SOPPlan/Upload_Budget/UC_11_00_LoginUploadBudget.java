package Pkg_SOPPlan.Upload_Budget;

import Pkg_SOPPlan.commonLibrary;

public class UC_11_00_LoginUploadBudget {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "11_Upload_Budget_Target";
		cl.testCaseName = "UC_11_00_LoginUploadBudget";
		cl.tableName = "tbl_upload_buget_target";
		cl.useCaseName = "UC_11_00_LoginUploadBudget";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("");
		cl.login3();
		
		cl.executeTestStep("upl_upload_data_menu", "mouseover");
		cl.executeTestStep("upl_upload_buget_target_menu", "click");
		
		Thread.sleep(2000);
		cl.resultfinal();
	}
}