package Pkg_SOPPlan.Manage_Company_Information;

import Pkg_SOPPlan.commonLibrary;

public class _NotInUse_UC_02_06_ChangeToWeekly_SecondAdmin {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "02_Manage_Company_Information";
		cl.testCaseName = "UC_02_06_ChangeToWeekly_SecondAdmin";
		cl.tableName = "tbl_manage_company_information";
		cl.useCaseName = "UC_02_06_ChangeToWeekly_SecondAdmin";
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
			cl.executeTestStep("mci_manage_company_info_menu", "click");
		}
		
		
//		cl.executeTestStep("mci_period", "select");
		cl.executeTestStep("mci_save_changes", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.executeTestStep("mci_change_forecasting_time_periods", "click");
		
		cl.executeTestStep("mcl_more_information", "click");
		
		cl.switchToNewWindow();
		
		cl.executeTestStep("mcl_new_window_more_information", "validate");
		
		cl.closeNewWindow();

		cl.executeTestStep("mcl_sales_period", "select");
		cl.executeTestStep("mcl_day_effective", "select");
		cl.executeTestStep("mcl_save_changes_date_format", "click");
		cl.clickAlert("ok");
		cl.clickAlert("ok");
		cl.executeTestStep("hdp_logout", "click");
		cl.resultfinal();
	}
}
