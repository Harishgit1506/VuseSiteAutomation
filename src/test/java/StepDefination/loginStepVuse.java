package StepDefination;
import Page.loginPageVuse;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class loginStepVuse  {
	loginPageVuse login=new loginPageVuse();
	@Given("click on the accept all cookies button for login page")
	public void click_on_the_accept_all_cookies_button() throws InterruptedException {
		login.click_on_the_accept_all_cookies_button();
		
	}
		
   @And("click i am under age button for login page")
	public void click_i_am_under_age_button() throws InterruptedException {
	 login.click_i_am_under_age_button();
	}
	@Then("verify user should navigate to google.com page")
	public void verify_user_should_navigate_to_google_com_page() throws InterruptedException {
		login.verify_user_should_navigate_to_google_com_page();
	    
	}


}
