package fliokart.java.practice2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample {
	@Test
	public void sample1(){
		System.out.println("sample1");
	}
	
	@Test
	public void sample2(){
		Assert.assertTrue(true, "Passed");
	}
	@Test
	public void sample3(){
		Assert.assertTrue(2>3, "Failed");
	}
	


}
