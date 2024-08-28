package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountsPage extends BasePage {

	// Constructor
	public MyAccountsPage(WebDriver driver) {

		super(driver);
	}

	// WebElements
	@FindBy(xpath = "//*[@id='content']/h2[1]") // MyAccount Page Header
	WebElement msgHeading;

	@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']") // Added as part of AutoFW Step 6.3
	WebElement linklogout;

	// Action Methods
	public boolean isMyAccountPageExists() {
		try {
			return (msgHeading.isDisplayed());
		} catch (Exception e) {
			return false;
		}

	}

	public void clickLogout() {

		linklogout.click();
	}

}
