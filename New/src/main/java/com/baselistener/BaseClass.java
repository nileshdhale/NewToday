package com.baselistener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
	@BeforeMethod
	public void setup() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\Documents\\Softwares\\chromedriver_win32\\chromedriver.exe");
    driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	}
	
	public  void screenshot(String filename) {
		TakesScreenshot takescreenshot=(TakesScreenshot) driver; 
		File srcfile=takescreenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile,new File(System.getProperty("user.dir") +"\\screenshot\\"+filename+" .png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
