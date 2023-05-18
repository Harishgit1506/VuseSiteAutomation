package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Helper.BaseVuse;


public class UserCreateVusePage extends BaseVuse {
	
	public void click_on_the_accept_all_cookies_button() throws InterruptedException{
	WebElement acceptCookies=driver.findElement(By.id("onetrust-accept-btn-handler"));
	acceptCookies.click();
	Thread.sleep(2000);
	}

	
	public void click_i_am_above_year_button1(Integer age) throws InterruptedException {
		
		WebElement Ageover=driver.findElement(By.xpath("//button[@id='btn-entry-age-allow']//span"));
				Ageover.click();
				Thread.sleep(2000);
		
	   
	}


	public void click_person_account_icon() throws InterruptedException {
		WebElement personicon=driver.findElement(By.xpath("//span[@class='icon-account']"));
		mouseOver(personicon);
		WebElement RegisterSigninButton=driver.findElement(By.xpath("//*[@class='dropdown account-dropdown']//a[contains(text(),'Anmelden')]"));
	    RegisterSigninButton.click();
	    Thread.sleep(2000);
	}


	public void click_on_the_resister_button() throws InterruptedException {
		WebElement ResisterButton=driver.findElement(By.xpath("//span[contains(text(),'Account Erstellen')]"));
		ResisterButton.click();
		Thread.sleep(2000);
	    
	}

	
	public void fill_all_the_details() throws InterruptedException {
		selectSurname();
		Thread.sleep(2000);
		WebElement firstname=driver.findElement(By.id("firstname"));
		firstname.sendKeys(prop.getProperty("firstname"));
		Thread.sleep(2000);
		WebElement lastname=driver.findElement(By.id("lastname"));
		lastname.sendKeys(prop.getProperty("lastname"));
		Thread.sleep(2000);
		WebElement DOB=driver.findElement(By.id("dob"));
		DOB.sendKeys(prop.getProperty("DOB"));
		Thread.sleep(2000);
		WebElement Submit=driver.findElement(By.id("vude02-btn-0"));
		Submit.click();
		Thread.sleep(2000);
		WebElement addressSearch=driver.findElement(By.id("address-search"));
		addressSearch.sendKeys(prop.getProperty("address"));
		Thread.sleep(2000);
		WebElement phoneNumber=driver.findElement(By.id("telephone"));
		phoneNumber.sendKeys(prop.getProperty("phoneNo."));
		Thread.sleep(2000);
		WebElement Submit1=driver.findElement(By.id("vude02-btn-1"));
		Submit1.click();
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.id("email_address"));
		email.sendKeys(prop.getProperty("email"));
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		WebElement passwordConfirm=driver.findElement(By.id("password-confirmation"));
		passwordConfirm.sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		WebElement checkbox1=driver.findElement(By.xpath("//label[@for='agreement-18']"));
		checkbox1.click();
		Thread.sleep(2000);
		WebElement checkbox2=driver.findElement(By.xpath("//label[@for='global_loyalty_optin']"));
		checkbox2.click();
		Thread.sleep(2000);
		WebElement signinAccountButton=driver.findElement(By.xpath("//button[@title='Erstelle deinen Account']"));
		signinAccountButton.click();
		Thread.sleep(2000);
	    
	}

	public void click_on_the_submit_button() throws InterruptedException {
		WebElement createAccountButton=driver.findElement(By.xpath("//button[@title='Erstelle deinen Account']"));
		createAccountButton.click();
		Thread.sleep(2000);
	    
	}

}
