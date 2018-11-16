package Pkg_SOPPlan.Manage_Users;

import Pkg_SOPPlan.commonLibrary;
import junit.framework.TestCase;

public class UC_03_01_CheckPageOpens extends TestCase {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "03_Manage_Users";
		cl.testCaseName = "UC_03_01_CheckPageOpens";
		cl.tableName = "tbl_manage_users";
		cl.useCaseName = "UC_03_01_CheckPageOpens";
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
		
		cl.executeTestStep("mus_manage_users_opens", "exist");
		cl.resultfinal();
	}
}
