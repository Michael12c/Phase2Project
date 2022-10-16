package stepdefPackage;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStepDefProject2 {

	WebDriver driver = Hooks.driver;

	@Given("User has launched the application")
	public void User_has_launched_the_application() {

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}

	//**********Successful Login Path************//
	@When("User enters correct username as {string} and password as {string}")
	public void User_enters_correct_username__as_and_password_as(String usernameVal, String passwordVal) {

		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys(usernameVal);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(passwordVal);

	}

	@When("User enters the correct username and password")
	public void User_enters_the_correct_username_and_password() {	

		WebElement UserName = driver.findElement(By.name("user-name"));
		UserName.sendKeys("problem_user");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("secret_sauce");
	}

	@And("User click on the Login Button")
	public void User_click_on_the_Login_Button() {

		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
	}

	@Then("User logs into Product page")
	public void User_logs_into_Product_page() {

		WebElement productPage = driver.findElement(By.id("inventory_container"));
		Assert.assertTrue(productPage.isDisplayed());

	}

	//**********Login Failure Path************//
	@When("User enters incorrect username as {string} and password as {string}")
	public void User_enters_incorrect_username_and_password(String usernameVal, String passwordVal) {

		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys(usernameVal);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(passwordVal);
	}

	@Then("User should get the error message {string}")
	public void User_should_get_the_error_message(String ExpError) {

		String ActError = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(ActError, ExpError);
	}

}


