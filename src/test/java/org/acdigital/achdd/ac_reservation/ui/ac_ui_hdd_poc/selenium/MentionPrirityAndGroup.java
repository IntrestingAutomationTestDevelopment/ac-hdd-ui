package org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.selenium;

import org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po.PriorityAndGroup;
import org.testng.annotations.Test;

public class MentionPrirityAndGroup extends PriorityAndGroup{
	@Test(priority = 0,groups = "Sanity")
	public void qa(){
		
	}
	@Test(priority = 1,dependsOnGroups = "Sanity")
	public void stg(){
		System.out.println("1");
	}
	@Test(priority = 2,groups="Sanity")
	public void brk() {
		System.out.println("2");
	}
	@Test(priority = 3,groups = "Regression")
	public void itst(){
		System.out.println("3");
	}
	@Test(priority = 4,groups = "Sanity")
	public void crp() {
		System.out.println("4");
	}
	@Test(priority = 5,dependsOnMethods = "crp")
	public void dev() {
		System.out.println("5");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
