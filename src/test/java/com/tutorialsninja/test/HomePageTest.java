package com.tutorialsninja.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{
	
	@Test
	public void verifyLoginForm() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("driver success");
		homepage.clickMyAccount();
		homepage.clickLinkLogin();
		homepage.verifyFormLogin();
		Thread.sleep(2000);
		
	}
	
	@Test
	public void LogintestWithValidCredetial() {
		homepage.clickMyAccount();
		homepage.clickLinkLogin();
		homepage.verifyFormLogin();
		homepage.inputEmail("melsigogo@gmail.com");
		homepage.inputPassword("Password21");
		homepage.clickLogin();
		homepage.verifyHasLogin();
	}

}
