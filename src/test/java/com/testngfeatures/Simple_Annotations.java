package com.testngfeatures;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	@BeforeSuite
	private void setproperty() {
		System.out.println("SetProperty");

	}
	
	@BeforeTest
	private void browserlaunch() {
		System.out.println("Browser Launch");
	}
	
	@BeforeClass
	private void launchurl() {
		System.out.println("Launch URL");

	}
	@BeforeMethod	
	private void login() {
	
	System.out.println("click the login button");

	}
	
	
	//@test --> run based on ascii value
	@Test
	private void laptop() {
		System.out.println("Laptop");


	}

	@Test
	private void mobilephones() {
		System.out.println("MobilePhones");


	}
	@Test
	private void earphones() {
		System.out.println("Earphones");

	}
	@AfterMethod
	private void logout() {
		System.out.println("Logout");

	}
	
	@AfterClass
	private void verifyhomepage() {
		System.out.println("HomePage");

	}
	
	@AfterTest
	private void close() {
		System.out.println("Driver close");
	}
	
	@AfterSuite
	private void deleteallcookies() {
		System.out.println("Delete all cookies");

	}
	

}
