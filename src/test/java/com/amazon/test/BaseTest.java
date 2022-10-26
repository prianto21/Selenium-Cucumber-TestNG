package com.amazon.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.amazon.pages.homepagePage;

import cmnLibrary.CmnDriver;

public class BaseTest {
	
	CmnDriver cmnDriver;
	
	WebDriver driver;
	
//	declare page
	homepagePage homepage;
	
	@BeforeClass
	public void preSetup()throws Exception{
		openBrowser("chrome");
		navigateToUrl("https://www.amazon.com/");
		driver=cmnDriver.getDriver();
		
		pageInitialization();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@BeforeMethod
	public void setUp() {

		System.out.println("before method");

	}

	@AfterMethod
	public void cleanUp() {
		System.out.println("after method");
	}

	@AfterClass
	public void postCleanUp() {
		cmnDriver.closeBrowser();
	}

	
	
	
	
	private void openBrowser(String browserType) throws Exception {
		// TODO Auto-generated method stub
		cmnDriver = new CmnDriver(browserType);
	}
	
	private void navigateToUrl(String url) throws Exception{
//		navigate url
		cmnDriver.navigateToUrl(url);
	}
	
	private void pageInitialization() {
		homepage=new homepagePage(driver);
	}
}
