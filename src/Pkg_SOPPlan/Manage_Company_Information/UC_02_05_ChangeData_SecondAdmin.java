package Pkg_SOPPlan.Manage_Company_Information;

import java.io.IOException;

import Pkg_SOPPlan.commonLibrary;

public class UC_02_05_ChangeData_SecondAdmin {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "02_Manage_Company_Information";
		cl.testCaseName = "UC_02_05_CheckInitial_Data_SecondAdmin";
		cl.tableName = "tbl_manage_company_information";
		cl.useCaseName = "UC_02_05_ChangeData_SecondAdmin";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("");
		
		//Login for second admin, data available in same testcase
		cl.executeTestStep("lgi_login_link", "click");
		cl.executeTestStep("lgi_sop_username", "set");
		cl.executeTestStep("lgi_sop_password", "set");
		cl.executeTestStep("lgi_login_button", "click");
		
		cl.executeTestStep("mci_administrator_menu", "mouseover");
		cl.executeTestStep("mci_manage_company_info_menu", "click");
		
		cl.executeTestStep("mci_company_name", "get");
		cl.executeTestStep("mci_country", "get");
		cl.executeTestStep("mci_currency", "get");
		cl.executeTestStep("mci_decimal_value", "get");
		cl.executeTestStep("mci_company_timezone", "get");
		cl.executeTestStep("mci_sales_volume_indicator", "get");
		
		cl.executeTestStep("mci_manage_administrator", "click");
		
		cl.executeTestStep("mci_admin_first_name", "innerHTML");
		cl.executeTestStep("mci_admin_last_name", "innerHTML");
		cl.executeTestStep("mci_admin_display_name", "innerHTML");
		cl.executeTestStep("mci_admin_email", "innerHTML");
		
		Thread.sleep(2000);
		
		cl.testCaseName = "UC_02_05_ChangeData_SecondAdmin";
		cl.loadTestData();
		
		cl.executeTestStep("mci_administrator_menu", "mouseover");
		cl.executeTestStep("mci_manage_company_info_menu", "click");
		
		cl.executeTestStep("mci_currency", "set");
		cl.executeTestStep("mci_decimal_value", "set");
		cl.executeTestStep("mci_company_timezone", "select");
		cl.executeTestStep("mci_sales_volume_indicator", "set");
		cl.executeTestStep("mci_save_changes", "click");
		
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.validateAlert("Changes successfully saved");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		cl.resultfinal();
	}
}
