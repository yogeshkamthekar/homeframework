package validations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

import base.Initialize;

import flightObjects.Flightoperations;
import flightObjects.Registration;



public class Flightbookingvalidation extends Initialize implements Registration,Flightoperations{

static String text = null;
static String text1 = null;
static String text2 = null;

	public static void dropdowndepartint (int passenger2) throws InterruptedException
	{
		element=driver.findElement(By.xpath(passengers));
		element.click();
		Thread.sleep(1000);
		List<WebElement> list=driver.findElements(By.xpath(passengers));
		int size=list.size();
		
		for(int i=1;i<=size;i++){
			
			element=driver.findElement(By.xpath(passengers+"["+i+"]/span"));
			text = element.getText();
			
			if(text.equals(passenger2)){
				
				element.click();
				break;
				
			}
	}
	}
	
	/*public static void selectFromDropDown(WebDriver driver, String dropdown, String value, ){
		
		List<WebElement> list=driver.findElements(By.xpath(dropdown));
		int s=list.size();
		for(i=1;i<=s;i++){
			element=driver.findElement(By.xpath(dropdown+))
			
		}
		
	}*/
	
	public static void dropdowndepartstring (String Departingfrom1, String DepartingOnMonth1, String DepartingOnDate1) throws InterruptedException
	{
		element=driver.findElement(By.xpath(departingfrom));
		element.click();
		Thread.sleep(1000);
		List<WebElement> list=driver.findElements(By.xpath(departingfrom));
		int size=list.size();
		
		for(int i=1;i<=size;i++){
			
			element=driver.findElement(By.xpath(departingfrom+"["+i+"]/span"));
			text = element.getText();
			
			if(text.equals(Departingfrom1)){
				
				element.click();
				break;
				
			}
	     }
		//selecting departing month
		element=driver.findElement(By.xpath(on));
		element.click();
		Thread.sleep(1000);
		List<WebElement> list1=driver.findElements(By.xpath(on));
		int size1=list1.size();
		
		for(int i=1;i<=size;i++){
			
			element=driver.findElement(By.xpath(on+"["+i+"]/span"));
			text1 = element.getText();
			
			if(text1.equals(DepartingOnMonth1)){
				
				element.click();
				break;
				
			}
	     }
     	
	//selecting departing date
	element=driver.findElement(By.xpath(on2));
	element.click();
	Thread.sleep(1000);
	List<WebElement> list2=driver.findElements(By.xpath(on2));
	int size2=list2.size();
	
	for(int i=1;i<=size;i++){
		
		element=driver.findElement(By.xpath(on2+"["+i+"]/span"));
		text1 = element.getText();
		
		if(text1.equals(DepartingOnMonth1)){
			
			element.click();
			break;
			
		}
     }
 	
	}
	
public static void dropdownarrivestring(String Arrivingin1,String ReturningMonth1,String ReturningDate1) throws InterruptedException
{
	//selecting Arriving location
		element=driver.findElement(By.xpath(arrivingin));
		element.click();
		Thread.sleep(1000);
		List<WebElement> list3=driver.findElements(By.xpath(arrivingin));
		int size3=list3.size();
		
		for(int i=1;i<=size3;i++){
			
			element=driver.findElement(By.xpath(arrivingin+"["+i+"]/span"));
			text2 = element.getText();
			
			if(text2.equals(Arrivingin1)){
				
				element.click();
				break;
				
			}
	      }
	 	 
     //selecting returning month
     element=driver.findElement(By.xpath(returning));
     element.click();
     Thread.sleep(1000);
     List<WebElement> list4=driver.findElements(By.xpath(returning));
     int size4=list3.size();

     for(int i=1;i<=size4;i++){
	
	element=driver.findElement(By.xpath(returning+"["+i+"]/span"));
	text2 = element.getText();
	
	if(text2.equals(ReturningMonth1)){
		
		element.click();
		break;
		
	 }
     }
	 

//selecting returning Date
	element=driver.findElement(By.xpath(returning2));
	element.click();
	Thread.sleep(1000);
	List<WebElement> list5=driver.findElements(By.xpath(returning2));
	int size5=list3.size();

	for(int i=1;i<=size5;i++){

	element=driver.findElement(By.xpath(returning2+"["+i+"]/span"));
	text2 = element.getText();

	if(text2.equals(ReturningMonth1)){
	
	element.click();
	break;
	
}
}
}	

//selecting serviceclass
public static void serviceclass(String Serviceclass1) throws InterruptedException
{
	try
	{
	if (Serviceclass1.contains("Economy"))
	{
	element=driver.findElement(By.xpath(economyclass));
	element.click();
    }
	if (Serviceclass1.contains("Business"))
	{
	element=driver.findElement(By.xpath(businessclass));
	element.click();
    }
	if (Serviceclass1.contains("First"))
	{
	element=driver.findElement(By.xpath(Firstclass));
	element.click();
    }
	}
	catch(Exception e)
	{
		Assert.fail("service validation failed with error " +e);
	}
}


public static void flightselection(String Departflight1,String Arriveflight1) throws InterruptedException
{
	try
	{
	if (Departflight1.contains("360"))
	{
	element=driver.findElement(By.xpath(departflight1));
	element.click();
    }
	if (Departflight1.contains("361"))
	{
	element=driver.findElement(By.xpath(departflight2));
	element.click();
    }
	if (Departflight1.contains("362"))
	{
	element=driver.findElement(By.xpath(departflight3));
	element.click();
    }
	if (Departflight1.contains("363"))
	{
	element=driver.findElement(By.xpath(departflight4));
	element.click();
    }
	if (Arriveflight1.contains("630"))
	{
	element=driver.findElement(By.xpath(arriveflight1));
	element.click();
    }
	if (Arriveflight1.contains("631"))
	{
	element=driver.findElement(By.xpath(arriveflight2));
	element.click();
    }
	if (Arriveflight1.contains("632"))
	{
	element=driver.findElement(By.xpath(arriveflight3));
	element.click();
    }
	if (Arriveflight1.contains("633"))
	{
	element=driver.findElement(By.xpath(arriveflight4));
	element.click();
    }
	}
	catch(Exception e)
	{
		Assert.fail("Flight selection validation failed with error " +e);
	}
}

public static void passengerbilling(String Firstname1, String Lastname1,String Mealpreference1,String cardtype1, 
		String Cardnumber1, String Cardexpirationdate1, String Cardexpirationyear1, String Cardfirstname1, String CardMidddlename1, 
		String CardLastname1, String CardBillingaddressline1,String CardBillingaddressline2, String CardBillingcity1, String CardBillingState1,
		String CardBillingpostal1, String CardBillingcountry1)
{
	element=driver.findElement(By.xpath(firstname11));
	element.sendKeys(Firstname1);
	element=driver.findElement(By.xpath(lastname11));
	element.sendKeys(Lastname1);
	Select billingselect1=new Select(driver.findElement(By.xpath(mealpreference)));
	billingselect1.selectByValue(Mealpreference1);
	Select billingselect2=new Select(driver.findElement(By.xpath(cardtype)));
	billingselect2.selectByValue(cardtype1);
	element=driver.findElement(By.xpath(cardnumber));
	element.sendKeys(Cardnumber1);
	Select billingselect3=new Select(driver.findElement(By.xpath(cardexpirationdate)));
	billingselect3.selectByValue(Cardexpirationdate1);
	Select billingselect4=new Select(driver.findElement(By.xpath(cardexpirationyear)));
	billingselect4.selectByValue(Cardexpirationyear1);
	element=driver.findElement(By.xpath(cardfirstname));
	element.sendKeys(Cardfirstname1);
	element=driver.findElement(By.xpath(cardmidddlename));
	element.sendKeys(CardMidddlename1);
	element=driver.findElement(By.xpath(cardlastname));
	element.sendKeys(CardLastname1);
	element=driver.findElement(By.xpath(cardbillingaddressline1));
	element.sendKeys(CardBillingaddressline1);
	element=driver.findElement(By.xpath(cardbillingaddressline2));
	element.sendKeys(CardBillingaddressline2);
	element=driver.findElement(By.xpath(cardbillingcity));
	element.sendKeys(CardBillingcity1);
	element=driver.findElement(By.xpath(cardbillingstate));
	element.sendKeys(CardBillingState1);
	element=driver.findElement(By.xpath(cardbillingpostal));
	element.sendKeys(CardBillingpostal1);
	Select billingselect5=new Select(driver.findElement(By.xpath(cardbillingcountry)));
	billingselect5.selectByValue(CardBillingcountry1);
	element=driver.findElement(By.xpath(Carddeliveryaddress));
	element.click();
	element=driver.findElement(By.xpath(securepurchase));
	element.click();
	String text =driver.findElement(By.xpath(itenaryconfirmation)).getText();
	if(text.contains("Your itinerary has been booked!"))
			{
	Reporter.log("Flight booking is successful for Passenger " +Firstname1 +Lastname1);
	element=driver.findElement(By.xpath(backtohome));
	element.click();
		    }
	else
			{
	Assert.fail("Flight booking is not successful for Passenger " +Firstname1 +Lastname1);
	element=driver.findElement(By.xpath(backtoflight));
	element.click();	
			}
}

public static void flightsearch1(String classname, String passengerdetails1,String DepartingOnMonth1,String DepartingOnDate1, 
		String Arrivingin1, String ReturningMonth1, String ReturningDate1, String Serviceclass1, String Airline1,
		String Departflight1, String Arriveflight1,
		String Firstname1, String Lastname1,String Mealpreference1,String cardtype1, 
		String Cardnumber1, String Cardexpirationdate1, String Cardexpirationyear1, String Cardfirstname1, String CardMidddlename1, 
		String CardLastname1, String CardBillingaddressline1,String CardBillingaddressline2,String CardBillingcity1, String CardBillingState1,
		String CardBillingpostal1, String CardBillingcountry)
{
	
	element = driver.findElement(By.xpath(signing));
	element.click();
	element = driver.findElement(By.xpath(username1));
	element.sendKeys(Environment.getProperty("user"));
	element = driver.findElement(By.xpath(password1));
	element.sendKeys(Environment.getProperty("password"));
	element = driver.findElement(By.xpath(submit1));
	element.click();
}

public static void flightsearch2(String classname, String passengerdetails1,String DepartingOnMonth1,String DepartingOnDate1, 
		String Arrivingin1, String ReturningMonth1, String ReturningDate1, String Serviceclass1, String Airline1,
		String Departflight1, String Arriveflight1,
		String Firstname1, String Lastname1,String Mealpreference1,String cardtype1, 
		String Cardnumber1, String Cardexpirationdate1, String Cardexpirationyear1, String Cardfirstname1, String CardMidddlename1, 
		String CardLastname1, String CardBillingaddressline1,String CardBillingaddressline2,String CardBillingcity1, String CardBillingState1,
		String CardBillingpostal1, String CardBillingcountry) throws InterruptedException
{
	
	element = driver.findElement(By.xpath(roundtrip));	
	element.click();
	Select passenger=new Select(driver.findElement(By.xpath(passengers)));
	passenger.selectByValue(passengerdetails1);
	Select departinglocation=new Select(driver.findElement(By.xpath(departingfrom)));
	departinglocation.selectByValue(classname);
	Thread.sleep(2000);
	Select DepartingOnMonth=new Select(driver.findElement(By.xpath(on)));
	DepartingOnMonth.selectByValue(DepartingOnMonth1);
	Select DepartingOnDate=new Select(driver.findElement(By.xpath(on2)));
	DepartingOnDate.selectByValue(DepartingOnDate1);
}

public static void flightsearch3(String classname, String passengerdetails1,String DepartingOnMonth1,String DepartingOnDate1, 
		String Arrivingin1, String ReturningMonth1, String ReturningDate1, String Serviceclass1, String Airline1,
		String Departflight1, String Arriveflight1,
		String Firstname1, String Lastname1,String Mealpreference1,String cardtype1, 
		String Cardnumber1, String Cardexpirationdate1, String Cardexpirationyear1, String Cardfirstname1, String CardMidddlename1, 
		String CardLastname1, String CardBillingaddressline1,String CardBillingaddressline2,String CardBillingcity1, String CardBillingState1,
		String CardBillingpostal1, String CardBillingcountry) throws InterruptedException
{
	
	Select Arrivingin=new Select(driver.findElement(By.xpath(arrivingin)));
	Arrivingin.selectByValue(Arrivingin1);
	Select ReturningMonth=new Select(driver.findElement(By.xpath(returning)));
	ReturningMonth.selectByValue(ReturningMonth1);
	Select ReturningDate=new Select(driver.findElement(By.xpath(returning2)));
	ReturningDate.selectByValue(ReturningDate1);
}

public static void flightsearch4(String classname, String passengerdetails1,String DepartingOnMonth1,String DepartingOnDate1, 
		String Arrivingin1, String ReturningMonth1, String ReturningDate1, String Serviceclass1, String Airline1,
		String Departflight1, String Arriveflight1,
		String Firstname1, String Lastname1,String Mealpreference1,String cardtype1, 
		String Cardnumber1, String Cardexpirationdate1, String Cardexpirationyear1, String Cardfirstname1, String CardMidddlename1, 
		String CardLastname1, String CardBillingaddressline1,String CardBillingaddressline2,String CardBillingcity1, String CardBillingState1,
		String CardBillingpostal1, String CardBillingcountry) throws InterruptedException
{
	
	Flightbookingvalidation.serviceclass(Serviceclass1);
	Select Airlineselect=new Select(driver.findElement(By.xpath(Airline)));
	if (Airline1.contains("No Preferen"))
	{
		Airlineselect.selectByIndex(0);
    }
	if (Airline1.contains("Blue Skies Airlines"))
	{
		Airlineselect.selectByIndex(1);
    }
	if (Airline1.contains("Unified Airlines"))
	{
		Airlineselect.selectByIndex(2);
    }

	if (Airline1.contains("Pangea Airlines"))
	{
		Airlineselect.selectByIndex(3);
    }
	
	element=driver.findElement(By.xpath(continue1));
	element.click();
	Flightbookingvalidation.flightselection(Departflight1,Arriveflight1);
	element=driver.findElement(By.xpath(continue2));
	element.click();
}

public static void flightsearch5(String classname, String passengerdetails1,String DepartingOnMonth1,String DepartingOnDate1, 
		String Arrivingin1, String ReturningMonth1, String ReturningDate1, String Serviceclass1, String Airline1,
		String Departflight1, String Arriveflight1,
		String Firstname1, String Lastname1,String Mealpreference1,String cardtype1, 
		String Cardnumber1, String Cardexpirationdate1, String Cardexpirationyear1, String Cardfirstname1, String CardMidddlename1, 
		String CardLastname1, String CardBillingaddressline1,String CardBillingaddressline2,String CardBillingcity1, String CardBillingState1,
		String CardBillingpostal1, String CardBillingcountry) throws InterruptedException
{
	
	element=driver.findElement(By.xpath(firstname11));
	element.sendKeys(Firstname1);
	element=driver.findElement(By.xpath(lastname11));
	element.sendKeys(Lastname1);
	Select billingselect1=new Select(driver.findElement(By.xpath(mealpreference)));
	billingselect1.selectByValue(Mealpreference1);
	Select billingselect2=new Select(driver.findElement(By.xpath(cardtype)));
	billingselect2.selectByValue(cardtype1);
	element=driver.findElement(By.xpath(cardnumber));
	element.sendKeys(Cardnumber1);
	Select billingselect3=new Select(driver.findElement(By.xpath(cardexpirationdate)));
	billingselect3.selectByVisibleText(Cardexpirationdate1);
	Select billingselect4=new Select(driver.findElement(By.xpath(cardexpirationyear)));
	billingselect4.selectByValue(Cardexpirationyear1);
	element=driver.findElement(By.xpath(cardfirstname));
	element.sendKeys(Cardfirstname1);
	element=driver.findElement(By.xpath(cardmidddlename));
	element.sendKeys(CardMidddlename1);
	element=driver.findElement(By.xpath(cardlastname));
	element.sendKeys(CardLastname1);

	element=driver.findElement(By.xpath(cardbillingaddressline1));
	element.clear();
	element.sendKeys(CardBillingaddressline1);
	element=driver.findElement(By.xpath(cardbillingaddressline2));
	element.clear();
	element.sendKeys(CardBillingaddressline2);
	element=driver.findElement(By.xpath(cardbillingcity));
	element.clear();
	element.sendKeys(CardBillingcity1);
	element=driver.findElement(By.xpath(cardbillingstate));
	element.clear();
	element.sendKeys(CardBillingState1);
	element=driver.findElement(By.xpath(cardbillingpostal));
	element.clear();
	element.sendKeys(CardBillingpostal1);
	Select billingselect5=new Select(driver.findElement(By.xpath(cardbillingcountry)));
	billingselect5.selectByValue(CardBillingcountry);
	try {
        WebDriverWait wait = new WebDriverWait(driver, 2);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    } catch (Exception e) {
       System.out.println("Exception in alert " +e);
    }
	System.out.println("I am here");
	//driver.switchTo().activeElement();
	element=driver.findElement(By.xpath(Carddeliveryaddress));
	element.click();
	Thread.sleep(5000);
	element=driver.findElement(By.xpath(securepurchase));
	element.click();
	
	 
	
	String text =driver.findElement(By.xpath(itenaryconfirmation)).getText();
	if(text.contains("Your itinerary has been booked!"))
			{
	Reporter.log("Flight booking is successful for Passenger " +Firstname1 +Lastname1);
	element=driver.findElement(By.xpath(backtohome));
	element.click();
		    }
	else
			{
	Assert.fail("Flight booking is not successful for Passenger " +Firstname1 +Lastname1);
	element=driver.findElement(By.xpath(backtoflight));
	element.click();	
			}

}


}

