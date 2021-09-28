package com.testngfeatures;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_Test_Concept {

	
	@Test
	@Parameters({"username","password"})
	private void credentials(@Optional("Rohit")String username, String password) {
		
		System.out.println("Username::"+ username);
		System.out.println("Password::"+ password);

	}

}
