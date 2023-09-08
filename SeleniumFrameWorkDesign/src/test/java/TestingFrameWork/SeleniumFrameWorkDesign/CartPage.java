package TestingFrameWork.SeleniumFrameWorkDesign;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends AbstractComponent {
	
	public CartPage(WebDriver driver) {
		super(driver);
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	WebDriver driver;
	
	@FindBy(css=".totalRow button")
	WebElement checkoutEle;
	
	@FindBy(css=".cartSection h3")
	List<WebElement> cartProducts;
	
	public Boolean verifyProductDisplay(String productName) {
		Boolean match = cartProducts.stream().anyMatch(cartproduct -> cartproduct.getText().equals(productName));
		return match;
	}
	
	public CheckoutPage gotoCheckout() {
		
		checkoutEle.click();
		return new CheckoutPage(driver);
	}

}
