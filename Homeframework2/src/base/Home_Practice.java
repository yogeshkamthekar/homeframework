package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import cucumber.annotation.en.Given;

public class Home_Practice {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null; 
		  // @Given("^I am on Facebook login page$") 
			
		  // public void goToFacebook() { 
		      driver = new FirefoxDriver(); 
		      driver.navigate().to("https://www.facebook.com/"); 
		   
		System.out.println("Hellowolrd");

	}

}
