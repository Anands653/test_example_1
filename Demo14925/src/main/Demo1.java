package main;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

			public static String URL = "https://phptravels.com/demo/"; // We can call static variable using class name URL.

		public static void main(String[] args) // This will run as Java application
		
	{
			
			var driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(Demo2.URL);
			
			  // driver will wait for 40 sec to do the next step
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	      //checking the landing page is correct  
			
	      		String expectedTitle1 = "Free Travel Booking Software Demo – Flights, Hotels, Tours & Cars";
	      	   	String actualTitle1 = driver.getTitle();
	      		
	      		
	      	  Assert.assertEquals(expectedTitle1, actualTitle1); // Homepage verified
	      		
	      	 System.out.println("Homepage opened");
	        
	     // find the button and click
			driver.findElement(By.xpath("/html/body/header/div[1]/div/nav/a[2]")).click();
			
			// System.out.println("pricing page clicked");
			
			//checking the landing page is correct  
			
			String expectedTitle2 = "Phptravels Plans & Pricing | One Time Payment";
		   	String actualTitle2 = driver.getTitle();
			
			
		   Assert.assertEquals(expectedTitle2, actualTitle2);
		   System.out.println("Pricing page verified");
		   
	
	}

}
