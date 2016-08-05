import java.io.File;
import junit.framework.Assert;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


 class sshot {
    
	sshot(){
		System.out.println("Constructor sshot");
	}
	
	{
		System.out.println("Initializer block");
	}
	
}
	

class shot extends sshot{
		shot(){
		
			System.out.println("Child class constructor");
		}
		
		{
			System.out.println("Child class Initializer block");
		}
	
		
	
	public static void main(String[] args) {
		shot s = new shot();
		

	
	
}

	}
