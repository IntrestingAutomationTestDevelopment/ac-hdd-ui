package org.acdigital.hdd.p_reservation.ui.ac_hdd_preservation_poc.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	public static void getScreenshot(WebDriver driver, String folderpath) {
		SimpleDateFormat s=new SimpleDateFormat("MM-dd-yyyy hh-mm-ss");
		String dateTime=s.format(new Date());
		
		TakesScreenshot t=(TakesScreenshot) driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File destFile=new File(folderpath+dateTime+".png");
		
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
		}
	}
}
