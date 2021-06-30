package org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.selenium;

/*import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class ExtentreportKSRA {
	
	
	static ExtentTest test;
	static ExtentReports report;
	@BeforeClass
	public static void startTest()
	{
	report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
	test = report.startTest("ExtentDemo");
	}
	@Test
	public void extentReportsDemo()
	{
	//System.setProperty("webdriver.chrome.driver", "D:\\SubmittalExchange_TFS\\QA\\Automation\\3rdparty\\chrome\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/vendor/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in");
	if(driver.getTitle().equals("Google"))
	{
	test.log(LogStatus.PASS, "Navigated to the specified URL");
	}
	else
	{
	test.log(LogStatus.FAIL, "Test Failed");
	}
	}
	@AfterClass
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}

}

