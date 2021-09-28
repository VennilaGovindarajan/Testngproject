package com.testngfeatures;

import org.testng.annotations.Test;

public class Priority_Concept {
	
	@Test(priority = 2)
	private void login() {
		System.out.println("Click Login Button");

	}
	
	
	@Test(priority = -1)
	private void setproperty() {
		System.out.println("Browser Launch");
	}
	
	@Test(priority = 1)
	private void password() {
		System.out.println("Password");
	}
	
	//default priority value is zero
	@Test
	private void username() {
		System.out.println("Username");

	}
	

}
