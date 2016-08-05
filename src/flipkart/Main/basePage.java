package flipkart.Main;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import flipkart.Util.Xls_Reader;

public class basePage {
	 public static WebDriver ff = null;
	 public static Properties OR = null;
	String path = System.getProperty("user.dir")+"\\src\\flipkart\\Properties\\OR.properties";
	public static Xls_Reader xls = new Xls_Reader("C:\\Users\\Laghuta\\workspace\\Flipkart\\TestCaseSheet.xlsx");
	public static boolean isLoggedin = false;
	FileInputStream  fis =null;
	public static topMenu topmenu = null;
	 
	
	public basePage(){
		 if(ff == null){
			//this.ff = new FirefoxDriver(); 
			 topmenu= new topMenu();
		OR = new Properties(); 
		 
		try{
			fis= new FileInputStream(path);
			OR.load(fis);
		}catch(Exception e)
		{
			System.out.println("File not Found");
		}
		//xls = new Xls_Reader("C:\\Users\\Laghuta\\workspace\\Flipkart\\TestCaseSheet.xlsx");
		if(OR.getProperty("browser").equals("firefox"))
			this.ff = new FirefoxDriver();
		else if(OR.getProperty("browser").equals("IE"))
			this.ff = new InternetExplorerDriver();
		else if((OR.getProperty("browser").equals("chrome"))){
			System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"); 
			this.ff = new ChromeDriver();
		ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		}	
		}
		 }	
		
		 
		 
		 
		
	
	 public static void click(String xpathkey){
		try{
		ff.findElement(By.xpath(OR.getProperty(xpathkey))).click();
	}
		catch(Exception e){
			System.out.println("Click function"+e.getMessage());
		}
	}
	static public void inputbyXpath(String xpath, String string){
		try{
		ff.findElement(By.xpath(OR.getProperty(xpath))).sendKeys(string);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		}
	static public void clickLinkText(String linktext){
		try{
			ff.findElement(By.linkText(OR.getProperty(linktext))).click();
		}
			catch(Exception e){
				System.out.println("Linktext function"+e.getMessage());
			}
		
	}
	static public void inputbyId(String id, String string){
		try{
		ff.findElement(By.id(OR.getProperty(id))).clear();
		ff.findElement(By.id(OR.getProperty(id))).sendKeys(string);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		}
	static public void clickbypartialLinkText(String partiallinktext){
		try{
			ff.findElement(By.partialLinkText(OR.getProperty(partiallinktext))).click();
		}
			catch(Exception e){
				System.out.println("Partial Linktext function"+e.getMessage());
			}

}
	static public void clearInputBox(String xpathkey){
		try{
			ff.findElement(By.xpath(OR.getProperty(xpathkey))).clear();
		}
			catch(Exception e){
				System.out.println("clear Input Box Function"+e.getMessage());
			}

}
	
	static public void selectDropdown(String id , String value){
		try{
			WebElement dd = ff.findElement(By.id(OR.getProperty(id)));
			Select s = new Select(dd);
			s.selectByVisibleText(value);
		
		}
			catch(Exception e){
				System.out.println("select drop down Function"+e.getMessage());
			}
		
	}
	

	static public boolean isElementPresent(String xpathkey){
		 try{
		ff.findElement(By.xpath(OR.getProperty(xpathkey)));
		}catch(Exception e){
			System.out.println("Element not visible");
			e.printStackTrace();
			return false;
		}
		 return true;
}
	
}