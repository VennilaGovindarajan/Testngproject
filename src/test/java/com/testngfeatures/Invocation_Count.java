package com.testngfeatures;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	@Test(priority = 0)
	private void browserlaunch() {
		System.out.println("Browser Launch");

	}
	
	@Test(priority = 1,invocationCount = 4)
	private void refresh() {
		System.out.println("Refresh");

	}
	
	@Test(priority = 2)
	private void nextpage() {
		System.out.println("Nextpage");

	}

}
