package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.contacts;
import com.qa.pages.loginPage;

public class ContactPageTest extends TestBase {
	
	loginPage LoginPage;
	HomePage homepage;
	contacts Contacts;

	public ContactPageTest() throws Exception {
		super();
		
	}

	@BeforeMethod
	public void setup() throws Exception{
		
		initialization();
		LoginPage=new loginPage();
		Contacts = new contacts();
		homepage =LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	
	@Test(priority=1)
	public void titletest() throws Exception{
		Contacts.clickcontacts();
		Thread.sleep(3000);
		Assert.assertTrue(Contacts.verifycontactlogo());
	}
	
	@Test(priority=2)
	public void clickcontacttest() throws InterruptedException{
		Contacts.clickcontacts();
		Thread.sleep(3000);
		Contacts.clickcheckbox();
	}
	
	
	
	@AfterMethod
	public void teardown(){
		
		driver.quit();
	}
	
}
