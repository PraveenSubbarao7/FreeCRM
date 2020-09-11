package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class contacts extends TestBase {
	
	
	@FindBy(xpath="//div[@class='ui header item mb5 light-black']")
	WebElement contactlogo;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactsclick;
	
	@FindBy(xpath="//div[@class='ui fitted checkbox']")
	WebElement checkbox;
	
	
	public contacts() throws Exception{
		
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifycontactlogo(){
		
		return contactlogo.isDisplayed();
	}
	
	public void clickcheckbox(){
		checkbox.click();
	}

	public void clickcontacts(){
		contactsclick.click();
	}
}
