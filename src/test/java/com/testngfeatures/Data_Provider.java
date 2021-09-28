package com.testngfeatures;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Data_Provider {
	
	
@Test(dataProvider = "testdata")	
private void credentials(String username, int password) {
		
		System.out.println("Username::"+ username);
		System.out.println("Password::"+ password);

	}

@DataProvider
private Object[][] testdata() {
	
	return new Object[][] {
		
		{"Raja",123},
		{"Ashok",345},
		{"Balu",4554},
		{"Shiva",6785}
		
		};
}

}
