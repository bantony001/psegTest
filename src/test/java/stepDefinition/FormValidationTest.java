package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FormValidationTest {
	WebDriver driver;
	
	@Before 
	public void setUp(){ 
	      driver = new FirefoxDriver(); 
	} 
	
	@Given("^the form is opened$")
	public void the_form_is_opened() throws Throwable {
	    driver.get("http://localhost:3000/");
	    driver.manage().window().maximize();
	}
	
	//To Test the Name Field
	@When("^the user enters invalid \"(.*)\" in Name field$")
	public void the_user_enters_invalid_in_Name_field(String value) throws Throwable {
		Thread.sleep(3000);
	    driver.findElement(By.id("name")).sendKeys(value);
	    Thread.sleep(3000);
	}

	@Then("^the error should appear for Name field$")
	public void the_error_should_appear_for_Name_field() throws Throwable {
	    String errorValue = driver.findElement(By.xpath(".//*[@id='root']/div/form/fieldset/span[1]")).getText();	    
	    Assert.assertEquals(errorValue, "Name must be greater than 0 characters long and less than 25");
	    System.out.println("The error appears as expected for Name field");
	}
	
	@When("^the user enters valid \"(.*?)\" in Name field$")
	public void the_user_enters_valid_in_Name_field(String value) throws Throwable {
		Thread.sleep(3000);
	    driver.findElement(By.id("name")).sendKeys(value);
	    Thread.sleep(3000);
	}

	@Then("^the error should not appear for Name field$")
	public void the_error_should_not_appear_for_Name_field() throws Throwable {
	    String errorValue = driver.findElement(By.xpath(".//*[@id='root']/div/form/fieldset/span[1]")).getText();
	    Assert.assertNotEquals(errorValue, "Name must be greater than 0 characters long and less than 25");
	    System.out.println("The error doesn't appear as expected for Name field");
	}
	
	//To Test the Age Field
	@When("^the user enters invalid \"(.*?)\" in Age field$")
	public void the_user_enters_invalid_in_Age_field(String value) throws Throwable {
		Thread.sleep(3000);
	    driver.findElement(By.id("age")).sendKeys(value);
	    Thread.sleep(3000);
	}

	@Then("^the error should appear for Age field$")
	public void the_error_should_appear_for_Age_field() throws Throwable {
	    String errorValue = driver.findElement(By.xpath(".//*[@id='root']/div/form/fieldset/span[2]")).getText();
	    Assert.assertEquals(errorValue, "Age must be a valid integer greater than or equal to 18");
	    System.out.println("The error appears as expected for Age field");
	}
	
	@When("^the user enters valid \"(.*?)\" in Age field$")
	public void the_user_enters_valid_in_Age_field(String value) throws Throwable {
		Thread.sleep(3000);
	    driver.findElement(By.id("age")).sendKeys(value);
	    Thread.sleep(3000);
	}

	@Then("^the error should not appear for Age field$")
	public void the_error_should_not_appear_for_Age_field() throws Throwable {
	    Assert.assertFalse(driver.getPageSource().contains("Age must be a valid integer greater than or equal to 18"));
	    System.out.println("The error doesn't appear as expected for Age field");
	}
	
	
	//To Test the Password field
	@When("^the user enters invalid \"(.*?)\" in Password field$")
	public void the_user_enters_invalid_in_Password_field(String value) throws Throwable {
		Thread.sleep(3000);
	    driver.findElement(By.id("password")).sendKeys(value);
	    Thread.sleep(3000);
	}

	@Then("^the error should appear for Password field$")
	public void the_error_should_appear_for_Password_field() throws Throwable {
	    String errorValue = driver.findElement(By.xpath(".//*[@id='root']/div/form/fieldset/span[3]")).getText();
	    Assert.assertEquals(errorValue, "Password must be greater than 8 characters and less than 15");
	    System.out.println("The error appear as expected for Password field");
	}

	@When("^the user enters valid \"(.*?)\" in Password field$")
	public void the_user_enters_valid_in_Password_field(String value) throws Throwable {
		Thread.sleep(3000);
	    driver.findElement(By.id("password")).sendKeys(value);
	    Thread.sleep(3000);
	}

	@Then("^the error should not appear for Password field$")
	public void the_error_should_not_appear_for_Password_field() throws Throwable {
	    Assert.assertFalse(driver.getPageSource().contains("Password must be greater than 8 characters and less than 15"));
	    System.out.println("The error doesn't appear as expected for password field");
	}
	
	//To Test the Confirm Password field
	@When("^the user enters valid \"(.*?)\" in Confirm Password field$")
	public void the_user_enters_valid_in_Confirm_Password_field(String value) throws Throwable {
		Thread.sleep(3000);
	    driver.findElement(By.id("passwordConfirm")).sendKeys(value);
	    Thread.sleep(3000);
	}
	
	@When("^the user enters invalid \"(.*?)\" in Confirm Password field$")
	public void the_user_enters_invalid_in_Confirm_Password_field(String value) throws Throwable {
		Thread.sleep(3000);
	    driver.findElement(By.id("passwordConfirm")).sendKeys(value);
	    Thread.sleep(3000);
	}
	
	@Then("^the error should not appear for Confirm Password field$")
	public void the_error_should_not_appear_for_Confirm_Password_field() throws Throwable {
		Thread.sleep(3000);
		Assert.assertFalse(driver.getPageSource().contains("The passwords must match"));
	    System.out.println("The error for Confirm Password doesn't appear as expected.");
	}
	
	@Then("^the error should appear for Confirm Password field$")
	public void the_error_should_appear_for_Confirm_Password_field() throws Throwable {
		Thread.sleep(3000);
		Assert.assertTrue(driver.getPageSource().contains("The passwords must match"));
	    System.out.println("The error for Confirm Password appear as expected.");
	}
	
	//To Test the Hobby field
	@When("^the user enters the \"(.*?)\" in Hobby field$")
	public void the_user_enters_the_in_Hobby_field(String value) throws Throwable {
		Thread.sleep(3000);
	    driver.findElement(By.id("hobby")).sendKeys(value);
	    Thread.sleep(3000);
	}

	@When("^clicks on the Add button$")
	public void clicks_on_the_Add_button() throws Throwable {
	    driver.findElement(By.xpath(".//*[@id='root']/div/button")).click();
	}

	@Then("^the entered \"(.*?)\" should appear above the Hobby field$")
	public void the_entered_should_appear_above_the_Hobby_field(String values) throws Throwable {
		Assert.assertTrue(driver.getPageSource().contains(values));
		System.out.println("The hobby has been added");
	}

	@Then("^the hobby field should disappear from the textbox$")
	public void the_hobby_field_should_disappear_from_the_textbox() throws Throwable {
		String textVal = driver.findElement(By.id("hobby")).getText();
		Assert.assertEquals(textVal, "");
	}
	
	@After 
	public void cleanUp(){ 
	    driver.close(); 
	}	
	
	
}
