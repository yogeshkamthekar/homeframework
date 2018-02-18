package validations;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import base.Initialize;
import flightObjects.*;

public class Registrationvalidation extends Initialize implements Registration {

	public static void registrationusername(String firstname1, String lastname1,String phone1, String email1, String address2, String address11, String city1, String State1, String Postalcode1,String user1,String password1,String confirmpassword1)
	{
	

		driver.findElement(By.xpath(register)).click();
		element = driver.findElement(By.xpath(firstname));
		element.sendKeys(firstname1);
		
		element = driver.findElement(By.xpath(lastname));
		element.sendKeys(lastname1);

		element = driver.findElement(By.xpath(phone));
		element.sendKeys(phone1);
		
		element = driver.findElement(By.xpath(email));
	 	element.sendKeys(email1);
		
		element = driver.findElement(By.xpath(address));
		element.sendKeys(address2);
		
		element = driver.findElement(By.xpath(address1));
		element.sendKeys(address11);
		
		element = driver.findElement(By.xpath(address1));
	    element.sendKeys(address11);
		
		element = driver.findElement(By.xpath(city));
		element.sendKeys(city1);
		
		element = driver.findElement(By.xpath(State));
		element.sendKeys(State1);
		
		element = driver.findElement(By.xpath(Postalcode));
		element.sendKeys(Postalcode1);
		
		element = driver.findElement(By.xpath(country));
		Select se=new Select(element);
		se.selectByIndex(107);
		
		Reporter.log("User details are accepted in system includes firstname,lastname,phone,email,address,state,country ");
	}
	
	public static void credentialvalidation(String firstname1, String lastname1,String phone1, String email1, String address2, String address11, String city1, String State1, String Postalcode1,String user1,String password1,String confirmpassword1)
	{
		element=driver.findElement(By.xpath(username));
		element.sendKeys(user1);
		
		element=driver.findElement(By.xpath(password));
		element.sendKeys(password1);
		
		element=driver.findElement(By.xpath(confirmpassword));
		element.sendKeys(confirmpassword1);
		
		
		if (password1==confirmpassword1)
		{
			driver.findElement(By.xpath(submit)).click();
			Reporter.log("password and confirm password entered are matching correctly");
		}
		else
		{
			Reporter.log("password and confirm password doesnt match");
		}
			
	}
	
	public static void checkuseridafterregistration(String firstname1, String lastname1,String phone1, String email1, String address2, String address11, String city1, String State1, String Postalcode1,String user1,String password1,String confirmpassword1)
	{
	
		String registration= driver.findElement(By.xpath(registrationresult)).getText();
		String u =registration.substring(24, 31);
		
		System.out.println(" " +registration);
		System.out.println(" " +u);
		
		
		
		if ( u.equals(user1)) {

			Reporter.log("registration is successful");
			Reporter.log("user id successfully registered =  " + user1);

		} 
		else {

		   Assert.fail("registration process  failed at last step");

		}

	}

}