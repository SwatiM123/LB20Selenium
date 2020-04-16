package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;

import com.training.pom.UNFPOM050;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.trianing.waits.WaitTypes;

public class UNFTests050 {

	private WebDriver driver;
	private String baseUrl;
//	private LoginPOM loginPOM;
	private UNFPOM050 UNFPOM050;
	private Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public  void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	//
		driver = DriverFactory.getDriver(DriverNames.CHROME);
	//	loginPOM = new LoginPOM(driver); 
		UNFPOM050 = new UNFPOM050(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	
	}

	@BeforeMethod
		public void setUp() throws Exception {
	/*	driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl); */
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	@Test(priority = 0)
	public void validLoginTest() {
	Boolean flag = UNFPOM050.LoginUser("admin","admin@123");
		if(flag){
			System.out.println("LogIn Successful");
		}
		else
		{
			System.out.println("LogIn Unsuccessful");
		}
	Boolean flag2 = UNFPOM050.UNF_050();	
	if(flag2){
		System.out.println("UNF_050 Successful");
	}
	else
	{
		System.out.println("UNF_050 Unsuccessful");
	}
	}
	

		
	
}
