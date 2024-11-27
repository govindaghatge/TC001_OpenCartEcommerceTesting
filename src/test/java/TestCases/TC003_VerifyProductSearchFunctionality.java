package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.ProductDescriptionPage;
import PageObjects.ProductPage;
import PageObjects.SearchPage;
import TestBase.BaseTest;

public class TC003_VerifyProductSearchFunctionality extends BaseTest
{
	     @Test(groups="Master")
         public void VerifyProductSearchFunctionality()
         {
        	 logger.info("****Starting Login Process****");
        	 
        	 try
        	 {
        		  HomePage hp = new HomePage(driver);
		    	  
			      hp.ClkMyAccount();
			      logger.info("****clicked on MyAccount link****");
			      
			      hp.ClkLogin();
			      logger.info("****clicked on Login link****");
			      
			      LoginPage lp = new LoginPage(driver);
			      logger.info("****Entering Login details****");
			      lp.SetEmail(p.getProperty("email"));
			      lp.SetPassword("password");
			      
			      lp.ClkLogin();
			      logger.info("****Clicked on Login button****");
			     
			      SearchPage sp = new SearchPage(driver);
			      logger.info("****Started searching for Product****");
			      sp.ClkSearch();
			      sp.ClkSearchBtn();
			      
			      ProductPage Pp = new ProductPage(driver);
			      Pp.ClkProductName();
			      
			      ProductDescriptionPage Pdp = new ProductDescriptionPage(driver);
			      Pdp.ClkAddToCart();
			      logger.info("****Clicked on AddToCart Button****");

			      boolean AddToCartMsg = Pdp.GetConfirmationMsg();
			      Assert.assertEquals(AddToCartMsg, true);
			      logger.info("Test passed");
        	 }
        	 
        	 catch(Exception e)
        	 {
        		 logger.error("Test Failed" + e.getMessage());
        		 Assert.fail("Test Failed"+ e.getMessage());
        	 }
        	 
        	 finally
        	 {
        		 logger.info("*****TC003_VerifyProductSearchFunctionality*****");
        	 }
         }
}
