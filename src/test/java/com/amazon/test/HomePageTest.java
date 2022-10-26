package com.amazon.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{
	
	@Test
	public void test_01() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("driver success");
		homepage.clickSideBar();
		Thread.sleep(2000);
		homepage.click_electronik();
		Thread.sleep(2000);
		homepage.click_televVideo();
		homepage.click_television();
		homepage.ceklis_32inches();
		homepage.select_priceByDesc();
	}

}
