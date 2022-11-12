package kumar_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Xfinity {

	public static void main(String[] args) {
		// TODO Auto-generated method stubc
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://xfinity.com");
		driver.findElement(By.xpath("//a[@class = 'xc-header--navigation-link xc-header--active xc-hidden']")).click();
		
		driver.get("https://xfinity.com");
		driver.findElement(By.xpath("//a [@name = 'shop']")).click();
		
		driver.get("https://xfinity.com");
		driver.findElement(By.xpath("//a [contains(@name , 'shop')]")).click();
		
		driver.get("https://xfinity.com");
		driver.findElement(By.xpath("//a [contains(@class , 'xc-header--navigation-link xc-header--active xc-hidden')]")).click();
		
		driver.get("https://xfinity.com");
		driver.findElement(By.xpath("//a[@id = 'xc-header-nav-item-shop']")).click();
		
		driver.get("https://xfinity.com");
		driver.findElement(By.xpath("//a[contains(@id , 'xc-header-nav-item-shop')]")).click();
		
		driver.get("https://xfinity.com");
		driver.findElement(By.xpath("//a[contains(text() , 'Shop')][1]")).click();
		
		driver.get("https://xfinity.com");
		driver.findElement(By.xpath("//li [@class = 'xc-header--navigation-li']/child :: a[1]")).click();
		
		driver.get("https://xfinity.com");
		driver.findElement(By.xpath("//script[@id = 'formula-navigation']/preceding-sibling :: li/child :: a[1]")).click();
		
		driver.get("https://xfinity.com");
		driver.findElement(By.xpath("//div [@class = 'xc-header--container-nav']/child :: ul/child :: li/child :: a[1]")).click();
	
		
		
		
		
		
		
		

	}

}
