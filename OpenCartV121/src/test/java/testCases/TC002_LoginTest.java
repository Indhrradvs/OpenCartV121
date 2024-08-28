package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountsPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {

	@Test(groups={"Sanity","Master"})
	public void verify_Login() {

		logger.info("**** Started TC002_LoginTest ****");

		try {

			// HomePage
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.linkLogin();

			// LoginPage
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(p.getProperty("email"));
			logger.info("**** Entered E-mail Id ****");
			
			lp.setPassword(p.getProperty("password"));
			logger.info("**** Entered Password ****");
			
			lp.clickLogin();
			System.out.println("Logged-In Successfully..!!");
			
			logger.info("**** Logged-In Successfully ****");
			
			// MyAccountsPage
			MyAccountsPage myAcc = new MyAccountsPage(driver);
			boolean verifyMsg = myAcc.isMyAccountPageExists();
			Assert.assertTrue(verifyMsg);
			
			//Logout
			myAcc.clickLogout();
			System.out.println("Logged-Out successfully..!!");
			
			logger.info("**** Logged-Out Successfully ****");
			
		} catch (Exception e) {
			Assert.fail();
		}
		
		/**
		 * We can use anyone from below Assertions Assert.assertTrue(verifyMsg); (or)
		 * Assert.assertEquals(verifyMsg, true,"Login Failed" );
		 */
		
		logger.info("**** Finished TC002_LoginTest ****");
	}

}
