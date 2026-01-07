package main;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {

	WebDriver driver;
	WebDriverWait wait;
	public static String URL = "https://www.primark.com/en-gb";
	
	 // --- Locators (Update these by inspecting the specific elements on Primark.com) ---
//    By cookieAcceptBtn = By.id("onetrust-accept-btn-handler"); // to accept all cookies
    By cookieAcceptBtn = By.id("onetrust-reject-all-handler");  // To accept only necessary ckies
   // By signInHeaderLink = By.cssSelector("href=\"/en-gb/profile\""); // Robust locator looking for 'sign-in' in URL
    By signInHeaderLink = By.id("profile-link");
    By emailField = By.id("signInName"); 
    By passwordField = By.id("password");
    By submitLoginBtn = By.cssSelector("button[type='submit']");
    By errorMessageObj = By.cssSelector(".error-message"); // Example class for error text
    By welcomeMessage = By.id(".typography"); // Example element shown after successful login

	
	@BeforeMethod
	public void setUp()
	{
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 
		driver.get(URL);
// Accept required cookies
//	driver.findElement(By.id("onetrust-reject-all-handler")).click();
		driver.findElement(cookieAcceptBtn).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
	
	@Test(priority = 1)
	public void loginPageTitleCheck() {
		
	String expectedTitle = ("Fashion, Home & Beauty | Primark UK");
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle,expectedTitle);
	
		 System.out.println( "Homepage Verified");
		 
		  // 1. Navigate to Login Page
	        driver.findElement(signInHeaderLink).click();

	        // 2. Enter Valid Credentials
	        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField)).sendKeys("as201183k@gmail.com");
	        driver.findElement(passwordField).sendKeys("Aprikra83-S");
	        // 3. Click Login
	        driver.findElement(submitLoginBtn).click();

	        // 4. Assertion: Verify Login Success
	        // Wait for the "Sign In" button to disappear or a "Welcome" message to appear
	        WebElement greeting = wait.until(ExpectedConditions.visibilityOfElementLocated(welcomeMessage));
	        Assert.assertTrue(greeting.isDisplayed(), "Login failed: Welcome message not displayed.");
	  
		 
		 // when cart is empty click Continue shoping button
		//driver.findElement(By.className("ContinueShoppingMessage_buttonContainerWidth__bKPcW")).click();
		// System.out.println("Continue shopping");
	}
	@Test(priority = 2)
	public void testLoginPageTitle() {
		
		 System.out.println( "Login clicked");
	}
	//@AfterMethod	
		 public void tearDownTest()
		 {
		 // close browser
			 driver.close();
			 driver.quit();
			 System.out.println("Test completed Successfully");
		 }	 
	
	}
	

