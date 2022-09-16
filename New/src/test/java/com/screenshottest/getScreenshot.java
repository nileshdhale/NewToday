package com.screenshottest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utility.TakeScreenshot;

public class getScreenshot {  //only one test case
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
    driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	}
	@Test
	public void testcase1() {
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Demo");
		
		Assert.assertTrue(true);
		//TakeScreenshot.screenshot(driver);
		}
	@Test
	public void testcase2() {
		
		
		Assert.assertTrue(true);
	}
	
	@AfterMethod
	public void teardown(ITestResult result) {
		if(result.FAILURE==result.getStatus()) {
			TakeScreenshot.screenshot(driver,result.getName());	
			
		}
		
		driver.quit();
		
	}

}
