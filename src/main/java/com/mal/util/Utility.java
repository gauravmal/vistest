package com.mal.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mal.commonPageObjects.LoginObjects;

public class Utility 
{
	public static FluentWait<WebDriver> wait;
	//Login into vision
	public static void login(WebDriver driver,String url,String un,String pw)
	{			
		driver.get(url);		
		LoginObjects.txtUserName(driver).sendKeys(un);
		LoginObjects.txtUserPassword(driver).sendKeys(pw);
		LoginObjects.btnLogin(driver).click();
	}	
	
	//Wait for element to be clickable
	public static boolean waitForElementToBeClickable(WebDriver driver, WebElement element) 
	{
		boolean webElement = false;

		try {
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, 60)
					.ignoring(NoSuchElementException.class, StaleElementReferenceException.class)
					.pollingEvery(5, TimeUnit.SECONDS);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			Log.info("Element is clickable");
			webElement = true;
		} 
		catch (Exception e) 
		{
			Log.error("Class name-Utility || Method name-waitForElementToBeClickable || Error-"+e.getStackTrace());
			webElement = false;
		} 
		return webElement;
	}
}
