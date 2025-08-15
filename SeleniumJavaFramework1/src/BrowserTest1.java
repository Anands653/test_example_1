import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest1 {
	
	  public static void main(String[] args) {
		
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.flipkart.com/");
		  
		  driver.findElement(By.name("q")).sendKeys("Mobile");
		  
		  //WebElement textBox = driver.findElement(By.id("Pke_EE")).sendKeys("Mobile");
		  
		  
	}
	  

}
