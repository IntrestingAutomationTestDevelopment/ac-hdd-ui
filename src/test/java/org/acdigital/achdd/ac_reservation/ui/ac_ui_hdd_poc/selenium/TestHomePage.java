package org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.selenium;
import org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po.Action.*;
import org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage{
	//HomePage hPage = new HomePage();
	//WebDriver driver;
	//@DataProvider("TestData.xlsx")
	@Test
	public static void qa(WebDriver driver) {
		loginFunctionality(driver);
	}
}
