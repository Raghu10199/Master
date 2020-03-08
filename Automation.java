import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

public class Automation 
{
	@Test
	public void Demo() throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rnagalli\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.microfocus.com/");
	Thread.sleep(5000);
	
	Actions action=new Actions(driver);
	WebElement ele=driver.findElement(By.xpath("(//a[text()='Products']) [1]"));
	Thread.sleep(5000);
	action.moveToElement(ele).build().perform();
	
	driver.findElement(By.xpath("(//a[text()='Free Trials']) [1]")).click();
	Thread.sleep(2000);
	WebElement search=driver.findElement(By.id("searchFilter"));
	search.click();
	search.sendKeys("Google");
	search.sendKeys(Keys.TAB);
	//Thread.sleep(5000);
	
	
	JavascriptExecutor je=(JavascriptExecutor)driver;
	Thread.sleep(5000);
	je.executeScript("window.scrollBy(0,400)");
	
	driver.findElement(By.xpath("(//b[@role='presentation']) [1]")).click();
	driver.findElement(By.xpath("(//li[text()='Vertica'])")).click();
	WebElement check=driver.findElement(By.id("hasDemo"));
	if(check.isSelected())
	{
		System.out.println("Check box is selected");
		
	}
	else
	{
		check.click();
		System.out.println("Check box is now clicked");
	
	}
	
	driver.findElement(By.xpath("(//a[text()='Support Login']) [1]")).sendKeys(Keys.CONTROL+"t");
	Thread.sleep(5000);
	
	
	
	
	
	/*String parent=driver.getWindowHandle();
	Set<String>child=driver.getWindowHandles();
	
	ArrayList<String>alltabs=new ArrayList<String>(child);
	driver.switchTo().window(alltabs.get(1));
	System.out.println(driver.getTitle());*/
	
	
	   
	
	
	
	
	
	
	
	
			
	
	
	
	
		
	}
	
}
