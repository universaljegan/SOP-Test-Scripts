package Pkg_SOPPlan.Manage_Products;

import Pkg_SOPPlan.commonLibrary;

public class UC_04_03_NavigateAway {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "04_Manage_Products";
		cl.testCaseName = "UC_04_03_NavigateAway";
		cl.tableName = "tbl_manage_products";
		cl.useCaseName = "UC_04_03_NavigateAway";
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
		
		cl.newURL("htpp://www.cnn.com");
		cl.clickAlert("Stay on Page");
		Thread.sleep(5000);
		
		cl.resultfinal();
	}
}