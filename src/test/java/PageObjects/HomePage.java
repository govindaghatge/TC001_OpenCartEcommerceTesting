package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
	
	public HomePage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement ClkMyaccount;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement ClkRegister;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement ClkLogin;
	
	public void ClkMyAccount()
	{
		ClkMyaccount.click();	
	}
	
	public void ClkRegister()
	{
		ClkRegister.click();
	}
	
	public void ClkLogin()
	{
		ClkLogin.click();
	}
	
}
