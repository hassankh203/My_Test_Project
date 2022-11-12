package practice_area;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization {
	
public static WebDriver driver;

	
		
	
		@Test
		@Parameters({"browser","url","username","password"})
		public void signin (String browser, String url, String username, String password) {
			if (browser.equals("chrome")) {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				
			}
			driver.get(url);
			driver.findElement(By.cssSelector("a[title='Already a user? Sign in']")).click();
			driver.findElement(By.cssSelector("#login1")).sendKeys(username);
			driver.findElement(By.cssSelector("#password")).sendKeys(password);

		}
		
			
		
		

	}


