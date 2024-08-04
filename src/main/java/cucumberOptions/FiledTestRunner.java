package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "@target/failed_scenarios.txt",
				 glue = "stepDefinitions",
				 monochrome = true,
				 plugin = {"pretty","html:target/cucumber.html"})
				
public class FiledTestRunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}

}
