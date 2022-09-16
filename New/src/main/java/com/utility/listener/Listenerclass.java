package com.utility.listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.baselistener.BaseClass;

public class Listenerclass extends BaseClass implements ITestListener {
	public void onTestStart(ITestResult result) {
		
		
		
	}
	public void onTestSuccess(ITestResult result) {
		
		
	}
	public void onTestFailure(ITestResult result) {
		screenshot(result.getName());
		
	}
	public void onTestSkipped(ITestResult result) {
		
		
	}
	
	
	
	
	
	

}
