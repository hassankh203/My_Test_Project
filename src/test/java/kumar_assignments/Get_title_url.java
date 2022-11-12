package kumar_assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_title_url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://office.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String expectedurl = driver.getCurrentUrl();
		String actualurl = "https://www.office.com/";
		String actualtitle = "Office 365 Login | Microsoft Office";
		String expecttitle = driver.getTitle();
		if (actualtitle.equals(expecttitle) && actualurl.equals(expectedurl)) {
			System.out.println("is correct");
		}

	}

}
