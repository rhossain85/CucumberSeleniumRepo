package DataTableSD;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableStepDef {
	
	WebDriver driver;
	@Given("^User need to be on facebook login page$")
	public void user_need_to_be_on_facebook_login_page() throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:\\Work\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
	
	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
	 driver.quit();
	}
	@When ("Enter following data")
	public void Enter_following_data(DataTable table) throws InterruptedException {
		List<List<String>> data=table.raw();
		
		//String values1 = data.get(0).get(0);
		//String values2 = data.get(0).get(1);
		//String values3 = data.get(0).get(2);
		
		String values4 = data.get(1).get(0);
		String values5 = data.get(1).get(1);
		String values6 = data.get(1).get(2);
		
		driver.findElement(By.id("u_0_m")).sendKeys(values4);
		  driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys(values5);		  
		  
		  driver.findElement(By.id("u_0_r")).sendKeys(values6);
		
		
		
	
		  
			
}
	

}

