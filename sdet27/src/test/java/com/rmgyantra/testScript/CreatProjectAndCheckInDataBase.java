package com.rmgyantra.testScript;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatProjectAndCheckInDataBase {
	public static void main(String[] args) {
		//lunch the browser
		System.setProperty("webdriver.chrome.driver","./src/main/resources/cromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//login to application
		driver.get("http://localhost:8084/");
		driver.findElement(By.id("username")).sendKeys("rmgyantra",Keys.TAB,"rmgy@9999",Keys.ENTER);
		
		

		//creating project
		driver.findElement(By.xpath("//a[text()='Project']")).click();
		driver.findElement(By.xpath("//span[text()='creat project']")).click();
		driver.findElement(By.name("ProjectName")).sendKeys("pradhan4");
		driver.findElement(By.name("createdBy")).sendKeys("vishnu");

		//click on add project
		
	

	}

}
