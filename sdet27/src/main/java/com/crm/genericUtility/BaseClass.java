package com.crm.genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.crm.objectreprositar.HomePage;
import com.crm.objectreprositar.LoginPage;

public class BaseClass {
	public DataBaseConnectionUtility dLib = new DataBaseConnectionUtility();
	public FileUtility fLib = new FileUtility();
	public ExcelUtility eLib = new ExcelUtility() ;
	public JavaUtility jLib = new JavaUtility();
	public WebDriverUtiity wLib =new WebDriverUtiity();
	public WebDriver driver;
	
    @BeforeSuite
	public void dbConnection() {
		
		dLib.connectToDB();
		System.out.println("======DataBase connection successfully======>");
	}
	
	@BeforeClass
	public void launchBrowser() throws Throwable {
	//read the data
       String BROWSER=fLib.getPropertyKeyValue("browser");
       String URL=fLib.getPropertyKeyValue("url");
  
	if(BROWSER.equalsIgnoreCase("chrome"))
    		   {
         driver= new ChromeDriver();
         
    		   }
       else if(BROWSER.equalsIgnoreCase("firefox")) {
	
	 driver=new FirefoxDriver();
	}
	else
	{
		System.out.println("invalid browser");
	}
	
	wLib.waitForPageToLoad(driver);
	wLib.maximizeBrowser(driver);
     driver.get(URL);
     System.out.println("======browser launched======");
	}
	
	@BeforeMethod	
	public void loginToApp() throws Throwable
	{
		//read the data
String USERNAME=fLib.getPropertyKeyValue("username");
	String PASSWORD=fLib.getPropertyKeyValue("password");
	LoginPage lp= new LoginPage(driver);
	lp.login(USERNAME, PASSWORD);
	System.out.println("=====login successfull=====");
	}
	
	@AfterMethod
	public void logoutofApp()
	{
	HomePage hp = new HomePage(driver);
	hp.getLogoutBtn(driver);
	System.out.println("===logout successful====");
	}
	
	@AfterClass
	public void closeBrowser()
	{
	driver.quit();
    System.out.println("====browser closed");
	}
	
	@AfterSuite
	public void closedbconnection()
	{
	dLib.closeDB();
	System.out.println("====Database connection closed====");
	}
}
	
	
		
		
       
       
    	   
    		 
 
    
	



	
	
	
	
	
	
	
	


