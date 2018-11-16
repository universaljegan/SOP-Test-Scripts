package Pkg_SOPPlan.Upload_Budget;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import Pkg_SOPPlan.commonLibrary;

public class UC_11_02_Download_Excel {

	public static void main(String[] args) throws InterruptedException, AWTException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "11_Upload_Budget_Target";
		cl.testCaseName = "UC_11_02_Download_Excel";
		cl.tableName = "tbl_upload_buget_target";
		cl.useCaseName = "UC_11_02_Download_Excel";
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