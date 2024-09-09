package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

	// Constructor
	public SearchPage(WebDriver driver) {

		super(driver);
	}

	// WebElements
	@FindBy(xpath = "//input[@name='search']")
	WebElement searchField;

	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	WebElement searchIcon;

	/** below is a Generic path for list of WebElements.
	 *  All the elements comes under same class, by entering the name as 
	 *  parameter it will work for isProductExist method.
	 * */
	@FindBy(xpath = "//div[@class='caption']/h4/a")
	WebElement product;
	
	@FindBy(xpath = "//div[@class='caption']//a[contains(text(),'HP LP3065')]")
	WebElement laptop;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	WebElement quantity;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	WebElement addToCartBtn;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement confirmMsg;
	
	// Action Methods
	public void enterProductName(String productName) {
		searchField.sendKeys(productName);
	}

	public void clickSearch() {
		searchIcon.click();
	}

	public void selectProduct(){
		laptop.click();
	}
	
	public void setQuantity(String count){
		quantity.clear();
		quantity.sendKeys(count);
	}
	
	public void addToCart(){
		addToCartBtn.click();
	}
	
	public String checkConfMsg() {

		try {

			return (confirmMsg.getText());

		} catch (Exception e) {

			return (e.getMessage());
		}
	}
	
	/*By Providing generic path, it will check all the values in the WebPage 
	depending on the parameter entered by the user */
	public boolean isProductExist(String productLookup) {
		try {
			return (product.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	}
}
