package com.example.one;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	//import org.openqa.selenium.edge.EdgeDriver;
	//import org.openqa.selenium.firefox.FirefoxDriver;

		public class HelloAmazon 
		{
//	invalid given title	public static String given_title = "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment &amp; more";
		public static String given_title = "Amazon.co.uk";		
		public static void main(String[] args)
		{
	        WebDriver driver = new ChromeDriver();

	        driver.get("https://www.amazon.co.uk/");
	        String title = driver.getTitle();
	        
	        System.out.println(title);
	        
	        if (given_title.equals(title)) 
	        {
	        	System.out.println("Valid Home Page");
	        	
	        }	
	        else 
	        {
	        	System.out.println("Invalid Home Page");
	        	
	        }
	        
	     //   System.out.println(title);
	      
	        //  driver.quit();
	    }
		
	}
	

