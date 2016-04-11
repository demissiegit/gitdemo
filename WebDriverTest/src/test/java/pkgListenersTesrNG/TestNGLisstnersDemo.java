package pkgListenersTesrNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGLisstnersDemo implements ITestListener {

	public void onFinish(ITestContext result) {
		System.out.println("Test Case Finished: " +result.getName());
		
	}

	public void onStart(ITestContext result) {
		System.out.println("Test Case started: " +result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("TestCase has mixed results: " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("TestCases failed: " +result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCases skipped: " +result.getName());
		
	}

	public void onTestStart(ITestResult result) {
		System.out.println("TestCases test started testing: " +result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("TestCases successfully excuted: " +result.getName());
	}
	

}
