package Pkg_SOPPlan.Forecast_Sales;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pkg_SOPPlan.commonLibrary;

public class UC_12_03_ValidateCustomerDropDown {

	public static void main(String[] args) throws InterruptedException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "12_Forecast_Sales";
		cl.testCaseName = "UC_12_04_CheckBudgetTarget";
		cl.tableName = "tbl_forecast_sales";
		cl.useCaseName = "UC_12_04_CheckBudgetTarget";
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
		
		cl.switchToNewWindow();
		
		cl.executeTestStep("fsl_reset_forecast", "exist");
		cl.executeTestStep("fsl_statistical_forecast", "exist");
		
//		cl.executeTestStep("fsl_product_category", "select");
		
		Thread.sleep(2000);
		
//		cl.validateDropDown("ddlSalesArea", "fsl_customer");
		
		cl.tableValidationHorizantal("txtStatistical", "fsl_statistical_forecast");
		
		cl.closeNewWindow();
				
		cl.resultfinal();
	}
}
