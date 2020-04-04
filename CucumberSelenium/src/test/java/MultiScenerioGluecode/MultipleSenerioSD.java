package MultiScenerioGluecode;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultipleSenerioSD {
	
	WebDriver driver;
	@Given("^User need to be on facebook login page$")
	public void user_need_to_be_on_facebook_login_page() throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:\\Work\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
	  
	}

	@When("^User enters user first name$")
	public void user_enters_user_first_name() throws Throwable {
		driver.findElement(By.id("u_0_m")).sendKeys("David");
	   
	}

	@Then("^User checks user first name is present$")
	public void user_checks_user_first_name_is_present() throws Throwable {
		String userNameActual=driver.findElement(By.id("u_0_m")).getAttribute("value");
		Assert.assertEquals("David", userNameActual);		
	  
	}
	
	@And ("^User enters user surname$")
	public void user_enters_user_surname() throws Throwable {
	  driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("Rogers");
	}

	@And("^User mobile field should be blank$")
	public void user_mobile_field_should_be_blank() throws Throwable {
		
		String mobileActual=driver.findElement(By.id("u_0_r")).getAttribute("value");
		Assert.assertEquals("", mobileActual);		
	  
	}
	
	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
	 driver.quit();
	}
}



