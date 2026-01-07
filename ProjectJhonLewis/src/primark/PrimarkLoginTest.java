package primark;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import java.time.Duration;

	public class PrimarkLoginTest {

	    WebDriver driver;
	    WebDriverWait wait;

	    // --- Locators (Update these by inspecting the specific elements on Primark.com) ---
	    By cookieAcceptBtn = By.id("onetrust-accept-btn-handler"); 
	    By signInHeaderLink = By.cssSelector("a[href*='sign-in']"); // Robust locator looking for 'sign-in' in URL
	    By emailField = By.id("email"); 
	    By passwordField = By.id("password");
	    By submitLoginBtn = By.cssSelector("button[type='submit']");
	    By errorMessageObj = By.cssSelector(".error-message"); // Example class for error text
	    By welcomeMessage = By.cssSelector(".account-greeting"); // Example element shown after successful login

	    @BeforeMethod
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	        
	        driver.get("https://www.primark.com/en-gb");
	        
	        // Handle Cookies globally for all tests in this class
	        try {
	            WebElement acceptBtn = wait.until(ExpectedConditions.elementToBeClickable(cookieAcceptBtn));
	            acceptBtn.click();
	        } catch (Exception e) {
	            // Cookies already accepted or not present
	        }
	    }

	    /**
	     * Scenario 1: Verify valid login allows access
	     */
	    @Test(priority = 1)
	    public void testValidLogin() {
	        // 1. Navigate to Login Page
	        driver.findElement(signInHeaderLink).click();

	        // 2. Enter Valid Credentials
	        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField)).sendKeys("validuser@example.com");
	        driver.findElement(passwordField).sendKeys("SecurePassword123!");

	        // 3. Click Login
	        driver.findElement(submitLoginBtn).click();

	        // 4. Assertion: Verify Login Success
	        // Wait for the "Sign In" button to disappear or a "Welcome" message to appear
	        WebElement greeting = wait.until(ExpectedConditions.visibilityOfElementLocated(welcomeMessage));
	        Assert.assertTrue(greeting.isDisplayed(), "Login failed: Welcome message not displayed.");
	    }

	    /**
	     * Scenario 2: Verify system blocks invalid credentials
	     * Uses @DataProvider to test multiple negative scenarios
	     */
	    @Test(priority = 2, dataProvider = "invalidCredentials")
	    public void testInvalidLogin(String email, String password, String errorDescription) {
	        // 1. Navigate to Login Page
	        WebElement signInLink = wait.until(ExpectedConditions.elementToBeClickable(signInHeaderLink));
	        signInLink.click();

	        // 2. Clear fields and enter invalid data
	        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
	        emailInput.clear();
	        emailInput.sendKeys(email);
	        
	        WebElement passInput = driver.findElement(passwordField);
	        passInput.clear();
	        passInput.sendKeys(password);

	        // 3. Click Login
	        driver.findElement(submitLoginBtn).click();

	        // 4. Assertion: Verify Error Message
	        WebElement errorMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessageObj));
	        String actualErrorText = errorMsg.getText();
	        
	        System.out.println("Testing: " + errorDescription + " | Alert Text: " + actualErrorText);
	        Assert.assertTrue(errorMsg.isDisplayed(), "Error message should be visible for invalid login.");
	    }

	    // Data Provider for Negative Testing
	    @DataProvider(name = "invalidCredentials")
	    public Object[][] getData() {
	        return new Object[][] {
	            {"wronguser@test.com", "wrongpass", "Wrong Email & Pass"},
	            {"validuser@example.com", "wrongpass", "Correct Email & Wrong Pass"},
	            {"", "password123", "Empty Email"}
	        };
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}

