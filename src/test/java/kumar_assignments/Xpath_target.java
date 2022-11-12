package kumar_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		driver.get("https://target.com");
		driver.findElement(By.xpath("//a [ @id = 'utilityNav-registries']")).click();
		
		 
		driver.get("https://target.com");
		driver.findElement(By.xpath("//a [ @class = 'Link__StyledLink-sc-frmop1-0 styles__StyledLink-sc-y1hu6r-2 fYMbkA bCAydd h-text-sm h-text-white h-padding-a-none h-margin-l-jumbo'][1]")).click();
		
		 
		driver.get("https://target.com");
		driver.findElement(By.xpath("//div [ @class = 'styles__UtilityHeaderLinksContainer-sc-y1hu6r-1 nKbky']/child :: a[1]")).click();
		
		 
		driver.get("https://target.com");
		driver.findElement(By.xpath("//a [@id = 'utilityNav-weeklyAd']/preceding-sibling :: a[1]")).click();
		
		 
		driver.get("https://target.com");
		driver.findElement(By.xpath("//div [@class = 'styles__UtilityNavWrapper-sc-cdaur3-1 enKUVO h-flex-align-center']/child :: div/child :: a[1]")).click();
		
		 
		driver.get("https://target.com");
		driver.findElement(By.xpath("//div [@class = 'styles__FlexColumn-sc-cdaur3-0 iKKeYG']/child :: div/child :: div/child :: a[1]")).click();
		
		 
		driver.get("https://target.com");
		driver.findElement(By.xpath("//div [@class = 'styles__FlexColumn-sc-cdaur3-0 hoUyzt']/following-sibling :: div/child :: div/child :: div/child :: a[1]")).click();
		
		 
		driver.get("https://target.com");
		driver.findElement(By.xpath("//div [@class = 'styles__UtilityHeaderContainer-sc-y1hu6r-0 kpFrrq l-container-fixed']/child :: div/following-sibling :: div/child :: div/child :: div/child :: a[1]")).click();
		
		 
		driver.get("https://target.com");
		driver.findElement(By.xpath("//div [ @class = 'styles__UtilityHeaderWrapper-sc-kavn3d-2 fvTOte']/child :: div/child :: div/following-sibling :: div/descendant :: div[2]/child :: a[1]")).click();
		
		 
		driver.get("https://target.com");
		driver.findElement(By.xpath("//a[ contains(text(), 'Reg')]")).click();
		
		

	}

}
