package fliokart.java.practice;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(listener_practice.class)
public class sample {
	@Test(groups="smoke")
	public void sample1(){
		System.out.println("sample1_Smoke");
	}
	
	@Test(groups="Regression")
	public void sample2(){
		throw new SkipException("skipped");
	}
	
	@Test(groups="smoke")
	public void sample3(){
		throw new SkipException("skipped");
		
	}@Test(groups="Regression")
	public void sample4(){
		System.out.println("sample4");
	}@Test(groups="smoke")
	public void sample5(){
		System.out.println("sample5_smoke");
	}@Test(groups="Regression")
	public void sample6(){
		System.out.println("sample6");
	}

}
