package com.crm.objectreprositar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.MoveMouseAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtility.WebDriverUtiity;

public class HomePage extends WebDriverUtiity{
//step 1:decleartion: 
	@FindBy(linkText ="Organizations")
	private WebElement Organizationslnk;
	
	@FindBy(linkText ="Leads")
	private WebElement Leadslnk;
	
	@FindBy(linkText ="Calendar")
	private WebElement calenderlnk;
	
	@FindBy(linkText ="Contacts")
	private WebElement Contactslnk;
	
	@FindBy(linkText ="Opportunities")
	private WebElement Opportunitieslnk;
	
	@FindBy(linkText ="Products")
	private WebElement Productslnk;
	
	@FindBy(linkText ="Documents")
	private WebElement Documentslnk;
	
	@FindBy(linkText ="Email")
	private WebElement Emaillnk;
	
	@FindBy(linkText ="Trouble Tickets")
	private WebElement  TroubleTicketslnk;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminstatorImg;
	
	
	@FindBy(linkText = "Sign Out")
	private WebElement signoutlink;
	
	//step 3 :intilization
	public HomePage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);	
	}
	//step4 :utilization

	public WebElement getOrganizationslnk() {
		return Organizationslnk;
	}

	public WebElement getCalenderlnk() {
		return calenderlnk;
	}

	public WebElement getContactslnk() {
		return Contactslnk;
	}

	public WebElement getOpportunitieslnk() {
		return Opportunitieslnk;
	}

	public WebElement getProductslnk() {
		return Productslnk;
	}

	public WebElement getDocumentslnk() {
		return Documentslnk;
	}

	public WebElement getEmaillnk() {
		return Emaillnk;
	}

	public WebElement getTroubleTicketslnk() {
		return TroubleTicketslnk;
	}

	public WebElement getAdminstatorImg() {
		return adminstatorImg;
	}

	public WebElement getSignoutlink() {
		return signoutlink;
	}
	//bussiness library
	
	public void getLogoutBtn(WebDriver driver) {
		mouseOverOnElement(driver,adminstatorImg);
		signoutlink.click();
	}
	
	public void contact(WebDriver driver) {
		Contactslnk.click();
		
	}
	
	public void createOrgImg(WebDriver driver) {
		Organizationslnk.click();
	}
	
	
}
