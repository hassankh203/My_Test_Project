package practice_area;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_testNG {
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	
		
	}
	
	
	@Test
	public  void lawnchingHomaPage() {
		
		driver.get("https://rediff.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		
	}
	@Test
	public void loginFunction() {
		driver.findElement(By.className("mailicon")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenuim@123");
		driver.findElement(By.name("proceed")).click();
		
		
	}
	

}
