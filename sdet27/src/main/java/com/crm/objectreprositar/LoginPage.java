package com.crm.objectreprositar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//step 1: Decleartion
	@FindBy(name ="user_name")
	private WebElement usernameEdt;
	
	@FindBy(name="user_password")
	private WebElement passwordEdt;
	
	@FindBy(id ="submitButton")
	private WebElement loginBtn;
	
	// step 2:Intialization
	public LoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	
	}
	//utilization provide for getter method

	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPasswordEdit() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	//business library for login to application
	public void login(String username,String password)
	{
	     usernameEdt.sendKeys(username);	
	     passwordEdt.sendKeys(password);
	     loginBtn.click();
	}
}	
	
	

