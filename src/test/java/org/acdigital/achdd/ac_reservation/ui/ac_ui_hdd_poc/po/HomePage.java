package org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po;

import java.sql.Driver;
//import org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po.Action.*;
import org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.selenium.TestWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class HomePage implements Config {
	
	TestWrapper testWrapper = new TestWrapper();
	
	public static By username = By.xpath("");
	public static By password = By.xpath("");
	public static void loginFunctionality(WebDriver driver) {
		//driver.get(baseUrl);
		driver.findElement(username).sendKeys("abhilash1993@outlook.com");
		driver.findElement(password).sendKeys("10AK1A0240");
	}
	//@BeforeSuite
	@BeforeMethod
	public void setUp() {
		testWrapper.setup();
	}
	//@AfterSuite
	@AfterMethod
	public void teardown() {
		testWrapper.tearDown();
	}
}
