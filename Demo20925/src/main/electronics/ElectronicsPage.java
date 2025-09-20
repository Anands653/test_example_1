package main.electronics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsPage
{

	public static String URL = "https://www.ebay.co.uk/";  // We can call static variable using class name URL.
	WebDriver driver;
		
		@Test
		public void LoginTestPage()
		{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL + "/b/bn_7000259660");
			  
		
		 // driver will wait for 30 sec to do the next step
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	    	
	    	    
	        // find the button and click
	       	driver.findElement(By.id("gdpr-banner-accept")).click();
	    		
	    	String expectedTitle2 = "Electronics products for sale | eBay UK";
	    	String actualTitle2 = driver.getTitle();
		
	    	//System.out.println(actualTitle2);
	    	Assert.assertEquals(expectedTitle2, actualTitle2);
	}
	
}
