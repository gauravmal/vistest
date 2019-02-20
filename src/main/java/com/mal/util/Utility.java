package com.mal.util;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
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
	
	public static boolean isEnpty(String str)
	{
		if(str==null || str.isEmpty() || str.equalsIgnoreCase(""))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("D:\\Automation\\Java-Automation\\vistest\\Results\\"+new Date().getTime()+".jpg"));		
	}
}
