package org.acdigital.hdd.p_reservation.ui.ac_hdd_preservation_poc.util;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


// TODO: Auto-generated Javadoc
/**
 * The Class Lib.
 */
public class Lib{
	
	/**
	 * Test method.
	 *
	 * @throws InterruptedException the interrupted exception
	 */
	@Test
	public void testMethod() throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//System.out.println(JavascriptLibrary.getJqueryLoadStatus(driver));
		
//		WebElement element1 = driver.findElement(By.id("username"));
//		WebElement element2 = driver.findElement(By.name("pwd"));
//		JavascriptLibrary.javascriptType(driver, element1, "admin", element2);
		
		//--------------------------------------------------------------------------
		//Login
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		//what this block of code does
		driver.findElement(By.xpath("//div[@class='popup_menu_icon settings_icon']")).click();
		driver.findElement(By.linkText("Types of Work")).click();
		
		String link1Xpath = "//a[text()='Automation']";
		String link2xpath = "//a[contains(text(),'delete')]";
		WebElement ele = DynamicElementLibrary.getLinkNearLink(driver, link1Xpath, link2xpath);
		ele.click();
		
//		driver.findElement(By.xpath("//div[@class='popup_menu_icon settings_icon']")).click();
//		driver.findElement(By.linkText("Billing Types")).click();
//		
//		WebElement table = driver.findElement(By.id("billingTypesTable"));
//		List<WebElement> rows = WebtableLibrary.getAllBodyRowsFromTable(table);
//		System.out.println(rows.size());
//		
//		List<WebElement> cells = WebtableLibrary.getColumnCellsFromTableByColumnHeader(table,"Type");
//		for(int i=0;i<cells.size();i++){
//			System.out.println(cells.get(i).getText());
//		}
		
//		
////		String xpth1 = "//a[contains(text(),'Lenovo A6000 (Black, 8 GB)')]";
////		String xpth2 = "//span[@class='fk-font-17 fk-bold']";
//		
//		//Thread.sleep(10000);
//		//WebElement ele = DynamicElementLibrary.getDynamicElement(driver, xpth1, xpth2);
//		//ele.click();
//		driver.findElement(By.cssSelector("a[href='/tasks/otasklist.do']")).click();
//		driver.findElement(By.linkText("Projects & Customers")).click();
//		DynamicElementLibrary.getCheckboxNearLink(driver,"//a[contains(text(),'Media Agency')]").click();
		//System.out.println(ele.getText());
		
//		WebElement ele1 = driver.findElement(By.linkText("Automation"));
//		WebElement ele2 = driver.findElement(By.xpath("//a[contains(text(),'delete')]"));
		
		
		/*
		String knownText = "testing";
		int cellNumber=3;
		String txt = driver.findElement(By.id("billingTypesTable").xpath(".//tr[descendant::*[contains(text(),'"+knownText+"')]]/td["+cellNumber+"]")).getText();
		
		//String txt = table.findElement(By.xpath(".//tr[descendant::*[contains(text(),'"+knownText+"')]]/td["+cellNumber+"]")).getText();
		System.out.println(txt);
		
		
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://www.services.irctc.co.in/");
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		WebElement ele = driver.findElement(By.id("button"));
//		VerificationLibrary.verifyElementPosition(ele,201,283);
		
//		String url="https://gmail.com";
//		VerificationLibrary.verifyBrokenLink(url);
		
		//ele.click();
		//VerificationLibrary.verifyAlertPresent(driver);
//		Set<Cookie> allCookies = driver.manage().getCookies();
//		for(Cookie cookie:allCookies){
//			System.out.println(cookie);
//		}
//		
//		driver.manage().deleteCookieNamed("__utmz");
//		allCookies = driver.manage().getCookies();
//		for(Cookie cookie:allCookies){
//			System.out.println(cookie);
//		}
		
//		CookieLibrary.deleteCookieByName(driver, "__utmz");
//		VerificationLibrary.verifyCookieDeletedByName(driver, "__utma");
//		CookieLibrary.get
		
//		Cookie name = new Cookie("mycookie", "123456789123");
//		driver.manage().addCookie(name);
//		VerificationLibrary.verifyCookieByName(driver, "mycookie");
		
		
		//JavascriptLibrary.javascriptScrollWindow(driver,0,1000);
		//ele.sendKeys("19/06/2015");
		//JavascriptLibrary.javascriptType(driver, ele, "19/06/2015");
		//VerificationLibrary.verifyImageLoaded(driver, ele);
		//JavascriptLibrary.javascriptClickElement(driver, ele);
		
		
		/*
		driver.get("http://www.flipkart.com/offers?otracker=hp_nmenu_offer-zone");

		WebElement ele = driver.findElement(By.className("pu-offer"));
		String val = ele.getAttribute("alt");
		if(val!=null){
			System.out.println("hellooooo");
		}
		else{
			System.out.println("h");
		}
		//System.out.println(val);
		/*
		System.out.println(ele.getSize().getHeight());
		System.out.println(ele.getSize().getWidth());
		
		//getElementColorAsHex(ele);
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		VerificationLibrary.verifyElementColor("#ffffff", ele);
		VerificationLibrary.verifyElementBackgroundColor("#ffffff", ele);
		VerificationLibrary.verifyElementFontFamily("Arial,\"Helvetica Neue\",Helvetica,sans-serif", ele);
		
		WebElement ele1 = driver.findElement(By.className("product-unit"));
		VerificationLibrary.verifyElementBorderColor("#db2b2b", ele1);
		
		VerificationLibrary.verifyElementFontSize("13px", ele1);
		*/
	}
		
	
	
	/**
	 * Switch to window by using the title of the window/browser.
	 * 
	 * @param title - The browser title
	 * @param driver - WebDriver
	 */
	public void switchToWindow(String title, WebDriver driver){
		boolean flag=false;
		Set<String> wndHandles = driver.getWindowHandles();
		Iterator<String> it = wndHandles.iterator();
		while(it.hasNext()){
			driver.switchTo().window(it.next());
			if(driver.getTitle().equals(title)){
				System.out.println("Switched to window with the title "+title);
				flag=true;
				break;
			}
		}
		if(!flag){
			System.out.println("No window matching the title "+title);
		}
	}
	
	/**
	 * Switch to window by checking for the presence of a particular element on that window.
	 *
	 * @param locator - The element locator (id,name,linkText,className,xpath,cssSelector,tagName,partialLinkText)
	 * @param locatorVal - The locator value
	 * @param driver - WebDriver
	 */
	public void switchToWindow(String locator, String locatorVal, WebDriver driver){
		boolean flag=false;
		Set<String> wndHandles = driver.getWindowHandles();
		Iterator<String> it = wndHandles.iterator();
		List<WebElement> elements = null;
		if(locator.equals("id")){
			elements=driver.findElements(By.id(locatorVal));
		}
		else if(locator.equals("name")){
			elements=driver.findElements(By.name(locatorVal));
		}
		else if(locator.equals("linkText")){
			elements=driver.findElements(By.linkText(locatorVal));
		}
		else if(locator.equals("className")){
			elements=driver.findElements(By.className(locatorVal));
		}
		else if(locator.equals("xpath")){
			elements=driver.findElements(By.xpath(locatorVal));
		}
		else if(locator.equals("cssSelector")){
			elements=driver.findElements(By.cssSelector(locatorVal));
		}
		else if(locator.equals("tagName")){
			elements=driver.findElements(By.tagName(locatorVal));
		}
		else if(locator.equals("partialLinkText")){
			elements=driver.findElements(By.partialLinkText(locatorVal));
		}
		else{
			System.out.println("Wrong locator type");
		}
		while(it.hasNext()){
			driver.switchTo().window(it.next());
			if(elements.size()>0){
				System.out.println("Switched to window with the element "+locatorVal);
				flag=true;
				break;
			}			
		}
		if(!flag){
			System.out.println("No window matching the title "+locatorVal);
		}
	}
}
