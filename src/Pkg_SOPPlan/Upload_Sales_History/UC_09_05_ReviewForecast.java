package Pkg_SOPPlan.Upload_Sales_History;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;

import Pkg_SOPPlan.commonLibrary;

public class UC_09_05_ReviewForecast {

	public static void main(String[] args) throws InterruptedException, AWTException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "09_Upload_Sales_History";
		cl.testCaseName = "UC_09_05_ReviewForecast";
		cl.tableName = "tbl_upload_sales_history";
		cl.useCaseName = "UC_09_05_ReviewForecast";
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
			cl.executeTestStep("upl_reports_menu", "mouseover");
			cl.executeTestStep("upl_review_forecast_menu", "click");
		}
		
		Thread.sleep(2000);
		
		cl.switchToNewWindow();
		
		Thread.sleep(2000);
		//Select values for review
		cl.executeTestStep("upl_level_of_review", "select");
		Thread.sleep(1000);
		cl.executeTestStep("upl_category", "select");
		Thread.sleep(1000);
		
		cl.resultfinal();
	}
}
