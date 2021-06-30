package org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.selenium;
import java.util.concurrent.TimeUnit;

import org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po.HomePage;
import org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po.ExtentReports1.*;

import org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po.Action.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage{
	@DataProvider(name = "sanity")
	@Test
	public static void qa() throws Exception{
		
		
		loginFunctionality(driver);
		//runReports(driver);
		
        
	}
	
}
