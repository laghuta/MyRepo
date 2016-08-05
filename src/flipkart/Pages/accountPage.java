package flipkart.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import flipkart.Main.basePage;
import flipkart.Util.testUtil;

public class accountPage extends basePage {
	
	public void personalInfo(String name ){
	
	
	}
	@Test
	public ChangePassword changePassword(){
		click("CHANGEPASSWORD");
		inputbyId("OLDPASSWORD","Vihaan@03");
		inputbyId("NEWPASSWORD","Vihaan@03");
		inputbyId("CONFIRMPASSWORD","Vihaan@03");
		click("PASSWORD_SAVE_CHANGES");
		return new ChangePassword();
		
	}

	public addressespage addresses() throws InterruptedException{
		Thread.sleep(3000L);
		System.out.println("inside addreses");
		
		clickLinkText("ADDRESSES");
		//clearInputBox("NAME_INPUT_BOX");
		inputbyId("NAME_INPUT_BOX", "Laghuta");
		inputbyId("STREET_ADDRESS_INPUT" , "335 n 184th Plaza");
		inputbyId("LANDMARK","DowonTown");
		inputbyId("CITY","Delhi");
		selectDropdown("DROPDOWN","Punjab");
		Thread.sleep(5000L);
		inputbyId("PINCODE","144410");
		inputbyId("PHONE","9319909944");
		click("ADDRESS_SAVE_CHANGES");
		return new addressespage();
		
	}
	
	public void subscribeAll(){
		click("EMAIL_PREFRENCE");
		click("OFFER_ZONE");
		click("MARKETING");
		
	}
	
	public void profileSettings(){
		
	}
}

