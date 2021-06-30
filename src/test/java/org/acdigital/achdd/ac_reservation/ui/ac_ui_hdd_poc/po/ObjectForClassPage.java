package org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ObjectForClassPage {

	private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;
    public void ObjectForClassPage(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, 2);
    }
    public void qatestMethodCheck(String u, String v) {
    	System.out.println("QA Test Method");
    }
    public void qatestMethodCheck2(String u, String v) {
    	System.out.println("QA Test Method2");
        }
    public void qatestMethodCheck3(String u, String v) {
    	System.out.println("QA Test Method3");
    }
}
