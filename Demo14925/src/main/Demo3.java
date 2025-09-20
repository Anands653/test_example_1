package main;

import java.time.Duration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 
{

	public static String URL = "https://phptravels.com/";  // We can call static variable using class name URL.
	@Test
	public  void testMainPage() {
	
	
	var driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(Demo2.URL);
	
	  // driver will wait for 40 sec to do the next step
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
      //checking the landing page is correct  
	
        String expectedTitle1 = "PHPTRAVELS Best Open Source PHP Booking Software";
  	   	String actualTitle1 = driver.getTitle();
  		
  		
  	  Assert.assertEquals(expectedTitle1, actualTitle1); // Homepage verification
  	//  System.out.println(actualTitle1);
  	  System.out.println("Homepage opened");       // Homepage verified
  	  
  	  
	}	  
	@Test
	public  void testPricingPage()
	
	{
	
		var driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(Demo2.URL +"pricing" );
	
	  // driver will wait for 40 sec to do the next step
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
  //checking the landing page is correct  
    

	String expectedTitle2 = "Phptravels Plans & Pricing | One Time Payment";
   	String actualTitle2 = driver.getTitle();
	
	
   Assert.assertEquals(expectedTitle2, actualTitle2);
   
   System.out.println("Pricing page verified"); // Pricing page verified
	}

	
	@Test
	public  void testLoginPage()
	{
}
}