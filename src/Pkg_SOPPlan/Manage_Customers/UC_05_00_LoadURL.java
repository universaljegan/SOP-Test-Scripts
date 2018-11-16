package Pkg_SOPPlan.Manage_Customers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UC_05_00_LoadURL {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.google.com");
	}
}
