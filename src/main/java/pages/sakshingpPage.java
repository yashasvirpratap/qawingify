package pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class sakshingpPage {

	private By amountColumn = By.xpath("//th[@id='amount']");
	private By valueList = By.xpath("//td[@class='text-right bolder nowrap']");
	public String text;
	public String home;
	private String s;

	public ChromeDriver driver;

	public sakshingpPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public String landingPageUrl() {
		text = driver.getCurrentUrl();
		return text;
	}

	public String homePageUrl() {

		home = driver.getCurrentUrl();
		return home;
	}

	public void amountColumnClick() {
		driver.findElement(amountColumn).click();
	}

	public void amountValuesortCheck() throws NumberFormatException {
		List<WebElement> list = driver.findElements(valueList);
		List<String> stringList = list.stream().map(s -> s.getText()).collect(Collectors.toList());

		List<String> trimmedStrings = new ArrayList<String>();
		for (String s : stringList) {
			trimmedStrings.add(s.substring(0, s.length() - 4));
		}
		stringList = trimmedStrings;

		List<Float> floatList = new ArrayList<>();
		for (String str : trimmedStrings) {
			// Preprocess the string to remove '+' sign if present
			String processedStr = str.replace("+", "");
			String output = processedStr.replace(" ", "");
			String finalString = output.replace(",","");
			floatList.add(Float.parseFloat(finalString));

		}

		List<Float> originalList = new ArrayList<Float>();
		for (Float s : floatList) {
			originalList.add(s);
		}
		System.out.println("originalList = " + originalList);
		List<Float> sortedList =
		originalList.stream().sorted().collect(Collectors.toList());
		System.out.println("Sortedlist = "+sortedList);
		Assert.assertTrue(originalList.equals(sortedList));
	}

}
