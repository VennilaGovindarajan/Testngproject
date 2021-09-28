package com.testngfeatures;

import org.testng.annotations.Test;

public class Timeout_Concept {
	
	
	@Test(timeOut = 3000)  //internal.thread.ThreadTimeoutException
	private void login() throws Throwable {
	System.out.println("Username");
	System.out.println("Password");
	System.out.println("Click Login Button");
	Thread.sleep(4000);
	System.out.println("Navigate to Home page");
	
	}

//	@Test(timeOut = 4000)
//	private void login() throws Throwable {
//		System.out.println("Username");
//		System.out.println("Password");
//		Thread.sleep(2000);
//		System.out.println("Click Login Button");
//		Thread.sleep(1000);
//		System.out.println("Navigate to Home page");
//		
//		}
	
	
	
//	@Test(timeOut = 4000)  //internal.thread.ThreadTimeoutException
//	private void login() throws Throwable {
//		System.out.println("Username");
//		System.out.println("Password");
//		System.out.println("Click Login Button");
//		Thread.sleep(300000000);
//		System.out.println("Navigate to Home page");
//		
//		}
	
}
