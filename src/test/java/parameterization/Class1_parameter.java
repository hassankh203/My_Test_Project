package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1_parameter {

	
	 
	@Test
	public void test1() {
		String url = "https://target.com";
		String username = "seleniumpand@rediffmail.com";
		String password = "Selenium@123";
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://target.com");
		driver2.manage().window().maximize();
		driver2.quit();
		
		
		
		
		
		
		
	}
	
}
