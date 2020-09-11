package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class loginPage extends TestBase {

	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginbtn;
	
	public loginPage() throws Exception {
		super();
		PageFactory.initElements(driver, this);
		}
	
	public String validateLoginPageTitle(){
		
		return driver.getTitle();
	}
	
	public HomePage login(String un, String pw) throws Exception{
		username.sendKeys(un);
		password.sendKeys(pw);
		loginbtn.click();
		return new HomePage();

}
}
