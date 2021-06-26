package com.ecom.webapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginToGithub {

	public static void userLogin() {
		String siteURL = "https://github.com/login";
		WebDriver driver = RuntimeDriver.getDriver();
		driver.get(siteURL);
		// enter username and password
		driver.findElement(By.id("login_field")).sendKeys(LoginCreds.username);
		driver.findElement(By.id("password")).sendKeys(LoginCreds.password);
		
		// submit login
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[12]")).submit();
	}
}
