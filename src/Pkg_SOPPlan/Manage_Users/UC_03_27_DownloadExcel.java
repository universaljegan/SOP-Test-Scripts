package Pkg_SOPPlan.Manage_Users;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import Pkg_SOPPlan.commonLibrary;

public class UC_03_27_DownloadExcel {

	public static void main(String[] args) throws InterruptedException, AWTException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "03_Manage_Users";
		cl.testCaseName = "UC_03_27_DownloadExcel";
		cl.tableName = "tbl_manage_users";
		cl.useCaseName = "UC_03_27_DownloadExcel";
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
			cl.executeTestStep("mus_manage_users_menu", "click");
		}
		
		cl.executeTestStep("mus_add_users_excel_menu", "click");
		Thread.sleep(2000);
		cl.executeTestStep("mus_download_excel_file", "click");
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
