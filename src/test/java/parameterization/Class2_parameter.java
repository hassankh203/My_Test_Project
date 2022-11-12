package parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class2_parameter {
	
	 
	@Test
	public void test1() {
		String url = "https://target.com";
		String username = "seleniumpand@rediffmail.com";
		String password = "Selenium@123";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://target.com");
		driver.manage().window().maximize();
		driver.quit();
		
	}
		

}
