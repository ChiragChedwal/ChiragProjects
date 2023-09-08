package TestingFrameWork.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	
	ExtentReports extent;
	
	@BeforeTest
	public void config() {
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("Web Automation Result");
		report.config().setDocumentTitle("Test Result");
		
		 extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Chirag");
	}
	
	
	@Test
	public void initialDemo() {
		extent.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver_mac64/chromedriver");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		
		
	}

}
