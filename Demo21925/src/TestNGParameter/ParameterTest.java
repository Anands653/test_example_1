package TestNGParameter;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ParameterTest {
	// Create first WebDriver reference.
	WebDriver driver;
	@Parameters({"Browser"})
	@BeforeTest
	public void setUp(String browser) {
		
		// Initialize WebDriver
		driver = new ChromeDriver();	
		 System.out.println("Chrome opened"); 
    
    driver.manage().window().maximize(); 
} 
	
	 // Test method to navigate to the specified URL.
	 @Parameters({"URL"}) 
	 @Test(priority = 1) 
	 public void getURL(String URL) { 
	     driver.get(URL); 
	 } 
	 
	 // Test method to retrieve and print the title of the webpage.
	 @Test(priority = 1) 
	 public void getTitle() { 
	     String title = driver.getTitle(); 
	     System.out.println("Title of Webpage: " + title); 
	 } 
	 
	 
	 	
	// https://www.geeksforgeeks.org/python/python-programming-language-tutorial/
	 static String PYTHONENDPOINT = "python/python-programming-language-tutorial/"; 
	 @Parameters({"URL"})
	 @Test(priority = 2)
	 public void getPythonURL(String URL) { 
	     driver.get(URL+PYTHONENDPOINT); 
	 } 
	// Test method to retrieve and print the title of the webpage.
		 @Test(priority = 2) 
		 public void getTitle2() { 
		     String title2 = driver.getTitle(); 
		     System.out.println("Title2 of the Webpage: " + title2); 
		     
		 } 
		 
	 // Close method to quit the WebDriver after tests are executed.
	 @AfterTest 
	 public void close() {
		 // driver will wait for 30 sec to do the next step
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	     driver.close(); 
	 } 
	}


