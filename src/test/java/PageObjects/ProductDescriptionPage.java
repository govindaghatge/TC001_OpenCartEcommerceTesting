package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDescriptionPage extends PageBase
{

	public ProductDescriptionPage(WebDriver driver) 
	{
		super(driver);
	}
  
	@FindBy(id="button-cart")
	WebElement clkAddToCart;
	
	@FindBy(xpath="//div[contains(text(),'Success: You have added')]")
	WebElement getmsg;
	
	public void ClkAddToCart()
	{
		clkAddToCart.click();
	}
	
	public boolean GetConfirmationMsg()
	{
		try
		{
			return getmsg.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
}
