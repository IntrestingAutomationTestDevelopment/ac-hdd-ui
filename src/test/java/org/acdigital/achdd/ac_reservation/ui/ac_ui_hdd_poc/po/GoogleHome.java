package org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po;

import java.util.concurrent.TimeUnit;

import org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.selenium.TestWrapper;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GoogleHome extends TestWrapper{
	public static void initializeSearchEngine() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.google.com");
	} 

	@BeforeMethod
	public void setUp() {
		setup();
	}

	@AfterMethod
	public void teardown() {
		/*
		 * if(ITestResult.FAILURE==result.getStatus()){ try{ // To create reference of
		 * TakesScreenshot TakesScreenshot screenshot=(TakesScreenshot)driver; // Call
		 * method to capture screenshot File
		 * src=screenshot.getScreenshotAs(OutputType.FILE); // Copy files to specific
		 * location // result.getName() will return name of test case so that screenshot
		 * name will be same as test case name FileUtils.copyFile(src, new
		 * File("D:\\"+result.getName()+".png"));
		 * System.out.println("Successfully captured a screenshot"); }catch (Exception
		 * e){ System.out.println("Exception while taking screenshot "+e.getMessage());
		 * }
		 * 
		 * 
		 * }
		 */
		tearDown();
	}

}
