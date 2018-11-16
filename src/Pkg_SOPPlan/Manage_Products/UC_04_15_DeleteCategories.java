package Pkg_SOPPlan.Manage_Products;

import Pkg_SOPPlan.commonLibrary;

public class UC_04_15_DeleteCategories {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "04_Manage_Products";
		cl.testCaseName = "UC_04_15_DeleteCategories";
		cl.tableName = "tbl_manage_products";
		cl.useCaseName = "UC_04_15_DeleteCategories";
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
		
		Thread.sleep(2000);
		
		cl.executeTestStep("mpc_prod_category_page_1", "click");
		
		Thread.sleep(2000);
		
		//Delete category Junk 2
		commonLibrary.curTableRow = "1";
		cl.tableValidationDynamic("ctl00_ContentMenu_dgEditPdtCatg_ctl", "_txtPdtCatname", "03", "ctl00_ContentMenu_dgEditPdtCatg", "mpc_edit_product_category", "ctl00_ContentMenu_ddlSelectPageCat", "delete", "ctl00_ContentMenu_dgEditPdtCatg_ctl", "_chkDelete");
		
		cl.executeTestStep("mpc_save_product_categories_edit", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
//		cl.validateAlert("Some rows of data had errors and were not uploaded. The rest of the data was successfully uploaded. See the table below for more information.");
//		Thread.sleep(2000);		
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		//Check Products now
		cl.executeTestStep("mpc_edit_products_menu", "click");
		cl.takeScreenShot("Check Deleted Category");
		
//		commonLibrary.curTableRow = "1";
//		cl.tableValidationDynamic("ctl00_ContentMenu_dgEditPdtCatg_ctl", "_txtPdtCatname", "03", 5, "mpc_edit_product_category", "ctl00_ContentMenu_ddlSelectPageCat", "", "", "");
		
		cl.resultfinal();
	}
}