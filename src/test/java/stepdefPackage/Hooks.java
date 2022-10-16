package stepdefPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	
public static WebDriver driver;
	
	@Before
	public void SetUp() {
		
		System.out.println("Before SetUp");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void TearDown() {
		
		System.out.println("After SetUp");
		
		driver.close();
	}

}
