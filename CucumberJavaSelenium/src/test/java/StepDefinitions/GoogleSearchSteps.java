package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	//C:\\Users\\C5270459\\Desktop\\Python\\chromedriver.exe

	WebDriver driver = null;
	@Given("browser is open")
	public void browser_is_open() {

		String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",projectPath+ "/src/test/resources/Drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@And("user in the google search page")
	public void user_in_the_google_search_page() {

		driver.navigate().to("https://google.com");

	}

	@When("enters the text")
	public void enters_the_text() {

		driver.findElement(By.name("q")).sendKeys("Automation step by step");


	}

	@And("hits on search button")
	public void hits_on_search_button() {

		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

	@Then("navigate to the search results")
	public void navigate_to_the_search_results() {

		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();

	}

}
