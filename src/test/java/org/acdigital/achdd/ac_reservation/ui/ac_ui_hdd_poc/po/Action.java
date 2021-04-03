package org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po; 
	import static org.junit.Assert.fail;

import java.util.List;
	import java.util.Random;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.NoAlertPresentException;
	import org.openqa.selenium.NoSuchElementException;
	import org.openqa.selenium.StaleElementReferenceException;
	import org.openqa.selenium.TimeoutException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	

	public class Action {
		public static WebDriver driver;
		static int maxWaitingTime = 120;
		private static WebDriverWait wait;
		public static void waitFor(WebDriver driver, By by) {

			WebDriverWait wdw = new WebDriverWait(driver,60);
			wdw.until(ExpectedConditions.presenceOfElementLocated(by));
			waitTill();
		}
		 
		public static void waitForVisible(WebDriver driver, By by) {
			WebElement elm = getWebElement(driver, by);
			WebDriverWait wdw = new WebDriverWait(driver, maxWaitingTime);
			wdw.until(ExpectedConditions.visibilityOf(elm));
		}
		
		public static void scrollDown(WebDriver driver, String size) {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0," + size + ")", "");
	
		}

		public static WebElement getWebElement(WebDriver driver, By by) {
			StackTraceElement caller = new Throwable().getStackTrace()[1];
			@SuppressWarnings("unused")
			String callerInfo = caller.getClassName() + " "
					+ caller.getMethodName() + " line " + caller.getLineNumber();
			WebElement ele = driver.findElement(by);
			return ele;
		}

		public static List<WebElement> getWebElements(WebDriver driver, By by) {

			List<WebElement> lis = driver.findElements(by);
			return lis;
		}

		public static boolean verifyElementPresent(WebDriver driver, By by) {
			try {
				if (getWebElement(driver, by).isDisplayed()) {
					return true;
				} else {
					return false;
				}
			} catch (Exception e) {
				return false;
			}
		}
		
		public static boolean verifyElementPresentOnPageSource(WebDriver driver,
				By by) {
			try {
				getWebElement(driver, by);
				return true;
			} catch (Exception e) {
				return false;
			}
		}

		public static boolean verifyTextPresent(WebDriver driver, By by, String text) {
			try {
				if (getWebElement(driver, by) == null) {
					return false;
				} else {
					if (getWebElement(driver, by).getText().contains(text)) {
						return true;
					}
				}
				return false;
			} catch (Exception e) {
				return false;
			}
		}

		public static boolean verifyElementIsEnabled(WebDriver driver, By by) {
			return getWebElement(driver, by).isEnabled();
		}

		public static void click(WebDriver driver, By by) {
			try {
				getWebElement(driver, by).click();
			} catch (Exception e) {
				//throw e;
				
			}
		}

		public static void newclick(WebDriver driver, By by) throws Exception {
			try {
				getWebElement(driver, by).click();
			} catch (NoSuchElementException e) {
				throw e;
			} catch (StaleElementReferenceException ex) {
				System.out.println("Stale Element Exception occured");
				for (int i = 0; i < 20; i++) {
					if (verifyElementPresent(driver, by)) {
						System.out.println("i value " + i);
						driver.findElement(by).click();
						waitTill(500);
						break;
					} else {
						Thread.sleep(1000);
					}
				}
			}
		}

		public static void click(WebDriver driver, By by, String info)
				throws Exception {
			click(driver, by);
		}

		public static String getText(WebDriver driver, By by) throws Exception {
			try {
				return getWebElement(driver, by).getText();
			} catch (Exception e) {
				throw e;
			}
		}

		public static String getAttribute(WebDriver driver, By by, String attribute)
				throws Exception {
			try {
				return getWebElement(driver, by).getAttribute(attribute);
			} catch (Exception e) {
				throw e;
			}
		}

		public String getCssValue(WebDriver driver, By by, String cssAttribute)
				throws Exception {
			String cssValue;
			try {
				cssValue = getWebElement(driver, by).getCssValue(cssAttribute);
			} catch (Exception e) {
				throw e;
			}
			return cssValue;
		}

		public static void clear(WebDriver driver, By by) throws Exception {
			try {
				getWebElement(driver, by).clear();
			} catch (Exception e) {
				throw e;
			}
		}

		public static void sendKeys(WebDriver driver, By by, String data)
				throws Exception {
			try {
				getWebElement(driver, by).sendKeys(data);
			} catch (Exception e) {
				throw e;
			}
		}

		public static void get(WebDriver driver, String url) {
			driver.get(url);
		}

		public static void refreshPage(WebDriver driver) {
			driver.navigate().refresh();
		}

		public static void browserBack(WebDriver driver) {
			driver.navigate().back();
		}

		public static void browserForward(WebDriver driver) {
			driver.navigate().forward();
		}

		protected static void executeJavaScript(WebDriver driver,
				String javaScriptFunction) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(javaScriptFunction);
		}

		/**
		 *
		 * @desc: click on ok button
		 */
		public static void clickAlertOkButton(WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}

		/**
		 * @Desc : To click the alert ok button and to return the message text in
		 * the alert box
		 */
		public static String verifyTextInAlertBoxAndClickOnOkButton(WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			alert.accept();
			return text;
		}

		/**
		 * @Desc : To verify whether the Alert is Present or not and its return true
		 * when alert message is displayed and return false when alert message is
		 * not displayed
		 */
		public static boolean isAlertPresent(WebDriver driver) {
			try {
				driver.switchTo().alert();
				return true;
			} catch (NoAlertPresentException Ex) {
				return false;
			}
		}

		/**
		 * 
		 * @desc: click on cancel button
		 */
		public static void clickAlertCancelButton(WebDriver driver) {
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}

		public static boolean clickAlertCancelButton(WebDriver driver,
				String alertString) {
			Alert alert = driver.switchTo().alert();
			if (!alert.getText().contains(alertString)) {
				return false;
			}
			alert.dismiss();
			return true;
		}

		protected static void clickCheckBox(WebDriver driver, By by)
				throws Exception {
			if (!getWebElement(driver, by).isSelected()) {
				click(driver, by);
			}
		}

		public static void doubleClick(WebDriver driver, By by) {
			
			((JavascriptExecutor) driver)
					.executeScript(
							"var evt = document.createEvent('MouseEvents');"
									+ "evt.initMouseEvent('dblclick',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
									+ "arguments[0].dispatchEvent(evt);",
							getWebElement(driver, by));
		}

		protected static void onMouseOver(WebDriver driver, By by) {
			Actions builder = new Actions(driver);
			WebElement menuRegistrar = getWebElement(driver, by);
			builder.moveToElement(menuRegistrar).build().perform();
		}

		public static void mouseOverJavascript(WebDriver driver, By by) {
			WebElement element = getWebElement(driver, by);
			String code = "var fireOnThis = arguments[0];"
					+ "var evObj = document.createEvent('MouseEvents');"
					+ "evObj.initEvent( 'mouseover', true, true );"
					+ "fireOnThis.dispatchEvent(evObj);";
			((JavascriptExecutor) driver).executeScript(code, element);
		}

		public static void selectFromDropDown(WebDriver driver, By by, String option) {
			Select droplist = new Select(getWebElement(driver, by));
			droplist.selectByVisibleText(option);
		}

		public static int getRandomIntwithinRange(int low, int high) {
			Random random = new Random();
			int randomNum = random.nextInt((high - low) + 1) + low;
			return randomNum;
		}
		public static boolean verifyElementPresent1(WebDriver driver, By by) {
			try {
				if (driver.findElement(by).isDisplayed()) {
					return true;
				} else {
					return false;
				}
			} catch (Exception ex) {
				return false;
				
			}
		}

		public static void waitForElement(WebDriver driver, By by) {
			for (int i = 0; i <= 3; i++) {
				if (!verifyElementPresent1(driver, by)) {
					System.out.println("Waiting for element to Visible: : "+by);
					waitTill(3000);
				} else {
					break;
				}
			}
		}

		public static void waitTill(long time) {
			try {
				Thread.sleep(time);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public static void waitTill() {
			waitTill(3000);
		}

		public static void scrollToElement1(WebDriver driver, By by)
				throws Exception {
			WebElement elm = driver.findElement(by);
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView(true);", elm);
		}
		 public static void scrollToElement(WebDriver driver,By element) {
		        if (element == null) System.out.println("Null fail scrolling");
		        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + driver.findElement(element).getLocation().y + ")");
		        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + driver.findElement(element).getLocation().x + ")");

		    }
		public static void waitForEver(WebDriver driver, By by) throws Exception {
			for (int i = 0; i <= 20; i++) {
				if (!verifyElementPresent(driver, by)) {
					System.out.println("waiting for the element " + by);
					waitTill(3000);
				} else {
					break;
				}
			}
		}

			public static void JSClick(WebDriver driver, By by) throws Exception {
			WebElement element = getWebElement(driver, by);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
			}
		
		  public static boolean isClickable(WebDriver driver,WebElement el) 
			{
				try{
					WebDriverWait wait = new WebDriverWait(driver, 6);
					wait.until(ExpectedConditions.elementToBeClickable(el));
					return true;
				}
				catch (Exception e){
					return false;
				}
			}
		  public static void scrollToEnd(WebDriver driver) throws Exception{
		    	JavascriptExecutor js = ((JavascriptExecutor) driver);
		    	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		    	
		    }
		  public static void scrollTo(WebDriver driver, WebElement element) {
		    ((JavascriptExecutor) driver).executeScript(
		            "arguments[0].scrollIntoView();", element);
		}
		 /* public static void waitForpresence(WebDriver driver, WebElement element) {
			  
		 
		  WebDriverWait wait = new WebDriverWait(driver, waitTime);
		  wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		  }*/
}