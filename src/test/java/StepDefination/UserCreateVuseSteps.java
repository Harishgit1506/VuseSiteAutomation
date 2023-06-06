package StepDefination;


import Page.UserCreateVusePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class UserCreateVuseSteps {
	UserCreateVusePage userCreate=new UserCreateVusePage();
	@Given("click on the accept all cookies button for register page")
	public void click_on_the_accept_all_cookies_button() throws InterruptedException {
	 userCreate.click_on_the_accept_all_cookies_button();
		
	   
	}
	@Given("click i am above {int} year button for register page")
	public void click_i_am_above_year_button(Integer age) throws InterruptedException {
		userCreate.click_i_am_above_year_button1(18);
	   
	}
	@Given("click person account icon")
	public void click_person_account_icon() throws InterruptedException {
		userCreate.click_person_account_icon();
	    
	}
	@Given("click on the resister button")
	public void click_on_the_resister_button() throws InterruptedException {
		userCreate.click_on_the_resister_button();
	   
	}
	@Then("fill all the details")
	public void fill_all_the_details() throws InterruptedException {
		userCreate.fill_all_the_details();
	 
	}
	@Then("click on the submit button")
	public void click_on_the_submit_button() throws InterruptedException {
		userCreate.click_on_the_submit_button();
	   
	}


}
