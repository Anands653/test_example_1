package Homepage;

import java.time.Duration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logiinpage

{
	WebDriver driver;
	@Test
public void openloginPage()
	
	{	
            driver = new ChromeDriver();
            driver.get("https://www.flexiquiz.com/account/login");
            driver.manage().window().maximize();
            
            // driver will wait for 30 sec to do the next step
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     
            
         // find the button and click
    		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    		
    		String expectedTitle = "Login - FlexiQuiz";
    		String actualTitle = driver.getTitle();
    				
    				
    		Assert.assertEquals(expectedTitle, actualTitle);

	}
	
	@Test
	public void TestWithEmptyfields()
	{
        driver = new ChromeDriver();
        driver.get("https://www.flexiquiz.com/account/login");
        driver.manage().window().maximize();
		
        // driver will wait for 30 sec to do the next step
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
 
        
     // find the button and click
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		
		// Login Button
		
		driver.findElement(By.id("loginNow")).click();
		
		String expectedValidationMessage = "The Email / Username field is required.";
		String actualValidationMessage = driver.findElement(By.id("userNameValidationMessage")).getText(); 

	Assert.assertEquals(expectedValidationMessage,actualValidationMessage);
	}


}


