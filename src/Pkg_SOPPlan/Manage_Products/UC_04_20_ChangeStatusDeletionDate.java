package Pkg_SOPPlan.Manage_Products;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;

import Pkg_SOPPlan.commonLibrary;

public class UC_04_20_ChangeStatusDeletionDate {

	public static void main(String[] args) throws InterruptedException, AWTException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "04_Manage_Products";
		cl.testCaseName = "UC_04_20_ChangeStatusDeletionDate";
		cl.tableName = "tbl_manage_products";
		cl.useCaseName = "UC_04_20_ChangeStatusDeletionDate";
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
		
		//Deleted all products
		cl.executeTestStep("mpc_edit_products_menu", "click");
		
		Thread.sleep(5000);
		
//		cl.tableValidationDynamic("ctl00_ContentMenu_dgEditPdtInfo_ctl", "_lblEditPdtNo", "02", 50, "mpc_edit_product_no", "ctl00_ContentMenu_ddlSelectPage", "pdtStatus", "", "");
		cl.tableValidationDynamic("ctl00_ContentMenu_dgEditPdtInfo_ctl", "_lblEditPdtNo", "02", "ctl00_ContentMenu_dgEditPdtInfo", "mpc_edit_product_no", "ctl00_ContentMenu_ddlSelectPage", "pdtDeletionDate", "", "");

		cl.executeTestStep("mpc_save_products_edit", "click");
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.validateAlert("Product details have been successfully updated");
		Thread.sleep(2000);		
		cl.clickAlert("ok");
		Thread.sleep(2000);
		
		cl.resultfinal();
		
		cl.exitCurrentTest();
	}
}
