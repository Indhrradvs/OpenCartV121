package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver); //invoking parent class constructor using SUPER keyword
	}

	// WebElements
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstName;

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLastName;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtTelePhone;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtConfirmPassword;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement chkdPolicy;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;

	@FindBy(xpath = "//*[@id='content']/h1")
	WebElement msgConfirmation;

	public void setFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}

	public void setLastName(String lname) {
		txtLastName.sendKeys(lname);
	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void setTelePhone(String tel) {
		txtTelePhone.sendKeys(tel);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void setPasswordConfirm(String pwdConfirm) {
		txtConfirmPassword.sendKeys(pwdConfirm);
	}

	public void setPrivacyPolicy() {
		chkdPolicy.click();
	}

	public void clickContinue() {
		btnContinue.click();
	}

	// Method will capture the text message and return it. No validation performed here.
	public String getConfirmationMsg() {

		try {

			return (msgConfirmation.getText());

		} catch (Exception e) {

			return (e.getMessage()); // getMessage(): Returns the detail message string of this throwable
		}

	}

}
