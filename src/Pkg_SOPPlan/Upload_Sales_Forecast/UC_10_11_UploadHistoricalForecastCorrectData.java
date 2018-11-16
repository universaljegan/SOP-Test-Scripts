package Pkg_SOPPlan.Upload_Sales_Forecast;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;

import Pkg_SOPPlan.commonLibrary;

public class UC_10_11_UploadHistoricalForecastCorrectData {

	public static void main(String[] args) throws InterruptedException, AWTException {
		commonLibrary cl = new commonLibrary();
		cl.packageName = "10_Upload_Sales_Forecast";
		cl.testCaseName = "UC_10_11_UploadHistoricalForecastCorrectData";
		cl.tableName = "tbl_upload_sales_forecast";
		cl.useCaseName = "UC_10_11_UploadHistoricalForecastCorrectData";
		cl.readXML();
		cl.loadTestData();
		
		if(cl.isLoginRequired.equals("YES"))
		{
			cl.loadURL("");
			cl.login3();
		}
		else
		{
			cl.createResultFolder();
		}
		
		if(cl.isMenuNavigationRequired.equals("YES"))
		{
			cl.executeTestStep("upl_upload_data_menu", "mouseover");
			cl.executeTestStep("upl_upload_sales_forecast_menu", "click");
		}
		
		Thread.sleep(2000);
		
		//Choose future foecast 
		cl.executeTestStep("upl_sales_forecast_type", "select");
		
		//Upload CSV File
		cl.executeTestStep("mus_browse_excel_file", "click");
		Thread.sleep(1000);
		cl.selectFile("mus_browse_csv_file");
		Thread.sleep(2000);
		cl.executeTestStep("upl_upload_excel_sales_forecast", "click");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		Thread.sleep(2000);
		cl.clickAlert("ok");
		

		cl.tableName = "tbl_account_activation";
		cl.loadTestData();

		cl.loadURL("http://www.google.com");
		cl.executeTestStep("aac_gmail_link", "click");
		cl.executeTestStep("aac_gmail_id", "set");
		cl.executeTestStep("aac_gmail_next", "click");
		cl.executeTestStep("aac_gmail_password", "set");
		cl.executeTestStep("aac_sign_in", "click");
		
		Thread.sleep(3000);
		
		cl.executeTestStep("upl_open_upload_sales_data_success_mail", "click");
		//If not found in Inbox, check in Spam
		if(cl.tcStatus.replaceAll("\\s+","").equalsIgnoreCase("Fail".replaceAll("\\s+","")))
		{
			cl.tcStatus = "Pass";
			System.out.println("Inside condition.");
			commonLibrary.LinkText = "Starred";
			cl.executeTestStep("common_mail_link_identifier", "mouseover");
			Thread.sleep(1000);
			cl.executeTestStep("aac_more_link_in_mail", "click");
			
			Thread.sleep(3000);
			
			commonLibrary.LinkText = "Starred";
			cl.executeTestStep("common_mail_link_identifier", "mouseover");
			
			Thread.sleep(1000);
			commonLibrary.LinkText = "Spam";
			cl.executeTestStep("common_mail_link_identifier", "click");
			
			cl.executeTestStep("upl_open_upload_sales_data_success_mail", "click");
		}
		
//		cl.executeTestStep("aac_activation_link_new_forecasting_system", "click");
		
		Thread.sleep(3000);
		
		String expectedText = "We are pleased to advise you that your Sales forecast data was correctly uploaded to MYSOPPLAN.com Your uploaded file name is :SOPPLAN_historical_forecast_upload_10_11.csv";
		
		cl.mpc_excel_upload_success_validation_in_mail("2", "2", expectedText);
		cl.resultfinal();
	}
}
