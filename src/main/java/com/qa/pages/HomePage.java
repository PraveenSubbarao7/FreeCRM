package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {

	
	
	@FindBy(xpath="//div[@class='header item']")
	WebElement logo;
	
	@FindBy(xpath="//span[contains(text(),'Praveen Subbarao')]")
	WebElement name;
	
	@FindBy(xpath="//a[contains(text(),'Free account')]")
	WebElement account;
	
	@FindBy(xpath="//span[contains(text(),'Calendar')]")
	WebElement calenderlink;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactslink;
	
	@FindBy(xpath="//span[contains(text(),'Companies')]")
	WebElement companieslink;
	
	public HomePage() throws Exception {
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyHomepagetitle(){
		
		return driver.getTitle();
	}
	
	public boolean logoCheck(){
		
		return logo.isDisplayed();
	}
	
	public contacts clickonContactslink() throws Exception{
		contactslink.click();
		return new contacts();
		
	}
	
	public Calender clickOnCalenderlink(){
		calenderlink.click();
		return new Calender();
		
	}
	
	public Companies clickOnCompanies(){
		companieslink.click();
		return new Companies();
		
	}
	
	public boolean userName(){
		
		return name.isDisplayed();
	}

}
