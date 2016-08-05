import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class customListener extends TestListenerAdapter {
	
	public void onTestFailure(ITestResult tr){
		System.out.println(tr.getTestName()+"FAILED");
		
	}
	
	public void onTestPassed(ITestResult tr){
		System.out.println(tr.getTestName()+"PASSED");
		
	}

}
