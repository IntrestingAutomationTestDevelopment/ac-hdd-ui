package org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.selenium;

import org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWrapper implements Config {

    protected WebDriver driver;
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
                }
            }
            driver = new ChromeDriver(options);
        }
    }

    public void tearDown() {
        driver.quit();
    }

}