package org.acdigital.hdd.p_reservation.ui.ac_hdd_preservation_poc.util;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	public static WebDriver driver;
	
	public static void implicitWait(WebDriver driver,By by) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void explicitWait(WebDriver driver,By by) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		driver.findElement(by).click();
	}
	public static void explicitWaitForElementpresence(WebDriver driver,By by) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
		driver.findElement(by).click();
	}
	public static void explicitWaitForPresenceOfAllElements(WebDriver driver,By by) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
		driver.findElement(by).click();
	}
	public static void scrollDown(WebDriver driver,By by) {
		
	}
	public static void scrollUp(WebDriver driver,By by) {
		
	}
	public static void scrollToElement(WebDriver driver,By by) {
		
	}
	public static void sendKeys(WebDriver driver,By by,String value) {
		driver.findElement(by).sendKeys(value);
	}
	public static void click(WebDriver driver,By by) {
		driver.findElement(by).click();
	} 
	public static void waitForElement(WebDriver driver,By by) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		for(int i=0;i<3;i++) {
		driver.findElement(by).isDisplayed();
		}
	}
	public static void waitForSelect(WebDriver driver,By by) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		for(int i=0;i<3;i++) {
		driver.findElement(by).isSelected();
		}
	}
	public static void waitForEnable(WebDriver driver,By by) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		for(int i=0;i<3;i++) {
		driver.findElement(by).isEnabled();
		}
	}

	/*
	 * public static void screenShotOnTestFail(WebDriver driver,By by) { FileUtils
	 * fis = new FileUtils(TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 * //copy // ssOnFail = ("User.dir") + "//ac-hdd-ui-poc//test-output//ssOnFail"
	 * ;
	 * 
	 * }
	 */
	public static void accessingExcels(WebDriver driver,By by) {
		
	}
	public static void sendingEmails(WebDriver driver,By by) {
		
	}
	
	
	
	
}
