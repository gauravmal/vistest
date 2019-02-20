package com.mal.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mal.commonPageObjects.WebElements;

public class Action 
{	
	//click on element
	public static void click(WebElement ele,String eleName)
	{		
		ele.click();	
		Log.info("Element Clicked - "+eleName);
	}
	//enter text in text box
	public static void sendKeys(WebElement ele,String eleName,String testData)
	{	
		ele.clear();
		ele.sendKeys(testData);	
		Log.info("Text entered in Text Box-"+eleName+" Text-"+testData);
	}	 
}
