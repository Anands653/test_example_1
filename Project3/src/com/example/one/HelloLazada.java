package com.example.one;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloLazada

	{
	public static String given_title = "Home";		
	public static void main(String[] args)
	{
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.lazada.com/en/");
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




