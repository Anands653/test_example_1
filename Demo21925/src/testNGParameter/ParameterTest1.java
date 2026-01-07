package testNGParameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ParameterTest1 {

	
	WebDriver driver;
	@Parameters({"Browser"})
	@BeforeTest
	public void set1Up(String browser) {
	
		driver = new ChromeDriver();
		System.out.println("Chrome browser openend");
	
		driver.manage().window().maximize();
	}
	@Parameters({"URL"})
	@Test(groups = {"smoke"})
	public void get1URL(String URL) {
		driver.get(URL);
	}
	
	@Test(groups = {"smoke"})
	 public void get1Title() { 
		 String titlea = driver.getTitle(); 
	     System.out.println("Titlea of Webpage: " + titlea); 
	 } 
	
	@AfterTest
	public void close1() {
		driver.close();
	}
	
}



