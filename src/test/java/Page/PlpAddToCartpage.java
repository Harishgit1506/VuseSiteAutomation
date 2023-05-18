package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Helper.BaseVuse;


public class PlpAddToCartpage extends BaseVuse {
	loginPageVuse pagelogin=new loginPageVuse();
	public void click_on_the_accept_all_cookies_button() throws InterruptedException{
		WebElement acceptCookies=driver.findElement(By.id("onetrust-accept-btn-handler"));
		acceptCookies.click();
		Thread.sleep(2000);
		
		}
	
		
	   
	

	public void click_i_am_above_year_button(Integer age) throws InterruptedException {
	   WebElement Ageover=driver.findElement(By.xpath("//button[@id='btn-entry-age-allow']//span"));
		Ageover.click();
		Thread.sleep(2000);
		
	    
	}
	public void verify_that_cart_is_empty_or_not() {
		isProductAvailableInCart();
	}

	public void search_product() {
		
	   
	}

	public void click_on_add_to_cart_button_and_add_some_product_into_the_cart() {
	}

	public void verify_product_is_successfully_added_into_the_cart_or_not() {
	   
	}
}


