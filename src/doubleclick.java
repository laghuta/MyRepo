import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class doubleclick {
	
	WebDriver ff = null;
			
			@BeforeTest
			public void start(){
				ff = new FirefoxDriver();
				ff.manage().window().maximize();
				ff.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				
			}
			
			@Test
			public void doubleclick(){
				ff.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
				WebElement dc = ff.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
				Actions action = new Actions(ff);
				action.doubleClick(dc).build().perform();
				WebDriverWait wait = new WebDriverWait(ff,5);
				//wait.until(ExpectedConditions.alertIsPresent());
				Alert  alert = ff.switchTo().alert();
				alert.accept();
				String alerttext = alert.getText();
				System.out.println(alerttext);
				
				
				
				
				
				
			}
			/*@Test
			
			public void dragAnddrop(){
				ff.get("http://only-testing-blog.blogspot.in/2014/09/drag-and-drop.html");
				WebElement dragfrom = ff.findElement(By.xpath("//div[@id='dragdiv']"));
				WebElement dropto = ff.findElement(By.xpath("//div[@id='dropdiv']"));
				Actions ac = new Actions(ff);
				//Action dragAndDrop = ac.clickAndHold(dragfrom)
			    //        .moveToElement(dropto)
			    //        .release(dragfrom)
			    //        .build();
				dragAndDrop.perform();
				ac.dragAndDrop(dragfrom, dropto).build().perform();
			}*/
			
			@Test
			
			public void selectable(){
				ff.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
				
				List<WebElement> list = (List<WebElement>) ff.findElement(By.xpath("//*[@id='selectable']/li"));
				Actions act = new Actions(ff);
				act.dragAndDrop(list.get(2), list.get(5)).build().perform();
				
				Action a = act.build();
				a.perform();
				
			}
}
