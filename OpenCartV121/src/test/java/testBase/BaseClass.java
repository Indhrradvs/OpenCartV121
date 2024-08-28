package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public static WebDriver driver;
	public Logger logger; // Log4j
	public Properties p;

	
	@BeforeClass(groups= {"Sanity","Regression","Master", "Datadriven"}) //We mentioned all group names because we need to execute these methods for every TC
	@Parameters({"os","browser"}) //Need to refer from MyTestng.xml file
	public void setup(String os, String br) throws IOException {
		
		//Loading values from config.properties file
		FileReader file = new FileReader("./src/test/resources/config.properties");
		p = new Properties(); //creating Properties class object to access Properties class method
		p.load(file);
		
		logger = LogManager.getLogger(this.getClass()); // log4j2
		
		// Remote Execution- Selenium GRID
		if (p.getProperty("execution_env").equalsIgnoreCase("remote")) {

			DesiredCapabilities capabilities = new DesiredCapabilities();

			// Verifying OS from MyTestng.xml file

			if (os.equalsIgnoreCase("windows")) {

				capabilities.setPlatform(Platform.WIN11);
				
			}else if(os.equalsIgnoreCase("Linux")) {
				
				capabilities.setPlatform(Platform.LINUX);
				
			} else if (os.equalsIgnoreCase("mac")) {

				capabilities.setPlatform(Platform.MAC);

			} else {

				System.out.println("No Matching OS found..");
				return;
			}

			// Verifying browser from MyTestng.xml file
			switch (br.toLowerCase()) {

			case "chrome":
				capabilities.setBrowserName("chrome");
				break;
			
			case "edge":
				capabilities.setBrowserName("MicrosoftEdge");
				break;
			
			case "firefox":
				capabilities.setBrowserName("firefox");
				break;
			
			default:
				System.out.println("No Matching Browser found..");
				return;
			}

			driver = new RemoteWebDriver(new URL("http://192.168.1.154:4444/wd/hub"), capabilities);
		}
		
		// Local Machine Execution
		if(p.getProperty("execution_env").equalsIgnoreCase("local")) 
		 {
			switch (br.toLowerCase()) { // converting browserName to lower case for consistency
			
			case "chrome":  //depending on the browser names below cases will execute
				driver = new ChromeDriver();
				break;
			
			case "edge":
				driver = new EdgeDriver();
				break;
			
			case "firefox":
				driver = new FirefoxDriver();
				break;
			
			default:
				System.out.println("Invalid Browser Name..");
				return;
			// return method will end the execution(next Steps) if browser Name is invalid
			}

		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appUrl")); //appUrl from config.properties file
		driver.manage().window().maximize();
	}

	@AfterClass(groups= {"Sanity","Regression","Master", "Datadriven"})
	public void tearDown() {

		driver.quit();
	}

	/*
	 * Scenario: If we want to create RANDOM data due to uniqueness is Mandatory. In
	 * this scenario we are using "RandomStringUtils" imported from
	 * "org.apache.commons.lang3". We have a dependency for this in POM.xml file
	 * 
	 * 1) RandomStringUtils -> Class 2) .randomAlphabetic( ) -> Method. 3)
	 * randomAlphabetic(5) == 5 is a chars max length that needs to be created
	 * randomly
	 * 
	 * Note: we need to call this method in required statements.
	 */

	// We defined this method because we don't have anything in Java.

	// Generating Random Alphabets
	public String randomeString() {
		String genearatedString = RandomStringUtils.randomAlphabetic(5);
		return genearatedString;
	}

	// Generating Random Numbers
	public String randomeNumber() {
		String genearatedNumbers = RandomStringUtils.randomNumeric(10);
		return genearatedNumbers;
	}

	// Generating Random Alphanumerics
	public String randomeAlphaNumeric() {
		String genearatedString = RandomStringUtils.randomAlphabetic(3);
		String genearatedNumbers = RandomStringUtils.randomNumeric(3);
		return (genearatedString + "@" + genearatedNumbers); // Returns random alphanumeric values with Special Characters
	}

	// Capturing Screenshots
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date()); // TimeStamp

		TakesScreenshot takesScreenShot = (TakesScreenshot) driver;
		File sourceFile = takesScreenShot.getScreenshotAs(OutputType.FILE);

		String targetFilePath = System.getProperty("user.dir") + "/screenshots/" + tname + "_" + timeStamp+".png";
		File targetFile = new File(targetFilePath);

		sourceFile.renameTo(targetFile);

		return targetFilePath; //this returned path we use in ExtentReportsManager class
	//If we don't return the path then sceenshots will stay in folder but won't be the part of reports

	}
}
