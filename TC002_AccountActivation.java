package Pkg_SOPPlan;

public class TC002_AccountActivation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		commonLibrary cl = new commonLibrary();
		cl.testCaseName = "TC002_AccountActivation";
		cl.tableName = "tbl_account_activation";
		cl.readXML();
		cl.loadTestData();
		
		cl.loadURL("http://www.google.com");
		cl.executeTestStep("aac_gmail_link", "click");
		cl.executeTestStep("aac_gmail_id", "set");
		cl.executeTestStep("aac_gmail_next", "click");
		cl.executeTestStep("aac_gmail_password", "set");
		cl.executeTestStep("aac_sign_in", "click");
		cl.executeTestStep("aac_open_activation_mail", "click");
		cl.executeTestStep("aac_click_activation_link", "click");
		
		cl.resultfinal();
	}
}
