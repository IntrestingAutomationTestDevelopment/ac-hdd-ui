package org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.io.File;
import java.io.IOException;

import org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.selenium.TestWrapper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExtentReports1 extends TestWrapper {
	
	public static ExtentTest test;
	public static ExtentReports report;
	@BeforeClass
	public static void startTest()
	{
	report = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReportResults.html");
	test = report.startTest("ExtentReports1Test");
	}
	
	
	@AfterClass
	public static void endTest()
	{
	report.endTest(test);
	}
	public static void testClassMethodSnippet(WebDriver driver) throws IOException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/vendor/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.google.co.in");
		 if(driver.getTitle().equals("Google")) { test.log(LogStatus.PASS,"Navigated to the specified URL"); 
		 } else { 
			 //test.log(LogStatus.FAIL,"Test Failed"); 
				test.log(LogStatus.FAIL,test.addScreenCapture(capture(driver))+ "Test Failed");

		 } 
	}
	public static String capture(WebDriver driver) throws IOException {
	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File Dest = new File("src/../BStackImages/" + System.currentTimeMillis()
	+ ".png");
	String errflpath = Dest.getAbsolutePath();
	FileUtils.copyFile(scrFile, Dest);
	return errflpath;
	}
	
	  @Test public void runReports() throws Exception{
	  
	  testClassMethodSnippet(driver); }
	 
}

