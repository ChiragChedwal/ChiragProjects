package TestingFrameWork.SeleniumFrameWorkDesign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {

	WebDriver driver;
	public AbstractComponent(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(css="[routerlink*='cart']")
	WebElement cartHeader;
	
	public CartPage gotoCartPage() {
		 cartHeader.click();
		 CartPage cartPage = new CartPage(driver);
		 return cartPage;
	}
	
	public void  waitforElementToApperar(By findBy)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}

	public void waitforElementToDisappear(WebElement ele) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

		wait.until(ExpectedConditions.invisibilityOf(ele));

			
		}

}
