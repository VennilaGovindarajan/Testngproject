package com.testngfeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Hard_Concept {
	
	@Test
	private void data_Validation() {
		String actual_Username ="Smith";
		
		String expected_Username="Rohit";
		
		Assert.assertEquals(actual_Username, expected_Username);
	
		System.out.println("Data Validation");

	}

}
