package Pkg_SOPPlan.Manage_Products;

import Pkg_SOPPlan.commonLibrary;

public class UC_04_12_AddProductsManually {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "04_Manage_Products";
		cl.testCaseName = "UC_04_12_AddProductsManually";
		cl.tableName = "tbl_manage_products";
		cl.useCaseName = "UC_04_12_AddProductsManually";
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
		
		cl.executeTestStep("mpc_add_products_manually_menu", "click");
		
		commonLibrary.curTableRow = "1";
		cl.executeTestStep("mpc_add_product_no", "set");
		cl.executeTestStep("mpc_add_product_name", "set");
		cl.executeTestStep("mpc_select_product_category", "select");
		cl.executeTestStep("mpc_add_selling_price", "set");
		cl.executeTestStep("mpc_add_product_unit_of_measure", "set");
		cl.executeTestStep("mpc_add_conversion_factore", "set");
		
		commonLibrary.curTableRow = "2";
		cl.executeTestStep("mpc_add_product_no", "set");
		cl.executeTestStep("mpc_add_product_name", "set");
		cl.executeTestStep("mpc_select_product_category", "select");
		cl.executeTestStep("mpc_add_selling_price", "set");
		cl.executeTestStep("mpc_add_product_unit_of_measure", "set");
		cl.executeTestStep("mpc_add_conversion_factore", "set");
		
		commonLibrary.curTableRow = "3";
		cl.executeTestStep("mpc_add_product_no", "set");
		cl.executeTestStep("mpc_add_product_name", "set");
		cl.executeTestStep("mpc_select_product_category", "select");
		cl.executeTestStep("mpc_add_selling_price", "set");
		cl.executeTestStep("mpc_add_product_unit_of_measure", "set");
		cl.executeTestStep("mpc_add_conversion_factore", "set");
		
		commonLibrary.curTableRow = "4";
		cl.executeTestStep("mpc_add_product_no", "set");
		cl.executeTestStep("mpc_add_product_name", "set");
		cl.executeTestStep("mpc_select_product_category", "select");
		cl.executeTestStep("mpc_add_selling_price", "set");
		cl.executeTestStep("mpc_add_product_unit_of_measure", "set");
		cl.executeTestStep("mpc_add_conversion_factore", "set");
		
		commonLibrary.curTableRow = "5";
		cl.executeTestStep("mpc_add_product_no", "set");
		cl.executeTestStep("mpc_add_product_name", "set");
		cl.executeTestStep("mpc_select_product_category", "select");
		cl.executeTestStep("mpc_add_selling_price", "set");
		cl.executeTestStep("mpc_add_product_unit_of_measure", "set");
		cl.executeTestStep("mpc_add_conversion_factore", "set");
		
		commonLibrary.curTableRow = "6";
		cl.executeTestStep("mpc_add_product_no", "set");
		cl.executeTestStep("mpc_add_product_name", "set");
		cl.executeTestStep("mpc_select_product_category", "select");
		cl.executeTestStep("mpc_add_selling_price", "set");
		cl.executeTestStep("mpc_add_product_unit_of_measure", "set");
		cl.executeTestStep("mpc_add_conversion_factore", "set");
		
		commonLibrary.curTableRow = "7";
		cl.executeTestStep("mpc_add_product_no", "set");
		cl.executeTestStep("mpc_add_product_name", "set");
		cl.executeTestStep("mpc_select_product_category", "select");
		cl.executeTestStep("mpc_add_selling_price", "set");
		cl.executeTestStep("mpc_add_product_unit_of_measure", "set");
		cl.executeTestStep("mpc_add_conversion_factore", "set");
		
		commonLibrary.curTableRow = "8";
		cl.executeTestStep("mpc_add_product_no", "set");
		cl.executeTestStep("mpc_add_product_name", "set");
		cl.executeTestStep("mpc_select_product_category", "select");
		cl.executeTestStep("mpc_add_selling_price", "set");
		cl.executeTestStep("mpc_add_product_unit_of_measure", "set");
		cl.executeTestStep("mpc_add_conversion_factore", "set");
		
		cl.executeTestStep("mpc_save_products", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		//Products have been successfully added
		cl.validateAlert("Some rows of data had errors and were not uploaded. The rest of the data was successfully uploaded. See the table below for more information.");
		Thread.sleep(2000);		
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		commonLibrary.curTableRow = "4";
		cl.executeTestStep("mpc_empty_product_num_error", "validate");
		
		commonLibrary.curTableRow = "5";
		cl.executeTestStep("mpc_duplicate_product_num_error", "validate");
		
		commonLibrary.curTableRow = "6";
		cl.executeTestStep("mpc_empty_product_name_error", "validate");
		
		commonLibrary.curTableRow = "3";
		cl.executeTestStep("mpc_selling_price_negative_error", "validate");
		
		commonLibrary.curTableRow = "5";
		cl.executeTestStep("mpc_selling_price_number_error", "validate");
		
		commonLibrary.curTableRow = "3";
		cl.executeTestStep("mpc_conversion_factor_number_error", "validate");
		
		commonLibrary.curTableRow = "4";
		cl.executeTestStep("mpc_conversion_factor_negative_error", "validate");
		
		commonLibrary.curTableRow = "6";
		cl.executeTestStep("mpc_conversion_factor_negative_error", "validate");
		
		cl.resultfinal();
	}
}