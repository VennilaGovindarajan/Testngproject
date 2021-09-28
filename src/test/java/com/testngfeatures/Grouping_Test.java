package com.testngfeatures;

import org.testng.annotations.Test;

public class Grouping_Test {
	
	@Test(groups = "Social media")
	private void facebook() {
		System.out.println("Facebook");

	}
	
	@Test(groups = "E_Commerce")
	private void flipkart() {
		System.out.println("Flipkart");

	}
	
	@Test(groups = "Social media")
	private void instagram() {
		System.out.println("Instagram");

	}
	
	@Test(groups = "Social media")
	private void whatsapp() {
		System.out.println("Whatsapp");
	}
	
	@Test(groups = "E_Commerce")
	private void amazon() {
		System.out.println("Amazon");

	}
	
	@Test(groups = "Entertainment")
	private void gannamusic() {
		System.out.println("Ganna Songs");
	}
	
	@Test(groups = "Entertainment")
	private void melodymusic() {
		System.out.println("Melody Songs");

	}

}
