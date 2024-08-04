package utils;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import factory.PageObjectManager;

public class TestContextSetup {
	public ChromeDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public Common common;
	
	
	public TestContextSetup() throws IOException {
		testBase = new TestBase();
		pageObjectManager= new PageObjectManager(testBase.ChromeDriverManager());
		common = new Common(testBase.ChromeDriverManager());
		
	}
}
