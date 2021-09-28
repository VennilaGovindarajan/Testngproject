package com.TestNG_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_Provider_implementation {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"//driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		
	}

	
	
}
