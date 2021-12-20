package com.crm.autodesk.orgtest;


import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.genericUtility.ExcelUtility;
import com.crm.genericUtility.FileUtility;
import com.crm.genericUtility.JavaUtility;
import com.crm.genericUtility.WebDriverUtiity;
import com.crm.objectreprositar.LoginPage;

public class CreateOrgWithBillingAddressTest {

	public static void main(String[] args) throws Throwable   {
		//step-1:get the java represention object of physical file 	
			JavaUtility jLib=new JavaUtility();
			ExcelUtility eLib=new ExcelUtility();
			FileUtility fLib=new FileUtility();
			WebDriverUtiity wLib=new  WebDriverUtiity();
	         FileInputStream fis=new FileInputStream("./data/commondata.properties");
			// step 2 :to create an object to property class to load all the keys
	         
			Properties pobj=new Properties();
			pobj.load(fis);	
				
		   //step 3:read the value using get property("key");	
		   String Browser=pobj.getProperty("browser");
		   String Url=pobj.getProperty("url");
		   String Username=pobj.getProperty("username");
		   String Password=pobj.getProperty("password");
		   WebDriver driver=new ChromeDriver();
						driver.get(Url);
					
							
		   //Strp4: get Random Num
			int randomnum=jLib.getRandomNum();
						
		//Step5: read the data from excel sheet
		String orgName=eLib.getvaluefromexelsheet("sheet1", 4, 2)+randomnum;
		String billingAddress=eLib.getvaluefromexelsheet("sheet1", 4, 3);
		/*
		WebDriver driver;
		if(BROWSER.equals(chrome)) {
			driver=new ChromeDriver();
		}
		
		else if(BROWSER.equals(firefox)) {
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		
		*/
		
		
		
		
		//step6:Synchronizing ImplicitTime	 
		wLib.waitForPageToLoad(driver);
					
	   //Step7: Maximize Web page
		driver.manage().window().maximize();
					
	   //Step8: login Application
		LoginPage lp=new  LoginPage(driver);
		lp.login(Username, Password);
		
		//click on organizations link
		driver.findElement(By.linkText("Organizations")).click();
		//click on create new organization IMG
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	    //enter organization name
		driver.findElement(By.name("accountname")).sendKeys(orgName);
		//enter billing address
		driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys(billingAddress);
		//click on save button
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		//verification
		//comparing created billing addrress with given billing address
		String crBlAdd= driver.findElement(By.id("mouseArea_Billing Address")).getText();
		
		System.out.println(crBlAdd);
		System.out.println(billingAddress);
		
		if(crBlAdd.contains(billingAddress)) {
			System.out.println("Billing Adress Created");
		}else {
			System.out.println("Billing Adress is not Created");
		}
		
		if((driver.findElement(By.id("mouseArea_Billing Address")).getText()).contains(billingAddress))
		{
			System.out.println("Billing Adress Created");
		}else {
		System.out.println("Billing Adress is not Created");
	    }
		
		
		}
	
	}
