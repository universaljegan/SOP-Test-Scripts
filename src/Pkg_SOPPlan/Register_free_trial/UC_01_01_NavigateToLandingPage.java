package Pkg_SOPPlan.Register_free_trial;

import java.io.IOException;

import Pkg_SOPPlan.commonLibrary;

public class UC_01_01_NavigateToLandingPage {

	public static void main(String[] args) throws IOException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "01_Register_free_trial";
		cl.testCaseName = "TC001_RegisterFreeTrial";
		cl.tableName = "tbl_register_free_trial";
		cl.useCaseName = "UC_01_01_NavigateToLandingPage";
		cl.readXML();
		cl.createResultFolder();
		
		cl.validateURL("http://www.mysopplan.com", "http://www.mysopplan.com/LandingPage.aspx");
		
		cl.validateURL("http://www.mysopplan.com", "https://www.mysopplan.com/LandingPage.aspx");
		cl.validateURL("www.mysopplan.com", "https://www.mysopplan.com/LandingPage.aspx");
		cl.validateURL("mysopplan.com", "https://www.mysopplan.com/LandingPage.aspx");
		
		cl.resultfinal();
		
		cl.exitCurrentTest();
	}
}