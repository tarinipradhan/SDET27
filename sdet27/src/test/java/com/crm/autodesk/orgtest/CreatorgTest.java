package com.crm.autodesk.orgtest;

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
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import com.crm.objectreprositar.HomePage;
import com.crm.objectreprositar.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatorgTest {
public static void main(String[] args) throws IOException  {
	
	//step-1:get the java represention object of physical file 	
	
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
				System.out.println(Url);
				//Strp4: get Random Num
				Random ran=new Random();
				int ranDomNum = ran.nextInt(10000);
				//Step5: read the data from excel sheet
				FileInputStream fis_e=new FileInputStream("./data/Book1.xlsx");
				Workbook wb = WorkbookFactory.create(fis_e);
				Sheet sh =wb.getSheet("Sheet1");
				Row ro =sh.getRow(4);
				Cell cel =ro.getCell(2);
				String orgName =cel.getStringCellValue()+ranDomNum;					
				
				

			//step6:Synchronizing ImplicitTime	 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		//Step7: Maximize Web page
			driver.manage().window().maximize();
		//Step8: login Application
		    LoginPage lp= new LoginPage(driver);
		    lp.login(Username, Password);
	//navigate to organisation module
    HomePage hp=new HomePage(driver);
	hp.createOrgImg(driver);
	
	
	
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	driver.findElement(By.name("accountname")).sendKeys(orgName);
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

//verify the organisation
	String text =driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	System.out.println(text);{
			if(text.equals(text)) {
				System.out.println("varify successful");
			}else {
				System.out.println("varify unsuccessful");
			}
				
				//logout application
	WebElement logout=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
				Actions act =new Actions(driver);
				act.moveToElement(logout).perform();
				driver.findElement(By.linkText("Sign Out")).click();
				//close browser
				driver.close();
				
				
			
	}
	
	

	
	


}
}
