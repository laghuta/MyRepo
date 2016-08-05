package fliokart.java.practice2;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class customListener extends TestListenerAdapter {
	  private int m_count=0;
	public void onTestFailure(ITestResult tr){
		log(tr.getName()+"- TEST Method FAILED \n");
		
	}
	
	public void onTestSuccess(ITestResult tr){
		log(tr.getName()+" - Test Method PASSED \n");
		
	}
	private void log(String string) {
        System.out.print(string);
      
       
    }

}
