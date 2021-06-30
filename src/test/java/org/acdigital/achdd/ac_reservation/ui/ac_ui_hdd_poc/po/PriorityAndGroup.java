package org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class PriorityAndGroup {
	WebDriver driver;
	@BeforeTest
	public void qaEngineer() {
		 driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/chromedriver.exe");
	}
	@AfterTest
	public void qaEngineer2() {
		driver.quit();
	}

}
