package demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactlistTest {
	@Test
	public void m1Test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/online-shopping/s?k=online+shopping");
		driver.manage().window().maximize();
		
		
		System.out.println("Hello");
	}
}
