package seleniumgluecode;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class myFirstStepDef {
	WebDriver driver;
	@Given("^User need to be on facebook login page$")
	public void user_need_to_be_on_facebook_login_page() throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:\\Work\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        System.out.println("Open URL");
	  
	}

	@When("^User enters user first name$")
	public void user_enters_user_first_name() throws Throwable {
		driver.findElement(By.id("u_0_m")).sendKeys("David");
	   
	}

	@Then("^User checks user first name is present$")
	public void user_checks_user_first_name_is_present() throws Throwable {
		String userNameActual=driver.findElement(By.id("u_0_m")).getAttribute("value");
		Assert.assertEquals("David", userNameActual);
		
		driver.quit();
	  
	}



}
