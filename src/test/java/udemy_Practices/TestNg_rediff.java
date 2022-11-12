package udemy_Practices;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_rediff {



@Test
public void LaunchingRediff () throws InterruptedException {
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
	String actualtext = driver.findElement(By.xpath("//b")).getText();
	System.out.println(driver.findElement(By.xpath("//b")).getText());
	String expectedtext = "Wrong username and password combintion.";
	Assert.assertEquals(actualtext, expectedtext );
	
	Thread.sleep(2000);
	driver.quit();
	
}

}
