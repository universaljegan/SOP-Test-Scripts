package Pkg_SOPPlan.Statistical_Forecasting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pkg_SOPPlan.commonLibrary;

public class UC_13_04_CheckAlgorithmManuallySelected {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "12_Forecast_Sales";
		cl.testCaseName = "UC_12_05_Check2and3YearAgo";
		cl.tableName = "tbl_forecast_sales";
		cl.useCaseName = "UC_12_05_Check2and3YearAgo";
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
			cl.executeTestStep("fsl_menu", "mouseover");
			cl.executeTestStep("fsl_menu", "click");
		}
		Thread.sleep(1000);
		cl.switchToNewWindow();
		
		cl.executeTestStep("fsl_reset_forecast", "exist");
		cl.executeTestStep("fsl_statistical_forecast", "exist");
		
		cl.executeTestStep("fsl_product_category", "select");
		
		Thread.sleep(1000);
		
		cl.executeTestStep("fsl_customer", "select");
		
		Thread.sleep(5000);
		
		//Validate Forecast data
		cl.tableValidationHorizantal("txtFst", "fsl_forecast_data");
		
		//Validate Sales Target
		cl.tableValidationHorizantal("txtSalesTarget", "fsl_sales_target_data");

		//Validate Two Year Ago
		cl.tableValidationHorizantal("txtTwoYear", "fsl_two_year_ago_data");

		//Validate Three Year Ago
		cl.tableValidationHorizantal("txtThreeYear", "fsl_three_year_ago_data");
		
		cl.closeNewWindow();
				
		cl.resultfinal();
	}
}
