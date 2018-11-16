package Pkg_SOPPlan.Upload_Budget;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;

import Pkg_SOPPlan.commonLibrary;

public class UC_11_03_ValidateCsvAlert {

	public static void main(String[] args) throws InterruptedException, AWTException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "11_Upload_Budget_Target";
		cl.testCaseName = "UC_11_03_ValidateCsvAlert";
		cl.tableName = "tbl_upload_buget_target";
		cl.useCaseName = "UC_11_03_ValidateCsvAlert";
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
		
		Thread.sleep(2000);
		
		//Validate CSV alert
		cl.executeTestStep("mus_browse_excel_file", "click");
		cl.selectFile("mus_browse_excel_file");
		
		Thread.sleep(2000);
		cl.executeTestStep("upl_upload_excel_budget_target", "click");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(1000);
		cl.validateAlert("Please upload the file in csv format");
		Thread.sleep(1000);
		cl.clickAlert("ok");
		Thread.sleep(3000);
		
		cl.resultfinal();
	}
}
