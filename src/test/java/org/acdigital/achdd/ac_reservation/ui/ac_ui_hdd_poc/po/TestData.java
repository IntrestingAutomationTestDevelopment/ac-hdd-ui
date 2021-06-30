package org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData {

	/**
	 * @Read/WritedatafromExcel
	 * @Date 5 May 2021
	 */
	
	public static void main(String[] args)throws Exception{
		String workSpace = System.getProperty("user.dir");
		File xlsxfile = new File(workSpace+"/Testxlsx.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(xlsxfile));
		Sheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		for(int i=1;i<=rows;i++) {
			Row row =sheet.getRow(i);
		}
		//int columns =sheet.getLastCellNum();
		//for(int j=1;j<columns;j++) {
			//Cell cell =row.getCell(j);
			/**
			 * need to work on...........
			 */
	}
}
