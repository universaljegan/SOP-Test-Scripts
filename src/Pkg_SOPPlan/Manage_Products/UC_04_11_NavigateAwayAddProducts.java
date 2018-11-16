package Pkg_SOPPlan.Manage_Products;

import Pkg_SOPPlan.commonLibrary;

public class UC_04_11_NavigateAwayAddProducts {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "04_Manage_Products";
		cl.testCaseName = "UC_04_11_NavigateAwayAddProducts";
		cl.tableName = "tbl_manage_products";
		cl.useCaseName = "UC_04_11_NavigateAwayAddProducts";
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
		
		cl.newURL("htpp://www.cnn.com");
		cl.clickAlert("Stay on Page");
		Thread.sleep(5000);
		
		cl.resultfinal();
	}
}