package Pkg_SOPPlan.Manage_Calendars;

import Pkg_SOPPlan.commonLibrary;

public class UC_07_02_SetSellingDays {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "07_Manage_Calendar";
		cl.testCaseName = "UC_07_02_SetSellingDays";
		cl.tableName = "tbl_manage_calendar";
		cl.useCaseName = "UC_07_02_SetSellingDays";
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
		
		cl.executeTestStep("mcl_selling_days_page", "click");		
		cl.executeTestStep("mcl_whare_are_selling_days", "click");
		
		cl.switchToNewWindow();
		
		cl.executeTestStep("mcu_new_window_selling_days_title", "validate");
		cl.executeTestStep("mcu_new_window_selling_days_content", "validate");
		
		cl.closeNewWindow();
		
		//Validate Existing Values
		cl.executeTestStep("mcl_total_selling_days_1", "get");
		
		cl.executeTestStep("mcl_selling_monday", "select");
		cl.executeTestStep("mcl_selling_tuesday", "select");
		cl.executeTestStep("mcl_selling_wednesday", "select");
		cl.executeTestStep("mcl_selling_thursday", "select");
		cl.executeTestStep("mcl_selling_friday", "select");
		cl.executeTestStep("mcl_selling_saturday", "select");
		cl.executeTestStep("mcl_selling_sunday", "select");
		
		Thread.sleep(5000);
		
		cl.executeTestStep("mcl_save_selling_days", "click");
		
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.validateAlert("Calendar details have been successfully updated");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		cl.executeTestStep("mcl_total_selling_days_2", "get");
		
		cl.resultfinal();
	}
}
