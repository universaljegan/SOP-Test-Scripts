package Pkg_SOPPlan;

import java.awt.AWTException;
import java.awt.Dimension;
import java.util.List;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.thoughtworks.selenium.Selenium;

public class commonLibrary 
{
	public Map<String, String> map;
	Selenium selenium;
	public static WebDriver driver;
	public static String tsStatus = ""; //Test step status
	public static String tcStatus = "Pass"; //Test case status
	BufferedWriter output;
	int sno = 0;

	public static String curTableRow = ""; //For multiple rows entry, assign the row number here
	public static String LinkText = "";
	public String tableName = "";
	public String packageName = "";
	public String testCaseName = "";
	public String useCaseName = "";
	
	public static int iteration = 1;
	String dbURL = "";
	String dbUsername = "";
	String dbPassword = "";
	String dbName = "";
	
	String sopUsername = "";
	String sopPassword = "";
	String secondUsername = "";
	String secondPassword = "";
	String thirdUsername = "";
	String thirdPassword = "";
	
	String applicationURL = "";
	String stopExecutionOnFail = "";
	
	String baseResultPath = "";
	String tcResultFolder = "";
	String testCaseResultPath = "";
	
	public String isLoginRequired = "";
	public String isMenuNavigationRequired = ""; 
	
	public void readXML()
	{
		try
		{
			File xmlFilePath = new File("sopEnvrionementDetails.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFilePath);
			doc.getDocumentElement().normalize();
	
			NodeList nList = doc.getElementsByTagName("Variable");
			for (int i = 0; i < nList.getLength(); i++) 
			{
				Node nNode = nList.item(i);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) 
				{
					Element eElement = (Element) nNode;
					String Envname = eElement.getElementsByTagName("Name").item(0).getTextContent();
					
					if (Envname.contains("Env_DB_URL"))
					{
						dbURL = eElement.getElementsByTagName("Value").item(0).getTextContent();
						System.out.println("Database URL: " + dbURL);
					}
					else if (Envname.contains("Env_DB_Username"))
					{
						dbUsername = eElement.getElementsByTagName("Value").item(0).getTextContent();
						System.out.println("Database username: " + dbUsername);
					}
					else if (Envname.contains("Env_DB_Password"))
					{
						dbPassword = eElement.getElementsByTagName("Value").item(0).getTextContent();
						System.out.println("Database password: " + dbPassword);
					}
					else if (Envname.contains("Env_DB_Name"))
					{
						dbName = eElement.getElementsByTagName("Value").item(0).getTextContent();
						System.out.println("Database name: " + dbName);
					}
					else if (Envname.contains("Env_ApplicationURL"))
					{
						applicationURL = eElement.getElementsByTagName("Value").item(0).getTextContent();
						System.out.println("Application URL: " + applicationURL);
					}
					else if (Envname.contains("Env_Is_Login_Required"))
					{
						isLoginRequired = eElement.getElementsByTagName("Value").item(0).getTextContent();
						System.out.println("Is login required each use case: " + isLoginRequired);
					}
					else if (Envname.contains("Env_Is_Menu_Navigation_Required"))
					{
						isMenuNavigationRequired = eElement.getElementsByTagName("Value").item(0).getTextContent();
						System.out.println("Is menu navigation required for each use case: " + isMenuNavigationRequired);
					}
					else if (Envname.contains("Env_SOP_Username"))
					{
						sopUsername = eElement.getElementsByTagName("Value").item(0).getTextContent();
						System.out.println("First username: " + sopUsername);
					}
					else if (Envname.contains("Env_SOP_Password"))
					{
						sopPassword = eElement.getElementsByTagName("Value").item(0).getTextContent();
						System.out.println("First password: " + sopPassword);
					}
					else if (Envname.contains("Env_Second_Username"))
					{
						secondUsername = eElement.getElementsByTagName("Value").item(0).getTextContent();
						System.out.println("Second username: " + secondUsername);
					}
					else if (Envname.contains("Env_Second_Password"))
					{
						secondPassword = eElement.getElementsByTagName("Value").item(0).getTextContent();
						System.out.println("Second password: " + secondPassword);
					}
					else if (Envname.contains("Env_Third_Username"))
					{
						thirdUsername = eElement.getElementsByTagName("Value").item(0).getTextContent();
						System.out.println("Third username: " + thirdUsername);
					}
					else if (Envname.contains("Env_Third_Password"))
					{
						thirdPassword = eElement.getElementsByTagName("Value").item(0).getTextContent();
						System.out.println("Third password: " + thirdPassword);
					}
					else if (Envname.contains("Env_Stop_Execution_on_Fail"))
					{
						stopExecutionOnFail = eElement.getElementsByTagName("Value").item(0).getTextContent();
						System.out.println("Stop execution if test step fails: " + stopExecutionOnFail);
					}
					else if (Envname.contains("Env_ResultPath"))
					{
						baseResultPath = eElement.getElementsByTagName("Value").item(0).getTextContent();
						System.out.println("Result path: " + baseResultPath);
					}
					else if (Envname.contains("Env_Iteration"))
					{
//						iteration = Integer.parseInt(eElement.getElementsByTagName("Value").item(0).getTextContent());
//						System.out.println(iteration);
					}
				}
			}
		}
		catch (Exception ex) 
		{}
	}
	
	@SuppressWarnings("finally")
	public String loadTestData()
	{
		Connection connection;
		Statement stmt;
		
		try
		{
	        Class.forName("com.mysql.jdbc.Driver");
	        String url = dbURL; //"jdbc:mysql://localhost";
	        String user = dbUsername; //"root";
	        String password = dbPassword; //"";
	        connection = DriverManager.getConnection(url, user, password);            
	        stmt = connection.createStatement();
	        stmt.execute("Use " + dbName);
	        System.out.println("\nDB " + dbName + " connected");
	        
	        //Get Values
	        ResultSet rs = null;
	        String qryGetTestData = "SELECT * FROM " + tableName + " WHERE testcase_name = '" + testCaseName + "' AND iteration = " + iteration; 
	        if(stmt.execute(qryGetTestData))
	        {
	        	rs = stmt.getResultSet();
    			map = new HashMap<String, String>();
	        	while(rs.next())
	        	{
	        		for(int i = 1; i <= rs.getMetaData().getColumnCount(); i++)
	        		{
	        			//Check if the value is null, if yes add empty string [Bcz comparison, will not consider null value]
	        			String tData = rs.getString(rs.getMetaData().getColumnLabel(i));
	        			if(tData == null)
	        			{
	        				map.put(rs.getMetaData().getColumnLabel(i), "");
	        			}
	        			else
	        			{
	        				map.put(rs.getMetaData().getColumnLabel(i), rs.getString(rs.getMetaData().getColumnLabel(i)));

	        				String tStep = rs.getMetaData().getColumnLabel(i);
	        				if(i > 4) //First 4 columns in table need not to substring.
	        				{
		        				tStep = tStep.substring(4);
		        				tStep = tStep.replaceAll("_", " ");
		        				tStep = StringUtils.capitalize(tStep);
	        				}
		        			System.out.println(tStep + ": " + tData); //Show test step and test data in Console
	        			}
	        		}
	        	}
	        }
		}
		catch(ClassNotFoundException e)
		{
			System.err.println("Could not load database driver!" + e);
			throw new IllegalStateException(e);
		}
		catch(SQLException e)
		{
	        System.out.println("notconnected");
			e.printStackTrace();
			throw new IllegalStateException(e);
		}
		catch(Exception e)
		{
			System.err.println("Error: "+e);
		}
		finally
		{
			return "success";
		}
	}
	
	public void loadURL(String URL)
	{
		driver = new FirefoxDriver();
// 		To execute in Chrome browser un-comment the below two lines
//		System.setProperty("webdriver.chrome.driver", "F://Projects/Eclipse/chromedriver.exe");
//      driver = new ChromeDriver();
        
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//If URL is empty, load the URL from Environment XML
		if(URL.equalsIgnoreCase(""))
		{
			driver.navigate().to(applicationURL);
			System.out.println("Default URL loaded: " + applicationURL);
		}
		else
		{
			driver.navigate().to(URL);
			System.out.println("Provided URL loaded: " + URL);
		}
		
		driver.manage().window().maximize();
		
		try 
		{
	    	createResultFolder();
			Thread.sleep(2500);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	//First user login
	public void login()
	{
		map.put("lgi_login_link", "Y");
		map.put("lgi_sop_username", sopUsername);
		map.put("lgi_sop_password", sopPassword);
		map.put("lgi_login_button", "Y");
		
		executeTestStep("lgi_login_link", "click");
		executeTestStep("lgi_sop_username", "set");
		executeTestStep("lgi_sop_password", "set");
		executeTestStep("lgi_login_button", "click");
		
		System.out.println("Logged in with user: " + sopUsername);
		
		clickAlert("ok"); //for Expired users
	}
	
	//Second user login
	public void login2()
	{
		map.put("lgi_login_link", "Y");
		map.put("lgi_sop_username", secondUsername);
		map.put("lgi_sop_password", secondPassword);
		map.put("lgi_login_button", "Y");
		
		executeTestStep("lgi_login_link", "click");
		executeTestStep("lgi_sop_username", "set");
		executeTestStep("lgi_sop_password", "set");
		executeTestStep("lgi_login_button", "click");
		
		System.out.println("Logged in with user: " + secondUsername);
		
		clickAlert("ok"); //for Expired users
	}
	
	//Third user login
	public void login3()
	{
		map.put("lgi_login_link", "Y");
		map.put("lgi_sop_username", thirdUsername);
		map.put("lgi_sop_password", thirdPassword);
		map.put("lgi_login_button", "Y");
		
		executeTestStep("lgi_login_link", "click");
		executeTestStep("lgi_sop_username", "set");
		executeTestStep("lgi_sop_password", "set");
		executeTestStep("lgi_login_button", "click");
		
		System.out.println("Logged in with user: " + thirdUsername);
		
		clickAlert("ok"); //for Expired users
	}
	
	//For some cases, username and password will be passed from Database instead of XML values
	public void loginDirect()
	{
		executeTestStep("lgi_login_link", "click");
		executeTestStep("lgi_sop_username", "set");
		executeTestStep("lgi_sop_password", "set");
		executeTestStep("lgi_login_button", "click");
	}
	
	//For continuous execution, result folder function called manually
	public void createResultFolder()
	{
		try
		{
			Date now = new Date();
			SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd_HH-mm");
			String curDT = dt.format(now);
			
			tcResultFolder = useCaseName + "_" + curDT;
			testCaseResultPath = baseResultPath + packageName + "/" + tcResultFolder + "/";
			
			File folder = new File(testCaseResultPath);
			
			if (!folder.exists())
			{
				folder.mkdirs();
				writeHTML("initial", "", "", "", "");
				sno++;
				
				System.out.println("Result folder created: " + testCaseResultPath);
			}
		}
		catch(Exception e)
		{}
	}
	
	//Load new URL in a browser, this is used to check Navigate away functionalities
	public void newURL(String URL)
	{
		driver.get(URL);
	}
	
	//To check leave browser window alert
	public void closeBrowser()
	{
		try
		{
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ALT);
			robot.keyPress(KeyEvent.VK_F4);
		}
		catch(Exception e)
		{}
	}
	
	//Page refresh
	public void refreshBrowser()
	{
		try
		{
			driver.navigate().refresh();
		}
		catch(Exception e){}
	}
	
	//To check navigate away (back)
	public void  goBackURL()
	{
		driver.navigate().back();
	}
	
	//Compare provided URL and actual URL loaded in Browser. (Ex: if we send soplan.com, it has to load www.soplan.com)
	//This is used in "Register for free trail" use case 1 alone.
	public void validateURL(String URL, String chkURL)
	{
		String curURL = "";
		try
		{
			driver = new FirefoxDriver();
			//To execute in Chrome browser un-comment the below two lines
			//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	        //driver = new ChromeDriver();
	        
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.navigate().to(URL);
			driver.get(URL);
			driver.manage().window().maximize();
			
			curURL = driver.getCurrentUrl();
			
			System.out.println("Given URL: " + URL);
			System.out.println("Expected URL: " + chkURL);
			System.out.println("Actual URL: " + curURL);
			if(curURL.equalsIgnoreCase(chkURL))
			{	
				tsStatus = "Pass";
				result("rfc_" + URL.replaceAll("http://", "").replaceAll("https://", ""), "validate", curURL.replaceAll("http://", "").replaceAll("https://", ""), tsStatus);
				driver.close();
			}
			else
			{
				tsStatus = "Fail";
				tcStatus = "Fail";
				result("rfc_" + URL.replaceAll("http://", "").replaceAll("https://", ""), "validate", curURL.replaceAll("http://", "").replaceAll("https://", ""), tsStatus);
				driver.close();
				if(stopExecutionOnFail.equalsIgnoreCase("YES"))
				{
					resultfinal();
				}
			}
		}
		catch(Exception e)
		{	
			tsStatus = "Fail";
			tcStatus = "Fail";
			result("rfc_" + URL.replaceAll("http://", "").replaceAll("https://", ""), "validate", curURL.replaceAll("http://", "").replaceAll("https://", ""), tsStatus);
			System.out.println(e.getMessage());
			driver.close();
			if(stopExecutionOnFail.equalsIgnoreCase("YES"))
			{
				resultfinal();
			}
		}
	}
	
	//Check loaded URL, ex: In popup some page opened, while click the link in Application
	public void validateCurrentURL(String expectedURL)
	{
		String curURL = "";
		try
		{			
			curURL = driver.getCurrentUrl();
			System.out.println("Expected URL: " + expectedURL);
			System.out.println("Actual URL: " + curURL);
			if(curURL.equalsIgnoreCase(expectedURL))
			{
				tsStatus = "Pass";
				result("rfc_" + expectedURL.replaceAll("http://", "").replaceAll("https://", ""), "validate", curURL.replaceAll("http://", "").replaceAll("https://", ""), tsStatus);
			}
			else
			{
				tsStatus = "Fail";
				tcStatus = "Fail";
				result("rfc_" + expectedURL.replaceAll("http://", "").replaceAll("https://", ""), "validate", curURL.replaceAll("http://", "").replaceAll("https://", ""), tsStatus);
				if(stopExecutionOnFail.equalsIgnoreCase("YES"))
				{
					resultfinal();
				}
			}
		}
		catch(Exception e)
		{	
			tsStatus = "Fail";
			tcStatus = "Fail";
			result("rfc_" + expectedURL.replaceAll("http://", "").replaceAll("https://", ""), "validate", curURL.replaceAll("http://", "").replaceAll("https://", ""), tsStatus);
			System.out.println(e.getMessage());
			if(stopExecutionOnFail.equalsIgnoreCase("YES"))
			{
				resultfinal();
			}
		}
	}
	
	//This is main function, which used to execute all test steps like "Click buttons, set value in textboxes etc"
	public void executeTestStep(String testStep, String eventType)
	{
		String testData = "";
		try
		{
			testData = map.get(testStep);
			if(testData != "" && testData != null)
			{
				//Split the string, and get required data alone
				int isMultipleData = testData.indexOf("|");
				if(isMultipleData > 0)
				{
					String[] arrTestData = StringUtils.split(testData, "|"); // testData.split("|");				
					testData = arrTestData[Integer.parseInt(curTableRow) - 1];
				}
				System.out.println("Test Data: " + testData);
			}
			
			Class c = Class.forName("Pkg_SOPPlan.objectRepository");
			Class[] paramTypes = new Class[1];
			paramTypes[0] = WebDriver.class;
			
			//Here testStep is a function name in Object Repository
			//We need to call that function, to get the element
			//But string is passed, to call that function, we need to use getMethod functionality
			Method m = c.getMethod(testStep, paramTypes);
			objectRepository or = new objectRepository();
			Object obj = m.invoke(or, driver);
			WebElement element = (WebElement)obj;

			Thread.sleep(2000);
			
			Actions action = new Actions(driver);			
			//Boolean isPass;
			tsStatus = "Done";
			if(eventType == "click")
			{
				action.moveToElement(element).click().perform();
			}
			else if(eventType == "set")
			{
				try
				{
					element.clear();
					if(testData.contains("presstab"))
					{
						element.sendKeys(Keys.TAB);
					}
					else if(testStep.contains("password"))
					{
						element.sendKeys(testData);
						testData = encryptPassword(testData);
					}
					else
					{
						element.sendKeys(testData);
					}
				}
				catch(Exception e){}
			}
			else if(eventType == "datepickter")
			{
				element.click();
				selectDatePicker("", testData);
			}
			else if(eventType == "tab")
			{
				element.sendKeys(Keys.TAB);
			}
			else if(eventType == "alttab")
			{
				Robot robot = new Robot();
				robot.delay(250);
				robot.keyPress(KeyEvent.VK_ALT);
				robot.keyPress(KeyEvent.VK_TAB);
			}
			else if(eventType == "select")
			{
				Select ddl = new Select(element);
				
				if(testData.equalsIgnoreCase(" "))
				{
					ddl.selectByIndex(0);
				}
				else
				{
					ddl.selectByVisibleText(testData);
				}
			}
			else if(eventType == "validate")
			{
				String result = element.getAttribute("innerHTML");
				testData = testData.replaceAll("<br>","");
				result = result.replaceAll("<br>","");
//				result = result.replaceAll("[^A-Za-z]+","");
				if(result.replaceAll("[^A-Za-z]+","").equalsIgnoreCase(testData.replaceAll("[^A-Za-z]+","")))
				{
					System.out.println("equal alert");
					tsStatus = "Pass";
				}
				else
				{
					System.out.println("not equal alert");
					tsStatus = "Fail";
					tcStatus = "Fail";
				}
				testData = "<b>Expected value:</b> " + testData + "<br> <b>Actual value:</b> " + result;
				
				System.out.println("Test data: " + testData);
				System.out.println("Actual data: " + result);
			}
			else if(eventType == "focus")
			{
				new Actions(driver).moveToElement(element).perform();
			}
			else if(eventType == "mouseover")
			{
				Actions builder = new Actions(driver);
				builder.moveToElement(element).perform();
				//element.click();
			}
			else if(eventType == "exist")
			{
				if(element.getSize().getHeight() > 1)
				{
					System.out.println("Element available");
					tsStatus = "Pass";
				}
				else
				{
					System.out.println("not equal");
					tsStatus = "Fail";
					tcStatus = "Fail";
				}
			}
			else if(eventType == "notexist")
			{
				if(!element.isDisplayed())
				{
					System.out.println("Element not available");
					tsStatus = "Pass";
				}
				else
				{
					System.out.println("not equal");
					tsStatus = "Fail";
					tcStatus = "Fail";
				}
			}
			else if(eventType == "get")
			{
				String val = element.getAttribute("value");
				System.out.println("Textbox value:" + val);
				if(val.replaceAll("\\s+","").equalsIgnoreCase(testData.replaceAll("\\s+","")))
				{
					System.out.println("equal");
					tsStatus = "Pass";
				}
				else
				{
					System.out.println("not equal");
					tsStatus = "Fail";
					tcStatus = "Fail";
				}
				testData = "<b>Expected value:</b> " + testData + "<br> <b>Actual value:</b> " + val;
			}
			else if(eventType == "innerHTML")
			{
				String val = element.getAttribute("innerHTML");
				System.out.println("Textbox value:" + val);
				if(val.replaceAll("\\s+","").equalsIgnoreCase(testData.replaceAll("\\s+","")))
				{
					System.out.println("equal");
					tsStatus = "Pass";
				}
				else
				{
					System.out.println("not equal");
					tsStatus = "Fail";
					tcStatus = "Fail";
				}
			}
			
			else if(eventType == "notequal")
			{
				String val = element.getAttribute("value");
				System.out.println("Textbox value:" + val);
				if(!val.replaceAll("\\s+","").equalsIgnoreCase(testData.replaceAll("\\s+","")))
				{
					System.out.println("Not Equal: Pass");
					tsStatus = "Pass";
				}
				else
				{
					System.out.println("Equal: Fail");
					tsStatus = "Fail";
					tcStatus = "Fail";
				}
				testData = "<b>Expected value:</b> " + testData + "<br> <b>Actual value:</b> " + val;
			}
			else if(eventType == "getSelectedText")
			{
				String val = new Select(element).getFirstSelectedOption().getText();
				System.out.println("Selected value:" + val);
				if(val.replaceAll("\\s+","").equalsIgnoreCase(testData.replaceAll("\\s+","")))
				{
					System.out.println("equal");
					tsStatus = "Pass";
				}
				else
				{
					System.out.println("not equal");
					tsStatus = "Fail";
					tcStatus = "Fail";
				}
			}
			else if(eventType == "readonly")
			{
				String isReadonly = element.getAttribute("readOnly");
				if(isReadonly.equalsIgnoreCase("true"))
				{
					System.out.println("Readonly");
					tsStatus = "Pass";
				}
				else
				{
					System.out.println("Not Readonly");
					tsStatus = "Fail";
					tcStatus = "Fail";
				}
			}
			else if(eventType == "hover_validate")
			{
				String titleValue = element.getAttribute("title");
				System.out.println("Hover Text: " + titleValue);
				if(titleValue.replaceAll("\\s+","").equalsIgnoreCase(testData.replaceAll("\\s+","")))
				{
					System.out.println("equal");
					tsStatus = "Pass";
				}
				else
				{
					System.out.println("not equal");
					tsStatus = "Fail";
					tcStatus = "Fail";
				}
			}
			else if(eventType == "highlight")
			{
				HighlightMyElement(element);
			}
//			else if(eventType == "partialLinkText")
//			{
//				driver.findElement(By.partialLinkText(“Gm”)).click();
//			}
			
			result(testStep, eventType, testData, tsStatus);
			sno++;
		}
		catch(Exception e)
		{
			tsStatus = "Fail";
			result(testStep, eventType, testData, tsStatus);
			sno++;
			System.out.println("Exception Msg: " + e.getMessage() + " @ " + e.getLocalizedMessage());
			e.printStackTrace();
			
			tcStatus = "Fail";
			if(stopExecutionOnFail.equalsIgnoreCase("YES"))
			{
				resultfinal();
			}
		}
	}
	
	public Boolean chkIsExist(String elementAttribute)
	{
		WebElement curElement =  driver.findElement(By.xpath(elementAttribute));
		if(curElement.getSize().getHeight() > 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	 public void HighlightMyElement(WebElement element) 
	 {
		  for (int i = 0; i < 10; i++)
		  {
			   JavascriptExecutor javascript = (JavascriptExecutor) driver;
			   javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: orange; border: 4px solid orange;");
			   javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
		  } 
	  }
	
	public String winHandleBefore2 = "";
	public void switchToNewWindow()
	{
		winHandleBefore2 = driver.getWindowHandle();
		//driver.close(); to close the previous window, use this line
		
		for(String winHandle : driver.getWindowHandles())
		{
			System.out.println("Current Window: " + winHandle);
			driver.switchTo().window(winHandle);
		}
	}
	
	public void closeNewWindow()
	{
		driver.close();
		driver.switchTo().window(winHandleBefore2);	
	}
	
	public String encryptPassword(String orginalPassword)
	{
		try
		{
		    MessageDigest md5 = MessageDigest.getInstance("MD5");
		    md5.update(orginalPassword.getBytes(),0,orginalPassword.length());
		    String signature = new BigInteger(1,md5.digest()).toString(16);
		    System.out.println("Signature: "+signature);
			return signature;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "";
		}
	}
	
	public void clickAlert(String alertOption)
	{
		try
		{
			result("mus_Click_Alert", "click", alertOption, "Pass");
			if(alertOption.replaceAll("\\s+","").equalsIgnoreCase("ok"))
			{
				driver.switchTo().alert().accept();
			}
			else
			{
				driver.switchTo().alert().dismiss();
			}
		}
		catch(Exception e)
		{
			result("mus_Click_Alert", "click", alertOption, "Fail");
			tcStatus = "Fail";
			if(stopExecutionOnFail.equalsIgnoreCase("YES"))
			{
				resultfinal();
			}
		}
	}
	
	public void validateAlert(String alertMsg)
	{
		try
		{
			System.out.println("Expected Alert: " + alertMsg);
			
			Alert alert = driver.switchTo().alert();
			
			String browserAlertMsg = alert.getText();
	
			System.out.println("Browser Alert: " + browserAlertMsg);
			if(alertMsg.replaceAll("\\s+","").equalsIgnoreCase(browserAlertMsg.replaceAll("\\s+","")))
			{
				tsStatus = "Pass";
				result("rfc_Alert", "validate", "<b>Expected value:</b> " + alertMsg + "<br><b>Actual value:</b> " + browserAlertMsg, tsStatus);
			}
			else
			{
				tsStatus = "Fail";
				tcStatus = "Fail";
				result("rfc_Alert", "validate", "<b>Expected value:</b> " + alertMsg + "<br><b>Actual value:</b> " + browserAlertMsg, tsStatus);
				if(stopExecutionOnFail.equalsIgnoreCase("YES"))
				{
					resultfinal();
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception Msg: " + e.getMessage());
			result("rfc_Expected Alert: " + alertMsg, "validate", e.getMessage(), "Fail");
			tcStatus = "Fail";
			if(stopExecutionOnFail.equalsIgnoreCase("YES"))
			{
				resultfinal();
			}
		}
	}
	
	public void listItems(String listBoxId, String checkValueId)
	{
		String expectedValue = map.get(checkValueId);
		System.out.println(expectedValue);
		String[] arrTestData = StringUtils.split(expectedValue, "|");
		
		//If more than one data exist, loop will iterate for all the test data
		for(int k = 1; k <= arrTestData.length; k++)
		{
			if(expectedValue != "" && expectedValue != null)
			{
				expectedValue = arrTestData[k - 1];

				WebElement element =  driver.findElement(By.id(listBoxId));
				
				Select mySelect = new Select(element);
				List<WebElement> options = mySelect.getOptions();
				
				String isFound = "no"; int i = 1;
				for(WebElement option : options)
				{
					try
					{
						
						String selectBoxText = option.getText();
						System.out.println(selectBoxText);
						if(selectBoxText.equalsIgnoreCase(expectedValue))
						{
							WebElement element2 =  driver.findElement(By.xpath(".//*[@id='" + listBoxId + "']/option[" + i + "]"));
							element2.click();
						}
						i++;
					}
					catch(Exception e)
					{
						System.out.println("In Catch Block");
					}
				}
			}
		}
	}
	
	public void validateDropDown(String selectBoxId, String checkValueId)
	{
		String expectedValue = map.get(checkValueId);
		String[] arrTestData = StringUtils.split(expectedValue, "|");
		
		//If more than one data exist, loop will iterate for all the test data
		for(int k = 1; k <= arrTestData.length; k++)
		{
			if(expectedValue != "" && expectedValue != null)
			{
				expectedValue = arrTestData[k - 1];
				System.out.println("Expected Value: " + expectedValue);
			}
			
			WebElement element =  driver.findElement(By.id(selectBoxId));
			
			Select mySelect = new Select(element);
			List<WebElement> options = mySelect.getOptions();
			
			String isFound = "no";
			for(WebElement option : options)
			{
				try
				{
					String selectBoxText = option.getText();
					if(selectBoxText.equalsIgnoreCase(expectedValue))
					{
						isFound = "yes";
					}
				}
				catch(Exception e){}
			}
			
			if(isFound == "yes")
			{
				tsStatus = "Pass";
				result("rfc_" + expectedValue, "validate", "Value Found", tsStatus);
			}
			else
			{
				tsStatus = "Fail";
				tcStatus = "Fail";
				result("rfc_" + expectedValue, "validate", "Value not found", tsStatus);
				System.out.println(expectedValue + " Value not found");
			}
		}
	}

	//********** Validate errors in table after upload in Excel **********
    //Excel upload Error Table validation for Manage Users
  	public void mus_excel_upload_error_validation(String tr, String td, String expectedText)
	{
  		WebElement element = null;
  		element = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMenu_dgShowUsersErrors']/tbody/tr[" + tr + "]/td[" + td + "]"));
  		
  		validateText(expectedText, element.getText());
	}

  	//Excel upload Error Table validation for Manage Products
  	public void mpc_excel_upload_error_validation(String tr, String td, String expectedText)
	{
  		try
  		{
	  		WebElement element = null;
	  		element = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMenu_dgShowProductsErrors']/tbody/tr[" + tr + "]/td[" + td + "]"));
	  		
	  		validateText(expectedText, element.getText());
  		}
  		catch(Exception e)
  		{
  			
  		}
	}
  	
  	//Excel upload Error Table validation for Manage Customers
  	public void mpc_excel_upload_error_validation_customers(String tr, String td, String expectedText)
	{
  		WebElement element = null;
  		element = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMenu_dgShowCustomersErrors']/tbody/tr[" + tr + "]/td[" + td + "]"));
  		
  		validateText(expectedText, element.getText());
	}

  	//Excel upload Error Table validation for Upload Sales History
  	public void mpc_excel_upload_error_validation_sales_history(String tr, String td, String expectedText)
	{
  		WebElement element = null;
  		element = driver.findElement(By.xpath(".//*[@id='ctl00_ContentMenu_dgShowSalesErrors']/tbody/tr[" + tr + "]/td[" + td + "]"));
  		
  		validateText(expectedText, element.getText());
	}
  	
  	//Excel upload Error Table validation for Upload Sales History
  	public void mpc_excel_upload_error_validation_in_mail(String tr, String td, String expectedText)
	{
		String tblClass = "a3s aXjCH m15cac0bb4985498a";
  		
  		WebElement element = null;
  		element = driver.findElement(By.xpath("//div[@class='" + tblClass + "']/div/table/tbody/tr[1]/td/table/tbody/tr[" + tr + "]/td[" + td + "]"));
  		
  		validateText(expectedText, element.getText());
	}
  	
  	//Excel upload Error Table validation for Upload Sales History
  	public void mpc_excel_upload_success_validation_in_mail(String tr, String td, String expectedText)
	{
		String tblClass = "a3s aXjCH m15aae55cd2185166";
  		
  		WebElement element = null;
  		element = driver.findElement(By.xpath("//div[@class='" + tblClass + "']/div/table/tbody/tr[1]/td"));
  		
  		validateText(expectedText, element.getText());
	}
  	
	public void validateText(String expectedText, String actualText)
	{
		try
		{
			System.out.println("Expected Text: " + expectedText);	
			System.out.println("Actual Text: " + actualText);
			if(actualText.replaceAll("\\s+","").equalsIgnoreCase(expectedText.replaceAll("\\s+","")))
			{
				tsStatus = "Pass";
				result("rfc_Excel Upload", "validate", "<b>Expected value:</b> " + expectedText + "<br><b>Actual value:</b> " + actualText, tsStatus);
			}
			else
			{
				tsStatus = "Fail";
				tcStatus = "Fail";
				result("rfc_Excel Upload", "validate", "<b>Expected value:</b> " + expectedText + "<br><b>Actual value:</b> " + actualText, tsStatus);
				if(stopExecutionOnFail.equalsIgnoreCase("YES"))
				{
					resultfinal();
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception Msg: " + e.getMessage());
			result("rfc_Excel Upload", "validate", "<b>Expected value:</b> " + expectedText + "<br><b>Actual value:</b> " + actualText, tsStatus);
			tcStatus = "Fail";
			if(stopExecutionOnFail.equalsIgnoreCase("YES"))
			{
				resultfinal();
			}
		}
	}
	
	public void takeScreenShot(String testStep)
	{
		try
		{	
			result(testStep, "Screenshot", "", "Done");
		}
		catch(Exception e)
		{
			result(testStep, "Screenshot", "", "Fail");
			tcStatus = "Fail";
			if(stopExecutionOnFail.equalsIgnoreCase("YES"))
			{
				resultfinal();
			}
		}
	}
	
	//Manually update the result, which sent from use case
	public void updateResult(String testStep, String status)
	{
		result(testStep, "validate", "", status);
	}
	
	public boolean isCheckboxChecked(String checkBoxId)
	{
		if(driver.findElement(By.id(checkBoxId)).isSelected())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//In file input (browse) control, select the file from windows explorer
	public void selectFile(String excelPathField) throws InterruptedException, AWTException
	{
		Thread.sleep(2000);

		String filename = map.get(excelPathField);
		String filePath = "";
		try
		{
			String dir = System.getProperty("user.dir");
			filePath = dir + "\\src\\Execution\\Upload_files\\" + filename;
	        System.out.println("Excel path = " + filePath);
	        
			StringSelection ss = new StringSelection(filePath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	
			//imitate mouse events like ENTER, CTRL+C, CTRL+V
			Robot robot = new Robot();
			robot.delay(250);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			result("mus_Upload_Excel", "Select File", filePath, "Pass");
		}
		catch(Exception e)
		{
			result("mus_Upload_Excel", "Select File", filePath, "Fail");
			tcStatus = "Fail";
			if(stopExecutionOnFail.equalsIgnoreCase("YES"))
			{
				resultfinal();
			}
		}
	}
	
	public void tableValidationDynamic(String prefix, String suffix, String startRowNum, String tableId, String checkValueId, String selectBoxId, String action, String actPrefix, String actSuffix) throws InterruptedException
	{
		String expectedValue = map.get(checkValueId);
		String[] arrTestData = StringUtils.split(expectedValue, "|");
		
		//If more than one data exist, loop will iterate for all the test data
		for(int k = 1; k <= arrTestData.length; k++)
		{
			if(expectedValue != "" && expectedValue != null)
			{
				expectedValue = arrTestData[k - 1];
				System.out.println("Expected Value: " + expectedValue);
			}
			
			//Page SelectBox
			WebElement element =  driver.findElement(By.id(selectBoxId));
			
			Select mySelect = new Select(element);
			List<WebElement> options = mySelect.getOptions();
			WebElement email;
			
			String isFound = "no";
			for(WebElement option : options)
			{
				System.out.println("Before Select Page");
				
				try
				{
					WebDriverWait wait = new WebDriverWait(driver, 3000);
					wait.until(ExpectedConditions.elementToBeClickable(By.id(selectBoxId)));
					
					String selectBoxText = option.getText();
					System.out.println(selectBoxText);
					mySelect.selectByVisibleText(selectBoxText);				
				}
				catch(Exception e){}
				
				int curRowNum = Integer.parseInt(startRowNum);
				
				WebElement table = driver.findElement(By.id(tableId));
				List<WebElement> allRows = table.findElements(By.cssSelector("table#" + tableId + ">tbody>tr"));
				int totalRows1 = allRows.size();
				System.out.println("Total Rows: " + totalRows1);
				for(int i = 0; i < totalRows1 - 1; i++)
				{
					Thread.sleep(500);
					try
					{
						String rowId = prefix + String.format("%02d", (curRowNum)) + suffix;
						curRowNum++;
						
						email = driver.findElement(By.id(rowId));
						String actualValue = email.getAttribute("value");
						System.out.println(rowId + " - " + actualValue);
						
						if(actualValue.equalsIgnoreCase(expectedValue))
						{
							isFound = "yes";
							
							//If any action found, apart from text validation, do that process (like delete, set display name)
							tableActions(action, actPrefix, actSuffix, startRowNum, expectedValue, "", i, k);
							
							System.out.println(expectedValue + " Found.");
							break; //Exit table rows loop
						}
					}
					catch(Exception e)
					{}
				}
				if(isFound == "yes") //Exit page selection loop (If multiple test data, loop start again)
				{	break;	}
			}
			
			//If any action found, no need to update result, since in action part, there is a updation of result
			if(action == "")
			{
				if(isFound == "yes")
				{
					tsStatus = "Pass";
					result("rfc_" + expectedValue, "validate", "Value Found", tsStatus);
				}
				else
				{
					tsStatus = "Fail";
					tcStatus = "Fail";
					result("rfc_" + expectedValue, "validate", "Value not found", tsStatus);
					System.out.println(expectedValue + " Value not found");
				}
			}
		}
	}
	
	//This is used to validate Table row values without navigating to next page (page 1, page 2 will not be used here)
	public void tableValidationStatic(String prefix, String suffix, String startRowNum, String tableId, String checkValueId, String checkValueId2, String action, String actPrefix, String actSuffix) throws InterruptedException
	{
		String expectedValue = map.get(checkValueId);
		String[] arrTestData = StringUtils.split(expectedValue, "|");
		
		for(int k = 1; k <= arrTestData.length; k++)
		{
			if(expectedValue != "" && expectedValue != null)
			{
				expectedValue = arrTestData[k - 1];
				System.out.println("Expected Value: " + expectedValue);
			}
			WebElement email;
			
			String isFound = "no";
				
			int curRowNum = Integer.parseInt(startRowNum);
			
			WebElement table = driver.findElement(By.id(tableId));
			List<WebElement> allRows = table.findElements(By.cssSelector("table#" + tableId + ">tbody>tr"));
			int totalRows1 = allRows.size();
			System.out.println("Total Rows: " + totalRows1);
			for(int i = 0; i < totalRows1 - 1; i++)
			{
				Thread.sleep(500);
				try
				{
					String rowId = prefix + String.format("%02d", (curRowNum)) + suffix;
					curRowNum++;
					
					email = driver.findElement(By.id(rowId));
					String actualValue = email.getAttribute("value");
					System.out.println(rowId + " - " + actualValue);
					
					if(actualValue.equalsIgnoreCase(expectedValue))
					{
						isFound = "yes";
						tableActions(action, actPrefix, actSuffix, startRowNum, expectedValue, checkValueId2, i, k);
						
						System.out.println(expectedValue + " Found.");
						
						break;
					}
				}
				catch(Exception e)
				{}
			}
			
			//If any action found, no need to update result, since in action part, there is a updation of result
			if(action == "")
			{
				if(isFound == "yes")
				{
					tsStatus = "Pass";
					result("rfc_" + expectedValue, "validate", "Value Found", tsStatus);
				}
				else
				{
					tsStatus = "Fail";
					tcStatus = "Fail";
					result("rfc_" + expectedValue, "validate", "Value not found", tsStatus);
					System.out.println(expectedValue + " Value not found");
				}
			}
		}
	}
	
	public void tableActions(String action, String actPrefix, String actSuffix, String startRowNum, String expectedValue, String checkValueId2, int i, int k)
	{
		WebElement deleteCheckBox;
		WebElement showAllCheckBox;
		WebElement displayName;
		WebElement objPdtStatus;
		WebElement objPdtDeletionDate;
		WebElement objTextboxValue;
		WebElement objTextBox;
		try
		{
			if(action.equalsIgnoreCase("delete"))
			{
				deleteCheckBox = driver.findElement(By.id(actPrefix + String.format("%02d",(i + 3)) + actSuffix));
				deleteCheckBox.click();
				result("mus_" + expectedValue, "Delete", "", "Pass");
			}
			else if(action.equalsIgnoreCase("setValue"))
			{
				String expectedValue2 = map.get(checkValueId2);
				
				String textBoxId = actPrefix + String.format("%02d",(i + Integer.parseInt(startRowNum))) + actSuffix;
				objTextBox = driver.findElement(By.id(textBoxId));
				
				objTextBox.click();
				selectDatePicker("", expectedValue2);
				
				result("mus_" + "Set new value", "Set", expectedValue2, "Pass");
			}
			else if(action.equalsIgnoreCase("checkEqualRowValue"))
			{
				String textBoxId = actPrefix + String.format("%02d",(i + Integer.parseInt(startRowNum))) + actSuffix;
				objTextboxValue = driver.findElement(By.id(textBoxId));
				String actualValue2 = objTextboxValue.getAttribute("value");
				
				String expectedValue2 = map.get(checkValueId2);
				String[] arrTestData2 = StringUtils.split(expectedValue2, "|");
				expectedValue2 = arrTestData2[k - 1];
				
				System.out.println("Expected Value2: " + expectedValue);
				System.out.println("Actual Value2: " + actualValue2);
				
				if(actualValue2.equalsIgnoreCase(expectedValue2))
				{
					result("mus_" + checkValueId2, "Validate", expectedValue2, "Pass");
				}
				else
				{
					result("mus_" + checkValueId2, "Validate", expectedValue2, "Fail");
				}
			}
			else if(action.equalsIgnoreCase("setDisplayName"))
			{
				displayName = driver.findElement(By.id(actPrefix + String.format("%02d",(i + 3)) + actSuffix));
				displayName.clear();
				
				String newDisplayName = map.get("mus_edit_display_name");
				if(newDisplayName != "" && newDisplayName != null)
				{
					//Split the string, and get required data alone
					int isMultipleData = newDisplayName.indexOf("|");
					if(isMultipleData > 0)
					{
						String[] arrTestData1 = StringUtils.split(newDisplayName, "|"); // testData.split("|");				
						newDisplayName = arrTestData1[Integer.parseInt(curTableRow) - 1];
					}
					System.out.println("New Display Name: " + newDisplayName);
				}
				
				displayName.sendKeys(newDisplayName);
				result("mus_" + newDisplayName, "Edit Display Name", "", "Pass");
			}
			else if(action.equalsIgnoreCase("showAll"))
			{
				showAllCheckBox = driver.findElement(By.id(actPrefix + String.format("%02d",(i + 3)) + actSuffix));
				showAllCheckBox.click();
				result("mus_" + expectedValue, "Show All", "", "Pass");
			}
			else if(action.equalsIgnoreCase("pdtStatus"))
			{
				objPdtStatus = driver.findElement(By.id("ctl00_ContentMenu_dgEditPdtInfo_ctl" + String.format("%02d",(i + 2)) + "_ddlStatus"));
				
				String productStatus = map.get("mpc_product_status");
				if(productStatus != "" && productStatus != null)
				{
					//Split the string, and get required data alone
					int isMultipleData = productStatus.indexOf("|");
					if(isMultipleData > 0)
					{
						String[] arrTestData1 = StringUtils.split(productStatus, "|"); // testData.split("|");				
						productStatus = arrTestData1[k - 1];
					}
					System.out.println("Prodcut Status: " + productStatus);
				}
				
				Select ddl = new Select(objPdtStatus);
				ddl.selectByVisibleText(productStatus);
				
				result("mpc_" + productStatus, "Change Product Status for " + expectedValue, "", "Pass");
			}
			else if(action.equalsIgnoreCase("pdtDeletionDate"))
			{
				objPdtDeletionDate = driver.findElement(By.id("ctl00_ContentMenu_dgEditPdtInfo_ctl" + String.format("%02d",(i + 2)) + "_DeletionDate_txtDate"));
				
				String deletionDate = map.get("mpc_deletion_date");
				if(deletionDate != "" && deletionDate != null)
				{
					//Split the string, and get required data alone
					int isMultipleData = deletionDate.indexOf("|");
					if(isMultipleData > 0)
					{
						String[] arrTestData1 = StringUtils.split(deletionDate, "|"); // testData.split("|");				
						deletionDate = arrTestData1[k - 1];
					}
					System.out.println("Deletion Date: " + deletionDate);
				}
				objPdtDeletionDate.click();
				selectDatePicker("", deletionDate);
				
				result("mpc_"+deletionDate, "Set Deletion Date for " + expectedValue, "", "Pass");
			}
		}
		catch(Exception e)
		{}
	}
	
	public void checkTableValuesTD(String tableId, String checkValueId, String action, String actPrefix, String actSuffix, String startRowNum) throws InterruptedException
	{
		String expectedValue = map.get(checkValueId);
		String[] arrTestData = StringUtils.split(expectedValue, "|");
		
		for(int k = 1; k <= arrTestData.length; k++)
		{
			if(expectedValue != "" && expectedValue != null)
			{
				expectedValue = arrTestData[k - 1];
				System.out.println("Expected Value: " + expectedValue);
			}
			
			WebElement tdValue;
			WebElement checkBox;
			
			String isFound = "no";
			
			WebElement table = driver.findElement(By.id(tableId));
			List<WebElement> allRows = table.findElements(By.cssSelector("table#" + tableId + ">tbody>tr"));
			int totalRows1 = allRows.size();
			System.out.println("Total Rows: " + totalRows1);
			
			for(int i = 0; i < totalRows1 - 1; i++)
			{
				Thread.sleep(500);
				try
				{
					String rowId = ".//*[@id='" + tableId + "']/tbody/tr[" + (i + 1) + "]/td[4]";
					tdValue = driver.findElement(By.xpath(rowId));
					String actualValue = tdValue.getAttribute("innerHTML");
					System.out.println(rowId + " - " + actualValue);
					
					if(actualValue.equalsIgnoreCase(expectedValue))
					{
						isFound = "yes";
						System.out.println(expectedValue + " Found.");
						
						if(action.equalsIgnoreCase("checkbox"))
						{
							String checkBoxId = actPrefix + String.format("%02d",(i + Integer.parseInt(startRowNum))) + actSuffix;
							checkBox = driver.findElement(By.id(checkBoxId));
							checkBox.click();
							result("mus_" + "Select Checkbox", "Select", expectedValue, "Pass");
						}
						break;
					}
				}
				catch(Exception e)
				{}
			}
		}
	}
	
	public void tableValidationHorizantal(String prefix, String checkValueId)
	{
		String expectedValue = map.get(checkValueId);
		String[] arrTestData = StringUtils.split(expectedValue, "|");
		
		int maxVal = arrTestData.length > 12 ? 12 : arrTestData.length;
		
		for(int k = 1; k <= maxVal; k++)
		{
			if(expectedValue != "" && expectedValue != null)
			{
				expectedValue = arrTestData[k - 1];
				System.out.println("Expected Value: " + expectedValue);
			}
			
			WebElement cellId;
			String elementId = prefix + k;
			cellId = driver.findElement(By.id(elementId));
			
			//String cellValue = cellId.getText();
			String cellValue = cellId.getAttribute("value");
			System.out.println("Actual Value: (" + elementId + ") " + cellValue);
			
			if(cellValue.replaceAll("\\s+","").equalsIgnoreCase(expectedValue.replaceAll("\\s+","")))
			{
				tsStatus = "Pass";
				result(checkValueId + "_" + expectedValue, "validate", "Value Found", tsStatus);
			}
			else
			{
				tsStatus = "Fail";
				tcStatus = "Fail";
				result(checkValueId + "_" + expectedValue, "validate", "Value not found", tsStatus);
				System.out.println(expectedValue + " Value not found");
			}
		}
	}
	
	public void checkSelectBoxValues(String selectBoxId, String checkValueId)
	{
		String expectedValue = map.get(checkValueId);
		try
		{
			if(expectedValue != "" && expectedValue != null)
			{
				//Split the string for enter in Table Rows
				int isMultipleData = expectedValue.indexOf("|");
				if(isMultipleData > 0)
				{				
					String[] arrTestData = StringUtils.split(expectedValue, "|");		
					expectedValue = arrTestData[Integer.parseInt(curTableRow) - 1];
				}
				System.out.println("Expected Value: " + expectedValue);
			}
			
			WebElement element =  driver.findElement(By.id(selectBoxId));
			
			Select mySelect = new Select(element);
			List<WebElement> options = mySelect.getOptions();
			
			String isFound = "no";
			for(WebElement option : options)
			{
				String curValue = option.getText();
				
				if(expectedValue.equalsIgnoreCase(curValue))
				{
					isFound = "yes";
					break;
				}
			}
			
			if(isFound == "yes")
			{
				tsStatus = "Pass";
				result("rfc_" + expectedValue, "validate", "Value Found", tsStatus);
				System.out.println(expectedValue + ": Value Found.");
			}
			else
			{
				tsStatus = "Fail";
				tcStatus = "Fail";
				result("rfc_" + expectedValue, "validate", "Value not found", tsStatus);
				System.out.println(expectedValue + ": Value not found");
			}
		}
		catch(Exception e)
		{
			tsStatus = "Fail";
			tcStatus = "Fail";
			result("rfc_" + expectedValue, "validate", "Value not found", tsStatus);
			System.out.println(expectedValue + ": Value not found");
		}
	}
	
	//In the data table, navigate within pages
	public void selectPage(String selectBoxId, String selectBoxText) throws InterruptedException
	{
		//Page SelectBox
		WebElement element =  driver.findElement(By.id(selectBoxId));
		
		Select mySelect = new Select(element);
		
		mySelect.selectByVisibleText(selectBoxText);
		
		Thread.sleep(2000);
		
		System.out.println(selectBoxText + " selected.");
	}
	
	public void deleteUserBySystemOwner(String emailId)
	{
		WebElement table = driver.findElement(By.id("ctl00_ContentMenu_dgEditCompanyInfo"));
		List<WebElement> allRows = table.findElements(By.cssSelector("table#ctl00_ContentMenu_dgEditCompanyInfo>tbody>tr"));
		int totalRows = allRows.size();
		
		System.out.println("Total Rows: " + totalRows);
		
		int startPos = 03;
		for(int i = 0; i < totalRows; i++)
		{
			String spanId = "ctl00_ContentMenu_dgEditCompanyInfo_ctl" + String.format("%02d",(startPos + i)) + "_txtEditAdministrator";
			System.out.println(spanId);
			WebDriverWait wait = new WebDriverWait(driver, 2);
			WebElement elmEMail =  driver.findElement(By.id(spanId));
			String curEmailId = elmEMail.getAttribute("innerHTML");
			System.out.println(curEmailId);			
		}
	}
	
	public void deleteAllProducts(String tableId, String selectAllId, String saveBtnId) throws InterruptedException
	{
		Thread.sleep(3000);
		
		while(true)
		{
			Thread.sleep(2000);

			try
			{
				WebElement isValueExist =  driver.findElement(By.id(tableId));
				if(isValueExist.isDisplayed())
				{
					List<WebElement> allRows = isValueExist.findElements(By.cssSelector("table#" + tableId + ">tbody>tr"));
					int totalRows = allRows.size();
					if(totalRows > 2)
					{
						WebElement deleteAllChkbox = driver.findElement(By.id(selectAllId));
						deleteAllChkbox.click();
						
						WebElement saveChanges = driver.findElement(By.id(saveBtnId));
						saveChanges.click();
						
						System.out.println("Before click alert");
						Thread.sleep(2000);
						clickAlert("ok");
						Thread.sleep(2000);
						clickAlert("ok");
						Thread.sleep(2000);
						System.out.println("After click alert");
					}
					else
					{
						System.out.println("After while");
						break;
					}
				}
				else
				{
					System.out.println("After while");
					break;
				}
			}
			catch(Exception e)
			{
				System.out.println("After delete all products");
				break;
			}
		}
	}
	
	public void selectDatePicker(String testStep, String testDataGiven) throws InterruptedException
	{
		try
		{
			String testData = "";
			if(testDataGiven == "")
			{
				testData = map.get(testStep);			
			}
			else
			{
				testData = testDataGiven;
			}
			System.out.println("Current Date " + testData);
			
			String[] arrCalendarDate = testData.split("-");
			
			String cDate = arrCalendarDate[0];
			String cMonth = arrCalendarDate[1];
			String cYear = arrCalendarDate[2];
			
			System.out.println("cDate " + cDate);
			System.out.println("cMonth " + cMonth);
			System.out.println("cYear " + cYear);
			
			Thread.sleep(1000);
			
			//Click on Top-Center of the calendar to change Year and Month 
			WebElement elmCalCenter = driver.findElement(By.xpath("html/body/table/tbody/tr/td/div/div[1]/table/tbody/tr/td/div/div"));
			elmCalCenter.click();
			
			WebElement calYear = driver.findElement(By.xpath("html/body/table/tbody/tr/td/div/div[4]/table/tbody/tr/td/table[1]/tbody/tr[1]/td/input"));
			calYear.clear();
			calYear.sendKeys(cYear);
			
			List<WebElement> calMonths = driver.findElements(By.xpath("html/body/table/tbody/tr/td/div/div[4]/table/tbody/tr/td/table[2]/tbody/tr"));
			System.out.println("Total Month Rows: " + calMonths.size());		
			
			for(WebElement row : calMonths)
			{
				List<WebElement> cells = row.findElements(By.tagName("div"));
				System.out.println("Total Column: " + cells.size());
				int i = 1;
				for(WebElement cell : cells)
				{
					System.out.println(i + " - " + cell.getText());
					i++;
					if(cell.getText().equalsIgnoreCase(cMonth))
					{
						cell.click();
						i = -1; //To exit the parent for loop
						break;
					}
				}
				if(i == -1) break;
			}
			
			String strCalDays = "html/body/table/tbody/tr/td/div/div[2]/table/tbody/tr";
			
			List<WebElement> calDays = driver.findElements(By.xpath(strCalDays));
			System.out.println("Total Day Rows: " + calDays.size());
			Thread.sleep(1000);
			
			boolean isCurrentMonthStarted = false;
			try
			{
				int i = 1;
				for(int k = 1; k <= 6; k++)
				{
					for(int j = 1; j <= 7; j++)
					{
						String strCurDay = strCalDays + "[" + k + "]/td[" + j + "]/div";
	
						Thread.sleep(100);
						WebElement curDay = driver.findElement(By.xpath(strCurDay));
						
						//Check the current month start in Calendar (bcz previous month's date also shown at beginning)				
						if(curDay.getText().equalsIgnoreCase("1"))
						{
							isCurrentMonthStarted = true;
						}
						
						if(curDay.getText().equalsIgnoreCase(cDate))
						{
							if(isCurrentMonthStarted == true) //May be the large date(previous month) available in current month
							{
								curDay.click();
								i = -1; //To exit the parent for loop
								break;
							}
						}
						if(i == -1) break;					
						System.out.println(strCurDay + ": " + curDay.getText());
					}
					if(i == -1) break;
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage() + e.getStackTrace());
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage() + e.getStackTrace() + ", Line Number: " + e.getLocalizedMessage());
		}
	}
	
	public void result(String testStep, String event, String testData, String status)
	{
		try 
		{
			System.out.println(testStep + "(" + event + "): " + status);
			
			Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
			Robot robot = new Robot();
			BufferedImage img = robot.createScreenCapture(new Rectangle(size));
			String screenshotFolderPath = testCaseResultPath + "screenshots/";
			File folder = new File(screenshotFolderPath);
			if (!folder.exists()) 
			{
				folder.mkdirs();
			}
			
			String tsScreenshotPath = "";
			if(testStep.length() > 15)
			{
				String imageName = testStep.substring(0, 15);
				tsScreenshotPath = screenshotFolderPath + (sno + 1) + imageName.replaceAll("\\s+","") + ".jpg";
			}
			else
			{
				tsScreenshotPath = screenshotFolderPath + (sno + 1) + testStep.replaceAll("\\s+","") + ".jpg";
			}
			File save_path = new File(tsScreenshotPath);
			ImageIO.write(img, "JPG", save_path);
			
			writeHTML(testStep, event, testData, status, tsScreenshotPath);
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void writeHTML(String testStep, String action, String testData, String strStatus, String lnkScreenshotImg) throws IOException 
	{
		File Result1;
		String strErrorPath = lnkScreenshotImg;
		testStep = testStep.substring(4);
		testStep = testStep.replaceAll("_", " ");
		testStep = StringUtils.capitalize(testStep);
		action = StringUtils.capitalize(action);
		if (sno == 0) 
		{
			Result1 = new File(testCaseResultPath + "/" + tcResultFolder + ".html");
			Result1.createNewFile();
			output = new BufferedWriter(new FileWriter(Result1));
			
			output.write("<html>");
			output.write("<head>");
			output.write("<title> Automation Execution Results</title>");
			output.write("</head>");
			output.write("<body bgcolor = #F0F0F0 link=#FF0000>");
			output.write("<blockquote>");
			output.write("<p align = center><table border=1 bordercolor=#000000 id=table1 width=900 height=31 cellspacing=0 bordercolorlight=#FFFFFF>");
			output.write("<tr>");
			output.write("<td>");
			// output.write("<img src= """ &
			// Environment.value("strHtmlReportLogoPath") &
			// """ width=150 height=30 />");
			output.write("<b><font color=#000000 size=4 face= Verdana>&nbsp;Automation Execution Results - "
					+ useCaseName + " </b>");
			output.write("</td>");
			output.write("</tr>");
			output.write("<table border=1 bordercolor=#000000 id=table1 width=900 height=31 cellspacing=0 bordercolorlight=#FFFFFF>");
			output.write("<table>");
			output.write("<p align = center><table border=1 bordercolor=#000000 id=table1 width=900 height=31 cellspacing=0 bordercolorlight=#FFFFFF>");
			output.write("<tr bgcolor=#A0A0A0>");
			output.write("<td width=100");
			output.write("<p align=center><b><font color = #663300 face=Arial Narrow size=2>Serial Number</b>");
			output.write("</td>");
			output.write("<td width=400");
			output.write("<p align=center><b><font color = #663300 face=Arial Narrow size=2>Test step</b>");
			output.write("</td>");
			output.write("<td width=400");
			output.write("<p align=center><b><font color = #663300 face=Arial Narrow size=2>Action</b>");
			output.write("</td>");
			output.write("<td width=400");
			output.write("<p align=center><b><font color = #663300 face=Arial Narrow size=2>Test data</b>");
			output.write("</td>");
			output.write("<td width=100");
			output.write("<p align=center><b><font color = #663300 face=Arial Narrow size=2>Status</b>");
			output.write("</td>");
			output.write("<td width=400");
			output.write("<p align=center><b><font color = #663300 face=Arial Narrow size=2>Time</b>");
			output.write("</td>");
			output.write("</tr>");
		} 
		else if (sno > 0) 
		{
			output.write("<tr bgcolor =#EDEEF0>");
			output.write("<td width=100>");
			output.write("<p align=center><font face=Verdana size=2> &nbsp; " + sno);
			output.write("</td>");
			output.write("<td width=400>");
			output.write("<p align=Left><font face=Verdana size=2>"	+ testStep);
			output.write("</td>");
			output.write("<td width=400>");
			output.write("<p align=Left><font face=Verdana size=2>"	+ action);
			output.write("</td>");
			output.write("<td width=400>");
			output.write("<p align=Left><font face=Verdana size=2>"	+ testData);
			output.write("</td>");
			output.write("<td width=100>");
			if (strStatus == "Pass") 
			{
				if (strErrorPath == "") 
				{
					output.write("<p align=center><b><font face=Verdana size=2 color=#008000>Pass</font></b>");
				} 
				else 
				{
					output.write("<p align=center><b><a href='file:///"	+ lnkScreenshotImg + "' target='_blank'><font face=Verdana size=2 color=#008000>Pass</font></a></b>");
				}
			}
			else if (strStatus == "Fail") 
			{
				if (strErrorPath == "") 
				{
					output.write("<p align=center><b><font face=Verdana size=2 color=#FF0000>Fail</font></b>");
				} 
				else 
				{
					output.write("<p align=center><b><a href='file:///"	+ lnkScreenshotImg + "' target='_blank'><font face=Verdana size=2 color=#FF0000>Fail</a></font></b>");
				}
			} 
			else if (strStatus == "Done") 
			{
				if (strErrorPath == "") 
				{
					output.write("<p align=center><b><font face=Verdana size=2 color=#848484>Done</font></b>");
				} 
				else 
				{
					output.write("<p align=center><b><a href='file:///"	+ lnkScreenshotImg
							+ "' target='_blank'><font face=Verdana size=2 color=#848484>Done</a></font></b>");
				}
			} 
			else if (strStatus == "Warning") 
			{
				if (strErrorPath == "") 
				{
					output.write("<p align=center><b><font face=Verdana size=2 color=#FFBF00>Warning</font></b>");
				} 
				else 
				{
					output.write("<p align=center><b><a href=''><font face=Verdana size=2 color=#FFBF00>Warning</a></font></b>");
				}
			}

			Date dNow = new Date();
			SimpleDateFormat ft = new SimpleDateFormat("dd-MMM-yyyy 'at' hh:mm:ss a zzz");
			output.write("</td>");
			output.write("<td width=400>");
			output.write("<p align;=center><font face=Verdana size=2>" + ft.format(dNow));
			output.write("</td>");
			output.write("</tr>");
		}
	}
	
	public void resultfinal()
	{
		try 
		{
			output.write("</table>");
			output.write("<table border=1 bordercolor=#000000 id=table1 width=900 height=31 cellspacing=0 bordercolorlight=#FFFFFF>");
			output.write("<tr bgcolor =#A0A0A0>");
			output.write("<td colspan =1 width=561> <p align=right><b><font face=Verdana size=3>Test case status: </font></b>: ");
			output.write("</td>");
			output.write("<td colspan =1 width=160>");
			if(tcStatus == "Pass")
			{
				output.write("<p align=center><b><font face=Verdana size=3 color=#008000>Pass</font></b>");
			}
			else if(tcStatus == "Fail")
			{
				output.write("<p align=center><b><font face=Verdana size=3 color=#FF0000>Fail</font></b>");
			}
			output.write("</td>");
			output.write("<td colspan =1>");
			output.write("</td>");
			output.write("</tr>");
			output.write("</table>");
			output.write("</blockquote>");
			output.write("</body>");
			output.write("</html>");
			output.close();
			System.out.println("Stopping current testcase.");
//			throw new NullPointerException();
//			break startTest;
//			System.exit(0);
//			driver.quit();
		}
		catch (Exception ex)
		{
			//driver.quit();
			//System.exit(0);
		}
	}
	
	public void exitCurrentTest()
	{
		driver.close();
		driver.quit();
		closeBrowser();
		closeBrowser();
//		System.exit(0);
	}
	
	
	
	//********** Unused Functions **********
	
	public void chkFirefox()
	{
		try
		{
			//URL url = new URL( "http", "localhost", 4444, "/wd/hub" );
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			System.out.println("1");
			capabilities.setJavascriptEnabled(true);
			System.out.println("2");
			//WebDriver driver = new RemoteWebDriver(url,capabilities);
			System.out.println("4");
			driver = new FirefoxDriver();
			driver.get("http://www.google.com");
		}
		catch(Exception e)
		{}
	}
	
	public void clickLinkByHref(String href) 
	{
	    List<WebElement> anchors = driver.findElements(By.tagName("a"));
	    Iterator<WebElement> i = anchors.iterator();

	    int j = 0;
	    while(i.hasNext()) {
	    	try
	    	{
		        WebElement anchor = i.next();
		        System.out.print(j + ": " + anchor.getAttribute("href").toString() + "\n");
		        j++;
		        
			    if(anchor.getAttribute("href").contains(href)) {
			        System.out.print(j + "Final: " + anchor.getAttribute("href").toString() + "\n");
			        j++;
//			        anchor.click();
//			        break;
		        }
	    	}
	    	catch(Exception e){}
	    }
	}

	public void closeWindow()
	{
		String winHandleBefore = driver.getWindowHandle();
		
		for(String winHandle : driver.getWindowHandles())
		{
			System.out.println(winHandle);
			driver.switchTo().window(winHandle);
		}
		
		driver.close();
		driver.switchTo().window(winHandleBefore);	
	}
}
