package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	/**
	 * Creating Constructor: without this constructor we cannot invoke the parent
	 * constructor(BasePage). This is called Inheritance.
	 * 
	 * CONSTRUCTOR is Mandatory for every PageObject class
	 */

	//Constructor
	public HomePage(WebDriver driver) {

		super(driver); // Referring to Parent class(BasePage)constructor
	}

	/**
	 * @FindBy is used to mark a field on a Page Object to indicate an alternative
	 *         mechanism for locating the element or a list of elements. -> Used in
	 *         conjunction with org.openqa.selenium.support.PageFactory, this allows
	 *         users to quickly and easily create PageObjects.
	 */

	// Adding WebElements using Locators
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement lnkMyAccount;

	@FindBy(xpath = "//a[text()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement linkLogin;

	//Action Methods for Above WebElements
	public void clickMyAccount() {

		lnkMyAccount.click();
	}

	public void clickRegister() {

		lnkRegister.click();
	}

	public void linkLogin() {
		
		linkLogin.click();
	}
}
