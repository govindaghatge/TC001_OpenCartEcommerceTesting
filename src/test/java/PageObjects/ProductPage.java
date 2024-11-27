package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBase
{
	public ProductPage(WebDriver driver) 
	{
		super(driver);
	}
 
	@FindBy(xpath="//h4//a[text()='MacBook Air']")
	WebElement ClkProductName;
	
	public void ClkProductName()
	{
		ClkProductName.click();
	}
}
