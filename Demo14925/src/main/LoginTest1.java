package main;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

	
		public class LoginTest1
		{

	    WebDriver driver;

	    @BeforeClass
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	    }

	    @BeforeMethod
	    public void openLoginPage1() 
	    {
	        driver.get("https://www.flexiquiz.com/account/login");

	        // Accept cookies
	        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	    }

	    @Test
	    public void testLoginPageTitle1() {
	        String expectedTitle = "Login - FlexiQuiz";
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle);
	    }

	    @Test
	    public void testWithEmptyFields1() {
	        driver.findElement(By.id("loginNow")).click();
	        String expectedMessage = "The Email / Username field is required.";
	        String actualMessage = driver.findElement(By.id("userNameValidationMessage")).getText();
	        Assert.assertEquals(actualMessage, expectedMessage);
	    }

	    @Test
	    public void testWithUserNameOnly1() {
	        driver.findElement(By.id("UserName")).sendKeys("Anand");
	        driver.findElement(By.id("loginNow")).click();
	        String expectedMessage = "The Password field is required.";
	        String actualMessage = driver.findElement(By.id("passwordValidationMessage")).getText();
	        Assert.assertEquals(actualMessage, expectedMessage);
	    }

	    @Test
	    public void testWithUserNameAndPassword1() {
	        driver.findElement(By.id("UserName")).sendKeys("Anand");
	        driver.findElement(By.id("Password")).sendKeys("Anand");
	        driver.findElement(By.id("loginNow")).click();

	        String expectedMessage = "Captcha is required.";
	        String actualMessage = driver.findElement(By.id("mtcaptchaValidationMessage")).getText();
	        Assert.assertEquals(actualMessage, expectedMessage);
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}


