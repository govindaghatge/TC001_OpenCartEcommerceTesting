package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase
{

	public SearchPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@name='search']")
	WebElement txtSearch;
	
	@FindBy(xpath="//span//button[@type='button']")
	WebElement ClkSearchBtn;
	
	public void ClkSearch()
	{
		txtSearch.sendKeys("MacBook");
	}
	
	public void ClkSearchBtn()
	{
		ClkSearchBtn.click();
	}
}
