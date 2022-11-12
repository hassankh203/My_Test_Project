package automation_mavencode;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_command {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://walmart.com");
		
		driver.findElement(By.xpath("//a[contains (text(), 'Flu')]")).click();
		
		driver.get("https://walmart.com");
		driver.findElement(By.xpath("//a[contains (text(), 'Gro')]")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println(alert.getText()); 
		
		
		
		
		
		
		
	}

}
