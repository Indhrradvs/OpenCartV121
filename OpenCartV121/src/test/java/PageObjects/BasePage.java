package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	WebDriver driver;

	//Constructor
	public BasePage(WebDriver driver) {

		this.driver = driver;
		
		PageFactory.initElements(driver,this);
	}
}

/**
 * Factory class to make using Page Objects simpler and easier.
 *  
 * syntax: initElements(ElementLocatorFactory factory, Object page)
 * 
 * ElementLocatorFactory -> refers to driver 
 * Object Page(this) -> referring to this page
 */