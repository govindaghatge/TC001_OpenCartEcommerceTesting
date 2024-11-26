package PageObjects;

import java.awt.TextField;

import org.apache.logging.log4j.core.layout.TextEncoderHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterationPage extends PageBase{
	
	public RegisterationPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtPhone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement ClkPolicy;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement ClkContinue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
   public void SetFirstName(String Fname)
   {
	   txtFirstName.sendKeys(Fname);
   }
   
   public void SetLastName(String Lname)
   {
	   txtLastName.sendKeys(Lname);
   }
   
   public void SetEmail(String Email)
   {
	   txtEmail.sendKeys(Email);
   }
   
   public void SetPhone(String PhoneNo)
   {
	   txtPhone.sendKeys(PhoneNo);
   }
   
   public void SetPassword(String Pass)
   {
	   txtPassword.sendKeys(Pass);
   }
   
   public void SetConfirmPassword(String ConfirmPassword)
   {
	   txtConfirmPassword.sendKeys(ConfirmPassword);
   }
   
   public void ClkPolicy()
   {
	   ClkPolicy.click();
   }
   
   public void ClkContinue()
   {
	   ClkContinue.click();
   }
   
   public String GetConfirmMessage()
   {
	   try {
		   return msgConfirmation.getText();
	   }
	   catch(Exception e)
	   {
		  return (e.getMessage());     
	   }
   }
}
