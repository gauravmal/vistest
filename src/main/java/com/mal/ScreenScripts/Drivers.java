package com.mal.ScreenScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mal.commonModule.DriversModule;
import com.mal.util.BaseClass;

public class Drivers extends BaseClass
{
	

	  @Test(description="TC#1",groups= {"DR001","ProdUnSafe"})
	  public void addDriver() throws InterruptedException, IOException
	  {
		  DriversModule.addDriver(
				  driver,
				  "00000117",
				  "MS",
				  "First",
				  "Middle",
				  "Last",
				  "U - Unassigned",
				  "gaurav.rajput@mikealbert.com",
				  "001-Information Technology",
				  "POST",
				  "Address Line 1",
				  "Address Line 2",
				  "43204",
				  "Columbus",
				  true,
				  "111",
				  "1111111",
				  "111",
				  true,
				  "111",
				  "1111111",
				  "111",
				  true,
				  "111",
				  "1111111",
				  "111",
				  "00000017",
				  "INACTIVE",
				  "Title",
				  "Department",
				  "999",
				  "SYSTEM",
				  "0000117"
				  );	  		
	  }
	  
	@Test(description="TC#2",groups= {"DR001","Regression","ProdSafe"})
  public void viewDriver() throws InterruptedException, IOException 
  {
	  DriversModule.viewDriver(driver,"abati","");	
  }
	
  @Test(description="TC#3",groups= {"DR001","ProdUnSafe"})
  public void editDriver() throws InterruptedException, IOException
  {
	  DriversModule.editDriver(driver,"abati","",true,"MS","G","M","last","U - Unassigned","gaurav.rajput@mikealbert.com","------",true,"111","1111111","111",true,"111","1111111","111",true,"111",
			  "1111111","111","00000117","INACTIVE","Title","Department","999","SYSTEM","0000117");
  }
  
  @Test(description="TC#4",groups= {"DR001","ProdUnsafe"})
  public void allocateDriver() throws InterruptedException
  {
	  DriversModule.allocateDriver(driver,"abati");
  }  
}
