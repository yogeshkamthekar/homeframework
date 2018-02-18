package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.DataProviderClass;
import base.Initialize;
import flightObjects.Registration;
import validations.Registrationvalidation;

public class Register extends Initialize implements Registration{
	

	 //String firstname1=Environment.getProperty("firstname");
	  String return1 = null;
	  DataProviderClass dataProvider;
	  static String  fileLocation = System.getProperty("user.dir")+ "/TestData/testdata.xls";
	  static String sheetName;
	  static String Result;
	  String Browser;
	  String text;
	  static String value;
	  Select option;
	 
	  
	  

	//public static void main(String[] args)  {

	public static WebDriverWait wait;
	 @Parameters ({ "browser" })
	  @BeforeTest
	
	  public void BeforeTest(@Optional("browser") String browser, ITestContext context) throws Exception {
	
		System.out.print("Start of Execution");
		
		if(browser.equals("browser")) {
			
			browser="opera";
			
			}
			Browser = browser;
			
			
			//Initializing the environment variables	
			initialize();
			System.out.print("Initialize is successful");
			//Setting the browser
			setBrowser(browser);
			sheetName = Environment.getProperty("registration");
			dataProvider= new DataProviderClass();
			dataProvider.setup(fileLocation, sheetName,"yogesh");	
				
		  	}
	
	
	@Test(dataProvider ="xlsData",dataProviderClass = DataProviderClass.class, priority=0)
	public void registration(String firstname1, String lastname1,String phone1, String email1, String address2, String address11, String city1, String State1, String Postalcode1,String user1,String password1,String confirmpassword1) throws Exception
	{
		
	Thread.sleep(2000);
	driver.get(Environment.getProperty("appurl"));
	
	Registrationvalidation.registrationusername(firstname1, lastname1, phone1, email1, address2, address11, city1, State1,
			Postalcode1, user1, password1, confirmpassword1);
	
	}
	
	@Test(dataProvider = "xlsData",dataProviderClass = DataProviderClass.class, priority=1) 
	
	public void credentialvalidation(String firstname1, String lastname1,String phone1, String email1, String address2, String address11, String city1, String State1, String Postalcode1,String user1,String password1,String confirmpassword1) throws Exception
	{
	Registrationvalidation.credentialvalidation(firstname1, lastname1, phone1, email1, address2, address11, city1, State1, Postalcode1,
			user1, password1, confirmpassword1);
	}
	
	@Test(dataProvider = "xlsData",dataProviderClass = DataProviderClass.class, priority=2)
	
	public void checkuseridafterregistration(String firstname1, String lastname1,String phone1, String email1, String address2, String address11, String city1, String State1, String Postalcode1,String user1,String password1,String confirmpassword1) throws Exception
	
	{
	Registrationvalidation.checkuseridafterregistration(firstname1, lastname1, phone1, email1, address2, address11, city1, State1,
			Postalcode1, user1, password1, confirmpassword1);
	}
	 
	
	
	@AfterTest
	
	public void AfterTest () {
		  driver.quit();
		System.out.print("End of Execution");
	}
	

}

