package TestNG_listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Listeners_Class implements ITestListener //ctrl+click on this interface to open interface
{
	
	public void onStart(ITestContext context) {
		   System.out.println("test execution started...");
		  }
	 
	public void onTestStart(ITestResult result) {
		
		//result: captures all info of tst method like classname, test method name, groups etc.
		 System.out.println("test started...");
	  }
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("test passed...");
	  }
	
	public void onTestFailure(ITestResult result) {
		System.out.println("test failed...");
		  }
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped...");
	  }
	
	public void onFinish(ITestContext context) {
		System.out.println("test execution completed...");
	  }
	
  
  
  
  
  
  
  
}
