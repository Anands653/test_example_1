package main;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String n [] )
	{
		var driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flexiquiz.com/account/login");
		
		 // driver will wait for 30 sec to do the next step
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
 
        
     // find the button and click
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		String expectedTitle2 = "Login - FlexiQuiz";
	   	String actualTitle2 = driver.getTitle();
		
		
	    Assert.assertEquals(expectedTitle2, actualTitle2);
		
		 // driver will wait for 30 sec to do the next step
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        
    		
		// Login Button
		
		driver.findElement(By.id("loginNow")).click();
		
		String expectedValidationMessage = "The Email / Username field is required.";
		String actualValidationMessage = driver.findElement(By.id("userNameValidationMessage")).getText(); 

	Assert.assertEquals(expectedValidationMessage,actualValidationMessage);
	
	
	
	//Input text in UserID

	 // driver will wait for 30 sec to do the next step
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	driver.findElement(By.id("UserName")).sendKeys("Anand");
	
	driver.findElement(By.id("loginNow")).click();
	
		//String expectedValidationMessage1 = "The Password field is required.";
		//String actualValidationMessage1 = driver.findElement(By.id("passwordValidationMessage")).getText(); 

	//Assert.assertEquals(expectedValidationMessage1,actualValidationMessage1);
	
	Assert.assertEquals("The Password field is required.",driver.findElement(By.id("passwordValidationMessage")).getText());
	
	}
		
	

	}


