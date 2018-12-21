package com.mal.commonPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObjects 
{
	//user name field
	public static WebElement txtUserName(WebDriver driver)
	{
		return WebElements.byId(driver,"j_username");
	}
	//user password field
	public static WebElement txtUserPassword(WebDriver driver)
	{
		return WebElements.byId(driver,"j_password");
	}
	//Login button
	public static WebElement btnLogin(WebDriver driver)
	{
		return WebElements.byId(driver,"login");
	}

}
