package Pkg_SOPPlan.Manage_Company_Information;

import Pkg_SOPPlan.commonLibrary;

public class UC_02_04_ChangeData_FirstAdmin {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "02_Manage_Company_Information";
		cl.testCaseName = "UC_02_04_ChangeData_FirstAdmin";
		cl.tableName = "tbl_manage_company_information";
		cl.useCaseName = "UC_02_04_ChangeData_FirstAdmin";
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
		
		cl.executeTestStep("mci_administrator_menu", "mouseover");
		cl.executeTestStep("mci_manage_company_info_menu", "click");
		
//		cl.executeTestStep("mci_admin_display_name", "set");
		cl.executeTestStep("mci_sales_volume_indicator", "set");
		cl.executeTestStep("mci_save_changes", "click");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.validateAlert("Changes successfully saved");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
				
//		cl.executeTestStep("mci_return_to_company_information", "click");
		
//		cl.map.put("hdp_header_display_name", cl.map.get("mci_admin_display_name")); //Change
//		
//		System.out.println("Display Name: " + cl.map.get("mci_admin_display_name"));
//		System.out.println("Header Name: " + cl.map.get("hdp_header_display_name"));
//		
//		cl.executeTestStep("hdp_header_display_name", "validate");
		cl.resultfinal();
		
		cl.exitCurrentTest();
	}
}
