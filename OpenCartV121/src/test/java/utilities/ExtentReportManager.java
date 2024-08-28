package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.ImageHtmlEmail;
import org.apache.commons.mail.resolver.DataSourceUrlResolver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.BaseClass;

public class ExtentReportManager implements ITestListener {

	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;

	String repName;

	public void onStart(ITestContext testContext) {

		/** Generating a Date with specific format with timeStamp
		 
		    1.SimpleDateFormat df = new SimpleDateFormat("yyyy.mm.dd.HH.mm.ss"); 
		    2.            Date dt = new Date();  //Date is a class from Java
		    3.String currentdatetimestamp = df.format(dt); 
		    				(OR)
		    String timeStamp = new SimpleDateFormat("yyyy.mm.dd.HH.mm.ss").format(new Date());				
		  */
		
		//Instead of above 3 steps, we combined into below Single step
		String timeStamp = new SimpleDateFormat("yyyy.mm.dd.HH.mm.ss").format(new Date()); //TimeStamp
		repName = "Test-Report-" + timeStamp + ".html"; 
		sparkReporter = new ExtentSparkReporter(".//reports//"+repName); //Specify location of the Report
		
		sparkReporter.config().setDocumentTitle("OpenCartV121 Automation Report"); //Title of the document
		sparkReporter.config().setReportName("OpenCartV121 Functional Testing"); //Name of the Report
		sparkReporter.config().setTheme(Theme.DARK); 
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Application","OpenCartV121");
		extent.setSystemInfo("Module","Admin");
		extent.setSystemInfo("Sub Module","customers");
		extent.setSystemInfo("User Name",System.getProperty("user.name"));
		extent.setSystemInfo("Environment","QA");
		
		//os is getting dynamically from MyTestNg.xml file parameters
		String os = testContext.getCurrentXmlTest().getParameter("os"); 
		extent.setSystemInfo("Operating System",os);
		
		//browser is getting dynamically from MyTestNg.xml file parameters
		String browser = testContext.getCurrentXmlTest().getParameter("browser");
		extent.setSystemInfo("Browser",browser);
		
		//Groups Parameters(Sanity,Smoke etc) are getting from MyTestNg.xml file
		List<String> includedGroups = testContext.getCurrentXmlTest().getIncludedGroups();
		if (!includedGroups.isEmpty()) {
			extent.setSystemInfo("Groups", includedGroups.toString());
		}

	}
	
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getTestClass().getName()); //Returns name of the executed class 
		test.assignCategory(result.getMethod().getGroups()); // To display Groups in report as Category wise
		test.log(Status.PASS, result.getName() + " got successfully executed");
	}
	
	public void onTestFailure(ITestResult result){
		test = extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups()); 
		test.log(Status.FAIL, result.getName() + " got failed");
		test.log(Status.INFO, result.getThrowable().getMessage());
	
		//Adding Failue Screenshots to the Report 
		try {
			String imgPath = new BaseClass().captureScreen(result.getName());
			//test.addScreenCaptureFromPath("verify_Login_2024.08.23.02.41.30.png");
			test.addScreenCaptureFromPath(imgPath);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}	
		public void onTestSkipped(ITestResult result){
			test = extent.createTest(result.getTestClass().getName());
			test.assignCategory(result.getMethod().getGroups()); 
			test.log(Status.SKIP, result.getName() + " got Skipped");
			test.log(Status.INFO, result.getThrowable().getMessage());
		}
		
		public void onFinish(ITestContext testContext) {
			extent.flush(); //consolidate all the info from report and generate it. 
			
			//Below code will Open the report automatically after generated
			String pathOfExtentReport = System.getProperty("user.dir") + "//reports//" + repName;
			File extentReport = new File(pathOfExtentReport);
			try {
				Desktop.getDesktop().browse(extentReport.toURI()); //open the report on browser Automatically
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
		//If we want to send the report to the team automatically then enable below code
		
		/*	Below code is not working, Configure accordingly
		try {
			
			URL url = new URL("file:///" + System.getProperty("user.dir") + "//reports//" + repName);
			// Create the E-mail Message
			ImageHtmlEmail email = new ImageHtmlEmail();
			email.setDataSourceResolver(new DataSourceUrlResolver(url));
			email.setHostName("smtp.gmail.com"); //depends on email server, need to update Accordingly
			email.setSmtpPort(465);//depends on email server, need to update Accordingly
			email.setAuthenticator(new DefaultAuthenticator("frankmartinqa@gmail.com", "Frankmartin24"));
			email.setSSLOnConnect(true);
			email.setFrom("frankmartinqa@gmail.com"); // sender
			email.setSubject("Test Results");
			email.setMsg("Please find Attached Report...");
			email.addTo("xxxx@gmail.com"); // Receiver & for team we need Distribution List Email ID
			email.attach(url, "extent report", "Please check report...");
			email.send();// send the email
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		*/
	}
	  
}

