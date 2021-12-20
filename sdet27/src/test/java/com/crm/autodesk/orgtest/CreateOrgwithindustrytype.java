package com.crm.autodesk.orgtest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.genericUtility.ExcelUtility;
import com.crm.genericUtility.FileUtility;
import com.crm.genericUtility.JavaUtility;

public class CreateOrgwithindustrytype {
	public static void main(String[] args) throws IOException {
		
		FileUtility fLib=new FileUtility();
		ExcelUtility eLib=new ExcelUtility();
		JavaUtility jLib=new JavaUtility();
		
		String Browser=fLib.getdataFromPropertiesFile("browser");
		String URL=fLib.getdataFromPropertiesFile("url");
		String USERNAME=fLib.getdataFromPropertiesFile("username");
		String PASSWORD=fLib.getdataFromPropertiesFile("password");
		
		WebDriver driver=null;
		if(Browser.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(Browser.equals("firefox")) {
			
		
		
		
	}
		
		
	}
	





























	
	
	
	
	

}
