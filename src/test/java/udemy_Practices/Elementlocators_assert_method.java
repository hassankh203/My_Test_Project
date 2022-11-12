package udemy_Practices;



import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Elementlocators_assert_method {
	public static void main(String[] args) throws InterruptedException {
		
		String username = "seleniumpanda@rediffmal.com";
		String password = "Selenium@123";
		String url = "https://rediff.com";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.getTitle();
		driver.findElement(By.cssSelector("a[title='Lightning fast free email']")).click();
		driver.findElement(By.cssSelector("#login1")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		driver.findElement(By.name("proceed")).click();
		System.out.println(driver.findElement(By.xpath("//b")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//b")).getText(), "Wrong username and password combination.");
		Thread.sleep(2000);
		driver.quit();
		

	}

}
