package Execution;

import java.lang.reflect.Method;

import Pkg_SOPPlan.commonLibrary;

public class Run_Testcases {
	
	public static Object objWait = "";
	
	public static void main(String[] args) throws Exception{
		 
		//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method
		ExcelUtils.setExcelFile(Constant.Path_TestCases + Constant.File_TestCases, "Sheet1");
		
		int totalRows = ExcelUtils.getTotalRows();
		System.out.println("total rows: " + totalRows);
		for(int i = Constant.start_row; i <= totalRows; i++)
		{
			String packageName  = ExcelUtils.getCellData(i, 1);
			String testCaseName = ExcelUtils.getCellData(i, 2);
			String iteration = ExcelUtils.getCellData(i, 3);
//			String iteration = "1";
			System.out.println("Package Name: " + packageName);
			System.out.println("Testcase Name: " + testCaseName);
			System.out.println("Iteration: " + iteration);
			
			commonLibrary.iteration = Integer.parseInt(iteration);
			
			String testCase = "Pkg_SOPPlan." + packageName + "." + testCaseName; // + ".main(args)";
					
			Class<?> cls = Class.forName(testCase);
			Method m = cls.getMethod("main", String[].class);
			String[] params = null;
			m.invoke(null, (Object)params);
			
			String curTestcaseStatus = commonLibrary.tcStatus;
			ExcelUtils.setCellData(curTestcaseStatus, i, 4);
			System.out.println("Testcase: " + testCaseName + " Executed. Status: " + curTestcaseStatus);
			commonLibrary.tcStatus = "Pass"; //By default set pass for next test case
		}
	}
}
