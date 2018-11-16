package Pkg_SOPPlan.Forecast_Sales;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pkg_SOPPlan.commonLibrary;

public class UC_12_23_CheckRightSideNegative4 {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "12_Forecast_Sales";
		cl.testCaseName = "UC_12_06_CheckRightSideValues";
		cl.tableName = "tbl_forecast_sales";
		cl.useCaseName = "UC_12_06_CheckRightSideValues";
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
				
		cl.executeTestStep("fsl_product_category", "select");
		
		Thread.sleep(1000);
		
		cl.executeTestStep("fsl_customer", "select");
		
		Thread.sleep(5000);
		
		cl.executeTestStep("fsl_forecast_error", "get");
		cl.executeTestStep("fsl_forecast_error_last_3_monts", "get");
		cl.executeTestStep("fsl_forecast_bias", "get");
		cl.executeTestStep("fsl_forecast_bias_last_3_months", "get");
		cl.executeTestStep("fsl_percent_of_forecasts", "get");
		cl.executeTestStep("fsl_average_monthly_sales", "get");
		cl.executeTestStep("fsl_average_monthly_forecast", "get");
		cl.executeTestStep("fsl_forecast_value_added", "get");
		cl.executeTestStep("fsl_forecast_value_added_last_3_months", "get");
		cl.executeTestStep("fsl_demand_pattern", "get");
		cl.executeTestStep("fsl_best_fit_algorithm", "get");
		cl.executeTestStep("fsl_historical_error_statistical", "get");
		cl.executeTestStep("fsl_historical_error_last_3_months_statistical", "get");
		cl.executeTestStep("fsl_historical_percent_error", "get");
		cl.executeTestStep("fsl_historical_percent_error_last_3_months", "get");
		
		cl.closeNewWindow();
				
		cl.resultfinal();
	}
}
