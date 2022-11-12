package kumar_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10, 0));
		
		driver.get("https://ebay.com");
		driver.findElement(By.xpath("//input[@class = 'btn btn-prim gh-spr']")).click();
		
		driver.get("https://ebay.com");
		driver.findElement(By.xpath("//td [@class = 'gh-td']/following-sibling :: td[@class = 'gh-td-s']/descendant :: input[@id = 'gh-btn']")).click();

		driver.get("https://ebay.com");
		driver.findElement(By.xpath("//td [@class = 'gh-td']/following-sibling :: td/descendant :: input[@id = 'gh-btn']")).click();
		
		driver.get("https://ebay.com");
		driver.findElement(By.xpath("//input[@id = 'gh-btn']")).click();
		
		driver.get("https://ebay.com");
		driver.findElement(By.xpath("//table[@class = 'gh-tbl2']/child :: tbody/child ::  tr/child :: td[3]/child :: input[1]")).click();
		
	   driver.get("https://ebay.com");
		driver.findElement(By.xpath("//table[@class = 'gh-tbl2']/descendant :: input[3]")).click();
		
		driver.get("https://ebay.com");
		driver.findElement(By.xpath("//table[@class = 'gh-tbl2']/child :: tbody/descendant :: input[3]")).click();
		
		driver.get("https://ebay.com");
		driver.findElement(By.xpath("//table[@class = 'gh-tbl2']/descendant :: input[3]")).click();
		
		driver.get("https://ebay.com");
		driver.findElement(By.xpath("//form/child :: table/descendant :: td[3]/child :: input")).click();
		
		driver.get("https://ebay.com");
		driver.findElement(By.xpath("//form/child :: table/descendant :: td[2]/following-sibling :: td[1]/child :: input")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
