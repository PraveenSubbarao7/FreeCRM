package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.contacts;
import com.qa.pages.loginPage;

public class HomePageTest extends TestBase{

	loginPage loginpage;
	HomePage homepage;
	contacts Contacts;
	public HomePageTest() throws Exception {
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws Exception{
		initialization();
		loginpage = new loginPage();
		Contacts = new contacts();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomepagetitleTest(){
		String title=homepage.verifyHomepagetitle();
		Assert.assertEquals(title, "Cogmento CRM");
		
	}
	
	@Test(priority=2)
	public void verifyUsernameTest(){
		
		boolean username=homepage.userName();
		Assert.assertTrue(username);
	}
	
	@Test(priority=3)
	public void verifyContactlinkTest() throws Exception{
		Contacts =homepage.clickonContactslink();
	}
	
	
	
	
	@AfterMethod
	public void teardown(){
		
		driver.quit();
	}

}
