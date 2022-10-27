package com.tutorialsninja.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.tutorialsninja.pages.homepagePage;

import cmnLibrary.CmnDriver;

public class BaseTest {
	
	CmnDriver cmnDriver;
	
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
//	declare page
	homepagePage homepage;
	
	@BeforeSuite
	public void setReport() {
		System.out.println("test before suite");
		
		// start reporters
        htmlReporter = new ExtentHtmlReporter("extent.html");
    
        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
	}
	
	@BeforeClass
	public void preSetup()throws Exception{
		openBrowser("chrome");
		navigateToUrl("http://www.tutorialsninja.com/demo/");
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
		driver.close();
		
	}

	@AfterSuite
	public void tearDown() {
		System.out.println("test after suite");
		cmnDriver.closeBrowser();
        // calling flush writes everything to the log file
        extent.flush();

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
