package main;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignInTest {

	public static String URL = "https://auth.johnlewis.com/login?state=hKFo2SBHc0VPdmxNSEVtWUZRRV9vRzZxV3pjVGNVcWlZZk1wYqFupWxvZ2luo3RpZNkgWC10ZEZ0U25DT1lJdENJYm8wZVA2VVJUZkJPOXlrOTmjY2lk2SBwNW5oOUtwUklIU1ZpSVNGNzcyZGZyNFJ0dTdrYUpGOA&client=p5nh9KpRIHSViISF772dfr4Rtu7kaJF8&protocol=oauth2&scope=openid%20profile%20email&audience=https%3A%2F%2Fapi.johnlewis.com&redirect_uri=https%3A%2F%2Fwww.johnlewis.com%2Fsso%2Fbrowse%2Fcallback%3FcontinueTo%3Dhttps%253A%252F%252Fwww.johnlewis.com%252F&newSignUpFlow=true&initialScreen=login&response_type=code&response_mode=query&nonce=Z1hofjVKTDVIaTd6NUw0cE1GdGVmYXJLcXptM35ZVWUzbHRmUlM4YjcyaA%3D%3D&code_challenge=I5TQV3Nhk3cJLsAIO3tARDEFeHaRWKGti0IjUc1zpxg&code_challenge_method=S256&auth0Client=eyJuYW1lIjoiYXV0aDAtc3BhLWpzIiwidmVyc2lvbiI6IjIuMS4zIn0%3D";
	WebDriver driver;
	
	@Test
	public void SigninTrail()
	{
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		 // when cart is empty click Continue shoping button
		driver.findElement(By.className("email_M8W_w sessioncamexclude")).sendKeys("An201183k@gmail.com");

	}
}
