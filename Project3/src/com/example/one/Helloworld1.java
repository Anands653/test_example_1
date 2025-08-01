package com.example.one;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Helloworld1
	{
		public static String given_title = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		 public static void main(String[] args)
		 {
		        WebDriver driver = new ChromeDriver();

		        driver.get("https://www.flipkart.com/");
		        
		        String title = driver.getTitle();
		        
		        System.out.println(title);
		        
		        if(given_title.equals(title))
		        {
		        	System.out.println("Pass:Valid Home Page");
		        }
		        else
		        {
		        	System.out.println("Fail:In-Valid Home Page");
		        }
		        
		        //System.out.println(title);

		        //driver.quit();
		 }
	}

