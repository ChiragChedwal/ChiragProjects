package SeleniumLatestFeature.SeleniumLatestFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v113.emulation.Emulation;

public class MobileEmulatorTest {
	public static void main (String [] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver_mac64/chromedriver");
	ChromeOptions op = new ChromeOptions();
	op.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(op);
	
	DevTools devtool =driver.getDevTools();
	devtool.createSession();
	
	//Send comment to CDP
	
	devtool.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, null, null, null, null, null, null, null, null, null));
	
	driver.get("https://rahulsheetyacademy.com/angularAppdemo/");
	
	driver.findElement(By.cssSelector(".navbar-toggler")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Library")).click();
}
}
