package StepDefination;
import Page.PlpAddToCartpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PlpAddToCartStep {
	PlpAddToCartpage addcart=new PlpAddToCartpage();
	@Given("click on the accept all cookies button for plp add to cart page")
	public void click_on_the_accept_all_cookies_button() throws InterruptedException {
		addcart.click_on_the_accept_all_cookies_button();
		
		}
	   
	
	@And("click i am above {int} year button for plp add to cart page")
	public void click_i_am_above_year_button(Integer age) {
	    
	}

	@Then("search product")
	public void search_product() {
	   
	}

	@Then("Click on add to cart button and add some product into the cart")
	public void click_on_add_to_cart_button_and_add_some_product_into_the_cart() {
	}

	@Then("verify product is successfully added into the cart or not")
	public void verify_product_is_successfully_added_into_the_cart_or_not() {
	   
	}

}
