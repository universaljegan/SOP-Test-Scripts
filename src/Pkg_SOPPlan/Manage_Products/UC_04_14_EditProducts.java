package Pkg_SOPPlan.Manage_Products;

import Pkg_SOPPlan.commonLibrary;

public class UC_04_14_EditProducts {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "04_Manage_Products";
		cl.testCaseName = "UC_04_14_EditProducts";
		cl.tableName = "tbl_manage_products";
		cl.useCaseName = "UC_04_14_EditProducts";
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
		
		cl.executeTestStep("mpc_edit_products_menu", "click");
		
		cl.executeTestStep("mpc_what_is_conversion_factor_edit_products", "click");
		
		cl.switchToNewWindow();
		
		cl.executeTestStep("mpc_new_window_conversion_factor_title", "validate");
		cl.executeTestStep("mpc_new_window_conversion_factor_content", "validate");
		
		cl.closeNewWindow();
		
		commonLibrary.curTableRow = "1";
		cl.executeTestStep("mpc_edit_product_name", "set");
		cl.executeTestStep("mpc_edit_select_product_category", "select");
		cl.executeTestStep("mpc_edit_selling_price", "set");
		cl.executeTestStep("mpc_edit_product_unit_of_measure", "set");
		cl.executeTestStep("mpc_edit_conversion_factore", "set");
		
		commonLibrary.curTableRow = "2";
		cl.executeTestStep("mpc_edit_product_name", "set");
		cl.executeTestStep("mpc_edit_select_product_category", "select");
		cl.executeTestStep("mpc_edit_selling_price", "set");
		cl.executeTestStep("mpc_edit_product_unit_of_measure", "set");
		cl.executeTestStep("mpc_edit_conversion_factore", "set");
		
		commonLibrary.curTableRow = "3";
		cl.executeTestStep("mpc_edit_product_name", "set");
		cl.executeTestStep("mpc_edit_select_product_category", "select");
		cl.executeTestStep("mpc_edit_selling_price", "set");
		cl.executeTestStep("mpc_edit_product_unit_of_measure", "set");
		cl.executeTestStep("mpc_edit_conversion_factore", "set");
		
		commonLibrary.curTableRow = "4";
		cl.executeTestStep("mpc_edit_product_name", "set");
		cl.executeTestStep("mpc_edit_select_product_category", "select");
		cl.executeTestStep("mpc_edit_selling_price", "set");
		cl.executeTestStep("mpc_edit_product_unit_of_measure", "set");
		cl.executeTestStep("mpc_edit_conversion_factore", "set");
		
		commonLibrary.curTableRow = "5";
		cl.executeTestStep("mpc_edit_product_name", "set");
		cl.executeTestStep("mpc_edit_select_product_category", "select");
		cl.executeTestStep("mpc_edit_selling_price", "set");
		cl.executeTestStep("mpc_edit_product_unit_of_measure", "set");
		cl.executeTestStep("mpc_edit_conversion_factore", "set");
		
		commonLibrary.curTableRow = "6";
		cl.executeTestStep("mpc_edit_product_name", "set");
		cl.executeTestStep("mpc_edit_select_product_category", "select");
		cl.executeTestStep("mpc_edit_selling_price", "set");
		cl.executeTestStep("mpc_edit_product_unit_of_measure", "set");
		cl.executeTestStep("mpc_edit_conversion_factore", "set");
		
		commonLibrary.curTableRow = "7";
		cl.executeTestStep("mpc_edit_product_name", "set");
		cl.executeTestStep("mpc_edit_select_product_category", "select");
		cl.executeTestStep("mpc_edit_selling_price", "set");
		cl.executeTestStep("mpc_edit_product_unit_of_measure", "set");
		cl.executeTestStep("mpc_edit_conversion_factore", "set");
		
		cl.executeTestStep("mpc_save_products_edit", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		//Products have been successfully added
		cl.validateAlert("Some rows of data had errors and were not uploaded. The rest of the data was successfully uploaded. See the table below for more information.");
		Thread.sleep(2000);		
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		cl.resultfinal();
	}
}