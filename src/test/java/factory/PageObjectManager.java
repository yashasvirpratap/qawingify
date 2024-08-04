package factory;

import org.openqa.selenium.chrome.ChromeDriver;
import pages.sakshingpPage;

public class PageObjectManager {
	public ChromeDriver driver;
	public sakshingpPage sakshingpPage;
	
	
	public PageObjectManager(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public sakshingpPage getLandingPage() {
		return sakshingpPage = new sakshingpPage(driver);
	}

}
