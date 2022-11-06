package com.tutorialsninja.test;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class HomePageTest extends BaseTest {

	@Test(priority = 1)
	public void verifyLoginForm() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("driver success");
		homepage.clickMyAccount();
		homepage.clickLinkLogin();
		Thread.sleep(2000);
		homepage.verifyFormLogin();
		// creates a toggle for the given test, adds all log events under it
		test = extent.createTest("Test 01","verifyLoginForm");

		// log(Status, details)
		test.log(Status.INFO, "This step shows Test Scenario verifyLoginForm succes");

		// info(details)
		test.info("This step shows usage of info(details)");

	}

	@Test(priority = 2)
	public void LogintestWithValidCredetial() {
		homepage.clickMyAccount();
		homepage.clickLinkLogin();
		homepage.verifyFormLogin();
		homepage.inputEmail("melsigogo@gmail.com");
		homepage.inputPassword("Password21");
		homepage.clickLogin();
		homepage.verifyHasLogin();
		test = extent.createTest("Test 02","LogintestWithValidCredetial");

		// log(Status, details)
		test.log(Status.INFO, "This step shows Test Scenario LogintestWithValidCredetial succes");

	}
	@Test
	public void test1() {
		System.out.println("testA");
		test = extent.createTest("Test A","LogintestWithValidCredetial");
		test.log(Status.INFO, "This step shows Test Scenario Test A succes");
		test.info("This step shows usage of info(details)");
	}
	@Test
	public void test2() {
		System.out.println("testB");
		test = extent.createTest("Test B","LogintestWithValidCredetial");
		test.log(Status.INFO, "This step shows Test Scenario testB succes");
		test.info("This step shows usage of info(details)");

	}
	@Test
	public void test3() {
		System.out.println("testC");
		test = extent.createTest("Test C","testC");
		test.log(Status.INFO, "This step shows Test Scenario testC succes");
		test.info("This step shows usage of info(details)");

	}

}
