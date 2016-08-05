package flipkart.rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class Listeners {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver  driver = new FirefoxDriver();
		EventFiringWebDriver event =  new EventFiringWebDriver(driver);
		ActivityCapture ac = new ActivityCapture();
		event.register(ac);
		event.navigate().to("http://www.facebook.com");
		event.unregister(ac);
		
		
		
		

	}
	

}
