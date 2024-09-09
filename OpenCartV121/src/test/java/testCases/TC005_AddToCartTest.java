package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.SearchPage;

import testBase.BaseClass;

public class TC005_AddToCartTest extends BaseClass {

	@Test(groups="Master")
	public void verify_AddToCart() {
		
		logger.info("**** Started TC005_AddToCartTest ****");
		
		try {
			
			//HomePage
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.linkLogin();
			
			logger.info("**** Moved to Log-In screen Successfully ****");
			
			//LoginPage
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clickLogin();
			
			logger.info("**** Logged-In Successfully ****");
			
			//SearchPage
			SearchPage sp = new SearchPage(driver);
			sp.enterProductName("HP");
			sp.clickSearch();
			
			logger.info("**** Product Searched Successfully ****");
			Thread.sleep(3000);
			
			if (sp.isProductExist("HP")) {
				sp.selectProduct();
				sp.setQuantity("3");
				sp.addToCart();
			}
			
			logger.info("**** Product Added to Cart Successfully ****");
			
			//ValidationCheck
			String msgConfirmation = sp.checkConfMsg();
			System.out.println("Confirmation Message is "+ msgConfirmation);
			
			Assert.assertEquals(msgConfirmation, sp.checkConfMsg());
			
		} catch (Exception e) {
			
			Assert.fail();
		}
		
		logger.info("**** Finished TC005_AddToCartTest ****");
	}
}
