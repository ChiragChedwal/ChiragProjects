package TestingFrameWork.SeleniumFrameWorkDesign;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String productName = "ZARA COAT 3";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		LandingPage landingpage = new LandingPage(driver);
		landingpage.goTo();
		

		ProductPage productPage = landingpage.loginApp("changc@gmail.com", "Chang@123");
		List<WebElement> pro = productPage.getProductList();
		productPage.addProductToCart(productName);
CartPage cartPage = productPage.gotoCartPage();
		
		
		Boolean match =cartPage.verifyProductDisplay(productName);
		
		CheckoutPage checkoutPage =cartPage.gotoCheckout();
		checkoutPage.selectCountry("India");
		ConfirmationPage confirmationPage = checkoutPage.submitOrder();
		
		String confirmationMsg = confirmationPage.getConfirmationMessage();
		
		
		
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
 
		// List<WebElement> products =driver.findElements(By.cssSelector(".mb-3"));

		//WebElement pro = products.stream()
		//		.filter(product -> product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst()
		//		.orElse(null);

		 //pro.findElement(By.cssSelector(".card-body button:last-of-type")).click();

		// Wait for Popup display

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));

		// wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));

//		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();

		/*List<WebElement> cartproducts = driver.findElements(By.cssSelector(".cartSection h3"));
		Boolean match = cartproducts.stream().anyMatch(cartproduct -> cartproduct.getText().equals(productName));
		System.out.println(match);*/

		//driver.findElement(By.cssSelector(".totalRow button")).click();

		/*Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));

		driver.findElement(By.xpath("//button[contains(@class,'ta-item')][2]")).click();*/

		//driver.findElement(By.cssSelector(".action__submit")).click();
		//String text = driver.findElement(By.cssSelector(".hero-primary")).getText();
		//System.out.println(text);

	}

}
