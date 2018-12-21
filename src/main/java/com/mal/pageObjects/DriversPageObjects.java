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
	public static void lstTitle(WebDriver driver,String testData)
	{
		WebElements.byId(driver,"titleCode_label").click();
		WebElements.byXpath(driver,".//*[@id='titleCode_panel']/div/ul/li[contains(text(),'"+testData+"')]").click();
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
	//Grade froup
	public static void lstGrade(WebDriver driver,String testData)
	{	
		WebElements.byId(driver,"driverGradeGroupCodes_label").click();
		WebElements.byXpath(driver,".//*[@id='driverGradeGroupCodes_panel']/div/ul/li[contains(text(),'"+testData+"')]").click();
	}
	
	//Email
	public static WebElement txtEmail(WebDriver driver)
	{
		return WebElements.byId(driver,"email");
	}
	//Cost center
	public static void lstCostCenter(WebDriver driver,String testData)
	{	
		WebElements.byId(driver,"costCentreCode_label").click();
		WebElements.byXpath(driver,".//*[@id='costCentreCode_panel']/div/ul/li[contains(text(),'"+testData+"')]").click();
	}
	//Add address
	public static WebElement btnAdd(WebDriver driver)
	{
		return WebElements.byId(driver,"driverAddressNumberPanel:addButton");
	}
	//address type
	public static WebElement btnAddType(WebDriver driver)
	{
		return WebElements.byId(driver,"addressForm:addressType_label");
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
		return WebElements.byId(driver,"addressForm:dialogAddressLine1");
	}
	//Postal Code
	public static WebElement txtPostalCode(WebDriver driver)
	{
		return WebElements.byId(driver,"addressForm:dialogPostcode");
	}
	//Postal search button
	public static WebElement btntPostalSearch(WebDriver driver)
	{
		return WebElements.byId(driver,"addressForm:dialogSearchButton");
	}
	//Postal city
	public static void lstCity(WebDriver driver)
	{}
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
		return WebElements.byId(driver,"driverAddressNumberPanel:opt1");
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
		return WebElements.byId(driver,"driverAddressNumberPanel:opt2");
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
		return WebElements.byId(driver,"driverAddressNumberPanel:opt3");
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
	//recharge ind
	public static WebElement txRechgInd(WebDriver driver)
	{
		return WebElements.byId(driver,"rechargeAccount");
	}
	//Active Ind
	public static void lstActiveInd(WebDriver driver,String testData)
	{
		WebElements.byId(driver,"activeInd_label").click();
		WebElements.byXpath(driver,".//*[@id='activeInd_panel']/div/ul/li[contains(text(),'"+testData+"')]").click();
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
	public static void lstManualStatus(WebDriver driver,String testData)
	{	
		WebElements.byId(driver,"manualStatus_label").click();
		WebElements.byXpath(driver,".//*[@id='manualStatus_panel']/div/ul/li[contains(text(),'"+testData+"')]").click();
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
}
