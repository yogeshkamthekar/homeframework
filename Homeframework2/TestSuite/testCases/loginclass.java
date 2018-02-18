package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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

public class loginclass extends Initialize implements Registration{
	
	DataProviderClass dataProvider;
	static String  fileLocation = System.getProperty("user.dir")+ "/TestData/testdata.xls";
	static String sheetName;
	static String Result;
	String Browser;
	String text;
	static String value;
	Select option=null;
	
	String return1 = null;

	public static WebDriverWait wait;
	 @Parameters ({ "browser" })
	  @BeforeTest
	
	  public void BeforeTest(@Optional("browser") String browser, ITestContext context) throws Exception {
	
		System.out.print("Start of Execution");
		
		if(browser.equals("browser")) {
			
			browser="Chrome";
			
			}
			//Browser = browser;
			
			
			//Initializing the environment variables	
			initialize();
			System.out.print("Initialize is successful");
			//Setting the browser
			setBrowser(browser);
			sheetName = Environment.getProperty("registration");
			dataProvider= new DataProviderClass();
			dataProvider.setup(fileLocation, sheetName,"yogesh");	
		  	}
	
	@Test(dataProvider = "xlsData",dataProviderClass = DataProviderClass.class, priority=0) 

	public void test1 (String firstname, String lastname,String phone, String email, String address, String address1, String city, String State, String Postalcode,String user,String password,String confirmpassword) {
		System.out.print("Executed 1 Test Case");
		
	}
	
	@Test(dataProvider = "xlsData",dataProviderClass = DataProviderClass.class, priority=1)

    public void readproperties(String firstname, String lastname,String phone, String email, String address, String address1, String city, String State, String Postalcode,String user,String password,String confirmpassword)  {
	
	System.out.println("property file value read as  = " + Environment.getProperty("appurl"));
			
		
  }
	
	@Test(dataProvider = "xlsData",dataProviderClass = DataProviderClass.class, priority=2)
	public void  opensite(String firstname, String lastname,String phone, String email, String address, String address1, String city, String State, String Postalcode,String user,String password,String confirmpassword) throws InterruptedException {
		System.out.print("Executed 1 Test Case");
		
		    Thread.sleep(2000);
		    driver.get(Environment.getProperty("appurl"));
			
		    Thread.sleep(2000);
			Reporter.log("Test Application loaded successfully");
			Thread.sleep(3000);
    		// driver.manage().window().maximize();
	}
	

	@AfterMethod
	public void screenCapture() throws IOException{
		    	
		    	capture();
		    	
		    }
	
	@AfterTest
	
	public void AfterTest () {
	    driver.quit();
		System.out.print("End of Execution");
	
		
	}
	

}

