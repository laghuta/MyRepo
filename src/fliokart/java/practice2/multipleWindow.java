package fliokart.java.practice2;

import java.io.File;
import java.io.IOException;
import java.util.Set;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.collections.Sets;


//@Listeners(fliokart.java.practice2.customListener.class)
public class multipleWindow {
	@Test	
	public void setup() throws IOException{
	WebDriver ff = new FirefoxDriver();
	Reporter.log("inialized firefox");
	EventFiringWebDriver  event = new EventFiringWebDriver(ff);
	webdriverListener webdriver = new webdriverListener();
	event.register(webdriver);
	
	String newWindow = null;
	event.get("http://toolsqa.com/automation-practice-switch-windows");
	Reporter.log("Site openned \n");
	String firstWindow = event.getWindowHandle();
	System.out.println(firstWindow+"----First Window");
	event.findElement(By.xpath(".//*[@id='alert']")).click();
	//Set <String> windowhandles = ff.getWindowHandles();
	/*for(String wh: ff.getWindowHandles()){
		if(!wh.equals(firstWindow))
			newWindow =wh;
		}
	 
	System.out.println(newWindow +"new window");*/
	
	File srcfile = ((TakesScreenshot)ff).getScreenshotAs(OutputType.FILE) ;
	FileUtils.copyFile(srcfile, new File("D://SS.png"));
	
	Alert alert = event.switchTo().alert();
	alert.accept();
	
	
	
	
	
 
	 
	
	}

	
}
