package Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Helper.BaseVuse;


public class loginPageVuse extends BaseVuse{

	public void click_on_the_accept_all_cookies_button() throws InterruptedException {
	WebElement acceptCookies=driver.findElement(By.id("onetrust-accept-btn-handler"));
	acceptCookies.click();
	Thread.sleep(2000);}
	public void click_i_am_under_age_button() throws InterruptedException {
		WebElement ageVerify=driver.findElement(By.xpath("//button[@id='btn-entry-age-deny']//span"));
		ageVerify.click();
		Thread.sleep(3000);
	}
	
   public void verify_user_should_navigate_to_google_com_page() throws InterruptedException {
		Thread.sleep(3000);
	  String	Googleurl=driver.getCurrentUrl();
	  String ExpectedUrl="https://www.google.com/";
	  Assert.assertEquals(Googleurl, ExpectedUrl);
	  driver.quit();
		
		
	}
	    
	

}
