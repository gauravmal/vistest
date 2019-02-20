package com.mal.commonModule;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.mal.commonPageObjects.VisionObjects;
import com.mal.commonPageObjects.WebElements;
import com.mal.pageObjects.DriversPageObjects;
import com.mal.util.Action;
import com.mal.util.Utility;

public class DriversModule 
{	
		
	public static void searchDriver(WebDriver driver,String driverName,String unitNo) throws InterruptedException
	{
		//click search driver link
		Action.click(VisionObjects.lnkDriverSearch(driver), "Search Drivers");		
		//Enter driver name
		if(!driverName.isEmpty()) 
		{
			Action.sendKeys(DriversPageObjects.txtDriverName(driver),"Driver Name",driverName);			
		}
		//Enter unit no
		if(!unitNo.isEmpty())
		{
			Action.sendKeys(DriversPageObjects.txtUnitNo(driver),"Unit Number",unitNo);
		}		
		//Click search button				
		Action.click(DriversPageObjects.btnSearch(driver),"search");		
	}
	
	public static void viewDriver(WebDriver driver,String driverName,String unitNo) throws InterruptedException, IOException
	{
		//searching for driver
		searchDriver(driver,driverName,unitNo);
		//waiting for view button to get enabled
		Utility.waitForElementToBeClickable(driver, WebElements.byId(driver,"editDriver"));
		//clicking in view button
		Action.click(DriversPageObjects.btnView(driver),"View/Edit");
		Utility.takeScreenshot(driver);
	}
	
	public static void editDriver(WebDriver driver,String driverName,String unitNo,boolean poolMgr,String title,String fName,String mName,String lName,String grade,String email,String cc,boolean cellNum,
			String cellAreaCode,String cellNo,String cellExt,boolean homeNum,String homeAreaCode,String homeNo,String homeExt,boolean workNum, String workAreaCode,String workNo,String workExt,
			String rchgCode,String activeInd,String jobTitle,String dept,String empRef,String ManaulStatus,String rchgAcc) throws InterruptedException, IOException
	{
		viewDriver(driver,driverName,unitNo);
		
		//Check pool manager checkbox if poolMgr=True
		if(poolMgr==true)
		{
			Action.click(DriversPageObjects.chkPoolMgr(driver),"Pool Manager");			
		}
		
		//Select Title
		if(!title.isEmpty())
		{				
			DriversPageObjects.lstTitle(driver).click();
			DriversPageObjects.lstTitleOptions(driver, title).click();
		}
		
		//Enter First name
		if(!fName.isEmpty())
		{
			Action.sendKeys( DriversPageObjects.txtFirstName(driver),"First Name",fName);			
		}
		//Enter Middle name
		if(!mName.isEmpty())
		{
			Action.sendKeys( DriversPageObjects.txtFirstName(driver),"First Name",mName);			
		}
		//Enter Last name
		if(!lName.isEmpty())
		{
			Action.sendKeys(DriversPageObjects.txtLastName(driver),"Last Name",lName);			
		}		
		//Enter Grade group
		if(!grade.isEmpty())
		{
			DriversPageObjects.lstGrade(driver).click();
			DriversPageObjects.lstGradeOptions(driver, grade).click();			
		}		
		//Enter Email
		if(!email.isEmpty())
		{
			Action.sendKeys(DriversPageObjects.txtEmail(driver),"Email",email);		
		}		
		//Select Cost Center
		if(!cc.isEmpty())
		{
			DriversPageObjects.lstCostCenter(driver).click();
			DriversPageObjects.lstCcOptions(driver,cc).click();	
		}				
		//still to do Add/Edit
		
		//Enter cell number
		if(cellNum==true)
		{
			Action.click( DriversPageObjects.rdCellPhNo(driver),"Cell Phone Number");
			Action.sendKeys(DriversPageObjects.txtCellAreaCode(driver),"Cell Phone Area Code",cellAreaCode);
			Action.sendKeys(DriversPageObjects.txtCellNumber(driver),"Cell Number",cellNo);
			Action.sendKeys(DriversPageObjects.txtCellExt(driver),"Cell Extension",cellExt);
		}
		//Enter Home number
		if(homeNum==true)
		{
			Action.click( DriversPageObjects.rdHomePhNo(driver),"Home Phone Number");
			Action.sendKeys(DriversPageObjects.txtHomeAreaCode(driver),"Home Phone Area Code",homeAreaCode);
			Action.sendKeys(DriversPageObjects.txtHomeNumber(driver),"Home Number",homeNo);
			Action.sendKeys(DriversPageObjects.txtHomeExt(driver),"Home Extension",homeExt);
		}
		//Enter Home number
		if(workNum==true)
		{
			Action.click( DriversPageObjects.rdWorkPhNo(driver),"Worke Phone Number");
			Action.sendKeys(DriversPageObjects.txtWorkAreaCode(driver),"Work Phone Area Code",workAreaCode);
			Action.sendKeys(DriversPageObjects.txtWorkNumber(driver),"Work Number",workNo);
			Action.sendKeys(DriversPageObjects.txtWorkExt(driver),"Work Extension",workExt);
		}
		
		//Enter rechg acc
		if(!rchgAcc.isEmpty())
		{
			Action.sendKeys(DriversPageObjects.txtRecgCode(driver),"Recharge Code",rchgAcc);			
		}
		else
		{
			Assert.fail("Recharge Code cannot be blank");
			Reporter.log("Recharge Code cannot be blank");
		}		
		//Select Active Ind
		if(!activeInd.isEmpty())
		{			
			DriversPageObjects.lstActiveInd(driver).click();
			DriversPageObjects.lstActIndOptions(driver,activeInd).click();
		}				
		
		//Enter Job Title
		if(!jobTitle.isEmpty())
		{
			Action.sendKeys(DriversPageObjects.txtJobTile(driver),"Job Title",jobTitle);			
		}		
		//Enter department
		if(!dept.isEmpty())
		{
			Action.sendKeys(DriversPageObjects.txtDept(driver),"Department",dept);			
		}		
		//Enter Emp Ref No.
		if(!empRef.isEmpty())
		{
			Action.sendKeys(DriversPageObjects.txtEmpRefNoDept(driver),"Employee Ref No.",empRef);			
		}		
		//Select Manual Status
		if(!ManaulStatus.isEmpty())
		{
			
			DriversPageObjects.lstManualStatus(driver).click();
			DriversPageObjects.lstManualStatusOptions(driver,ManaulStatus).click();
		}
		//Enter Recharge code
		if(!rchgCode.isEmpty())
		{
			Action.sendKeys(DriversPageObjects.txtRecgCode(driver),"Recharge Code",rchgCode);			
		}		
		//Click Save
		Action.click(DriversPageObjects.btnSave(driver),"Save");		
		Utility.takeScreenshot(driver);
	}	
	
	public static void addDriver(WebDriver driver,String client,String title,String fName,String mName,String lName,String grade,String email,String cc,String addType,String addLine1,String addLine2,String postalCode,
			String city,boolean cellNum,String cellAreaCode,String cellNo, String cellExt,boolean homeNum, String homeAreaCode,String homeNo, String homeExt,boolean workNum, String workAreaCode,String workNo, 
			String workExt, String rchgAcc,String activeInd, String jobTitle, String dept, String empRef, String manualStatus,String rchgCode) throws IOException, InterruptedException
	{
		//Clicking add driver link
		Action.click(WebElements.byLinkText(driver,"Add Driver"),"Add Driver");
		
		//Entering client code
		if(!client.isEmpty())
		{
			Action.sendKeys(DriversPageObjects.txtClientNumber(driver),"Client",client);	
			Action.click(DriversPageObjects.lovClientAdd(driver),"Client LOV");
			Action.click(DriversPageObjects.btnClientSelect(driver),"Select");	
			Thread.sleep(5000);
		}
		else
		{
			Assert.fail("Client Code cannot be blank");
			Reporter.log("Client Code cannot be blank");
		}
		
		//Select title
		if(!title.isEmpty())
		{	
			DriversPageObjects.lstTitle(driver).click();
			DriversPageObjects.lstTitleOptions(driver, title).click();
		}
		else
		{
			Assert.fail("Title cannot be blank");
			Reporter.log("Title cannot be blank");
		}
		
		//Enter First name
		if(!fName.isEmpty())
		{
			Action.sendKeys( DriversPageObjects.txtFirstName(driver),"First Name",fName);	
		}
		else
		{
			Assert.fail("First name cannot be blank");
			Reporter.log("First name cannot be blank");
		}	
		
		//Enter Middle name
		if(!mName.isEmpty())
		{
			Action.sendKeys(DriversPageObjects.txtMiddleName(driver),"Middle Name",mName);			
		}	
		
		//Enter Last name
		if(!lName.isEmpty())
		{
			Action.sendKeys(DriversPageObjects.txtLastName(driver),"Last Name",lName);	
		}
		else
		{
			Assert.fail("Last name cannot be blank");
			Reporter.log("Last name cannot be blank");
		}	
		
		//Selecting grade group
		if(!grade.isEmpty())
		{		
			DriversPageObjects.lstGrade(driver).click();
			DriversPageObjects.lstGradeOptions(driver,grade).click();
		}
		else
		{
			Assert.fail("Grade Group cannot be blank");
			Reporter.log("Grade group cannot be blank");
		}	
		
		//Enter Email
		if(!email.isEmpty())
		{
			Action.sendKeys(DriversPageObjects.txtEmail(driver),"Email",email);		
		}	
		
		//Select Cost Center
		if(!cc.isEmpty())
		{
			DriversPageObjects.lstCostCenter(driver).click();
			DriversPageObjects.lstCcOptions(driver,cc).click();			
		}
		
		//Click add button
		Action.click( DriversPageObjects.btnAdd(driver),"Add");
		
		//select address type
		if(!addType.isEmpty())
		{
			DriversPageObjects.lstAddType(driver).click();
			DriversPageObjects.lstAddTypeOption(driver,addType).click();
		}
		
		//Enter address line 1
		if(!addLine1.isEmpty())		
		{		
			Action.sendKeys(DriversPageObjects.txtAddressLine1(driver),"Address Line1",addLine1);
		}
		else
		{
			Assert.fail("Address Line 1 cannot be blank");
			Reporter.log("Address Line 1  cannot be blank");
		}
		
		//Enter address line 2
		if(!addLine2.isEmpty())		
		{
			Action.sendKeys(DriversPageObjects.txtAddressLine2(driver),"Address Line2",addLine2);
		}
		else
		{
			Assert.fail("Address Line 2 cannot be blank");
			Reporter.log("Address Line 2  cannot be blank");
		}
		
		//Enter Postal code
		if(!postalCode.isEmpty())		
		{
			Action.sendKeys(DriversPageObjects.txtPostalCode(driver),"Postal Code",postalCode);
		}
		else
		{
			Assert.fail("Postal code cannot be blank");
			Reporter.log("Postal code cannot be blank");
		}
		
		//Click search postal code button
		Action.click(DriversPageObjects.btntPostalSearch(driver),"Search");
		
		//Select city
		if(!city.isEmpty())		
		{
				Action.click(DriversPageObjects.lstCity(driver,city),city);	
		}
		else
		{
			Assert.fail("Postal code cannot be blank");
			Reporter.log("Postal code cannot be blank");
		}		
		//Click done button
		Action.click(DriversPageObjects.btnDone(driver),"Done");
		Thread.sleep(4000);
		
		//Enter cell number
		if(cellNum==true)
		{
//			Action.click( DriversPageObjects.rdCellPhNo(driver),"Cell Phone Number");
//			Action.sendKeys(DriversPageObjects.txtCellAreaCode(driver),"Cell Phone Area Code",cellAreaCode);
//			Action.sendKeys(DriversPageObjects.txtCellNumber(driver),"Cell Number",cellNo);
//			Action.sendKeys(DriversPageObjects.txtCellExt(driver),"Cell Extension",cellExt);
		}
		//Enter Home number
		if(homeNum==true)
		{
//			Action.click(DriversPageObjects.rdHomePhNo(driver),"Home Phone Number");
//			Action.sendKeys(DriversPageObjects.txtHomeAreaCode(driver),"Home Phone Area Code",homeAreaCode);
//			Action.sendKeys(DriversPageObjects.txtHomeNumber(driver),"Home Number",homeNo);
//			Action.sendKeys(DriversPageObjects.txtHomeExt(driver),"Home Extension",homeExt);
		}
		//Enter Home number
		if(workNum==true)
		{
//			Action.click(DriversPageObjects.rdWorkPhNo(driver),"Worke Phone Number");
//			Action.sendKeys(DriversPageObjects.txtWorkAreaCode(driver),"Work Phone Area Code",workAreaCode);
//			Action.sendKeys(DriversPageObjects.txtWorkNumber(driver),"Work Number",workNo);
//			Action.sendKeys(DriversPageObjects.txtWorkExt(driver),"Work Extension",workExt);
		}
		
		//Enter rechg acc
		if(!rchgAcc.isEmpty())
		{
			Action.sendKeys(DriversPageObjects.txRechgAcc(driver),"Recharge Code",rchgAcc);
			Action.click(DriversPageObjects.lovRechgAcc(driver),"Recharge Client LOV");
			Action.click(DriversPageObjects.btnClientSelect(driver),"Select");	
			Thread.sleep(2000);
		}
		else
		{
			Assert.fail("Recharge Code cannot be blank");
			Reporter.log("Recharge Code cannot be blank");
		}
		//Select Active Ind
		if(!activeInd.isEmpty())
		{		
			DriversPageObjects.lstActiveInd(driver).click();
			DriversPageObjects.lstActIndOptions(driver,activeInd).click();
		}				
				
		//Enter Job Title
		if(!jobTitle.isEmpty())
		{
			Action.sendKeys(DriversPageObjects.txtJobTile(driver),"Job Title",jobTitle);			
		}		
		
		//Enter department
		if(!dept.isEmpty())
		{
			Action.sendKeys(DriversPageObjects.txtDept(driver),"Department",dept);			
		}		
		
		//Enter Emp Ref No.
		if(!empRef.isEmpty())
		{
			Action.sendKeys(DriversPageObjects.txtEmpRefNoDept(driver),"Employee Ref No.",empRef);			
		}		
		
		//Select Manual Status
		if(!manualStatus.isEmpty())
		{	
			DriversPageObjects.lstManualStatus(driver).click();
			DriversPageObjects.lstManualStatusOptions(driver,manualStatus).click();
		}
		
		//Enter Recharge code
		if(!rchgCode.isEmpty())
		{
			Action.sendKeys(DriversPageObjects.txtRecgCode(driver),"Recharge Code",rchgCode);			
		}		
		
		//Click Save
		Action.click(DriversPageObjects.btnSave(driver),"Save");		
		Utility.takeScreenshot(driver);
	}
	
	public static void allocateDriver(WebDriver driver,String newDriver) throws InterruptedException
	{
		searchDriver(driver,"","01009142");
		Action.click(DriversPageObjects.btnAllocate(driver),"Allocate/Deallocate");
		//Entering new driver name
		if(!newDriver.isEmpty())
		{
			Action.click(DriversPageObjects.txtNewDriver(driver),newDriver);			
		}
		else
		{
			Assert.fail("New driver name cannot be blank");
			Reporter.log("New driver name cannot be blank");
		}
		//Clicking new driver LOV
		Action.click(DriversPageObjects.lovNewDriver(driver),"New Driver LOV");
		//Clicking select button
		Action.click(DriversPageObjects.btnNewDriverSelect(driver),"Select");
		//Entering latest Odo meter reading
		Action.click(DriversPageObjects.txtOdoReading(driver),"Odo Reading");		
		//Click Save
		Action.click(DriversPageObjects.btnSave(driver),"Save");		
	}	
}
