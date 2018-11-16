package Pkg_SOPPlan.Manage_Products;

import Pkg_SOPPlan.commonLibrary;

public class UC_04_06_CheckInEditCategories {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "04_Manage_Products";
		cl.testCaseName = "UC_04_06_CheckInEditCategories";
		cl.tableName = "tbl_manage_products";
		cl.useCaseName = "UC_04_06_CheckInEditCategories";
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
		cl.checkSelectBoxValues("ctl00_ContentMenu_dgEditPdtCatg_ctl03_ddlCatMgr", "mpc_edit_category_manager");
		
		commonLibrary.curTableRow = "2";
		cl.checkSelectBoxValues("ctl00_ContentMenu_dgEditPdtCatg_ctl03_ddlCatMgr", "mpc_edit_category_manager");
		
		cl.resultfinal();
	}
}