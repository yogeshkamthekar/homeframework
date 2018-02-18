package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Initialize {

	public static WebDriver driver = null;
	public static WebElement element = null;
	public static Properties CONFIG = new Properties();
	public static Properties Environment = new Properties();
	//public static Logger log = Logger.getLogger("TestBase.Class");
	public static WebDriverWait wait;
	public static String message;
	private static final String ESCAPE_PROPERTY = "org.uncommons.reportng.escape-output";

	//TimeStamp Related
	public static String startTime;
	public static String endTime;
	public static long finishTime, startingTime;
	/*
	 * @Rule public ErrorCollector errCol = new ErrorCollector();
	 */
	public static void initialize() throws IOException {

		// loading config file
		FileInputStream config = new FileInputStream(
				System.getProperty("user.dir") + "/config.properties");
		CONFIG.load(config);
		String property_file = CONFIG.getProperty("propertyfile_path");

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/PropertyFiles/"
						+ property_file);
		Environment.load(fis);
		//PropertyConfigurator.configure("PropertyFiles/log4j.properties");
//		proxyIpGlobal = Environment.getProperty("Proxy_IP");
//		proxyPort = Integer.parseInt(Environment.getProperty("Proxy_Port"));
		
		System.setProperty(ESCAPE_PROPERTY, "false");
	}

	@SuppressWarnings("deprecation")
	public static void setBrowser(String strBrowser) throws InterruptedException {
		
		
		// instantiate a IE driver
		if (strBrowser.equals("IE")) {
			String path = System.getProperty("user.dir")
					+ "/tools/IEDriverServer.exe";
			//log.info(path);
			
			System.setProperty("webdriver.ie.driver", path);
			//log.info("system property set");

			
			
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setBrowserName("internet explorer");
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			//System.setProperty("webdriver.ie.driver",path);
			driver = new InternetExplorerDriver(capabilities);
			
			
			
			
			
			
			//driver=new InternetExplorerDriver(capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			wait = new WebDriverWait(driver, 180);

		} 
		
		else if (strBrowser.equals("Firefox")) {

			//log.info("Inside Firefox set up");
			// Setting the proxy
//			Proxy proxy = new Proxy();
//			String proxyIp = proxyIpGlobal;
//
//			// Below lines sets the proxy defined above
//			proxy.setHttpProxy(proxyIp);
//			proxy.setSslProxy(proxyIp);
//			proxy.setFtpProxy(proxyIp);

			/*final FirefoxProfile firefoxProfile = new FirefoxProfile();
			firefoxProfile.setPreference("xpinstall.signatures.required", false);
			driver = new FirefoxDriver(firefoxProfile);*/
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities = DesiredCapabilities.firefox();
			capabilities.wait(2000);
			capabilities.setBrowserName("firefox");
			driver=new FirefoxDriver(capabilities);
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			//log.info("All conditions accepted in the profile");
			wait = new WebDriverWait(driver, 100);
		
			
		} 
		
		else if (strBrowser.equals("Chrome")) {
			String path = System.getProperty("user.dir")
					+ "/tools/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			//log.info("path Chrome : "+path);
			//log.info("system property set");

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities = DesiredCapabilities.chrome();
                        capabilities.setBrowserName("chrome");
		
			driver = new ChromeDriver(capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			wait = new WebDriverWait(driver, 180);
		}
		
		else if (strBrowser.equals("opera")) {
			String path = System.getProperty("user.dir")
					+ "/tools/operadriver.exe";
			System.setProperty("webdriver.opera.driver", path);
			//log.info("path Chrome : "+path);
			//log.info("system property set");

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities = DesiredCapabilities.opera();
                        capabilities.setBrowserName("opera");
		
			driver = new ChromeDriver(capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			wait = new WebDriverWait(driver, 180);
		}

	}

	//
	public static boolean isTextPresent(String text) {
		try {
			boolean b = driver.getPageSource().contains(text);
			return b;
		} catch (Exception e) {
			return false;
		}
	}

	// Method to capture the screenshots
	public String capture() throws IOException {
	
		
		File screenshot = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat sdf = new SimpleDateFormat("MMddyyyy_hmmss");
		Date date = new Date();
		String currentDate = sdf.format(date);
		File saveFile = new File("screenShots/"
				+this.getClass().getSimpleName()+"_"+currentDate + ".png");
		try {
			
			FileUtils.copyFile(screenshot, saveFile);
		} catch (IOException e) {
			System.out.println("Error getting screenshot");
			e.printStackTrace();
		}
		return currentDate;
		
	}
}
