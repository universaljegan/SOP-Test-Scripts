package Pkg_SOPPlan.Upload_Sales_History;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import Pkg_SOPPlan.commonLibrary;

public class UC_09_02_Download_Excel {

	public static void main(String[] args) throws InterruptedException, AWTException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "09_Upload_Sales_History";
		cl.testCaseName = "UC_09_02_Download_Excel";
		cl.tableName = "tbl_upload_sales_history";
		cl.useCaseName = "UC_09_02_Download_Excel";
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
		
		cl.executeTestStep("upl_download_excel_file", "click");
		
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		cl.takeScreenShot("mus_Save Excel");
		Thread.sleep(5000);
		cl.takeScreenShot("mus_After Save");
		cl.resultfinal();
	}
}