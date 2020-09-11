package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws Exception{
		
		prop=new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\praveen.subbarao\\Desktop\\ui-automation-framework-master\\FreeCRM\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(ip);
		
		}
	
	public static void initialization(){
		
		String browsername = prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\praveen.subbarao\\Desktop\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
