package com.mal.scripts;

import org.testng.annotations.Test;

import com.mal.commonModule.DriversModule;
import com.mal.pageObjects.DriversPageObjects;
import com.mal.util.BaseClass;

public class Drivers extends BaseClass
{
  @Test(description="TC#1",groups= {"DR001","Regression","ProdSafe"},enabled=false)
  public void viewDriver() throws InterruptedException 
  {
	  DriversModule.viewDriver(driver,"abati");	  
  }
  
  @Test(description="TC#2",groups= {"DR001","ProdUnSafe"},enabled=true)
  public void editDriver() throws InterruptedException
  {
	  DriversModule.editDriver(driver,"abati",true,"MS","G","M","last","-----","gaurav.rajput@mikealbert.com","959-959",true,"111","1111111","111",true,"111","1111111","111",true,"111","1111111","111","00000117","INACTIVE","Title","Department","999","SYSTEM","0000117");
  }
  
  @Test(description="TC#3",groups= {"DR001","ProdUnSafe"},enabled=false)
  public void addDriver() throws InterruptedException
  {
	  DriversModule.viewDriver(driver,"abati");	  		
  }
}
