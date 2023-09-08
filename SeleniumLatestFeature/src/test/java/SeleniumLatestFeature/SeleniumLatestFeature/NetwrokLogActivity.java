package SeleniumLatestFeature.SeleniumLatestFeature;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v113.network.Network;

public class NetwrokLogActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		DevTools devtool = driver.getDevTools();
		devtool.createSession();
		devtool.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		

	}

}
