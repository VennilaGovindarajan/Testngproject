package com.testngfeatures;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Soft_Concept {
	
	@Test
	private void data_Validation() {
		String actual_Username ="Smith";
		
		String expected_Username="Rohit";
		
		
		//softassert --> Class
		SoftAssert s = new SoftAssert();
		s.assertEquals(actual_Username, expected_Username);
		System.out.println("Data Verification");
		
	}

}
