package TestingFrameWork.SeleniumFrameWorkDesign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends AbstractComponent{
	
	WebDriver driver;

	public  ProductPage(WebDriver driver) {
		
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);


	}
	
	//List<WebElement> products =driver.findElements(By.cssSelector(".mb-3"));
	
	@FindBy(css=".mb-3")
	List<WebElement> products;
	
	@FindBy(css=".ng-animating")
	WebElement spinner;
	
	By productBy = By.cssSelector(".mb-3"); 
	By addToCart = By.cssSelector(".card-body button:last-of-type");
	By toastMessage = By.cssSelector("#toast-container");


public List<WebElement> getProductList() {
	waitforElementToApperar(productBy);
	return products;
}

public WebElement getProductByName(String productName) {
	
	WebElement prod = products.stream()
			.filter(product -> product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst()
			.orElse(null);
	return prod;

}

public void addProductToCart(String productName) {
	WebElement prod = getProductByName(productName);
			prod.findElement(addToCart).click();
			waitforElementToApperar(toastMessage);
			waitforElementToDisappear(spinner);
}


}

