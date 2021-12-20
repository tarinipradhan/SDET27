package com.crm.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author USER
 *
 */
public class FileUtility {
	/**
	 * @throws IOException 
	 *
	 * 
	 */
	public String getPropertyKeyValue(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.properties");
		Properties pobj=new Properties();
		 pobj.load(fis);
		 String value=pobj.getProperty(key);
		return value; 
	}

		
	
	
}


 
