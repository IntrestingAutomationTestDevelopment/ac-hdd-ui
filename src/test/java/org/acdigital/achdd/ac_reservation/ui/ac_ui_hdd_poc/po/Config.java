package org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po;
//package org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po;
public interface Config {
	
		String baseUrl        = System.getProperty("baseUrl", "https://www.google.com"); 
    	String browser        = System.getProperty("browser", "chrome");
    	String host           = System.getProperty("host", "localhost"); 
    	String browserVersion = System.getProperty("browserVersion", "35");
    	String platform       = System.getProperty("platform", "Windows 8.1");
}
