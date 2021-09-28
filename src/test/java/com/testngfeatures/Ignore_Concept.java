package com.testngfeatures;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	
	@BeforeMethod	
	private void login() {
	
	System.out.println("click the login button");

	}
	
	

	
	@Test
	private void laptop() {
		System.out.println("Laptop");


	}

	@Test
	private void mobilephones() {
		System.out.println("MobilePhones");


	}
	
	@Ignore
	@Test
	private void books() {
		System.out.println("Books");

	}
	
	
	@Test(enabled = false)
	private void earphones() {
		System.out.println("Earphones");

	}
	@AfterMethod
	private void logout() {
		System.out.println("Logout");

	}

}
