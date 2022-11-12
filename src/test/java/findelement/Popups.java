package findelement;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rediff.com");
		driver.findElement(By.className("mailicon")).click();
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		alert.accept();
		
		
	
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://google.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://rediff.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://google.com");
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://rediff.com");
		

	}

}
