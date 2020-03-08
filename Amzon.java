import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amzon {

	@Test
	public void AddtoCart() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rnagalli\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j = 0;

		// list of arrays
		String[] allNames = { "Cauliflower", "Cucumber" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < items.size(); i++) {

			String[] value = items.get(i).getText().split("-");
			String formattedName = value[0].trim();

			List ItemsList = Arrays.asList(allNames);

			if (ItemsList.contains(formattedName)) {
				j++;
				// click on add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == 2) {
					break;
				}

			}

		}

	}

}
