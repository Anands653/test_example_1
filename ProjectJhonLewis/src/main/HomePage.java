package main;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage 
{
	public static String URL = "https://www.johnlewis.com/";
	WebDriver driver;
	
	@Test
	public void LoginTest()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
	
 driver.findElement(By.xpath("//button[contains(.,'Allow all')]")).click();

 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));

	
// driver.findElement(By.xpath("//*[@id=\"wrapper_inner\"]/div[3]/a[1]/span")).click();

// John Lewis & Partners | Never Knowingly Undersold
 String actualTitle = driver.getTitle();		 
	System.out.println("Title is :" +actualTitle);
	}

	
		
}
