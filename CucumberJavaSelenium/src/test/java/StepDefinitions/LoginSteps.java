package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("user in the login page")
	public void user_in_the_login_page() {
	    System.out.println("user in the login page");
	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
	   System.out.println("user enters the username and password");
	}

	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
		System.out.println("clicks on the login button");
	}

	@Then("navigates to the home page")
	public void navigates_to_the_home_page() {
	    System.out.println("navigates to the home page");
	}

}
