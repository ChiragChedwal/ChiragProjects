package dataDriven.excelDataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

	@Test(dataProvider = "driveTest")
	public void testdataCase(String greeting, String communicate, String id) 
	{	
	System.out.println(greeting + communicate + id);	
	}
	
	
	@DataProvider(name="driveTest")
	public void getData() throws IOException {
		//Object[][] data = {{"hello","text",1},{"bye","message",143},{"solo","call",453}};
		//return data;
		
		///Users/kratikaagrawal/Downloads/Book1.xlsx");
	}
}
