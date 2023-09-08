package StepDefination;

import TestingFrameWork.SeleniumFrameWorkDesign.BaseTest;
import TestingFrameWork.SeleniumFrameWorkDesign.ProductPage;
import io.cucumber.java.en.Given;

public class StepDefinationImpl extends BaseTest{
	
	public ProductPage productpage;
	@Given("I landed on Ecommerce website")
	public void I_landed_on_Ecommerce_website() {
		
		BaseTest = productpage();
	}

	@Given("^Logged in with username (.+) and password (.+)$")
	public void Logged_in_with_username_and_password(String username, String password) {
		
		ProductCatalogue productcatalogue = la
		
	}
}
