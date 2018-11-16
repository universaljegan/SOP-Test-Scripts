package Pkg_SOPPlan.Manage_Products;

import Pkg_SOPPlan.commonLibrary;

public class UC_04_00_LoginManageProducts2 {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "04_Manage_Products";
		cl.testCaseName = "UC_04_00_LoginManageProducts";
		cl.tableName = "tbl_manage_products";
		cl.useCaseName = "UC_04_00_LoginManageProducts";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("");
		cl.login2();
		
		cl.executeTestStep("mci_administrator_menu", "mouseover");
		cl.executeTestStep("mpc_manage_products_menu", "click");
		cl.resultfinal();
	}
}
