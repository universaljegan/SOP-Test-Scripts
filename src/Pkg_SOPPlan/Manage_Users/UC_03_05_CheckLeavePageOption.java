package Pkg_SOPPlan.Manage_Users;

import Pkg_SOPPlan.commonLibrary;

public class UC_03_05_CheckLeavePageOption {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "03_Manage_Users";
		cl.testCaseName = "UC_03_04_CheckSameUsers";
		cl.tableName = "tbl_manage_users";
		cl.useCaseName = "UC_03_05_CheckLeavePageOption";
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
			cl.executeTestStep("mus_manage_users_menu", "click");
		}
		
		cl.executeTestStep("mus_add_users_manually", "click");
		
		commonLibrary.curTableRow = "1";
		cl.executeTestStep("mus_first_name", "set");
		cl.executeTestStep("mus_last_name", "set");
		cl.executeTestStep("mus_email_id", "set");
		
		cl.newURL("htpp://www.google.com");
		cl.clickAlert("Stay on Page");
		Thread.sleep(5000);
		
		cl.closeBrowser();
		cl.clickAlert("Stay on Page");
		Thread.sleep(5000);
		
		cl.executeTestStep("mus_edit_users_menu", "click");	
		cl.clickAlert("ok");
		Thread.sleep(5000);
		
		cl.resultfinal();
	}
}
