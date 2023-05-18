/*package Helper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseVuse{

	 public void setup() {
		
			String Browsername=prop.getProperty("Browser");
			if(Browsername.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				ChromeOptions option=new ChromeOptions();
				option.addArguments("--incogneto");
				option.addArguments("--remote-allow-origins=*");
				driver=new ChromeDriver(option);
			}else if(Browsername.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				EdgeOptions option=new EdgeOptions();
		    	 option.addArguments("--remote-allow-origins=*");
		 		option.addArguments("--incognito");
		 		driver=new EdgeDriver(option);
		     }else if(Browsername.equals("firefox")) {
		    	 WebDriverManager.firefoxdriver().setup();
		    	 FirefoxOptions option=new FirefoxOptions();
		    	 option.addArguments("--remote-allow-origins=*");
		 		option.addArguments("--incognito");
		 		driver=new FirefoxDriver(option);
		 		}else if(Browsername.equals("IE")) {
		 	    	 WebDriverManager.iedriver().setup();
		 	    	// InternetExplorerOptions option=new InternetExplorerOptions() ;
		 	 		//option.addCommandSwitches("--incognito");
		 	 		driver=new InternetExplorerDriver();
		 		}
				driver.get(prop.getProperty("Url"));
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
				
			}
	public void click_on_the_accept_all_cookies_button() throws InterruptedException {
		WebElement acceptCookies=driver.findElement(By.id("onetrust-accept-btn-handler"));
		acceptCookies.click();
		Thread.sleep(2000);
		}public void ageverify() throws InterruptedException {
	 WebElement Ageover=driver.findElement(By.xpath("//button[@id='btn-entry-age-allow']//span"));
		Ageover.click();
		Thread.sleep(2000);
		}
	
	
	 public void GetFailedStepScreenshot(Scenario s) {
		 if(s.isFailed()) {
		getScreenShot1();	 
		 }
		 driver.quit();
	 }

}*/
