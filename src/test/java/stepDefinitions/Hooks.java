package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	TestContextSetup testContextSetup;
	
	
	
	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	
	@After
	public void afterScenario() throws IOException {
		testContextSetup.testBase.ChromeDriverManager().quit();
		
	}
	
	@AfterStep
	public void takeScreenshot(Scenario scenario) throws IOException {
		ChromeDriver driver = testContextSetup.testBase.ChromeDriverManager();
		if(scenario.isFailed())
		{
			try
			{
				File sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				byte[] fileContent = FileUtils.readFileToByteArray(sourcepath);
				scenario.attach(fileContent, "image/png", "image");
			}
			catch(Exception e)
			{
				System.out.println("Could not capture the screenshot");
				e.printStackTrace();
			}
		}
	}
}
