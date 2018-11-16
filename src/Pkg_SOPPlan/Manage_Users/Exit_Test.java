package Pkg_SOPPlan.Manage_Users;

import Pkg_SOPPlan.commonLibrary;

public class Exit_Test {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		Thread.sleep(2000);
		cl.exitCurrentTest();
	}
}
