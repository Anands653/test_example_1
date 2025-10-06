package TestNGAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGSeleniumExample 
{

	WebDriver driver;
					// @BeforeSuite - This will run before the suite begins
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite: Running once before the test suite.");
	}
					// @BeforeTest - This will run before any test is executed
		@BeforeTest
		public void beforeTest() {
			System.out.println("Before Test: Running once before any test.");
			}
					// @BeforeClass - This will run before the first test method in the class
		@BeforeClass
		public void beforeClass() {
			System.out.println("Before Class: Running once before the first test method.");
		}
		
					// @BeforeMethod - This will run before each @Test method
		@BeforeMethod
		public void setup() {
			System.out.println("Before Method: setting up WebDriver.");
			
					// Initialize WebDriver
			driver = new ChromeDriver();		
		}
		
				// @Test - This is the test method where actual test steps are written
		@Test
		public void testGoogleTitle() {
			driver.get("https://www.google.com/");
			String title = driver.getTitle();
			System.out.println("Title of the pge is:" + title);
		}
		@Test
		public void testGeeksForGeeksTitle() {
			driver.get("https://www.geeksforgeeks.org/");
			String title = driver.getTitle();
			System.out.println("Title of the page is:" + title);
			
			Assert.assertEquals("GeeksforGeeks | Your All-in-One Learning Portal",driver.getTitle());
		}
		
		 // @AfterMethod - This will run after each @Test method
	    @AfterMethod
	    public void tearDown() {
	        System.out.println("After Method: Closing the browser.");
	        driver.quit();
	    }
	    
	    // @AfterClass - This will run after all the test methods in this class
	    @AfterClass
	    public void afterClass() {
	        System.out.println("After Class: All tests in this class have finished.");
	    }
	    
	    // @AfterTest - This will run after all the tests in the test tag are executed
	    @AfterTest
	    public void afterTest() {
	        System.out.println("After Test: Running after all the tests.");
	    }

	    // @AfterSuite - This will run after the suite finishes
	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("After Suite: Running once after the test suite.");
	    }
	}

