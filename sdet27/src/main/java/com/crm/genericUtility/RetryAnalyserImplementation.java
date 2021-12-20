package com.crm.genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class  RetryAnalyserImplementation implements IRetryAnalyzer{
	
int count =0;

int retrycount=5;

public boolean retry(ITestResult results) {
	while(count <=retrycount)
	{
		count++;
		return true;
	}
	return false;
}





}
