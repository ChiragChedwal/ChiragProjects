package TestNG_T;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {
	@Parameters({"UPI"})
	@Test
	public void secondTest(String a)
	{
	
		System.out.println("Day 2 Parameter passing");
		System.out.println(a);
	}
	
	@Test(groups= {"Smoke"})
	public void smk() {
		System.out.println("Smoke Group day2");
	}

}
