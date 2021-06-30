package org.acdigital.achdd.ac_reservation.ui.ac_ui_hdd_poc.po;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
/**
 * 
 * @author Kakarla Home
 * @ Date 05 May 2021 EarlyM
 *
 */
public class Propertiesfile {
	Properties p = new Properties();
	public Properties getDatafromPropertiesfile() throws Exception{
		InputStream stream = new FileInputStream(new File(System.getProperty("user.dir")+ "\\test.properties"));
	    p.load(stream);
	    return p;
	}

}
