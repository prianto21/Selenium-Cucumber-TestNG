package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepagePage {

	public homepagePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="nav-hamburger-menu")
	WebElement leftSideBar;
	public void clickSideBar() {
		leftSideBar.click();
	}
//	/html[1]/body[1]/div[4]/div[2]/div[1]/ul[1]/li[7]/a[1]
	//span[@class='a-size-base a-color-base'][normalize-space()='Televisions']
	@FindBy(xpath = "//a[@data-menu-id='5']")
	WebElement electronik_btn;
	public void click_electronik() {
		electronik_btn.click();
	}
	
//	//li/a[text()='Television & Video']
	@FindBy(xpath = "//li/a[text()='Television & Video']")
	WebElement televAndVideo_btn;
	public void click_televVideo() {
		televAndVideo_btn.click();
	}
	
//	//a/span[text()='Televisions']
	@FindBy(xpath = "//a/span[text()='Televisions']")
	WebElement televisions_btn;
	public void click_television() {
		televisions_btn.click();
	}
	
//	//ul/li[@aria-label='32 Inches & Under']
	@FindBy(xpath = "//ul/li[@aria-label='32 Inches & Under']")
	WebElement inches32Under_btn;
	public void ceklis_32inches() {
		inches32Under_btn.click();
	}
	
	@FindBy(xpath = "//li/a[@id='s-result-sort-select_2' and @data-value='{\"stringVal\":\"price-desc-rank\"}' and  text()='Price: High to Low' and @aria-hidden='true' and @class='a-dropdown-link a-active']")
	WebElement PriceByDesc_btn;
	public void select_priceByDesc() {
		PriceByDesc_btn.click();
	}
	
	
	
}
