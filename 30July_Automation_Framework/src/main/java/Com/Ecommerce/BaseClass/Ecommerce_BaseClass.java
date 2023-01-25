package Com.Ecommerce.BaseClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Com.Ecommerce.Configuration.Read_Configuration;
import Com.Ecommerce.Utilities.TestUtils;

public class Ecommerce_BaseClass {

	Read_Configuration Read = new Read_Configuration();
	
	public String BaseUrl = Read.getAppURL();
	public String UserName = Read.getUsername();
	public String Password = Read.getPassword();

	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeMethod
	public void setup() {
		
		logger=logger.getLogger("30th_July_Ecommere_Logs");
		
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", Read.getChromePath() );
		
		 driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(TestUtils.ImplicitWait, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(TestUtils.PageLoadTime, TimeUnit.SECONDS);
		 
		 driver.get(BaseUrl);
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
