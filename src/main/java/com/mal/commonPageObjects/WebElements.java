package com.mal.commonPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElements 
{
	public static WebElement ele;
	public static WebDriverWait wait;
	
	public static WebElement byId(WebDriver driver,String id)
	{
		wait = new WebDriverWait(driver,10);
		ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
		return ele;
	}
	
	public static WebElement byXpath(WebDriver driver,String xpath)
	{
		wait = new WebDriverWait(driver,10);
		ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		return ele;
	}	
	
	public static WebElement byLinkText(WebDriver driver,String link)
	{	
		wait = new WebDriverWait(driver,10);
		ele = driver.findElement(By.partialLinkText(link));
		return ele;
	}
	
}