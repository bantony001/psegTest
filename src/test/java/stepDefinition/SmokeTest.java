package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	WebDriver driver = new FirefoxDriver();
	
	@Given("^the user is in pseg application$")
	public void the_user_is_in_pseg_application() throws Throwable {
		driver.get("https://pseg.com");
	}

	@When("^the user enters login information$")
	public void the_user_enters_login_information() throws Throwable {
		Thread.sleep(5000);
	}

	@Then("^the user should be logged in$")
	public void the_user_should_be_logged_in() throws Throwable {
		driver.close();
	}
}
