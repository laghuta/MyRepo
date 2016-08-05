package flipkart.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import flipkart.Main.basePage;

public class addressespage extends basePage{
	
	public void deleteAddresses(String name){
		//if(name.equals(" "))
		List<WebElement> addr = ff.findElements(By.id("address_infos"));
		for(int i=0;i<addr.size();i++){
			String text = ff.findElement(By.xpath("div[starts-with(@id,'address_CNTCT')]/div/span")).getText();
			System.out.println(text);
		}
		
		
	}
	
	public void spanData(){
		List <WebElement>  spandataName = ff.findElements(By.xpath("div[starts-with(@id,'address_CNTCT')]/div/span"));
		for(int i =0;i<spandataName.size();i++){
			System.out.println(spandataName.get(i).getText());
		}
		
		
		
		
	}

}
