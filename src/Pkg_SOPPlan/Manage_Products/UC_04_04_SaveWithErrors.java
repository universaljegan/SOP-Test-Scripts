package Pkg_SOPPlan.Manage_Products;

import Pkg_SOPPlan.commonLibrary;

public class UC_04_04_SaveWithErrors {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "04_Manage_Products";
		cl.testCaseName = "UC_04_04_SaveWithErrors";
		cl.tableName = "tbl_manage_products";
		cl.useCaseName = "UC_04_04_SaveWithErrors";
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
		
		cl.executeTestStep("mpc_add_product_cagegories_menu", "click");
		
		commonLibrary.curTableRow = "1";
		cl.executeTestStep("mpc_add_product_category", "set");
		cl.executeTestStep("mpc_add_category_manager", "select");

		commonLibrary.curTableRow = "2";
		cl.executeTestStep("mpc_add_product_category", "set");
		cl.executeTestStep("mpc_add_category_manager", "select");
		
		commonLibrary.curTableRow = "3";
		cl.executeTestStep("mpc_add_product_category", "set");
		cl.executeTestStep("mpc_add_category_manager", "select");

		commonLibrary.curTableRow = "4";
		cl.executeTestStep("mpc_add_product_category", "set");
		cl.executeTestStep("mpc_add_category_manager", "select");

		commonLibrary.curTableRow = "5";
		cl.executeTestStep("mpc_add_product_category", "set");
		cl.executeTestStep("mpc_add_category_manager", "select");
		
		cl.executeTestStep("mpc_save_product_category", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.validateAlert("Some rows of data had errors and were not uploaded. The rest of the data was successfully uploaded. See the table below for more information.");
		Thread.sleep(2000);		
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		commonLibrary.curTableRow = "1";
		cl.executeTestStep("mpc_product_category_existing_error", "validate");
				
		commonLibrary.curTableRow = "3";
		cl.executeTestStep("mpc_product_category_duplicate_error", "validate");
		
		commonLibrary.curTableRow = "4";
		cl.executeTestStep("mpc_product_category_empty_error", "validate");
		
		cl.executeTestStep("mpc_edit_product_cagegories_menu", "click");
		
		cl.tableValidationDynamic("ctl00_ContentMenu_dgEditPdtCatg_ctl", "_txtPdtCatname", "03", "ctl00_ContentMenu_dgEditPdtCatg", "mpc_edit_product_category", "ctl00_ContentMenu_ddlSelectPageCat", "", "", "");

		//Delete Page 2				
		cl.executeTestStep("mpc_select_all_delete_product_categories", "click");
		
		cl.executeTestStep("mpc_save_product_categories_edit", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.validateAlert("Product categories updated successfully");
		Thread.sleep(2000);		
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		//Delete Page 1
		cl.executeTestStep("mpc_select_all_delete_product_categories", "click");
		
		cl.executeTestStep("mpc_save_product_categories_edit", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.validateAlert("Product categories updated successfully");
		Thread.sleep(2000);		
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		cl.resultfinal();
	}
}