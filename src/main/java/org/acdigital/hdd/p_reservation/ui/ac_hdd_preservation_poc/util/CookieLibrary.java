package org.acdigital.hdd.p_reservation.ui.ac_hdd_preservation_poc.util;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

// TODO: Auto-generated Javadoc
/**
 * The Class CookieLibrary.
 */
public class CookieLibrary {

	/**
	 * Gets the cookie by name.
	 *
	 * @param driver -The driver
	 * @param cookieName -The cookie name
	 * @return the cookie
	 */
	public static Cookie getCookieByName(WebDriver driver, String cookieName){
		return driver.manage().getCookieNamed(cookieName);
	}
	
	/**
	 * Delete cookie by name.
	 *
	 * @param driver -The driver
	 * @param cookieName -The cookie name
	 */
	public static void deleteCookieByName(WebDriver driver, String cookieName){
		driver.manage().deleteCookieNamed(cookieName);
	}
	
	/**
	 * Delete all cookies.
	 *
	 * @param driver -The driver
	 */
	public static void deleteAllCookies(WebDriver driver){
		driver.manage().deleteAllCookies();
	}
	
	/**
	 * Gets the all cookies.
	 *
	 * @param driver -The driver
	 * @return all cookies as Set&lt;Cookie&gt;
	 */
	public static Set<Cookie> getAllCookies(WebDriver driver){
		return driver.manage().getCookies();
	}
	
	
}
