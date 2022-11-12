package parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class3_parameter {
	
	 
	@Test
	public void test1() {
		String url = "https://target.com";
		String username = "seleniumpand@rediffmail.com";
		String password = "Selenium@123";
		WebDriverManager.edgedriver().setup();
		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://target.com");
		driver1.manage().window().maximize();
		driver1.quit();
		
		
		
	}
}
