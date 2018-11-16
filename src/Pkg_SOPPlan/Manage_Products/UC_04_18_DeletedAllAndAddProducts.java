package Pkg_SOPPlan.Manage_Products;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;

import Pkg_SOPPlan.commonLibrary;

public class UC_04_18_DeletedAllAndAddProducts {

	public static void main(String[] args) throws InterruptedException, AWTException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "04_Manage_Products";
		cl.testCaseName = "UC_04_18_DeletedAllAndAddProducts";
		cl.tableName = "tbl_manage_products";
		cl.useCaseName = "UC_04_18_DeletedAllAndAddProducts";
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
		
		cl.deleteAllProducts("ctl00_ContentMenu_dgEditPdtInfo", "ctl00_ContentMenu_chkSelectAll", "ctl00_ContentMenu_btEditPdtInfo");
		
		Thread.sleep(5000);
		
		//Upload new set of products
		cl.executeTestStep("mpc_add_products_using_excel_menu", "click");
		Thread.sleep(2000);
				
		//Upload Excel File
		cl.executeTestStep("mus_browse_excel_file", "click");
		Thread.sleep(1000);
		cl.selectFile("mus_browse_csv_file");
		Thread.sleep(2000);
		cl.executeTestStep("mus_upload_excel", "click");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		
		cl.resultfinal();
	}
}
