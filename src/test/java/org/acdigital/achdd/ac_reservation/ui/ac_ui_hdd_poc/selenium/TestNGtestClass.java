package org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.selenium;
import org.testng.annotations.*;

public class TestNGtestClass {
	 
	
	public class SimpleTest {
	 
	 @BeforeClass
	 public void setUp() {
	   // code that will be invoked when this test is instantiated
	 }
	 @BeforeTest
	 public void qa2att() {
		 System.out.println("close test");	
		 }
	 @Test(groups = { "fast" })
	 public void aFastTest() {
	   System.out.println("Fast test");
	 }
	 
	 @BeforeMethod
	 public void asu() {
		 System.out.println("Before FastTestMethod1");	
	}

	 @Test(groups = { "slow" })
	 public void aSlowTest() {
	    System.out.println("Slow test");
	 }
	 @AfterMethod
	 public void amtest() {
		 System.out.println("AfterSlowTestMethod2");	 
		 }


	 @AfterTest
	 public void qa1att() {
		 System.out.println("close test");	
		 }
	

	 @AfterClass
	 public void tDAC() {
		 System.out.println("end test");	
	}


}
}