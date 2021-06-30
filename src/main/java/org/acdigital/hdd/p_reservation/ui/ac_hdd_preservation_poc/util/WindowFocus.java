package org.acdigital.hdd.p_reservation.ui.ac_hdd_preservation_poc.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

// TODO: Auto-generated Javadoc
/**
 * The Class WindowFocus.
 */
public class WindowFocus {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws InterruptedException the interrupted exception
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandru\\Downloads\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
//		driver.get("http://demo.actitime.com/login.do");
//		
//		WindowFocus w = new WindowFocus();
//		String ph = w.getExcelData("Client",1,4);
//		
//		driver.findElement(By.id("username")).sendKeys(ph);
		
		driver.get("http://209.198.193.74:6112/User/Login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                
        //login as Organization Admin
        driver.findElement(By.name("username")).sendKeys("govind");
        driver.findElement(By.name("password")).sendKeys("g");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
            
        //Client Information->Open client page
        driver.findElement(By.className("sub-menu")).click();
        driver.findElement(By.linkText("Client Information")).click();
        driver.findElement(By.linkText("Clients")).click();    
        
        //To View the client
        driver.findElement(By.xpath("//tr/td[5]/div/a[text()='View']")).click();
        driver.findElement(By.linkText("Contacts")).click();
        
        //create store
        driver.findElement(By.linkText("Stores")).click();
        driver.findElement(By.linkText("Add Store")).click();
        
        driver.findElement(By.name("MarketModel.MarketName")).sendKeys("Home Depot Store # 9993");
        driver.findElement(By.name("MarketModel.MarketID")).sendKeys("S-12345");
        
        Select region = new Select(driver.findElement(By.id("RegionGUID")));
        region.selectByVisibleText("Southeast");
        Thread.sleep(3000);
        boolean visibility2 = driver.findElement(By.id("TerritoryGUID")).isDisplayed();
    
        
        driver.findElement(By.linkText("Pick Regional Manager")).click();
        driver.findElement(By.xpath("//tr[3]/td/input[@name='rdoUser']")).click();
        driver.findElement(By.id("btnrmcontinuepicker")).click();
        driver.findElement(By.linkText("Pick Field Manager")).click();
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('divmasknew').style.display='none';");
        
        
        //WebDriverWait wait=new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rdo_btn_FM_d4d8a895-407f-4c2e-a495-c92c541372ce")));
        
        driver.findElement(By.xpath("//td[contains(text(),'Bob')]/../td[1]/input[@type='radio']")).click();
        
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//tr[3]/td/input[5]")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.name("MarketModel.FirstName")).sendKeys("Anuj");
        driver.findElement(By.name("MarketModel.LastName")).sendKeys("Rao");
        driver.findElement(By.name("MarketModel.MobilePhone")).sendKeys("9886212765");
        driver.findElement(By.name("MarketModel.MarketPhone")).sendKeys("08025255264");
        driver.findElement(By.name("MarketModel.HomePhone")).sendKeys("08025454654");
        driver.findElement(By.name("MarketModel.Emails")).sendKeys("anuj@homedepot.com");
        driver.findElement(By.name("MarketModel.AddressLine1")).sendKeys("2nd cross");
        driver.findElement(By.name("MarketModel.AddressLine2")).sendKeys("3rd Main");
        driver.findElement(By.name("MarketModel.City")).sendKeys("Bangalore");
        driver.findElement(By.name("MarketModel.State")).sendKeys("Karnataka");
        driver.findElement(By.name("MarketModel.Country")).sendKeys("India");
        driver.findElement(By.name("MarketModel.ZipCode")).sendKeys("560054");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	}
	
	
	/**
	 * Gets the excel data.
	 *
	 * @param sheetName the sheet name
	 * @param rowNum the row num
	 * @param cellNum the cell num
	 * @return the excel data
	 */
	public String getExcelData(String sheetName,int rowNum,int cellNum) {
        String val = null;
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Chandru\\Desktop\\WIM_Test_Data_manual.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet s=wb.getSheet(sheetName);
            Row r=s.getRow(rowNum);
            Cell c=r.getCell(cellNum);
         
            if(c.getCellType() == Cell.CELL_TYPE_NUMERIC) {            	
                long i = (long)c.getNumericCellValue();
                val = String.valueOf(i);
                } else {
                val = c.toString();
                } 
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (EncryptedDocumentException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } catch (InvalidFormatException e) {
			e.printStackTrace();
		}
        
        return val;

    }

}
