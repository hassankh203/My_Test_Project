package kumar_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//a[@class = 'MV3Tnb']")).click();
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//body[1]/child :: style/following-sibling :: div/child :: div/child :: style/following-sibling :: a[1]")).click();
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//body[1]/child :: div[@class = 'L3eUgb']/child :: div/child :: style/following-sibling :: a[1]")).click();
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//div[@class = 'Fgvgjc']/preceding-sibling :: div/descendant :: style/following-sibling :: a[@class = 'MV3Tnb'][1]")).click();
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//div[@class = 'L3eUgb']/descendant :: a[1]")).click();
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//div[@class = 'gb_Se']/preceding :: div[2]/preceding :: a[2]")).click();
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//div[@class = 'gb_Se']/preceding :: div[2]/ancestor :: div[5]/preceding :: a[2]")).click();
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//div[@class = 'gb_Se']/preceding :: div[2]/preceding :: a[2]")).click();
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//div[@class = 'gb_Se']/preceding :: a[2]/preceding :: a[2]")).click();
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//div[@class = 'gb_Se']/preceding :: a[2]/preceding :: style[1]/following-sibling :: a[1]")).click();
		
		
		
	}

}
