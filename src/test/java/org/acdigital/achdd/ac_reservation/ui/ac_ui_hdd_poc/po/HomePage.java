package org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.selenium.TestWrapper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.LogStatus;

public class HomePage extends TestWrapper {
//s	public static WebDriver driver;

	// TestWrapper testWrapper = new TestWrapper();
	public static By username = By.xpath(".//input[@id='user_login']");
	public static By password = By.xpath(".//input[@id='user_pass1']");//change
	public static By clickusnpwd = By.xpath(".//a[@class='wpaas-sso-login-toggle']");
	public static By loginbtn = By.xpath(".//input[@id='wp-submit']");

	
	  public static void loginFunctionality(WebDriver driver) {
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://www.kpmanpowerservices.in/wp-admin");	  
		
		  driver.findElement(clickusnpwd).click();
		  driver.findElement(username).sendKeys("351937985");
		  driver.findElement(password).sendKeys("kpadmin9vandana");
		  driver.findElement(loginbtn).click();
		 
	  
	  }
	 

	@BeforeMethod
	public void setUp() {
		setup();
	}

	@AfterMethod
	public void teardown(ITestResult result) {
		screenShotOnTestFail(result);
		tearDown();

}
	public static  void screenShotOnTestFail(ITestResult result){
		if(ITestResult.FAILURE==result.getStatus()){
			try{
				TakesScreenshot screenshot=(TakesScreenshot)driver;
				File src=screenshot.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("D:\\"+result.getName()+".png"));
				System.out.println("Successfully captured a screenshot");
			}catch (Exception e){
				System.out.println("Exception while taking screenshot "+e.getMessage());
			} 
		
		
	}
	}
}

