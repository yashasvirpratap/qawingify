package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {
		public ChromeDriver driver;
		
		public Common(ChromeDriver driver) {
			this.driver=driver;
		}
	
		public void userLogin() {
			driver.findElement(By.id("username")).sendKeys("xyz");
			driver.findElement(By.id("password")).sendKeys("123");
			driver.findElement(By.id("log-in")).click();
		}
		
		public void switchWindowToChild() {
			Set<String> s1 = driver.getWindowHandles();
		    Iterator<String> i1 = s1.iterator();
		    String parentWindow = i1.next();
		    String childWindow = i1.next();
		    driver.switchTo().window(childWindow);
		}
}
