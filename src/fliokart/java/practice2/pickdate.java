package fliokart.java.practice2;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class pickdate {
	WebDriver ff =null;
	int expmonth,expyear;
	String expdate=null;
	boolean datenotfound;
	
	
	List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
	@BeforeMethod
	public void start(){
	ff =new FirefoxDriver();
	ff.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	ff.manage().window().maximize();
	
	}
	
	@Test
	public void picexpdate(){
		ff.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
		ff.findElement(By.xpath("//input[@id='datepicker']")).click();
		datenotfound=true;
		expdate ="12";
		expmonth=6;
		expyear=2012;
		while(datenotfound){
			String currentmonth= ff.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/div/span[@class='ui-datepicker-month']")).getText();
	
			String currentyear = ff.findElement(By.className("ui-datepicker-year")).getText();
		
			if(months.indexOf(currentmonth)+1==expmonth && (expyear == Integer.parseInt(currentyear)))
			{
			selectDate(expdate);
			datenotfound=false;
			}
			else if(months.indexOf(currentmonth)+1<expmonth && (expyear == Integer.parseInt(currentyear))||(expyear>Integer.parseInt(currentyear)))
			ff.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
			else if(months.indexOf(currentmonth)+1>expmonth && (expyear == Integer.parseInt(currentyear))||(expyear<Integer.parseInt(currentyear))){
			ff.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[1]/span")).click();
		
		}
		
		
			
	
	}
		
	}
	 public void selectDate(String date)
	 {
	  WebElement datePicker = ff.findElement(By.id("ui-datepicker-div")); 
	  List <WebElement > noOfColumns=datePicker.findElements(By.tagName("td"));

	  //Loop will rotate till expected date not found.
	  for (WebElement cell: noOfColumns){
	   //Select the date from date picker when condition match.
	   if (cell.getText().equals(date)){
	    cell.findElement(By.linkText(date)).click();
	    break;
	   }
	  }
	 
}
}
