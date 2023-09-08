package TestNG_T;

import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public void weblogincarloan()
	{
	System.out.println("weblogincarloan");	
	}

	@Test
	public void mobileLogincarloan()
	{
		System.out.println("mobileLogincarloan");	
	}
	
	@Test(groups= {"Smoke"})
	public void apiLogincarloan()
	{
		System.out.println("Smoke Group Day 3");
	}
}
