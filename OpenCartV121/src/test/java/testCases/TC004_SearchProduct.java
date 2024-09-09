package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.SearchPage;

import testBase.BaseClass;

public class TC004_SearchProduct extends BaseClass {
	
	@Test(groups="Master")
	public void verify_ProductSearch(){
		
		logger.info("**** Started TC004_SearchProduct  ****");
		
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
		sp.enterProductName("Mac");
		sp.clickSearch();
		
		logger.info("**** Product Searched Successfully ****");
       
		System.out.println(sp.isProductExist("MacBook Pro"));
		
		Assert.assertEquals(true, sp.isProductExist("MacBook Pro"));
		
		logger.info("**** Logged-Out Successfully ****");
				
		} catch (Exception e) {
			
			Assert.fail();
		}
	
		logger.info("**** Finished TC004_SearchProduct ****");
	}

}
