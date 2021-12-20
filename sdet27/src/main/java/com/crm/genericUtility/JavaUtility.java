package com.crm.genericUtility;

import java.util.Date;
import java.util.Random;

/**
 * 
 * @author USER
 *
 */
public class JavaUtility {
	/**
	 * to generate random number
	 * @return
	 */
	public int getRandomNum() {
		Random random=new Random();
		int ran=random.nextInt(10000);
		return ran;
	}
	
     /**
       * used to get system date in IST format
       * @return
       * 
       */
    public String getDateandTime() {
	Date date =new Date();
	return date.toString();
    }
    
    public String CalenderdateFormat() {
    	Date date=new Date();
    	String formate=date.toString();
    	
    	String yyyy=formate.split(" ")[5];
    	String dd=formate.split(" ")[2];
    	int mm=date.getMonth();
    	String actualformate=yyyy+"-"+mm+"-"+dd;
		return actualformate;
    	
    }
    
}