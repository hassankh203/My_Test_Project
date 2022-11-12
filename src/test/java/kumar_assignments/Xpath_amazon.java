package kumar_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_amazon {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com");
		
		//xpath for the  Element "best sellers"
		
		driver.findElement(By.xpath("//a [@class = 'nav-a  '][1]")).click();
		driver.get("https://www.amazon.com");
		
		driver.findElement(By.xpath("//div [ @id = 'nav-main']/descendant :: a [3]")).click();
		driver.get("https://www.amazon.com");
		
		driver.findElement(By.xpath("//a [@id = 'nav-link-amazonprime']/preceding :: a[4]")).click();
		driver.get("https://www.amazon.com");
		

		driver.findElement(By.xpath("//a [@id = 'nav-link-amazonprime']/preceding-sibling :: a[4]")).click();
		driver.get("https://www.amazon.com");
		
		
		driver.findElement(By.xpath("//div[ @id = 'nav-xshop']/child:: script[1]/following-sibling :: a[2]")).click();
		driver.get("https://www.amazon.com");
		

		driver.findElement(By.xpath("//div [@id = 'a-page']/descendant :: header/descendant :: div[@id = 'navbar']/descendant :: div[@id = 'nav-main']/descendant :: a[3]")).click();
		driver.get("https://www.amazon.com");
		

		driver.findElement(By.xpath("//div [@id = 'a-page']/descendant :: header/descendant :: div[@id = 'nav-main']/descendant :: a[3]")).click();
		driver.get("https://www.amazon.com");
		

		driver.findElement(By.xpath("//div [@id = 'a-page']/descendant :: div[@id = 'nav-main']/descendant :: a[3]")).click();
		driver.get("https://www.amazon.com");
		

		driver.findElement(By.xpath("//div [@class = 'nav-fill']/descendant :: div [@class = 'nav-progressive-content']/descendant :: a[@class = 'nav-a  '][1]")).click();
		driver.get("https://www.amazon.com");
		

		driver.findElement(By.xpath("//div [@class = 'nav-fill']//descendant :: a[@class = 'nav-a  '][1]")).click();
		driver.get("https://www.amazon.com");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
