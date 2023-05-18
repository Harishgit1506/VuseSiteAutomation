package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Helper.BaseVuse;

public class forgotPasswordPage extends BaseVuse {
	public void click_on_the_accept_all_cookies_button() throws InterruptedException
	{
		WebElement acceptCookies=driver.findElement(By.id("onetrust-accept-btn-handler"));
		acceptCookies.click();
		Thread.sleep(2000);
		
	}
  public void click_i_am_above_year_button(Integer age) throws InterruptedException {
	  WebElement Ageover=driver.findElement(By.xpath("//button[@id='btn-entry-age-allow']//span"));
		Ageover.click();
		Thread.sleep(2000);
		
		
		
	   
	}
	
	
	public void click_person_account_icon1() throws InterruptedException {
		 WebElement Ageover=driver.findElement(By.xpath("//button[@id='btn-entry-age-allow']//span"));
			Ageover.click();
			Thread.sleep(2000);
	    
	}

	
	public void click_on_forgot_password_button() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='icon-arrow-right']")).click();
	    Thread.sleep(2000);
		
	    
	}

	
	public void enter_your_email() throws InterruptedException {
		driver.findElement(By.id("email_address")).sendKeys(prop.getProperty("email"));
		Thread.sleep(2000);
		
	   
	}

	
	public void click_on_the_reset_password_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
		Thread.sleep(2000);
	}


	public void verify_success_message() {
		String Successtextactual=driver.findElement(By.xpath("//div//font[contains(text(),'we will email you')]")).getText();
		 String expectedText="If a customer account is linked to hari@gmail.com, we will email you a link to reset your password.";
		 Assert.assertEquals(Successtextactual,expectedText);
		 
	    
	}


	public void click_i_am_above_year_button1(int i) {
		// TODO Auto-generated method stub
		
	}

}
	


