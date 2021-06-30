package org.acdigital.hdd.p_reservation.ui.ac_hdd_preservation_poc.util;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib {
	public static String readExcel(String path, String sheet, int row, int cell){
		String v="";
		try {
			FileInputStream fis=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
			v=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		} 
		catch (Exception e) {			
		}
		return v;
	}
}
