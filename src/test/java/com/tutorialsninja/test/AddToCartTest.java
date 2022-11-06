package com.tutorialsninja.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest{
	@Test
	public void AddToCart() {
		homepage.AddToCart();
		homepage.NotifSuccesAddItem();
	}

	
}
