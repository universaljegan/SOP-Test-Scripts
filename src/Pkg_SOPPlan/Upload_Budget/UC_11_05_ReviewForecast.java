package Pkg_SOPPlan.Upload_Budget;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;

import Pkg_SOPPlan.commonLibrary;

public class UC_11_05_ReviewForecast {

	public static void main(String[] args) throws InterruptedException, AWTException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "11_Upload_Budget_Target";
		cl.testCaseName = "UC_11_05_ReviewForecast";
		cl.tableName = "tbl_upload_buget_target";
		cl.useCaseName = "UC_11_05_ReviewForecast";
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
		
		cl.executeTestStep("upl_reports_menu", "mouseover");
		cl.executeTestStep("upl_review_forecast_menu", "click");
		
		Thread.sleep(2000);
		
		cl.switchToNewWindow();
		
		Thread.sleep(2000);
		//Select values for review
		cl.executeTestStep("upl_level_of_review", "select");
		Thread.sleep(1000);
		cl.executeTestStep("upl_product", "select");
		Thread.sleep(1000);
		cl.executeTestStep("upl_budget_target", "select");
		Thread.sleep(1000);
		
		cl.resultfinal();
	}
}
