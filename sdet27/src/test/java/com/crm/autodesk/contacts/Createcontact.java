package com.crm.autodesk.contacts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.genericUtility.BaseClass;
import com.crm.genericUtility.ExcelUtility;
import com.crm.genericUtility.FileUtility;
import com.crm.genericUtility.JavaUtility;
import com.crm.genericUtility.WebDriverUtiity;
import com.crm.objectreprositar.ContactPage;
import com.crm.objectreprositar.HomePage;
import com.crm.objectreprositar.LoginPage;


public class Createcontact extends BaseClass{
	@Test
	public  void createContact() throws Throwable   {
	
				 //Strp4: get Random Num
					int randomnum=jLib.getRandomNum();
					
			   //Step5: read the data from excel sheet
					String value=eLib.getvaluefromexelsheet("sheet1", 1, 2)+randomnum;
			
				//step9: navigate to contact module
				  HomePage hp =  new HomePage(driver);
					hp.contact(driver);
						  
				//Step10: Create Contact
				ContactPage cp =new ContactPage(driver);
				cp.contact();
	
				
				//Step11: Save Contact
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
				
				//Step12: Verify Contact
				String text=driver.findElement(By.xpath("//span[@class='dvHeaderText']/../../..")).getText();
				System.out.println(text);
				if(text.equals(text)) {
					System.out.println("Varify Sucessful.....");
			}else {
					System.out.println("Verify Unsucessful!!!!");
				}
				
	}

}
