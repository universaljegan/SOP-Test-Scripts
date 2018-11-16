package Pkg_SOPPlan.Manage_Calendars;

import Pkg_SOPPlan.commonLibrary;

public class UC_07_00_LoginManageCalendars {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "07_Manage_Calendar";
		cl.testCaseName = "UC_07_00_LoginManageCalendars";
		cl.tableName = "tbl_manage_calendar";
		cl.useCaseName = "UC_07_00_LoginManageCalendars";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("");
		cl.login();
		
		cl.executeTestStep("mci_administrator_menu", "mouseover");
		cl.executeTestStep("mcl_menu_manage_calendar", "click");
		cl.resultfinal();
	}
}
