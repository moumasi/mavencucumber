package stepdepination_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepdefination_class {
	WebDriver driver;
	@Given("^Open demoblaze Application$")
	public void open_demoblaze_Application() throws Throwable {
		System.setProperty("webDriver.edge.driver", "C:\\edgeDriver\\msedgedriver.exe");
		  EdgeOptions bp= new EdgeOptions();
		  bp.addArguments("--remote-allow-origins=*");
		  
		   driver= new EdgeDriver();
		   driver.get("https://www.demoblaze.com/index.html");
		   driver.manage().window().maximize();
		 
		  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		  


	}

	@Then("^Click login$")
	public void click_login() throws Throwable {
		WebElement a= driver.findElement(By.id("login2"));
		a.click();
	}

	@Then("^Enter username$")
	public void enter_username() throws Throwable {
		WebElement b= driver.findElement(By.id("loginusername"));
		b.sendKeys("jahan2");
		Thread.sleep(3000);
	}

	@Then("^Enter passward$")
	public void enter_passward() throws Throwable {
		WebElement c= driver.findElement(By.id("loginpassword"));
		c.sendKeys("12345");
		Thread.sleep(3000);
	}

	@Then("^Verify user can login$")
	public void verify_user_can_login() throws Throwable {
		WebElement d= driver.findElement(By.xpath("//button[text()='Log in']"));
		d.click();
		Thread.sleep(5000);
		driver.close();
	}

	@Then("^Click cart link$")
	public void click_cart_link() throws Throwable {
	    WebElement crt = driver.findElement(By.id("cartur"));
	    crt.click();
	    Thread.sleep(3000);
	}

	@Then("^Verify user in cart page$")
	public void verify_user_in_cart_page() throws Throwable {
	    
	}





}
