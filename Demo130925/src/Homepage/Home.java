package Homepage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {

			
			public static void main(String[] args) throws InterruptedException 
			{
				
				// step-1 Open Chrome Browser with https://www.flexiquiz.com/
				
				var driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				
				
				// step-2 click on accept cookies button
				
				//driver will wait for 30 seconds to do next action
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Thread.sleep(30000);
				System.out.println("wait finished");
				
				// find the button and click Mobile & Tablets
				driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[2]/div/div")).click();
			
				//driver will wait for 30 seconds to do next action
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

				//Thread.sleep(30000);
				System.out.println("Iphone clicked");

				//driver will wait for 30 seconds to do next action
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

				// find the button and click
				driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[10]/div/div[2]/div/div/div[1]/div/div[1]/div/div/div[1]/div[1]/a")).click();
				
				
				
			}
			
			
	}


