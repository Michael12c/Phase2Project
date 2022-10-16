package stepdefPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDefProject2 {

	WebDriver driver = Hooks.driver;
	String ProductName = "";

	@When("User click on product as {string}")
	public void User_click_on_product_as(String string) {

		WebElement item = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));
		item.click();
	}

	@Then("User should proceed to cart")
	public void User_should_proceed_to_cart() {

		WebElement item = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		item.click();

	}


}
