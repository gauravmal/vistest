package com.mal.commonPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VisionObjects 
{
	//Driver search link
	public static WebElement lnkDriverSearch(WebDriver driver)
	{
		return WebElements.byLinkText(driver,"Search Drivers");
	}
	
	//Home icon
	public static WebElement imgHome(WebDriver driver)
	{
		return WebElements.byXpath(driver,".//*[@id='j_idt34']/ul/li[1]/a/span");
	}

}
