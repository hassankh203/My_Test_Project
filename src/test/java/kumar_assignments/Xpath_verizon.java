package kumar_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_verizon {
public static WebDriver driver;
	public static void main(String[] args) {
		//testing Shop Link
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://verizon.com");
		driver.findElement(By.xpath("//button [@id = 'gnav20-Shop-L1']")).click();
		

		driver.get("https://verizon.com");
		driver.findElement(By.xpath("//button [@class =  'gnav20-menu-label gnav20-menu-label-button gnav20-haschild'][1]")).click();
		
		
		driver.get("https://verizon.com");
		driver.findElement(By.xpath("//button [contains (@id, \"gnav20-Shop-L1\")][1]")).click();
		
		
		driver.get("https://verizon.com");
		driver.findElement(By.xpath("//div [@class = 'gnav20-primary-menu gnav20-featured-card']/child :: button[1]")).click();
		
		
		driver.get("https://verizon.com");
		driver.findElement(By.xpath("//div [ @class = 'gnav20-navigation-item']/child :: div/child :: button[1]")).click();
		
		
		driver.get("https://verizon.com");
		driver.findElement(By.xpath("//div [ @class = 'gnav20-navigation opacityOne']/child :: div/child :: div/child :: div/child :: div/child :: button[1]")).click();
		
		
		driver.get("https://verizon.com");
		driver.findElement(By.xpath("//div [ @class = 'gnav20-navigation opacityOne']/descendant :: button[1]")).click();
		
		
		driver.get("https://verizon.com");
		driver.findElement(By.xpath("//div [ @class = 'gnav20-navigation opacityOne']/child :: div/descendant :: button[1]")).click();
		
		
		driver.get("https://verizon.com");
		driver.findElement(By.xpath("//div [ @class = 'gnav20-navigation-item']/preceding-sibling :: div/descendant :: button[1]")).click();
		
		
		driver.get("https://verizon.com");
		driver.findElement(By.xpath("//a [@class = 'gnav20-menu-label-link']/preceding-sibling :: button[2]")).click();
		
		
		
		
		
		
		
		
		
		

	}

}
