package flipkart.Testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import flipkart.Main.basePage;
import flipkart.Pages.accountPage;
import flipkart.Pages.addressespage;
import flipkart.Pages.doLogin;
import flipkart.Util.testUtil;

public class addAddress {
	
	@Test
	public void verifyAddress() throws InterruptedException{
		
		if(testUtil.isTestExecutable("addresses", basePage.xls))
		throw new SkipException("Skip Test , RunMode set to No");
		
		doLogin l = new doLogin();
		accountPage page =null;
		if(!basePage.isLoggedin)
			 page = l.Login();
		addressespage addrPage = page.addresses();
		addrPage.spanData();
	
	
	
	}		
}