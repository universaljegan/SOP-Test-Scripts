package Pkg_SOPPlan;

import Pkg_SOPPlan.Manage_Users.UC_03_01_CheckPageOpens;
import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;


public class Test_Suite {
	
	public static Test suite()
	{
		TestSuite suite = new TestSuite();
		
		suite.addTestSuite(UC_03_01_CheckPageOpens.class);
		return suite;
	}

	public static void main(String[] args) {
		TestRunner.run(suite());
	}
}
