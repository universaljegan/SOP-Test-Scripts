package Pkg_SOPPlan.Manage_Products;

import Pkg_SOPPlan.commonLibrary;

public class UC_04_09_SecondSetOfChangesCategories {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "04_Manage_Products";
		cl.testCaseName = "UC_04_09_SecondSetOfChangesCategories";
		cl.tableName = "tbl_manage_products";
		cl.useCaseName = "UC_04_09_SecondSetOfChangesCategories";
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
			cl.executeTestStep("mpc_manage_products_menu", "click");
		}
		
		cl.executeTestStep("mpc_edit_product_cagegories_menu", "click");

		commonLibrary.curTableRow = "1";
		cl.executeTestStep("mpc_edit_product_category", "set");
		cl.executeTestStep("mpc_edit_category_manager", "select");
		
		commonLibrary.curTableRow = "2";
		cl.executeTestStep("mpc_edit_product_category", "set");
		cl.executeTestStep("mpc_edit_category_manager", "select");

		commonLibrary.curTableRow = "4";
		cl.executeTestStep("mpc_edit_product_category", "set");
		cl.executeTestStep("mpc_edit_category_manager", "select");
		
		cl.executeTestStep("mpc_save_product_categories_edit", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.validateAlert("Some rows of data had errors and were not uploaded. The rest of the data was successfully uploaded. See the table below for more information.");
		Thread.sleep(2000);		
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		commonLibrary.curTableRow = "4";
		cl.executeTestStep("mpc_edit_product_category_duplicate_error", "validate");
		
		cl.executeTestStep("mpc_refresh_product_categories_edit", "click");
		
		cl.takeScreenShot("mpc_Check Product Categories");
		
		cl.resultfinal();
	}
}