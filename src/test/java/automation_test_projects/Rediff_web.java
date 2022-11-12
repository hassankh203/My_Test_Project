package automation_test_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_web {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.xpath("//a[contains(text() , 'Sign in')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input [contains (@name, 'proceed')]")).click();
		
		driver.findElement(By.xpath("//a[contains(@class,'rd_logout')]")).click();
		
		driver.findElement(By.xpath("//img[contains(@src,  '//imworld.rediff.com/worldrediff/pix/redifflogo_n.png')]")).click();
	}

}
