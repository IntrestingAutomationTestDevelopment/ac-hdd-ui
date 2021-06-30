package org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class GroupRun {
	@BeforeSuite
	public void beforeSuite1() {
		System.out.println("Group Run Suite Initialization Rank 0"); 
		
	}
	@BeforeClass
	public void beforeclass1() {
		
		System.out.println("Called While Execution each Class Rank 1 for URL parse");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before every test method Rank 2");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("after every test method Rank 4");
	}
	@AfterClass
	public void afterclass1() {
		System.out.println("Called at the end of each individual class closure Rank 5");
	}
	@AfterSuite
	public void afterSuite1() {
		System.out.println("Called at the end of suite browser tear down Rank 6");
	}
}
