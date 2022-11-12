package p2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://rediff.com");
		 driver.findElement(By.cssSelector("a.mailicon")).click();
		 driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		 driver.findElement(By.cssSelector("input#password")).sendKeys("selenuim@123");
		 driver.findElement(By.cssSelector("input[name = 'proceed']")).click();
		
		
		
		
		
		
	}

}
