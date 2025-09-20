 package main;

import java.time.Duration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2
{
	public static String URL = "https://phptravels.com/"; // We can call static variable using class name URL.

	// public static void main(String[] args) 
	
	@Test                              // Add @Test and import org.junit.Test and run test with Juint
		public void testPhptravels() 
	{
		
		var driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Demo2.URL+"demo/");
		
		  // driver will wait for 40 sec to do the next step
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
      //checking the landing page is correct  
		
      		String expectedTitle1 = "Free Travel Booking Software Demo – Flights, Hotels, Tours & Cars";
      	   	String actualTitle1 = driver.getTitle();
      		
      		
      	  Assert.assertEquals(expectedTitle1, actualTitle1); // Homepage verification
      	  
      	  System.out.println("Homepage opened");       // Homepage verified
        
     // find the Pricing page with By.xpath or By.id and click the button
		driver.findElement(By.xpath("/html/body/header/div[1]/div/nav/a[2]")).click();
		
		// System.out.println("Pricing page clicked");
		
		//checking the landing page is correct  or not
		
		String expectedTitle2 = "Phptravels Plans & Pricing | One Time Payment";
	   	String actualTitle2 = driver.getTitle();
		
		
	   Assert.assertEquals(expectedTitle2, actualTitle2);
	   
	   System.out.println("Pricing page verified"); // Pricing page verified
	   
	}
}
