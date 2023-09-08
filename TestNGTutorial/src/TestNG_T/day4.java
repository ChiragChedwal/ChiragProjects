package TestNG_T;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@Parameters({"URL"})
	@Test
	public void para(String urlname) {
		System.out.println("Parameter calling");
		System.out.println(urlname);
	}
	
	@DataProvider
	public void dataPro() {
		//1st combination username password good credit history
		//2nd username pass no credit history
		//3rd fraud history
		
		Object[][] data = new Object[3][2];
		
		
		//1st Set
		data[0][0] = "Firstudername";
		data[0][1] = "Firstpassword";
		
		//2nd set
		data[1][0] = "SecondUsername";
		data[1][1] = "SecondPassword";
		
		//3rd Set
		data[2][0] = "ThireUsername";
		data[2][1] = "Third Password";
		
	}

}
