package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestBase {
	
	ChromeDriver driver;
	
	public ChromeDriver ChromeDriverManager() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		if(driver==null) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		}
		return driver;
		

	}
}
