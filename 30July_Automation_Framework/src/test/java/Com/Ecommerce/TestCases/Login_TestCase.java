package Com.Ecommerce.TestCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClass.Ecommerce_LoginPage;
import net.bytebuddy.utility.RandomString;

public class Login_TestCase extends Ecommerce_BaseClass {

	@Test
	public void LoginPage() throws InterruptedException, IOException {
		
		logger.info("Open Nop Commerce URL");
		
		Ecommerce_LoginPage ELP = new Ecommerce_LoginPage();
		
		ELP.Username1(UserName);
		logger.info("Enter User ID");
		
		ELP.Password1(Password);
		logger.info("Enter User Password");
		
		ELP.LoginButton1();
		logger.info("Click on Login button");
		
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("nopCommerce demo store")) {
			
			Assert.assertTrue(true);
			logger.info("Login Successfully");
		}
		else {
            File Source =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String Random = RandomString.make(3);
			
			String ImgName="FailedLogin";
            
			File dest = new File("C:\\Users\\Yogesh\\eclipse-workspace\\30_July_Automation\\Screenshots\\"+ImgName+""+Random+".jpg");
			
			FileHandler.copy(Source, dest);
		//	Assert.assertTrue(false);
			logger.info("Login Failed");

		}
	}
}
