package kumar_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_jumia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jumia.com");
		driver.findElement(By.xpath("//div [ @class = 'my-auto']")).click();
		
		driver.get("https://jumia.com");
		driver.findElement(By.xpath("//a [ @class = 'block h-full flex align-center']/child :: div[ @class = 'my-auto'][1]")).click();
		
		driver.get("https://jumia.com");
		driver.findElement(By.xpath("//div  [@class = 'navbar-item'][5]/child :: a/child :: div[1]")).click();
		
		driver.get("https://jumia.com");
		driver.findElement(By.xpath("//div  [@class = 'navbar-item'][6]/preceding-sibling :: div[1]/child :: a/child :: div[1]")).click();
		
		driver.get("https://jumia.com");
		driver.findElement(By.xpath("//div [ @class = 'menu-background']/ancestor :: div[1]/descendant :: div[52]/child :: a/child :: div")).click();
		
		driver.get("https://jumia.com");
		driver.findElement(By.xpath("//div [ @class = 'navbar-item'][8]/preceding-sibling :: div[3]/child :: a/child ::div")).click();
		
		driver.get("https://jumia.com");
		driver.findElement(By.xpath("//div[1]/child :: div/child :: section/child :: nav/child :: div/child :: div[2]/child :: div[5]/child :: a/child :: div[1]")).click();
		
		driver.get("https://jumia.com");
		driver.findElement(By.xpath("//div[1]/child :: div/child :: section/child :: nav/child :: div/child :: div[1]/following-sibling :: div/child :: div[5]/child :: a/child :: div")).click();
		
		driver.get("https://jumia.com");
		driver.findElement(By.xpath("//div[1]/child :: div/child :: section/child :: nav/child :: div/child :: div[1]/following-sibling :: div/child :: div/following-sibling :: div[4]/child :: a/child :: div[1]")).click();
		
		driver.get("https://jumia.com");
		driver.findElement(By.xpath("//div  [@class = 'navbar-item'][5]/child :: a/child :: div[1]")).click();
		
		
		
		
		
		
		

	}

}
