package practice_area;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_ares1 {
public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String expectedUrl = driver.getCurrentUrl();
		String expectedTitle = driver.getTitle();
		String actualUrl = "https://www.facebook.com/";
		String actualTitle = "Facebook - log in or sign up";
		
		if (actualUrl.equals(expectedUrl) && expectedTitle.equals(actualTitle)){
				System.out.println("this is a correct Url");}
	else {System.out.println("this is incorrect Url");}
		
		WebElement signin = driver.findElement(By.name("email"));
		if (signin.isDisplayed()== true && signin.isEnabled() == true) {
			signin.sendKeys("17037658976");
		}
		WebElement password = driver.findElement(By.name("pass"));
		if ( password.isDisplayed() == true && password.isEnabled() == true) {
			password.sendKeys("mypassword");
		}
		WebElement login = driver.findElement(By.name("login"));
		if ( login.isDisplayed() == true && login.isDisplayed() == true) {
			login.click();
		}
		else {System.out.println("login text box is not working");}
		

	}

}
