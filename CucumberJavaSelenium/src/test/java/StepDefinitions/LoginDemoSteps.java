package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;
import pages.loginPage;

public class LoginDemoSteps {

	WebDriver driver = null;
	LoginPage_PF login;
	HomePage_PF home;	
	
	@Given("launch the browser")
	public void launch_the_browser() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

	}

	@And("user on the login page")
	public void user_on_the_login_page() throws InterruptedException {
		
			
		driver.get("https://example.testproject.io/web/");
		Thread.sleep(2000);

	}

	@When("^enter valid (.*) and (.*)$")
	public void enter_valid_username_and_password(String username, String password) {
		
		login = new LoginPage_PF(driver);
		
		login.enterUsername(username);
		login.enterPassword(password);
	
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);

	}

	@And("click on the login button")
	public void click_on_the_login_button() {
		
		login.clickOnLogin();
//		driver.findElement(By.id("login")).click();

	}

	@Then("navigates to the main page")
	public void navigates_to_the_main_page() {
		
		home = new HomePage_PF(driver);
		home.checkLogoutIsDisplayed();

//		driver.findElement(By.id("logout")).isDisplayed();
		driver.close();
		driver.quit();
	}
}