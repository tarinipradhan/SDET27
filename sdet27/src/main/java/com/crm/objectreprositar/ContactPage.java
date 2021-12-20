package com.crm.objectreprositar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	//step 1: decleration
	@FindBy(xpath="//img[@alt='Create Contact...']")
			private WebElement lookupImg;
		
	// step 2: intiization
	public ContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//step3:utilization		

	public WebElement getLookupImg() {
		return lookupImg;
	}
	
	//step4:bussiness library	
	public void contact() {
		lookupImg.click();
	}
	
}
