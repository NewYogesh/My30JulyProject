package Com.Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;

public class Ecommerce_LoginPage  extends Ecommerce_BaseClass{

	public Ecommerce_LoginPage() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	public WebElement Username;
	
	@FindBy(id = "Password")
	public WebElement Password;
	
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	public WebElement LoginButton;
	
	
	public void Username1(String Uname) {
		Username.sendKeys(Uname);
		
	}
	
	public void Password1(String Pass) {
		Password.sendKeys(Pass);
	}
	
	public void LoginButton1() {
		LoginButton.click();
	}
	
}
