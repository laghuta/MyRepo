package flipkart.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import flipkart.Main.basePage;

public class doLogin extends basePage{
	
	

	public accountPage Login(String username, String password) throws InterruptedException{
		ff.get(OR.getProperty("URL"));
		//ff.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		clickLinkText("SIGNUP");
		
		inputbyXpath("USERNAMEINPUTBOX",username);
		inputbyXpath("PASSWORDINPUTBOX", password);
		
		click("LOGIN");
		
		Thread.sleep(3000L);
		/*if(isElementPresent("CHANGEPASSWORD"))
			return new accountPage(); 
		else
			return null;*/
		return new accountPage();
	}
	
	public accountPage Login() throws InterruptedException{
		return Login(OR.getProperty("defaultusername"),OR.getProperty("defaultpassword"));
	}
	public void showPassword(){
		if(isElementPresent("PASSWORDINPUTBOX"))
			
		click("SHOW_PASSWORD");
		else
		System.out.println("Password Empty");
	}
	
	public void forgotPassword(){
		
	}
	
	public void errorMessage(){
		WebElement errMsg = ff.findElement(By.xpath("//div[@class='login-wrap']/div[2]/div[contains(text(),'Invalid details')]"));
	}
	

}
