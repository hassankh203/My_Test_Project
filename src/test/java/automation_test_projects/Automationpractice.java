package automation_test_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automationpractice {
public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationpractice.com");
		driver.findElement(By.xpath("//a [@class = 'login']")).click();
		driver.findElement(By.xpath("//input [@class='is_required validate account_input form-control']")).sendKeys("samir123@gmail.com");
		driver.findElement(By.xpath("//button [@class = 'btn btn-default button button-medium exclusive']")).click();
		driver.findElement(By.xpath("//input [@id = 'customer_firstname']")).sendKeys("samir");
		driver.findElement(By.xpath("//input [@id = 'customer_lastname']")).sendKeys("samiro");
		driver.findElement(By.xpath("//input [@id = 'email']")).sendKeys("sam123@gmail.com");
		driver.findElement(By.xpath("//input [@id = 'passwd']")).sendKeys("samir123");
		
		//driver.findElement(By.xpath("//input [@id = 'id_gender1']")).click();
		//driver.findElement(By.xpath("//input [@id = 'id_gender1']")).click();
		//driver.findElement(By.xpath("//input [@id = 'id_gender1']")).click();
		//driver.findElement(By.xpath("//input [@id = 'id_gender1']")).click();
		//driver.findElement(By.xpath("//input [@id = 'id_gender1']")).click();
	

	}

}
