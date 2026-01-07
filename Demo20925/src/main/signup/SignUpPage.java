package main.signup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpPage 
{

	public static String URL = "https://www.ebay.co.uk/";  // We can call static variable using class name URL.
	WebDriver driver;
		
		@Test
		public void LoginTestPage()
		{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
		

	     // driver will wait for 30 sec to do the next step
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	    // find the button and click
	    	driver.findElement(By.id("gdpr-banner-accept")).click();
		
		 // driver will wait for 30 sec to do the next step
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	    	String expectedTitle2 = "eBay UK | Electronics, Cars, Fashion, Collectibles & More";
	    	String actualTitle2 = driver.getTitle();
		
	    	//System.out.println(actualTitle2);
	    	Assert.assertEquals(expectedTitle2, actualTitle2);
	}
		
		@Test
		public void SingnInTestPage()
		
		{
			
		//	driver.findElement(By.className("vl-flyout-nav__js-tab")).click();
			

			
		}
}
