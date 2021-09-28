package com.testngfeatures;

import org.testng.annotations.Test;

public class Expected_Exceptions {
	
	
//	@Test
//	private void demo() {
//		int a =10;
//		
//		System.out.println(a/0);
//
//	}
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void demo() {
		int a =10;
		
		System.out.println(a/0);

	}

//	@Test(expectedExceptions = NullPointerException.class)
//	private void demo() {
//		int a =10;
//		
//		System.out.println(a/0);
//
//	}

	
}
