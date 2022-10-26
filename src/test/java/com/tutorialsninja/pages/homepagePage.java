package com.tutorialsninja.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class homepagePage {

	public homepagePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@title='My Account']")
	WebElement myAccountMenu;

	public void clickMyAccount() {
		myAccountMenu.click();
	}
	
	@FindBy(xpath = "//a[text()='Login']")
	WebElement login_btn;
	public void clickLinkLogin() {
		login_btn.click();
	}
	
	@FindBy(xpath="//h2[text()='Returning Customer']")
	WebElement form_login;
	public void verifyFormLogin() {
		Assert.assertTrue(form_login.isDisplayed());
	}
	
	@FindBy(name = "email")
	WebElement emailField;
	public void inputEmail(String email) {
		emailField.sendKeys(email);
	}
	
	@FindBy(name = "password")
	WebElement passwordField;
	public void inputPassword(String password) {
		passwordField.sendKeys(password);
	}
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement LoginBtn;
	public void clickLogin() {
		LoginBtn.click();
	}

	@FindBy(xpath = "//h2[text()='My Account']")
	WebElement MyAccountTextHasLogin;
	public void verifyHasLogin() {
		Assert.assertTrue(MyAccountTextHasLogin.isDisplayed());
	}
}














