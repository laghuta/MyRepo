package flipkart.Testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import flipkart.Main.basePage;
import flipkart.Pages.ChangePassword;
import flipkart.Pages.accountPage;
import flipkart.Pages.doLogin;
import flipkart.Util.testUtil;

public class AccountPageTest {
	
	@Test
	public void accountpagetest() throws InterruptedException{
		if(!testUtil.isTestExecutable("changePassword", basePage.xls))
		throw new SkipException("Skip Test , RunMode set to No");
		accountPage page =null;
		if(!basePage.isLoggedin){
			doLogin l = new doLogin();
			 page = l.Login();
		}
		//ChangePassword cp =
				page.changePassword();
		 
		
		
	}
	
	

}
