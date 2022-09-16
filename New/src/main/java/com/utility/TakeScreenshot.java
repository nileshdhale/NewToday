package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {
	
	public static void screenshot(WebDriver driver, String string) {
		TakesScreenshot takescreenshot=(TakesScreenshot) driver; 
		File srcfile=takescreenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile,new File(System.getProperty("user.dir") +"\\screenshot\\screenshot1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	

}
