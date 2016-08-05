package fliokart.java.practice;

import java.util.ArrayList;
import java.util.List;

import org.testng.IClass;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

public class listener_practice extends TestListenerAdapter {
	
	List l = new ArrayList();
	public void onTestSucess(ITestResult tr){
		
		
	}
	
	public void OnTestFailure(ITestResult tr){
		
	}
	public void OnTestSkipped(ITestResult tr){
		log("TestSkipped");
		Reporter.log("jh");
		
	}
	public void onTestStart(ITestResult tr) {
		log("Test Started....");
		
		
		
	}
	
	public void OnTestFinish (ITestResult tr){
		log("Test Finish");
	}

	private void log(String string) {
		System.out.println(string);
	}

	private void log(IClass testClass) {
		System.out.println(testClass.getName());
		
	}

}
