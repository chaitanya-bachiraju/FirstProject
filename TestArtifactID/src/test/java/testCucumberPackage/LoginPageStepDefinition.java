package testCucumberPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefinition {

	WebDriver driver;

	@Given(" I am the user of facebook application")
	public void i_am_the_user_of_facebook_application() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CHAITANYA BACHIRAJU\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		driver.findElement(By.id("email")).sendKeys(username);

	}


	@When("I enter username as {String}")
	public void i_enter_password_as(String password) {
		driver.findElement(By.id("pass")).sendKeys(password);

	}


	@When("I click on Login Button")
	public void i_click_on_login_button() {
		driver.findElement(By.id("loginButton")).click();

	}
	
	
	
	@Then("I should be able to login successfully")
	public void i_should_be_able_to_login_successfully() {
		System.out.println("User Logged in successfully");
	}

	@Then("I should not be able to login successfully")
	public void i_should_not_be_able_to_login_successfully() {
		System.out.println("User did not login successfully");
	}

	@When("I enter the user credUsername as {string}")
	public void i_enter_the_user_cred_Username(String username) {
		driver.findElement(By.id("email")).sendKeys(username);

	}

	@When("I enter the user credPassword as {string}")
	public void i_enter_the_user_cred_password(String password) {
		driver.findElement(By.id("pass")).sendKeys(password);

	}

}
