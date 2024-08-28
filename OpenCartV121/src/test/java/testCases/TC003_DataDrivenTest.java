package testCases;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountsPage;
import junit.framework.Assert;
import testBase.BaseClass;
import utilities.MyDataProviders;

public class TC003_DataDrivenTest extends BaseClass {
	
	/* 1) dataProvider = "LoginData" -> If it's part of same class
	 * 2) dataProviderClass = MyDataProviders.class --> if we need to import from another class/package
	 *
	 * Note: If it's part of same class then 1st annotation will be fine. 
	 *       If not we need to add 2nd Annotation as well.
	 */
	
	@Test(dataProvider = "LoginData", dataProviderClass = MyDataProviders.class, groups="Datadriven" )
	public void verify_loginDDT(String email, String pwd, String expResult) {
		
		logger.info("**** Started TC003_DataDrivenTest ****");
		
		try 
		{		
		// HomePage
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.linkLogin();

		// LoginPage
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.clickLogin();
		
		// MyAccountsPage
		MyAccountsPage myAcc = new MyAccountsPage(driver);
		boolean verifyMsg = myAcc.isMyAccountPageExists();
		
		/**
		 * Some of the important Conditions we need to test:
		 * 1. Data is valid   -> Login Successful ->Test Pass ->logout 
		 * 2.                 -> Login Failed     ->Test Fail
		 * 3. Data is Invalid -> Login Successful ->Test Fail ->logout 
		 * 4.                 -> Login Failed     ->Test Pass
		 */
		
		//Conditions-1 & 2
		if (expResult.equalsIgnoreCase("valid")) { // 1.Data is valid

			if (verifyMsg == true) { // 2.Login Successful

				myAcc.clickLogout(); // 4.Logout
				Assert.assertTrue(true); // 3.Test Pass
			} else // 5.Login Failed
			{
				Assert.assertTrue(false); // 6.Test Fail
			}
		}

		// Conditions-3 & 4
		if (expResult.equalsIgnoreCase("invalid")) { // 1.Data is invalid

			if (verifyMsg == true) { // 2.Login Successful

				myAcc.clickLogout(); // 4.Logout
				Assert.assertTrue(false); // 3.Test Fail
			} else // 5.Login Failed
			{
				Assert.assertTrue(true); // 6.Test Pass
			}
		}

		}catch(Exception e) {
			
			Assert.fail();
		}
		
		logger.info("**** Finished TC003_DataDrivenTest ****");
	}

}
