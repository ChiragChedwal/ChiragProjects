package CrossBrowserDemo;

import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.testng.annotations.Test;

public class TestDemo {
	
	@Test
	public void TitleCheck() {
		MutableCapabilities caps = new MutableCapabilities();
	WebDriver driver =new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"),caps);
	}
}
