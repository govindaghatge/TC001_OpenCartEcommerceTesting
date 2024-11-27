package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import TestBase.BaseTest;

public class TC002_VerifyLoginFunctionality extends BaseTest
{
	   @Test(groups="Sanity")
       public void Verify_LoginFunctionality()
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
			      lp.SetPassword(p.getProperty("password"));
			      
			      lp.ClkLogin();
			      logger.info("****Clicked on Login button****");
			     
			      String validationMessage = lp.getMsg();
			      
			      Assert.assertEquals(validationMessage, "My Account");
			      
			      logger.info("Test passed");
		      }
		      
		      catch(Exception e)
		      {
		    	  logger.error("Test failed: " + e.getMessage());
		    	  Assert.fail("Test failed:" + e.getMessage());
		      }
		      
		      finally
		      {
		    	  logger.info("***** Finished TC002_AccountRegistrationTest *****");
		      }
       }
}
