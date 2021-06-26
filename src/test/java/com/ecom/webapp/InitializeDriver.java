package com.ecom.webapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitializeDriver {

	final static String driverPath = "driver\\chromedriver.exe";
	static WebDriver driver;

	// initialize selenium driver
	public static void init() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		// set global driver 
		RuntimeDriver.setDriver(driver);
	}

}
