package com.mal.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.mal.commonPageObjects.WebElements;

public class DriversPageObjects 
{
	//Driver Name
	public static WebElement txtDriverName(WebDriver driver)
	{
		return WebElements.byId(driver,"driverName");
	}
	//Unit Number
	public static WebElement txtUnitNo(WebDriver driver)
	{
		return WebElements.byId(driver,"unitNo");
	}
	//search button
	public static WebElement btnSearch(WebDriver driver)
	{
		return WebElements.byId(driver,"search");
	}
	//view/Edit
	public static WebElement btnView(WebDriver driver)
	{
		return WebElements.byId(driver,"editDriver");
	}
		
	//pool manager
	public static WebElement chkPoolMgr(WebDriver driver)
	{
		return WebElements.byId(driver,"poolManager");
	} 
	//Title
	public static WebElement lstTitle(WebDriver driver)
	{
		return WebElements.byId(driver,"titleCode_label");
	}
	//Title list options
	public static WebElement lstTitleOptions(WebDriver driver,String testData)
	{
		return WebElements.byXpath(driver,".//*[@id='titleCode_panel']/div/ul/li[contains(text(),'"+testData+"')]");
	}
	
	//first name
	public static WebElement txtFirstName(WebDriver driver)
	{
		return WebElements.byId(driver,"driverForename");
	}
	
	//Middle name
	public static WebElement txtMiddleName(WebDriver driver)
	{
		return WebElements.byId(driver,"driverMiddlename");
	}
	
	//Last Name
	public static WebElement txtLastName(WebDriver driver)
	{
		return WebElements.byId(driver,"driverSurname");
	}
	
	//Grade group
	public static WebElement lstGrade(WebDriver driver)
	{	
		return WebElements.byId(driver,"driverGradeGroupCodes_label");
	}
	//Grade group list options
	public static WebElement lstGradeOptions(WebDriver driver,String testData)
	{
		return WebElements.byXpath(driver,".//*[@id='driverGradeGroupCodes_panel']/div/ul/li[contains(text(),'"+testData+"')]");
	}
	
	//Email
	public static WebElement txtEmail(WebDriver driver)
	{
		return WebElements.byId(driver,"email");
	}
	//Cost center
	public static WebElement lstCostCenter(WebDriver driver)
	{	
		return WebElements.byId(driver,"costCentreCode_label");
	}
	//Grade group list options
	public static WebElement lstCcOptions(WebDriver driver,String testData)
	{
		return WebElements.byXpath(driver,".//*[@id='costCentreCode_panel']/div/ul/li[contains(text(),'"+testData+"')]");
	}
	//Add address
	public static WebElement btnAdd(WebDriver driver)
	{
		return WebElements.byId(driver,"driverAddressNumberPanel:addButton");
	}
	//address type
	public static WebElement lstAddType(WebDriver driver)
	{
		return WebElements.byId(driver,"addressForm:addressType_label");
	}
	//Address type option
	public static WebElement lstAddTypeOption(WebDriver driver,String testData)
	{
		return WebElements.byXpath(driver,".//*[@id='addressForm:addressType_panel']/div/ul/li[contains(text(),'"+testData+"')]");
	}
	
	//Business address checkbox
	public static WebElement chkBusiness(WebDriver driver)
	{
		return WebElements.byId(driver,"addressForm:dialogBusinessIndicator");
	}
	//Business Address
	public static WebElement txtBusinessAddress(WebDriver driver)
	{
		return WebElements.byId(driver,"addressForm:businessAddressLine");
	}
	//Address Line 1
	public static WebElement txtAddressLine1(WebDriver driver)
	{
		return WebElements.byId(driver,"addressForm:dialogAddressLine1");
	}
	//Address Line 2
	public static WebElement txtAddressLine2(WebDriver driver)
	{
		return WebElements.byId(driver,"addressForm:dialogAddressLine2");
	}
	//Postal Code
	public static WebElement txtPostalCode(WebDriver driver)
	{
		return WebElements.byId(driver,"addressForm:dialogPostcode");
	}
	//Postal search button
	public static WebElement btntPostalSearch(WebDriver driver)
	{	
		return WebElements.byXpath(driver,".//*[text()='Search']");
	}
	//Postal city
	public static WebElement lstCity(WebDriver driver,String testData)
	{
		return WebElements.byXpath(driver,".//*[@id='addressForm:dialogCitySelector']/div[2]/ul/li[contains(text(),'"+testData+"')]");
	}
	//Done
	public static WebElement btnDone(WebDriver driver)
	{
		return WebElements.byId(driver,"addressForm:dialogDoneButton");
	}
	//Edit
	public static WebElement btnEdit(WebDriver driver)
	{
		return WebElements.byId(driver,"driverAddressNumberPanel:editButton");
	}
	//Cell phon enumber radio button
	public static WebElement rdCellPhNo(WebDriver driver)
	{
		return WebElements.byXpath(driver,".//*[@id='driverAddressNumberPanel:opt1']/div[2]/span");
	}
	//Cell  phone Area code
	public static WebElement txtCellAreaCode(WebDriver driver)
	{
		return WebElements.byId(driver,"driverAddressNumberPanel:cellAreaCode");
	}
	//Cell  phone Extension
	public static WebElement txtCellNumber(WebDriver driver)
	{
		return WebElements.byId(driver,"driverAddressNumberPanel:cellNumber");
	}
	//Cell  phone Extension
	public static WebElement txtCellExt(WebDriver driver)
	{
		return WebElements.byId(driver,"driverAddressNumberPanel:j_idt115");
	}
	//Home phone radio button
	public static WebElement rdHomePhNo(WebDriver driver)
	{
		return WebElements.byXpath(driver,".//*[@id='driverAddressNumberPanel:opt2']/div[2]/span");
	}
	//Home  phone Area code
	public static WebElement txtHomeAreaCode(WebDriver driver)
	{
		return WebElements.byId(driver,"driverAddressNumberPanel:cellAreaCode");
	}
	//Home  phone Extension
	public static WebElement txtHomeNumber(WebDriver driver)
	{
		return WebElements.byId(driver,"driverAddressNumberPanel:cellNumber");
	}
	//Home  phone Extension
	public static WebElement txtHomeExt(WebDriver driver)
	{
		return WebElements.byId(driver,"driverAddressNumberPanel:j_idt115");
	}
	//Work phone
	public static WebElement rdWorkPhNo(WebDriver driver)
	{
		return WebElements.byXpath(driver,".//*[@id='driverAddressNumberPanel:opt3']/div[2]/span");
	}
	//Work  phone Area code
	public static WebElement txtWorkAreaCode(WebDriver driver)
	{
		return WebElements.byId(driver,"driverAddressNumberPanel:cellAreaCode");
	}
	//Work  phone Extension
	public static WebElement txtWorkNumber(WebDriver driver)
	{
		return WebElements.byId(driver,"driverAddressNumberPanel:cellNumber");
	}
	//Work  phone Extension
	public static WebElement txtWorkExt(WebDriver driver)
	{
		return WebElements.byId(driver,"driverAddressNumberPanel:j_idt115");
	}
	//recharge Account
	public static WebElement txRechgAcc(WebDriver driver)
	{
		return WebElements.byId(driver,"rechargeAccount");
	}	
	//Recharge Account LOV
	public static WebElement lovRechgAcc(WebDriver driver)
	{
		return WebElements.byId(driver,"rechargeAccountLOV");
	}
	//Active Ind
	public static WebElement lstActiveInd(WebDriver driver)
	{
		return WebElements.byId(driver,"activeInd_label");
	}	
	//Active Indicator options
	public static WebElement lstActIndOptions(WebDriver driver,String testData)
	{
		return WebElements.byXpath(driver,".//*[@id='activeInd_panel']/div[2]/ul/li[text(),'"+testData+"']");
	}
	
	//Job Title
	public static WebElement txtJobTile(WebDriver driver)
	{
		return WebElements.byId(driver,"title");
	}
	//Department
	public static WebElement txtDept(WebDriver driver)
	{
		return WebElements.byId(driver,"department");
	}
	//Eployee Ref No
	public static WebElement txtEmpRefNoDept(WebDriver driver)
	{
		return WebElements.byId(driver,"payrollNo");
	}
	//Manual Status
	public static WebElement lstManualStatus(WebDriver driver)
	{	
		return WebElements.byId(driver,"manualStatus_label");
	}
	//Manual status options
	public static WebElement lstManualStatusOptions(WebDriver driver,String testData)
	{	
		return WebElements.byXpath(driver,".//*[@id='manualStatus_panel']/div[2]/ul/li[contains(text(),'"+testData+"')]");
	}
	
	//Recharge Code
	public static WebElement txtRecgCode(WebDriver driver)
	{
		return WebElements.byId(driver,"rechargeCode");
	}
	//Save
	public static WebElement btnSave(WebDriver driver)
	{
		return WebElements.byId(driver,"submit");
	}
	//Save and Stay
	public static WebElement btnSaveStay(WebDriver driver)
	{
		return WebElements.byId(driver,"submitAndStay");
	}
	//Cancel
	public static WebElement btnCancel(WebDriver driver)
	{
		return WebElements.byId(driver,"cancel");
	}
	//client number
	public static WebElement txtClientNumber(WebDriver driver)
	{
		return WebElements.byId(driver,"customerAccount");		
	}
	//Deallocate/Allocate button
	public static WebElement btnAllocate(WebDriver driver)
	{
		return WebElements.byId(driver,"reAllocate");
	}
	//New driver text box
	public static WebElement txtNewDriver(WebDriver driver)
	{
		return WebElements.byId(driver,"driverName");
	}	
	//New driver LOV
	public static WebElement lovNewDriver(WebDriver driver)
	{
		return WebElements.byId(driver,"driverNameLOV");
	}	
	//New driver select button
	public static WebElement btnNewDriverSelect(WebDriver driver)
	{
		return WebElements.byId(driver,"drvLovDataTblForm:driverSelectButton");
	}
	//Odo meter reading text box
	public static WebElement txtOdoReading(WebDriver driver)
	{
		return WebElements.byId(driver,"odoReading");
	}
	//Client LOV
	public static WebElement lovClientAdd(WebDriver driver)
	{
		return WebElements.byId(driver,"customerAccountLOV");
	}
	//Select client button
	public static WebElement btnClientSelect(WebDriver driver)
	{
		return WebElements.byId(driver,"custLovDataTblForm:customerSelectButton");
	}
}