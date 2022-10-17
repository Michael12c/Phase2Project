package stepdefPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/features",
		glue = "stepdefPackage",
		plugin = {"json:target/cucumber/cucumber.json"},
		tags = {"@sanity"}
		
		
		)


public class TestRunner {

}
