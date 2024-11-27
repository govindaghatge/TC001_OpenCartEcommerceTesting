package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase
{
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
    
	@FindBy(id="input-email")
	WebElement txtEmail;
	
	@FindBy(id="input-password")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement ClkLogin;
    
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement validMsg;
	
	public void SetEmail(String email)
	{
		txtEmail.sendKeys(email);;
	}
	
	public void SetPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void ClkLogin()
	{
		ClkLogin.click();
	}
	
	public String getMsg()
	{
		try {
			return(validMsg.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
}
