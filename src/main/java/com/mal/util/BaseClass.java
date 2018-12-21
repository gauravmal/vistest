package com.mal.util;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.mal.commonPageObjects.VisionObjects;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public static WebDriver driver;

	  @BeforeSuite
	  @Parameters({"browser"})
	  public void beforeSuite(String browser)
	  {
		  //creating webdriver
		  if(browser.equalsIgnoreCase("Chrome"))
			{
				//System.setProperty("webdriver.chrome.driver","D:\\Software\\Selenium setup\\chromedriver_win32\\chromedriver.exe");
			  WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();			
			}
			else if(browser.equalsIgnoreCase("IE"))
			{
				//System.setProperty("webdriver.ie.driver","D:\\Software\\Selenium setup\\IEDriverServer\\IEDriverServer.exe");
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();				
			}	
		  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  //configuring log4j
		  DOMConfigurator.configure("log4j.xml");	  
	  }  
	  
	  @BeforeTest
	  @Parameters({"username","password","url"})
	  public void beforeTest(String username,String password,String url) 
	  {
		  Utility.login(driver,url, username, password);
	  }
	  
	@AfterMethod
	public void afterMethod()
	{
		//will move user to Home screen after each method execution
//		VisionObjects.imgHome(driver).click();	
	}
	

  

}
