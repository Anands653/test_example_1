import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest1 {
	
	  public static void main(String[] args) throws InterruptedException {
		
		  
		  WebDriver driver = new ChromeDriver();
		  // go to flipkart.com
		  driver.get("https://www.flipkart.com/");
		  
		  // search keyword Mobile in search bar 
		 	  driver.findElement(By.name("q")).sendKeys("Mobile");
		  
				 	  
		 	  // to get time to see
		 	  
		 	  Thread.sleep(3000);
			  
				 // to close the chrome browser
				  driver.quit();	  
		 	  
		 	  System.out.println("Test pass");
	}
	  

}
