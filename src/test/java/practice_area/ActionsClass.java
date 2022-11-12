package practice_area;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://walmart.com");
		Actions action1 = new Actions(driver);
		action1.clickAndHold(driver.findElement(By.id("UhoGrpIakgcuHjD")));
		
		driver.findElement(By.cssSelector(".f7.mw3.mw4-hdkp.lh-title.truncate")).click();
		driver.findElement(By.cssSelector("button[class='w_Bm w_Bo w_Bs db mb3 w-100']")).click();
		
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.id("UhoGrpIakgcuHjD")));
		

	}

}
