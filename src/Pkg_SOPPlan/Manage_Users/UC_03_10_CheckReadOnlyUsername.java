package Pkg_SOPPlan.Manage_Users;

import Pkg_SOPPlan.commonLibrary;

public class UC_03_10_CheckReadOnlyUsername {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "03_Manage_Users";
		cl.testCaseName = "UC_03_08_AddOneMoreUser";
		cl.tableName = "tbl_manage_users";
		cl.useCaseName = "UC_03_10_CheckReadOnlyUsername";
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
		
		cl.executeTestStep("mus_edit_users_menu", "click");
		
		commonLibrary.curTableRow = "1";
//		cl.map.put("mus_email_id", "newmailid@max2cs.com"); //Change
		cl.executeTestStep("mus_email_id", "readonly");
		
		//Check the new mail id set in textbox
		cl.executeTestStep("mus_email_id", "notequal");
		
		cl.resultfinal();
	}
}
