package com.example.one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Helloworld
{
	public static String given_title = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
//	public static String given_title = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
			
	public static void main(String[] args)
	{
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");
        String title = driver.getTitle();
        
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
