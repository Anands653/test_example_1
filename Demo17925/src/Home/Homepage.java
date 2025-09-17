package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
public class Homepage {

	public static void main(String[] args) throws InterruptedException
	{
	var driver = new ChromeDriver();
	
	// web site to open
	
	driver.get("https://www.flexiquiz.com/");
	// Maximize the window 
	
	driver.manage().window().maximize();
	
	// wait for 30 sec for dialog box popup
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(160));
	
	Thread.sleep(3000);
	// to get actual title of landing page
	
		String actualTitle = driver.getTitle();
		 System.out.println(actualTitle);
	
	// click accept cookies button
	
	driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	
	System.out.println("Accept cookies");

	// click on pricing page
	
	driver.findElement(By.id("fq-main-menu-item-pricing")).click();

	System.out.println("pricing page clicked");
	
	//checking the landing page is correct  
	
	String expectedTitle2 = "Plans - FlexiQuiz";
   	String actualTitle2 = driver.getTitle();
	
	
    Assert.assertEquals(expectedTitle2, actualTitle2);
	
	 System.out.println(actualTitle2);

	}

}
