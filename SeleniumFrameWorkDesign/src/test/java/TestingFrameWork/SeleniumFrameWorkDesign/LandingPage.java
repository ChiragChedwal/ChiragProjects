package TestingFrameWork.SeleniumFrameWorkDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractComponent{

	WebDriver driver;

	public  LandingPage(WebDriver driver) {
		
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);


	}
	
	//WebElement username = driver.findElement(By.id("userEmail"));

	//PageFactory
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement password;
	
	@FindBy(id="login")
	WebElement loginBtn;
	
	public ProductPage loginApp(String email, String pass) {
		
		userEmail.sendKeys(email);
		password.sendKeys(pass);
		loginBtn.click();
		ProductPage productPage = new ProductPage(driver);
		return productPage;
	}
	
	public void goTo() {
		
		driver.get("https://rahulshettyacademy.com/client/");
	}
	
	
	
}
