package com.ecom.webapp;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadGithubProfileTest {
	
	String profileURL = "https://github.com/settings/profile";
	WebDriver driver;
	
	@BeforeEach
	void setUp() {
		InitializeDriver.init();
		driver = RuntimeDriver.getDriver();
	}
	
	@AfterEach
	void cleanUp() {
		driver.close();
	}
	
	@Test
	public void testForGithubUserProfile() throws InterruptedException, IOException {
		
		// login
		LoginToGithub.userLogin();
		
		// navigate to profile
		driver.get(profileURL);
		
		// click on edit / upload profile
		driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div[2]/div[2]/div[2]/dl/dd/div/details/summary")).click();
		driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div[2]/div[2]/div[2]/dl/dd/div/details/details-menu/label")).click();
		
		Thread.sleep(2000);
		
		// run / execute upload.exe
		Runtime.getRuntime().exec("driver\\upload.exe");
		
		// confirm the profile upload
		driver.findElement(By.xpath("/html/body/details/details-dialog/form/div[2]/button")).click();
		
		Thread.sleep(2000);
		
	}
}
