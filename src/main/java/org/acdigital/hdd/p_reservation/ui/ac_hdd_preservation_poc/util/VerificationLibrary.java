package org.acdigital.hdd.p_reservation.ui.ac_hdd_preservation_poc.util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

// TODO: Auto-generated Javadoc
/**
 * The Class VerificationLibrary.
 */
public class VerificationLibrary {
	/**
	 * Verify element hex color.
	 *
	 * @param expectedColor - The expected color in hex format
	 * @param element - The Web Element
	 * 
	 * <pre>
	 * {@code
	 * Example:
	 * 		WebElement ele = driver.findElement(By.id(""));
	 * 		VerificationLibrary.verifyElementColor("#ffffff",ele);
	 * }
	 * </pre>
	 */
	public static void verifyElementColor(String expectedColor, WebElement element){
		Assert.assertEquals(CssLibrary.getElementColorAsHex(element), expectedColor);
	}
	
	/**
	 * Verify element background color.
	 *
	 * @param expectedColor - The expected color in hex format
	 * @param element - The Web Element
	 */
	public static void verifyElementBackgroundColor(String expectedColor, WebElement element){
		Assert.assertEquals(CssLibrary.getElementColorAsHex(element), expectedColor);
	}
	
	/**
	 * Verify element border color.
	 *
	 * @param expectedColor - The expected border color in hex format
	 * @param element - The Web Element
	 */
	public static void verifyElementBorderColor(String expectedColor, WebElement element){
		Assert.assertEquals(CssLibrary.getElementBorderColorAsHex(element), expectedColor);
	}
		
	/**
	 * Verify element font size.
	 *
	 * @param expectedSize - The expected font size
	 * @param element - The Web Element
	 */
	public static void verifyElementFontSize(String expectedSize, WebElement element){
		Assert.assertEquals(CssLibrary.getElementFontSize(element), expectedSize);
	}
	
	/**
	 * Verify element font family.
	 *
	 * @param expectedFontFamily - The expected font family
	 * @param element - The Web Element
	 */
	public static void verifyElementFontFamily(String expectedFontFamily, WebElement element){
		Assert.assertEquals(CssLibrary.getElementFontFamily(element), expectedFontFamily);
	}
	
	
	/**
	 * Verify presence of text.
	 *
	 * @param expectedText - The expected text
	 * @param element - The Web Element
	 */
	public static void verifyTextPresent(String expectedText, WebElement element){
		Assert.assertEquals(element.getText(), expectedText);
	}
	
	
	/**
	 * Verify element present.
	 *
	 * @param driver - WebDriver
	 * @param locatorType - The element locator (id,name,linkText,className,xpath,cssSelector,tagName,partialLinkText)
	 * @param locatorValue - The locator value
	 */
	public static void verifyElementPresent(WebDriver driver, String locatorType, String locatorValue){
		List<WebElement> elements = null;
		if(locatorType.equals("id")){
			elements=driver.findElements(By.id(locatorValue));
		}
		else if(locatorType.equals("name")){
			elements=driver.findElements(By.name(locatorValue));
		}
		else if(locatorType.equals("linkText")){
			elements=driver.findElements(By.linkText(locatorValue));
		}
		else if(locatorType.equals("className")){
			elements=driver.findElements(By.className(locatorValue));
		}
		else if(locatorType.equals("xpath")){
			elements=driver.findElements(By.xpath(locatorValue));
		}
		else if(locatorType.equals("cssSelector")){
			elements=driver.findElements(By.cssSelector(locatorValue));
		}
		else if(locatorType.equals("tagName")){
			elements=driver.findElements(By.tagName(locatorValue));
		}
		else if(locatorType.equals("partialLinkText")){
			elements=driver.findElements(By.partialLinkText(locatorValue));
		}
		else{
			System.out.println("Wrong locator type");
		}
		
		Assert.assertEquals(elements.size(),1);
	}
	
	/**
	 * Verify checkbox is selected.
	 *
	 * @param element - The Web Element
	 */
	public static void verifyCheckboxSelected(WebElement element){
		Assert.assertEquals(element.isSelected(), true);
	}
	
	/**
	 * Verify radio button selected.
	 *
	 * @param element - The Web Element
	 */
	public static void verifyRadiobuttonSelected(WebElement element){
		Assert.assertEquals(element.isSelected(), true);
	}
	
	/**
	 * Verify element enabled.
	 *
	 * @param element - The Web Element
	 */
	public static void verifyElementEnabled(WebElement element){
		Assert.assertEquals(element.isEnabled(), true);
	}
	
	/**
	 * Verify element displayed.
	 *
	 * @param element - The Web Element
	 */
	public static void verifyElementDisplayed(WebElement element){
		Assert.assertEquals(element.isDisplayed(), true);
	}
	
	/**
	 * Verify image tooltip.
	 *
	 * @param image The image as WebElement
	 * @param expectedTitle - The expected title
	 */
	public static void verifyImageTooltip(WebElement image, String expectedTitle){		
		Assert.assertEquals(image.getAttribute("title"),expectedTitle);
	}
	
	/**
	 * Verify image loaded.
	 *
	 * @param driver -The driver
	 * @param image -The image
	 */
	public static void verifyImageLoaded(WebDriver driver, WebElement image){
		Assert.assertTrue(JavascriptLibrary.getImageLoadStatus(driver, image));
	}
	
	/**
	 * Verify alert present.
	 *
	 * @param driver -The driver
	 */
	public static void verifyAlertPresent(WebDriver driver){
		try {
			driver.switchTo().alert();
			Assert.assertTrue(true,"Alert is present");
		} catch (Exception e) {
			Assert.fail("Alert not present");
		}
	}
	
	/**
	 * Verify cookie by name.
	 *
	 * @param driver -The driver
	 * @param cookieName the cookie name
	 */
	public static void verifyCookieByName(WebDriver driver, String cookieName){		
		Cookie cookie = CookieLibrary.getCookieByName(driver, cookieName);
		if(cookie!=null){
			Assert.assertTrue(true,"Cookie:"+cookieName+" is present");
		}
		else{
			Assert.fail("Cookie:"+cookieName+" not present");
		}
	}
	
	/**
	 * Verify cookie deleted by cookie name.
	 *
	 * @param driver -The driver
	 * @param cookieName the cookie name
	 */
	public static void verifyCookieDeletedByName(WebDriver driver, String cookieName){
		Cookie cookie = CookieLibrary.getCookieByName(driver, cookieName);		
		if(cookie==null){
			Assert.assertTrue(true,"Cookie:"+cookieName+" is Deleted");
		}
		else{
			Assert.fail("Cookie:"+cookieName+" failed to delete");
		}
	}
	
	/**
	 * Verify element height.
	 *
	 * @param element - The Web Element
	 * @param expectedHeight -The expected height as integer
	 */
	public static void verifyElementHeight(WebElement element, int expectedHeight){
		Assert.assertEquals(CssLibrary.getElementHeight(element),expectedHeight);		
	}
	
	/**
	 * Verify element width.
	 *
	 * @param element - The Web Element
	 * @param expectedWidth -The expected width as integer
	 */
	public static void verifyElementWidth(WebElement element, int expectedWidth){
		Assert.assertEquals(CssLibrary.getElementWidth(element),expectedWidth);		
	}
	
	/**
	 * Verify element position. This depends on the resolution of the system
	 *
	 * @param element - The Web Element
	 * @param xpos the Expected x position of the element
	 * @param ypos the Expected y position of the element.
	 */
	public static void verifyElementPosition(WebElement element, int xpos, int ypos){
		int x = CssLibrary.getElementLeftPosition(element);
		int y = CssLibrary.getElementTopPosition(element);		
		if(x==xpos && y==ypos){
			Assert.assertTrue(true, "Element Position matches");
		}
		else{
			Assert.fail("Position does not match. Expected xpos:"+xpos+" and expected ypos:"+ypos+" does not match Actual xpos:"+x+" and Actual ypos:"+y);
		}		
	}
	
	/**
	 * Verify page URL.
	 *
	 * @param driver -The driver
	 * @param expectedUrl the expected URL of the page
	 */
	public static void verifyPageUrl(WebDriver driver, String expectedUrl){
		Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
	}
	
	
	/**
	 * Verify broken link. Verify if the given link url is broken
	 *
	 * @param url -The url as String
	 */
	public static void verifyBrokenLink(String url){
		URL u = null;
		String response = ""; 
		try {
			u = new URL(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		HttpURLConnection connection;
		try {
			connection = (HttpURLConnection) u.openConnection();
			connection.connect();
		    response = connection.getResponseMessage();	        
		    connection.disconnect();
		    Assert.assertEquals(response, "OK", "Verifying link validity:");
		} catch (IOException e) {

		}				
	}	
}









