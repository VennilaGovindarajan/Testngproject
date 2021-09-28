package com.testngfeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry_Concept {

	@Test(retryAnalyzer = Retry_Class.class)
	private void username() {

		String expected_Username = "Smith";

		String actual_Username = "Smith";

		Assert.assertEquals(actual_Username, expected_Username);

	}

	@Test(retryAnalyzer = Retry_Class.class)
	private void password() {

		String expected_Password = "123";

		String actual_Password = "456";

		Assert.assertEquals(actual_Password, expected_Password);

	}

}
