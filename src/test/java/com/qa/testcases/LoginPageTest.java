package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.loginPage;

public class LoginPageTest extends TestBase {
	
	public LoginPageTest() throws Exception {
		super();
		
	}
	
	loginPage loginpage;
	HomePage homepage;

	
	
	@BeforeMethod
	public void setup() throws Exception{
		initialization();
		 loginpage = new loginPage();
		
	}
	
	@Test(priority=1)
	public void loginPagetitletest(){
		
		String title =loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
		
		}
	
	@Test(priority=2)
	public void loginTest() throws Exception{
		
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}

}
