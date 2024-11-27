package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.RegisterationPage;
import TestBase.BaseTest;

public class TC001_VerifyAccountRegistration extends BaseTest
{
   @Test(groups ="Master")	
   public void VerifyRegistrationFunctionality()
    {
	     logger.info("****Starting_Registration****");
	      try
	      {
	    	  HomePage hp = new HomePage(driver);
	    	  
		      hp.ClkMyAccount();
		      logger.info("****clicked on MyAccount link****");
		      
		      hp.ClkRegister();
		      logger.info("****clicked on Register link****");

		      RegisterationPage rp = new RegisterationPage(driver);
		      
		      logger.info("****Entering_User_info****");
		      rp.SetFirstName(randomString().toUpperCase());
		      rp.SetLastName(randomString().toUpperCase());
		      rp.SetEmail(randomString()+"@gmail.com");
		      rp.SetPhone(randomNumber().toUpperCase());
		    
		      String password = randomAlphaNumberic();
		      rp.SetPassword(password);
		      rp.SetConfirmPassword(password);
		      
		      rp.ClkPolicy();
		      logger.info("****click on policy****");
		      
		      rp.ClkContinue();
		      logger.info("****click on Continue****");
		      
		      logger.info("Validating expected message..");
	          String confirmmsg = rp.GetConfirmMessage();
	          Assert.assertEquals("Your Account Has Been Created!", confirmmsg);
	          
	          logger.info("Test passed");
	      }
	      
	      catch (Exception e)
			{
				logger.error("Test failed: " + e.getMessage());
				Assert.fail("Test failed: " + e.getMessage());
			} 
	      
	      finally
	      {
	    	  logger.info("***** Finished TC001_AccountRegistrationTest *****");
	      }
    }
}
