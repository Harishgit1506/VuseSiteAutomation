package StepDefination;
import Page.forgotPasswordPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class forgotPasswordStep {
	forgotPasswordPage forgotPass=new forgotPasswordPage();
	@Given("click on the accept all cookies button for forgot password")
	public void click_on_the_accept_all_cookies_button1() throws InterruptedException {
		forgotPass.click_on_the_accept_all_cookies_button();
		
		}
	@Given("click i am above {int} year button for forgot passwords")
	public void click_i_am_above_year_button1(Integer age) throws InterruptedException {
		
		forgotPass.click_i_am_above_year_button(18);
		
	   
	}
	@Given("click person account icon1")
	public void click_person_account_icon1() throws InterruptedException {
		forgotPass.click_person_account_icon1();
		
	    
	}

	@Given("click on Forgot password button")
	public void click_on_forgot_password_button() throws InterruptedException {
		forgotPass.click_on_forgot_password_button();
		 
	}

	@Then("Enter your email")
	public void enter_your_email() throws InterruptedException {
		forgotPass.enter_your_email();
		
	   
	}

	@Then("click on the Reset password button")
	public void click_on_the_reset_password_button() throws InterruptedException {
		forgotPass.click_on_the_reset_password_button();
		
	    
	}

	@Then("verify success message")
	public void verify_success_message() {
		forgotPass.verify_success_message();
	 
	    
	}


}
