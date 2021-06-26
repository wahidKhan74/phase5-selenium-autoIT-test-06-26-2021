package com.ecom.webapp;

import org.openqa.selenium.WebDriver;

public class RuntimeDriver {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		RuntimeDriver.driver = driver;
	}
}
