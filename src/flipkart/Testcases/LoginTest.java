package flipkart.Testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import flipkart.Main.basePage;
import flipkart.Pages.accountPage;
import flipkart.Pages.doLogin;
import flipkart.Util.testUtil;


public class LoginTest {
	
	@Test
	public void logintest() {
		if(! testUtil.isTestExecutable("logintest",basePage.xls))
		throw new SkipException("Skip Test , RunMode set to No");
		
		doLogin l = new doLogin();
		accountPage page = null;
		try {
			page = l.Login("laghuta@gmail.com", "Vihaan@03");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		boolean testdatatype = true;
		 	if(!testdatatype)
			Assert.assertTrue(false, "Invalid details. Please try again");
		 	else if(testdatatype & page == null)
			Assert.assertTrue(false , "Not Able to Login with correct usrname and password");
			else if(!testdatatype & page != null)
			Assert.assertTrue(false , "Able to Login with incorrect usrname and password");
			
		 basePage.isLoggedin = true;
			
			
			
		
	}	
}
	
	