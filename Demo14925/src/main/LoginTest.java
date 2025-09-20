package main;

import java.time.Duration;

//import org.junit.Assert;
//import org.junit.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest
{
	WebDriver driver;
@Test
public void openLoginPage()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flexiquiz.com/account/login");
	
	 // driver will wait for 30 sec to do the next step
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

    
    // find the button and click
    	driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	
	 // driver will wait for 30 sec to do the next step
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	
    	String expectedTitle2 = "Login - FlexiQuiz";
    	String actualTitle2 = driver.getTitle();
	
	
    	Assert.assertEquals(expectedTitle2, actualTitle2);
	
	
}
@Test
public void testWithEmptyfields()
{
	// Login Button
	
		driver.findElement(By.id("loginNow")).click();
		
		 // driver will wait for 30 sec to do the next step
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		String expectedValidationMessage = "The Email / Username field is required.";
		String actualValidationMessage = driver.findElement(By.id("userNameValidationMessage")).getText(); 

		Assert.assertEquals(expectedValidationMessage,actualValidationMessage);

	
}
@Test
public void testWithUserNameInput()

{
	//Input text in UserID

		
		driver.findElement(By.id("UserName")).sendKeys("Anand");
		
		driver.findElement(By.id("loginNow")).click();
		
		 // driver will wait for 30 sec to do the next step
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
					
		Assert.assertEquals("The Password field is required.",driver.findElement(By.id("passwordValidationMessage")).getText());
		
	
}
@Test
public void testWithUserNameAndPasswordInput()
{
	//Input text in UserID and password

				
			driver.findElement(By.id("Password")).sendKeys("Anand");
			
			driver.findElement(By.id("loginNow")).click();
			
			
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 
		    String expectedValidationMessage4 = "Captcha is required.";
			String actualValidationMessage4 = driver.findElement(By.id("mtcaptchaValidationMessage")).getText(); 

		//Assert.assertEquals(expectedValidationMessage4,actualValidationMessage4);
			
		Assert.assertEquals(expectedValidationMessage4, actualValidationMessage4,null);
		
}

}

