package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

//Below pages are imported from PageObjects Package
import PageObjects.AccountRegistrationPage;
import PageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

	@Test(groups={"Regression","Master"}) //Master group selects all the Test cases including any group
	public void verify_Account_Registration() {

		logger.info("**** Started TC001_AccountRegistrationTest ****"); // log4j2

		try {

			// Accessing Methods from HomePage by creating a HomePage object
			HomePage hp = new HomePage(driver);

			hp.clickMyAccount();
			logger.info("Clicked on MyAccount Link..");

			hp.clickRegister();
			logger.info("Clicked on Register Link..");

			// Accessing Methods from AccountRegistrationPage by creating a object
			AccountRegistrationPage regPage = new AccountRegistrationPage(driver);

			logger.info("Entering Customer Details..");
			regPage.setFirstName(randomeString().toUpperCase()); // creates random text in UPPER CASE
			regPage.setLastName(randomeString().toUpperCase());
			regPage.setEmail(randomeString() + "@test.com"); // creates random text with @test.com
			regPage.setTelePhone(randomeNumber()); // creates random numbers

			String password = randomeAlphaNumeric(); // Creating Random Alphanumeric value and stored into "password" variable
			regPage.setPassword(password);
			regPage.setPasswordConfirm(password); // passing same value to "setPassword" & "setPasswordConfirm" methods

			regPage.setPrivacyPolicy();
			regPage.clickContinue();

			logger.info("Validating expected Message..");

			// Validation check
			String confMsg = regPage.getConfirmationMsg();
			System.out.println("Confirmation Message is: " + confMsg);

			if (confMsg.equals("Your Account Has Been Created!")) {

				AssertJUnit.assertTrue(true);

			} else {
				AssertJUnit.assertTrue(false);
				logger.error("Test Failed.."); // choose "charSequnce" methods
				logger.debug("Debug Logs..");
			}

		} catch (Exception e) {

			AssertJUnit.fail();
		}

		logger.info("**** Finished TC001_AccountRegistrationTest ****");
	}

}
