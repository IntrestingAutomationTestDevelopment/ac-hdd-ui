package org.acdigital.hdd.p_reservation.ui.ac_hdd_preservation_poc.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// TODO: Auto-generated Javadoc
/**
 * The Class WebtableLibrary.
 */
public class WebtableLibrary {

	/**
	 * Gets the header row from table.
	 *
	 * @param table the table
	 * @return the header row from table
	 */
	public static List<WebElement> getHeaderRowFromTable(WebElement table){
		return table.findElements(By.xpath("./thead/tr"));
	}
	
	/**
	 * Gets the all header cells from table.
	 *
	 * @param table the table
	 * @return the all header cells from table
	 */
	public static List<WebElement> getAllHeaderCellsFromTable(WebElement table){
		return table.findElements(By.xpath("./thead/tr/th"));
	}
	
	/**
	 * Gets the all body rows from table.
	 *
	 * @param table the table
	 * @return the all body rows from table
	 */
	public static List<WebElement> getAllBodyRowsFromTable(WebElement table){
		return table.findElements(By.xpath("./tbody/tr"));
	}
	
	/**
	 * Gets the all body cells from table.
	 *
	 * @param table the table
	 * @return the all body cells from table
	 */
	public static List<WebElement> getAllBodyCellsFromTable(WebElement table){
		return table.findElements(By.xpath("./tbody/tr/td"));
	}
	
	/**
	 * Gets the column cells from table by index.
	 *
	 * @param table the table
	 * @param columnNumber the column number
	 * @return the column cells from table by index
	 */
	public static List<WebElement> getColumnCellsFromTableByIndex(WebElement table, int columnNumber){
		return table.findElements(By.xpath("./tbody/tr/td["+columnNumber+"]"));
	}
	
	/**
	 * Gets the column cells from table by column header.
	 *
	 * @param table the table
	 * @param columnHeader the column header
	 * @return the column cells from table by column header
	 */
	public static List<WebElement> getColumnCellsFromTableByColumnHeader(WebElement table,String columnHeader){
		int colNumber = table.findElements(By.xpath(".//th[contains(text(),'"+columnHeader+"')]/preceding-sibling::th")).size()+1;
		return table.findElements(By.xpath("./tbody/tr/td["+colNumber+"]"));
	}
	
	
}
