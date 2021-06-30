package org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.selenium;

import java.io.File;

import org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po.Config;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.ITestResult;

public class TestWrapper implements Config {

    protected static WebDriver driver;
    protected ChromeOptions options;
    public void setup() {
        if (browser.equals("firefox"))
        {
            driver = new FirefoxDriver();
        }
        else if (browser.equals("chrome"))
        {
            options = new ChromeOptions();

            if (System.getProperty("os.name").toLowerCase().equals("linux"))
            {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/vendor/linux-chromedriver");
                options.addArguments("headless");
                options.addArguments("no-sandbox");
            }
            else
            {
                options.addArguments("start-maximized");

                if (System.getProperty("os.name").toLowerCase().equals("mac os x"))
                {
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/vendor/mac-chromedriver");
                }
                else
                {
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/vendor/chromedriver.exe");
                    /**
                     * POC here
                     */
                    options.addArguments("start-maximized");
                    options.addArguments("--test-type:Sanity/Regression Suite");
                    options.addArguments("--disable-extensions");
                    options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                    options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.DISMISS);
                }
            }
            driver = new ChromeDriver(options);
        }
    }

    public void tearDown() {
        driver.quit();
    }
    
	/*
	 * public void screenShotOnTestFail(ITestResult result){ //using
	 * ITestResult.FAILURE is equals to result.getStatus then it enter into if
	 * condition if(ITestResult.FAILURE==result.getStatus()){ try{ // To create
	 * reference of TakesScreenshot TakesScreenshot
	 * screenshot=(TakesScreenshot)driver; // Call method to capture screenshot File
	 * src=screenshot.getScreenshotAs(OutputType.FILE); // Copy files to specific
	 * location // result.getName() will return name of test case so that screenshot
	 * name will be same as test case name FileUtils.copyFile(src, new
	 * File("D:\\"+result.getName()+".png"));
	 * System.out.println("Successfully captured a screenshot"); }catch (Exception
	 * e){ System.out.println("Exception while taking screenshot "+e.getMessage());
	 * } }
	 * 
	 * }
	 */
    /**
     * 
     * @param driver
     * @return
     * @throws IOException
   
    test.log(LogStatus.FAIL,test.addScreenCapture(capture(driver))+ "Test Failed");
    public static String capture(WebDriver driver) throws IOException {
    	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    	File Dest = new File("src/../BStackImages/" + System.currentTimeMillis()
    	+ ".png");
    	String errflpath = Dest.getAbsolutePath();
    	FileUtils.copyFile(scrFile, Dest);
    	return errflpath;
    	}
    	  */
}