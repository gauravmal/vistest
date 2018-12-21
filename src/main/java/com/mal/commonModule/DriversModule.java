package com.mal.commonModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.mal.commonPageObjects.VisionObjects;
import com.mal.commonPageObjects.WebElements;
import com.mal.pageObjects.DriversPageObjects;
import com.mal.util.Action;
import com.mal.util.Utility;

public class DriversModule 
{	
		
	public static void searchDriver(WebDriver driver,String driverName) throws InterruptedException
	{
		//click search driver link
		Action.click(driver,VisionObjects.lnkDriverSearch(driver), "Search Drivers");		
		//Enter driver name
		Action.sendKeys(driver,DriversPageObjects.txtDriverName(driver),"Driver Name",driverName);
		//Click search button				
		Action.click(driver,DriversPageObjects.btnSearch(driver),"search");		
	}
	
	public static void viewDriver(WebDriver driver,String driverName) throws InterruptedException
	{
		//searching for driver
		searchDriver(driver,driverName);
		//waiting for view button to get enabled
		Utility.waitForElementToBeClickable(driver, WebElements.byId(driver,"editDriver"));
		//clicking in view button
		Action.click(driver,DriversPageObjects.btnView(driver),"View/Edit");		
	}
	
	public static void editDriver(WebDriver driver,String driverName,boolean poolMgr,String title,String fName,String mName,String lName,String grade,String email,String cc,boolean cellNum,
			String cellAreaCode,String cellNo,String cellExt,boolean homeNum,String homeAreaCode,String homeNo,String homeExt,boolean workNum, String workAreaCode,String workNo,String workExt,
			String rchgCode,String activeInd,String jobTitle,String dept,String empRef,String ManaulStatus,String rchgAcc) throws InterruptedException
	{
		viewDriver(driver,driverName);
		
		//Check pool mnage chakbox if poolMgr=True
		if(poolMgr==true)
		{
			Action.click(driver,DriversPageObjects.chkPoolMgr(driver),"Pool Manager");			
		}
		
		//Select Title
		if(!title.isEmpty())
		{
			DriversPageObjects.lstTitle(driver, title);			
		}
		
		//Enter First name
		Action.sendKeys(driver, DriversPageObjects.txtFirstName(driver),"First Name",fName);
		
		//Enter Middle name
		Action.sendKeys(driver,DriversPageObjects.txtMiddleName(driver),"Middle Name",mName);
		
		//Enter Last name
		Action.sendKeys(driver,DriversPageObjects.txtLastName(driver),"Last Name",lName);
		
		//Enter Grade group
		if(!grade.isEmpty())
		{
			DriversPageObjects.lstGrade(driver,grade);		
		}
		
		//Enter Email
		Action.sendKeys(driver,DriversPageObjects.txtEmail(driver),"Email",email);
		
		//Select Cost Center
		if(!cc.isEmpty())
		{
			DriversPageObjects.lstCostCenter(driver,cc);			
		}
				
		//still to do Add/Edit
		
		//Enter cell number
		if(cellNum==true)
		{
			Action.click(driver, DriversPageObjects.rdCellPhNo(driver),"Cell Phone Number");
			Action.sendKeys(driver,DriversPageObjects.txtCellAreaCode(driver),"Cell Phone Area Code",cellAreaCode);
			Action.sendKeys(driver,DriversPageObjects.txtCellNumber(driver),"Cell Number",cellNo);
			Action.sendKeys(driver,DriversPageObjects.txtCellExt(driver),"Cell Extension",cellExt);
		}
		//Enter Home number
		if(homeNum==true)
		{
			Action.click(driver, DriversPageObjects.rdHomePhNo(driver),"Home Phone Number");
			Action.sendKeys(driver,DriversPageObjects.txtHomeAreaCode(driver),"Home Phone Area Code",homeAreaCode);
			Action.sendKeys(driver,DriversPageObjects.txtHomeNumber(driver),"Home Number",homeNo);
			Action.sendKeys(driver,DriversPageObjects.txtHomeExt(driver),"Home Extension",homeExt);
		}
		//Enter Home number
		if(workNum==true)
		{
			Action.click(driver, DriversPageObjects.rdWorkPhNo(driver),"Worke Phone Number");
			Action.sendKeys(driver,DriversPageObjects.txtWorkAreaCode(driver),"Work Phone Area Code",workAreaCode);
			Action.sendKeys(driver,DriversPageObjects.txtWorkNumber(driver),"Work Number",workNo);
			Action.sendKeys(driver,DriversPageObjects.txtWorkExt(driver),"Work Extension",workExt);
		}
		
		//Enter rechg acc
		Action.sendKeys(driver,DriversPageObjects.txtRecgCode(driver),"Recharge Code",rchgAcc);
		
		//Select Active Ind
		if(!activeInd.isEmpty())
		{
			DriversPageObjects.lstActiveInd(driver,activeInd);			
		}				
		
		//Enter Job Title
		Action.sendKeys(driver,DriversPageObjects.txtJobTile(driver),"Job Title",jobTitle);
		
		//Enter department
		Action.sendKeys(driver,DriversPageObjects.txtDept(driver),"Department",dept);
		
		//Enter Emp Ref No.
		Action.sendKeys(driver,DriversPageObjects.txtEmpRefNoDept(driver),"Employee Ref No.",empRef);
		
		//Select Manual Status
		if(!ManaulStatus.isEmpty())
		{
			DriversPageObjects.lstManualStatus(driver,ManaulStatus);		
		}
		//Enter Recharge code
		Action.sendKeys(driver,DriversPageObjects.txtRecgCode(driver),"Recharge Code",rchgCode);
		
		//Click Save
//		Action.click(driver,DriversPageObjects.btnSave(driver),"Save");
	}
	
}
