package Pkg_SOPPlan.Manage_Products;

import Pkg_SOPPlan.commonLibrary;

public class UC_04_01_CheckPageOpens {

	public static void main(String[] args) {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "04_Manage_Products";
		cl.testCaseName = "UC_04_01_CheckPageOpens";
		cl.tableName = "tbl_manage_products";
		cl.useCaseName = "UC_04_01_CheckPageOpens";
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
		cl.executeTestStep("mpc_what_are_product_categories_link", "click");
		
		cl.switchToNewWindow();
		
		cl.executeTestStep("mpc_new_window_product_category_title", "validate");
		cl.executeTestStep("mpc_new_window_product_category_content", "validate");
		
		cl.closeNewWindow();
		
		cl.resultfinal();
	}
}


