package Pkg_SOPPlan.Manage_Products;

import Pkg_SOPPlan.commonLibrary;

public class UC_04_17_ValidateProducts {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "04_Manage_Products";
		cl.testCaseName = "UC_04_17_ValidateProducts";
		cl.tableName = "tbl_manage_products";
		cl.useCaseName = "UC_04_17_ValidateProducts";
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
		
		Thread.sleep(5000);
		
		commonLibrary.curTableRow = "1";
		cl.tableValidationDynamic("ctl00_ContentMenu_dgEditPdtInfo_ctl", "_lblEditPdtNo", "02", "ctl00_ContentMenu_dgEditPdtInfo", "mpc_edit_product_no", "ctl00_ContentMenu_ddlSelectPage", "", "", "");
		cl.tableValidationDynamic("ctl00_ContentMenu_dgEditPdtInfo_ctl", "_txtEditPdtName", "02", "ctl00_ContentMenu_dgEditPdtInfo", "mpc_edit_product_name", "ctl00_ContentMenu_ddlSelectPage", "", "", "");
				
		cl.resultfinal();
	}
}