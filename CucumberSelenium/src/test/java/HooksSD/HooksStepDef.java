package HooksSD;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDef {
	
	WebDriver driver;
	
	@Before(order=1)
	public void beforeSetup1() {
		System.out.println("in Before1");
		System.setProperty("webdriver.gecko.driver","C:\\Work\\geckodriver.exe");
		 driver = new FirefoxDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Before(order=2)
	public void beforeSetup2() {
		System.out.println("in Before2");
	}
	@Given("^User need to be on facebook login page$")
	public void user_need_to_be_on_facebook_login_page() throws Throwable {
		
       
        driver.get("https://www.facebook.com/");
	  
	}

	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String userName) throws Throwable {
		driver.findElement(By.id("u_0_m")).sendKeys(userName);
	   
	}

	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void user_checks_user_first_name_is_present(String userName) throws Throwable {
		String userNameActual=driver.findElement(By.id("u_0_m")).getAttribute("value");
		Assert.assertEquals(userName, userNameActual);		
	  
	}
	
	@And ("^User enters user \"([^\"]*)\" surname$")
	public void user_enters_user_surname(String surName) throws Throwable {
	  driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys(surName);
	}

	@But("^User mobile field should be blank$")
	public void user_mobile_field_should_be_blank() throws Throwable {
		
		String mobileActual=driver.findElement(By.id("u_0_r")).getAttribute("value");
		Assert.assertEquals("", mobileActual);		
	  
	}	
		
	@After(order=2)
	public void tearDown1() {
		System.out.println("in After1");
		driver.quit();
		driver=null;
	}
	
	@After(order=1)
	public void tearDown2() {
		System.out.println("in After2");
	}
}



