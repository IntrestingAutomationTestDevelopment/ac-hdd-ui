package org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.selenium;

import org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po.Config;
import org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po.ObjectForClassPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestObjectForClassPage extends TestWrapper implements Config{
	private ObjectForClassPage object1;
	
	public void setup() {
        super.setup();
        object1 = new  ObjectForClassPage();
    }
	@Test
	public void method1() {
		
		object1.qatestMethodCheck("abc","def");
	} 
}
