package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksDemoSteps {
	
	WebDriver driver = null;
	
	@Before(value = "@smoke", order = 0)
	public void browserSetup() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Before("@smoke")
	public void setup2() {
		
		System.out.println("I am setup 2");
	}
	
	@After (value ="@smoke")
	public void tearDown() {
		
		driver.close();
	}
	
	@BeforeStep
	public void beforeSteps() {
		
		System.out.println("I am before steps");
	}
	
	@AfterStep
	public void afterSteps() {
		
		System.out.println("I am After steps");
	}

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {

	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {

	}

	@And("click on the login button")
	public void click_on_the_login_button() {

	}

	@Then("user navigates to the home page")
	public void user_navigates_to_the_home_page() {

	}


}
