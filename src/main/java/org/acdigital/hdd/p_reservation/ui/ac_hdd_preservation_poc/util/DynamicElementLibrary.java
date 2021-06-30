package org.acdigital.hdd.p_reservation.ui.ac_hdd_preservation_poc.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// TODO: Auto-generated Javadoc
/**
 * The Class DynamicElementLibrary.
 */
public class DynamicElementLibrary {
	
	/**
	 * Gets the dynamic element.
	 *
	 * @param driver the driver
	 * @param independentElementXpath - Independent element xpath
	 * @param dependentElementXpath - Dependent element xpath
	 * @return the dynamic element
	 */
	public static WebElement getDynamicElement(WebDriver driver, String independentElementXpath, String dependentElementXpath){
		WebElement commonParent = JavascriptLibrary.getCommonParent(driver, independentElementXpath, dependentElementXpath);
		WebElement dynamicElement = commonParent.findElement(By.xpath("."+dependentElementXpath));
		return dynamicElement;			
		
	}
	
	/**
	 * Gets the checkbox near link.
	 *
	 * @param driver the driver
	 * @param linkXpath the link xpath
	 * @return the checkbox near link
	 */
	public static WebElement getCheckboxNearLink(WebDriver driver,String linkXpath){
		String dependentElementXpath = "//input[@type='checkbox']";
		WebElement commonParent=null;
		if(JavascriptLibrary.getJqueryLoadStatus(driver)){
			commonParent = JavascriptLibrary.getCommonParentCheckboxJquery(driver, linkXpath);
		}
		else{
			commonParent = JavascriptLibrary.getCommonParent(driver, linkXpath,dependentElementXpath);
		}
		WebElement dynamicElement = commonParent.findElement(By.xpath("."+dependentElementXpath));
		return dynamicElement;		
	}
	
	/**
	 * Gets the radiobutton near link.
	 *
	 * @param driver the driver
	 * @param linkXpath the link xpath
	 * @return the radiobutton near link
	 */
	public static WebElement getRadiobuttonNearLink(WebDriver driver,String linkXpath){
		String dependentElementXpath = "//input[@type='radio']";
		WebElement commonParent=null;
		if(JavascriptLibrary.getJqueryLoadStatus(driver)){
			commonParent = JavascriptLibrary.getCommonParentRadioJquery(driver, linkXpath);
		}
		else{
			commonParent = JavascriptLibrary.getCommonParent(driver, linkXpath,dependentElementXpath);
		}			
		WebElement dynamicElement = commonParent.findElement(By.xpath("."+dependentElementXpath));
		return dynamicElement;		
	}
	
	/**
	 * Gets the link near link.
	 *
	 * @param driver the driver
	 * @param link1Xpath the link1 xpath
	 * @param link2xpath the link2xpath
	 * @return the link near link
	 */
	public static WebElement getLinkNearLink(WebDriver driver,String link1Xpath,String link2xpath){
		String dependentElementXpath = link2xpath;
		WebElement commonParent = JavascriptLibrary.getCommonParent(driver, link1Xpath, dependentElementXpath);
		WebElement dynamicElement = commonParent.findElement(By.xpath("."+dependentElementXpath));
		return dynamicElement;		
	}
	
	/**
	 * Gets the textbox near link.
	 *
	 * @param driver the driver
	 * @param linkXpath the link xpath
	 * @return the textbox near link
	 */
	public static WebElement getTextboxNearLink(WebDriver driver,String linkXpath){
		String dependentElementXpath = "//input[@type='text']";
		WebElement commonParent = JavascriptLibrary.getCommonParent(driver, linkXpath, dependentElementXpath);
		WebElement dynamicElement = commonParent.findElement(By.xpath("."+dependentElementXpath));
		return dynamicElement;		
	}
	
	/**
	 * Gets the textbox near label.
	 *
	 * @param driver the driver
	 * @param label the label
	 * @return the textbox near label
	 */
	public static WebElement getTextboxNearLabel(WebDriver driver,String label){
		String dependentElementXpath = "//input[@type='text']";
		String independentElementXpath = "//*[text()='"+label+"']";
		WebElement commonParent = JavascriptLibrary.getCommonParent(driver, independentElementXpath, dependentElementXpath);
		WebElement dynamicElement = commonParent.findElement(By.xpath("."+dependentElementXpath));
		return dynamicElement;		
	}
	
	/**
	 * Gets the checkbox near label.
	 *
	 * @param driver the driver
	 * @param label the label
	 * @return the checkbox near label
	 */
	public static WebElement getCheckboxNearLabel(WebDriver driver,String label){
		String dependentElementXpath = "//input[@type='checkbox']";
		String independentElementXpath = "//*[text()='"+label+"']";
		WebElement commonParent = JavascriptLibrary.getCommonParentCheckboxJquery(driver, independentElementXpath);
		WebElement dynamicElement = commonParent.findElement(By.xpath("."+dependentElementXpath));
		return dynamicElement;		
	}
	
	/**
	 * Gets the radiobutton near label.
	 *
	 * @param driver the driver
	 * @param label the label
	 * @return the radiobutton near label
	 */
	public static WebElement getRadiobuttonNearLabel(WebDriver driver,String label){
		String dependentElementXpath = "//input[@type='radio']";
		String independentElementXpath = "//*[text()='"+label+"']";
		WebElement commonParent = JavascriptLibrary.getCommonParent(driver, independentElementXpath, dependentElementXpath);
		WebElement dynamicElement = commonParent.findElement(By.xpath("."+dependentElementXpath));
		return dynamicElement;		
	}
	
}








