package cucumberOptions;

import org.testng.annotations.*;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
				 glue = "stepDefinitions",
				 monochrome = true,
				 tags = "@sakshingp_TC1 or @sakshingp_TC2",
				 plugin = {"pretty", "html:target/cucumber.html", "rerun:target/failes_scenario.txt" })
public class TestRunnerTestNG extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
