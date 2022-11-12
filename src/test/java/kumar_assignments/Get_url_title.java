package kumar_assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_url_title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		String actualT = "Amazon.com. Spend less. Smile more.";
		String expectedT = driver.getTitle();
		String actualU = "https://amazon.com";
		String expectedU = driver.getCurrentUrl();
		if ( actualT.equals(expectedT) && actualU.equals(expectedU)) {
			System.out.println("URL & TITLE are corrects11");
		}
	}

}
