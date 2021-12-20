package com.crm.genericUtility;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author USER
 *
 */


	public class WebDriverUtiity {
		/**
		    * wait for page to load before identifying any synchronized element in DOm[HTML-Document]
		    * @param driver
		    */
	
			public void waitForPageToLoad(WebDriver driver) {
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
			}
			
			/**
			 * wait for page to load before identifying any synchronized[java script actions] element in DOM[HTML-Document]
			 *@param driver
			 */
			public void waitForPageToLoadForJSelement(WebDriver driver) {
				driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
			}
			
			/**
			 *used to wait for element to be clickable in GUI and check for specific element for every 500 milli seconds
			 *@param driver
			 * @param element
			 */
			public void waitForElementToBeClickable(WebDriver driver,WebElement element) {
				WebDriverWait wait=new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.elementToBeClickable(element));	
			}
			
			
			/**
			 *used to wait for element to be clickable in GUI and check for specific element for every 500 milli seconds 
			 * @param driver
			 * @throws Throwable 
			 * @throws Throwable 
			 * 
			 */
//			public void waitForElementWithCustomTimeOut(WebDriver driver,WebElementelement,intpollingTime) throws Throwable {
//				FluentWaitwait=new FluentWait(driver);
//				wait.pollingEvery(pollingTime, TimeUnit.SECONDS);
//				wait.wait(20);
//			}
//			
			
			/**
			 * used to switch to any window based on window title
			 * @param driver
			 * @parampartialWindowTitle
			 */
			public void  switchToWindow(WebDriver driver,String partialWindowTitle) {
				Set<String>set=driver.getWindowHandles();
				Iterator<String>it=set.iterator();
				
				while(it.hasNext()) {
					String wID=it.next();
					driver.switchTo().window(wID);
					String currentWindowTitle=driver.getTitle();
					if(currentWindowTitle.contains(partialWindowTitle)) {
						break;
					}
				}
			}
				
				
				/**
				 * used to switch to alert window and click on OK button
				 * @param driver
				 */
				public void switchToAlertWindowAndAccept(WebDriver driver) {
					driver.switchTo().alert().accept();	
				}
				
				
				/**
				 * used to switch to window and click on CANCEL button
				 * @param driver
				 */
				public void switchToAlertWindowAndCancel(WebDriver driver) {
					driver.switchTo().alert().dismiss();	
				}
				/**
				 * used to maximize the browser
				 */
				public void maximizeBrowser(WebDriver driver) {
				driver.manage().window().maximize();
				}
				
				
				
				
				/**
				 *used to switch to Frame window based on index
				 * @param driver
				 * @param index
				 */
				public void switchToFrame(WebDriver driver,int index) {
					driver.switchTo().frame(index);	
				}
				
				
				/**
				 * used to switch to Frame Window based on id or name attribute
				 * @param driver
				 * @paramid_name_attribute
				 */
//				public void switchToFrame(WebDriver driver,Stringid_name_attribute) {
//					driver.switchTo().frame(id_name_attribute);
//				}
				
				
				/**
				 * used to select the value from the dropDown based on index
				 *@param driver
				 *@param index
				 */
				public void select(WebElement element,int index) {
					Select sel=new Select(element);
					sel.selectByIndex(index);
				}
				
				
				/**
				 *used to select the value from the dropDown based on value/option available in GUI
				 * @param element
				 * @param index
				 */
				public void select(WebElement element,String text) {
					Select sel=new Select(element);
					sel.deselectByVisibleText(text);
				}
				
				
				/**
				 * used to place mouse cursor on specific element
				 * @param driver
				 * @param element
				 */
				public void mouseOverOnElement(WebDriver driver,WebElement element) {
					Actions act=new Actions(driver);
					act.moveToElement(element).perform();
				}
				
				
				/**
				 * used to right click on specific element
				 * @param driver
				 * @param element
				 */
				public void rightClickOnElement(WebDriver driver,WebElement element) {
					Actions act=new Actions(driver);
					act.contextClick(element).perform();	
				}
			
				
				
				/**
				 * 
				 * 
				 * 
				 */
//				public void executeJavaScript(WebDriver driver,String javaScript) {
//					JavascriptExecutorjs=(JavascriptExecutor)driver;
//					js.executeAsyncScript(javaScript,null);
//				}
//				
//				
//				/**
//				 * @throws Throwable 
//				 * 
//				 * 
//				 * 
//				 */
//				public void waitAndClick(WebElementelement) throws Throwable {
//					intcount=0;
//					while(count<20) {
//						try {
//							element.click();
//							break;
//						}catch(Throwable e) {
//							Thread.sleep(1000);
//							count++;
//						}
//				    }
//				}
//				
//				
//				/**
//				 * 
//				 * @throws Throwable  
//				 * 
//				 */
//				public void takeScreenshot(WebDriver driver,StringscreenshotName) throws Throwable {
//					TakesScreenshotts=(TakesScreenshot)driver;
//					File src=ts.getScreenshotAs(OutputType.FILE);
//					File dest=new File("./screenshot/"+screenshotName+".PNG");
//					Files.copy(src, dest);
//				}
//				
//				
//				
//				/**
//				 * pass enter Key appertain in to Browser
//				 * @param driver
//				 */
//				publicvoidpassEnterKey(WebDriver driver) {
//					
//					Actions act=new Actions(driver);
//					act.sendKeys(Keys.ENTER).perform();
//				}
				
			
		}



