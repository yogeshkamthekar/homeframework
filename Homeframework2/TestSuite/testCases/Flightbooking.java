
package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
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

import flightObjects.Flightoperations;
import flightObjects.Registration;
import validations.Flightbookingvalidation;

public class Flightbooking extends Initialize implements Registration,Flightoperations {

	  String return1 = null;
	  DataProviderClass dataProvider;
	  static String  fileLocation = System.getProperty("user.dir")+ "/TestData/testdata.xls";
	  static String sheetName;
	  static String Result;
	  String Browser;
	  String text;
	  static String value;
	  Select option; 
	  public static WebDriverWait wait;
	
	  @Parameters ({ "browser" })
	  @BeforeTest
	
	  public void BeforeTest(@Optional("browser") String browser, ITestContext context) throws Exception 
	  
	  {
	
		System.out.print("Start of Execution");
		
		if(browser.equals("browser")) {
			
			browser="Chrome";
			
			}
			Browser = browser;
			
			
			//Initializing the environment variables	
			initialize();
			System.out.print("Initialize is successful");
			//Setting the browser
			setBrowser(browser);
			sheetName = Environment.getProperty("flightfinder");
			dataProvider= new DataProviderClass();
			dataProvider.setup(fileLocation, sheetName,"London");	
				
		  	}
	
	
	@Test(dataProvider ="xlsData",dataProviderClass = DataProviderClass.class, priority=0)
	
	public void Flightsearch1(String classname, String passengerdetails1,String DepartingOnMonth1,String DepartingOnDate1, 
			String Arrivingin1, String ReturningMonth1, String ReturningDate1, String Serviceclass1, String Airline1,
			String Departflight1, String Arriveflight1,
			String Firstname1, String Lastname1,String Mealpreference1,String cardtype1, 
			String Cardnumber1, String Cardexpirationdate1, String Cardexpirationyear1, String Cardfirstname1, String CardMidddlename1, 
			String CardLastname1, String CardBillingaddressline1,String CardBillingaddressline2,String CardBillingcity1, String CardBillingState1,
			String CardBillingpostal1, String CardBillingcountry) throws Exception
	{
		Reporter.log("Test for checking sign-on for existing customer");
		Thread.sleep(2000);
		driver.get(Environment.getProperty("appurl"));
		Thread.sleep(2000);
		Flightbookingvalidation.flightsearch1(classname, passengerdetails1, DepartingOnMonth1, DepartingOnDate1, Arrivingin1,
				ReturningMonth1, ReturningDate1, Serviceclass1, Airline1, Departflight1, Arriveflight1, Firstname1, Lastname1,
				Mealpreference1, cardtype1, Cardnumber1, Cardexpirationdate1, Cardexpirationyear1, Cardfirstname1, CardMidddlename1,
				CardLastname1, CardBillingaddressline1, CardBillingaddressline2, CardBillingcity1, CardBillingState1, CardBillingpostal1,
				CardBillingcountry);
	}
	
	@Test(dataProvider ="xlsData",dataProviderClass = DataProviderClass.class, priority=1)
	
	public void Flightsearch2(String classname, String passengerdetails1,String DepartingOnMonth1,String DepartingOnDate1, 
			String Arrivingin1, String ReturningMonth1, String ReturningDate1, String Serviceclass1, String Airline1,
			String Departflight1, String Arriveflight1,
			String Firstname1, String Lastname1,String Mealpreference1,String cardtype1, 
			String Cardnumber1, String Cardexpirationdate1, String Cardexpirationyear1, String Cardfirstname1, String CardMidddlename1, 
			String CardLastname1, String CardBillingaddressline1,String CardBillingaddressline2,String CardBillingcity1, String CardBillingState1,
			String CardBillingpostal1, String CardBillingcountry) throws Exception
	{
		Reporter.log("Test for checking Flight Departing validation-roundtrip");		
		Flightbookingvalidation.flightsearch2(classname, passengerdetails1, DepartingOnMonth1, DepartingOnDate1, Arrivingin1,
				ReturningMonth1, ReturningDate1, Serviceclass1, Airline1, Departflight1, Arriveflight1, Firstname1, Lastname1,
				Mealpreference1, cardtype1, Cardnumber1, Cardexpirationdate1, Cardexpirationyear1, Cardfirstname1, CardMidddlename1,
				CardLastname1, CardBillingaddressline1, CardBillingaddressline2, CardBillingcity1, CardBillingState1, CardBillingpostal1,
				CardBillingcountry);
		
	}	
	
	@Test(dataProvider ="xlsData",dataProviderClass = DataProviderClass.class, priority=2)
	
	public void Flightsearch3(String classname, String passengerdetails1,String DepartingOnMonth1,String DepartingOnDate1, 
			String Arrivingin1, String ReturningMonth1, String ReturningDate1, String Serviceclass1, String Airline1,
			String Departflight1, String Arriveflight1,
			String Firstname1, String Lastname1,String Mealpreference1,String cardtype1, 
			String Cardnumber1, String Cardexpirationdate1, String Cardexpirationyear1, String Cardfirstname1, String CardMidddlename1, 
			String CardLastname1, String CardBillingaddressline1,String CardBillingaddressline2,String CardBillingcity1, String CardBillingState1,
			String CardBillingpostal1, String CardBillingcountry) throws Exception
	{
		Reporter.log("Test for checking Flight arriving validation-roundtrip");
		Flightbookingvalidation.flightsearch3(classname, passengerdetails1, DepartingOnMonth1, DepartingOnDate1, Arrivingin1,
				ReturningMonth1, ReturningDate1, Serviceclass1, Airline1, Departflight1, Arriveflight1, Firstname1, Lastname1,
				Mealpreference1, cardtype1, Cardnumber1, Cardexpirationdate1, Cardexpirationyear1, Cardfirstname1, CardMidddlename1,
				CardLastname1, CardBillingaddressline1, CardBillingaddressline2, CardBillingcity1, CardBillingState1, CardBillingpostal1,
				CardBillingcountry);
	}
	
	@Test(dataProvider ="xlsData",dataProviderClass = DataProviderClass.class, priority=3)
	
	public void Flightsearch4(String classname, String passengerdetails1,String DepartingOnMonth1,String DepartingOnDate1, 
			String Arrivingin1, String ReturningMonth1, String ReturningDate1, String Serviceclass1, String Airline1,
			String Departflight1, String Arriveflight1,
			String Firstname1, String Lastname1,String Mealpreference1,String cardtype1, 
			String Cardnumber1, String Cardexpirationdate1, String Cardexpirationyear1, String Cardfirstname1, String CardMidddlename1, 
			String CardLastname1, String CardBillingaddressline1,String CardBillingaddressline2,String CardBillingcity1, String CardBillingState1,
			String CardBillingpostal1, String CardBillingcountry) throws Exception
	{
	    Reporter.log("Test for selecting Airline and service class validations-roundtrip");
		Flightbookingvalidation.flightsearch4(classname, passengerdetails1, DepartingOnMonth1, DepartingOnDate1, Arrivingin1,
				ReturningMonth1, ReturningDate1, Serviceclass1, Airline1, Departflight1, Arriveflight1, Firstname1, Lastname1,
				Mealpreference1, cardtype1, Cardnumber1, Cardexpirationdate1, Cardexpirationyear1, Cardfirstname1, CardMidddlename1,
				CardLastname1, CardBillingaddressline1, CardBillingaddressline2, CardBillingcity1, CardBillingState1, CardBillingpostal1,
				CardBillingcountry);
	}
	
	
	@Test(dataProvider ="xlsData",dataProviderClass = DataProviderClass.class, priority=4)
	
	public void Flightsearch5(String classname, String passengerdetails1,String DepartingOnMonth1,String DepartingOnDate1, 
			String Arrivingin1, String ReturningMonth1, String ReturningDate1, String Serviceclass1, String Airline1,
			String Departflight1, String Arriveflight1,
			String Firstname1, String Lastname1,String Mealpreference1,String cardtype1, 
			String Cardnumber1, String Cardexpirationdate1, String Cardexpirationyear1, String Cardfirstname1, String CardMidddlename1, 
			String CardLastname1, String CardBillingaddressline1,String CardBillingaddressline2,String CardBillingcity1, String CardBillingState1,
			String CardBillingpostal1, String CardBillingcountry
			) throws Exception
	{
		Reporter.log("Test for selecting Passenger billing during flight booking-roundtrip");
		Flightbookingvalidation.flightsearch5(classname, passengerdetails1, DepartingOnMonth1, DepartingOnDate1, Arrivingin1,
				ReturningMonth1, ReturningDate1, Serviceclass1, Airline1, Departflight1, Arriveflight1, Firstname1, Lastname1,
				Mealpreference1, cardtype1, Cardnumber1, Cardexpirationdate1, Cardexpirationyear1, Cardfirstname1, CardMidddlename1,
				CardLastname1, CardBillingaddressline1, CardBillingaddressline2, CardBillingcity1, CardBillingState1, CardBillingpostal1,
				CardBillingcountry);
		
		
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
