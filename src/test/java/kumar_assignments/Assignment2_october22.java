package kumar_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_october22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rediff.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class = \"mailicon\"]")).click();
		driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name = 'proceed']")).click();
		driver.findElement(By.xpath("//a[@class = 'rd_logout']")).click();
		driver.findElement(By.xpath("//img[@src = '//imworld.rediff.com/worldrediff/pix/redifflogo_n.png']")).click();
		driver.findElement(By.xpath("//a[@class = 'moneyicon relative']")).click();
		driver.findElement(By.xpath("//a[@href = 'http://www.rediff.com/']")).click();
		driver.findElement(By.xpath("//a[@class = 'bmailicon relative']")).click();
		driver.findElement(By.xpath("//a[@class = 'vdicon']")).click();
		driver.findElement(By.xpath("//a[@title = 'Online Shopping']")).click();


	}

}
