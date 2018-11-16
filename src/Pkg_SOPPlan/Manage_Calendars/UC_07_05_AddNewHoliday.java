package Pkg_SOPPlan.Manage_Calendars;

import Pkg_SOPPlan.commonLibrary;

public class UC_07_05_AddNewHoliday {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "07_Manage_Calendar";
		cl.testCaseName = "UC_07_05_AddNewHoliday";
		cl.tableName = "tbl_manage_calendar";
		cl.useCaseName = "UC_07_05_AddNewHoliday";
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
			cl.executeTestStep("mcl_menu_manage_calendar", "click");
		}
		
		cl.executeTestStep("mcl_menu_holidays", "click");
		
		commonLibrary.curTableRow = "0";
		cl.executeTestStep("mcl_holiday_name", "set");
		cl.executeTestStep("mcl_holiday_before_two_year", "datepickter");
		cl.executeTestStep("mcl_holiday_before_one_year", "datepickter");
		cl.executeTestStep("mcl_holiday_current_year", "datepickter");
		
		//Change the Holiday Dates 
//		cl.tableValidationStatic("ctl00_ContentMenu_newHolidaysGrid_holiday", "_txtHolidayName", "1", "ctl00_ContentMenu_newHolidaysGrid_Table1", "mcl_holiday_name", "mcl_holiday_edit_before_two_year", "setValue", "ctl00_ContentMenu_newHolidaysGrid_holiday", "_ccTwoYearsBefore_txtDate");
//		cl.tableValidationStatic("ctl00_ContentMenu_newHolidaysGrid_holiday", "_txtHolidayName", "1", "ctl00_ContentMenu_newHolidaysGrid_Table1", "mcl_holiday_name", "mcl_holiday_edit_before_one_year", "setValue", "ctl00_ContentMenu_newHolidaysGrid_holiday", "_ccOneYearsBefore_txtDate");
//		cl.tableValidationStatic("ctl00_ContentMenu_newHolidaysGrid_holiday", "_txtHolidayName", "1", "ctl00_ContentMenu_newHolidaysGrid_Table1", "mcl_holiday_name", "mcl_holiday_edit_current_year", "setValue", "ctl00_ContentMenu_newHolidaysGrid_holiday", "_ccCurrentYear_txtDate");
		
		cl.executeTestStep("mcl_add_holidays_save", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.validateAlert("Holidays successfully updated");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		cl.resultfinal();
	}
}
