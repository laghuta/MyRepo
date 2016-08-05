package flipkart.Main;

import flipkart.Pages.accountPage;
import flipkart.Pages.addressespage;
import flipkart.Pages.doLogin;
import flipkart.Pages.homePage;

public class mainFunction {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		doLogin l = new doLogin();
		
		accountPage ap = l.Login("laghuta@gmail.com", "Vihaan@03");
		//l.showPassword();
		//Thread.sleep(5000L);
		//ap.subscribeAll();
		//ap.changePassword();
		addressespage addr = ap.addresses();
		addr.spanData();
		//ap.addresses();
	

	}

	

}


