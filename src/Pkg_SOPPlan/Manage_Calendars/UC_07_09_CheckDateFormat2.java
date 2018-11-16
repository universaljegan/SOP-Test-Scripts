package Pkg_SOPPlan.Manage_Calendars;

import Pkg_SOPPlan.commonLibrary;

public class UC_07_09_CheckDateFormat2 {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "07_Manage_Calendar";
		cl.testCaseName = "UC_07_09_CheckDateFormat2";
		cl.tableName = "tbl_manage_calendar";
		cl.useCaseName = "UC_07_09_CheckDateFormat2";
		cl.readXML();
		cl.loadTestData();
		
		if(cl.isLoginRequired.equals("YES"))
		{
			cl.loadURL("");
			cl.login2();
		}
		else
		{
			cl.createResultFolder();
		}
		
		if(cl.isMenuNavigationRequired.equals("YES"))
		{
			cl.executeTestStep("mci_administrator_menu", "mouseover");
			cl.executeTestStep("mcl_menu_manage_calendar", "click");
		}
		
		cl.executeTestStep("mcl_date_format_page", "click");
		
		cl.executeTestStep("mcl_date_format_select", "highlight");
		Thread.sleep(2000);
		cl.executeTestStep("mcl_date_format_select", "getSelectedText");
		
		cl.resultfinal();
	}
}
