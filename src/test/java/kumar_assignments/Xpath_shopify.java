package kumar_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_shopify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://shopify.com");
		driver.findElement(By.xpath("//a [ @class = 'marketing-nav__item marketing-nav__item--user'][1]")).click();
		
		driver.get("https://shopify.com");
		driver.findElement(By.xpath("//a [ contains(@class, 'marketing-nav__item marketing-nav__item--user')][1]")).click();
		
		driver.get("https://shopify.com");
		driver.findElement(By.xpath("//ul [ @class = 'marketing-nav__items marketing-nav__user display--expanded-nav']/child :: li/child :: a[1]")).click();
		
		
		
		driver.get("https://shopify.com");
		driver.findElement(By.xpath("//nav [1]/child :: ul[3]/child :: li/child :: a[1]")).click();
		
		driver.get("https://shopify.com");
		driver.findElement(By.xpath("//div [ @id = 'NavDrawer']/preceding-sibling :: div/descendant :: li[66]/child :: a")).click();
		
		driver.get("https://shopify.com");
		driver.findElement(By.xpath("// button [ @class = 'marketing-nav__hamburger hide--expanded-nav js-drawer-open-right']/preceding-sibling :: ul[1]/child :: li/child :: a[1]")).click();
		
		driver.get("https://shopify.com");
		driver.findElement(By.xpath("//ul[@class = 'marketing-nav__items marketing-nav__user display--expanded-nav']/child :: li/child :: a[1]")).click();
		
		driver.get("https://shopify.com");
		driver.findElement(By.className("marketing-nav__item marketing-nav__item--user")).click();
		
		driver.get("https://shopify.com");
		driver.findElement(By.xpath("//ul [ @class = 'marketing-nav__items marketing-nav__items--primary-mobile hide--desktop']/following-sibling :: ul/child :: li/child :: a[1]")).click();

		
		
		
		
		
		
		
		
	}

}
