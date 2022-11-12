package findelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validate_facebook {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://facebook.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String expectedurl = driver.getCurrentUrl();
		String expectedtitle = driver.getTitle();
		String actualurl = "https://www.facebook.com/";
		String actualtitle = "Facebook - log in or sign up";
		if (expectedurl.equals(actualurl) && expectedtitle.equals(actualtitle)) {
			System.out.println("the url is correct");}
		
			else {System.out.println("the url is not correct");}
		
		driver.findElement(By.xpath("//div[@id = 'reg_pages_msg']/preceding :: a[@role = 'button'][1]")).click();
		
	
		driver.findElement(By.name("firstname")).sendKeys("samir");
		
		//driver.findElement(By.name("//label[text() = \"Male\"]")).click();
		driver.findElement(By.name("lastname")).sendKeys("sam");
		
		
		driver.findElement(By.name("reg_email__")).sendKeys("sam@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sam@gmail.com");
		

		driver.findElement(By.name("reg_passwd__")).sendKeys("sam1234");
		
		
		
		
		
		
		// do not use select byvalue and byindex 
		//always use selectbyvisibletext 
		WebElement ddown = driver.findElement(By.name("birthday_month"));
		Select select = new Select(ddown);
		select.selectByVisibleText("Oct");
		
		WebElement ddown1 = driver.findElement(By.id("day"));
		Select select1 = new Select(ddown1);
		select1.selectByVisibleText("27");
		
		WebElement ddown2 = driver.findElement(By.id("year"));
		Select select2 = new Select(ddown2);
		select2.selectByVisibleText("1980");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(), \"Male\")]")).click();
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


