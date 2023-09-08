package TestNG_T;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	
	@BeforeSuite
	public void Bfsuit()
	{
		System.out.println("I am Before Suite");
	}
	
	@AfterSuite
	public void Afsuit()
	{
		System.out.println("I am After Suite");
	}
	
	
	
	@AfterTest
	public void Lastone()
	{
		System.out.println("Last execution");
	}
	
	@Test(groups= {"Smoke"})
	public void Demo() {
		System.out.println("Smoke Group Day1");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
		
	}
	
	@BeforeTest
	public void BeforeExecute()
	{
		System.out.println("I will execute first");
	}
	
	

}
