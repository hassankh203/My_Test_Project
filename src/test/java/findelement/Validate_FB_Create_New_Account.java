package findelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validate_FB_Create_New_Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		WebElement signup = driver.findElement(By.xpath("//div[@id = 'reg_pages_msg']/preceding :: a[@role = 'button'][1]"));
		if(signup.isEnabled() == true && signup.isDisplayed() == true) {
		signup.click();
		}else {
		System.out.println("The link is not working");
		}
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name = 'firstname']"));
		if ( firstname.isEnabled() == true && firstname.isDisplayed() == true) {
			firstname.sendKeys("Jhone");
			}
		else {System.out.println("this text box in not working");}
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name = 'lastname']"));
		if (lastname.isEnabled() == true && lastname.isDisplayed() == true) {
			lastname.sendKeys("Jackson");
			}
		else { System.out.println("this lastname text box is not working");}
		
		WebElement mailOrmobile = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
		if (mailOrmobile.isDisplayed() == true && mailOrmobile.isEnabled()== true) {
			mailOrmobile.sendKeys("jhon.j123@gmail.com");
			}
		else { System.out.println("this email text box is not working");}
		
		
		WebElement emailConfirm = driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']"));
		if ( emailConfirm.isDisplayed() == true && emailConfirm.isEnabled() == true) {
			emailConfirm.sendKeys("jhon.j123@gmail.com");
		}
		else { System.out.println("this email confirm text box is not working");}
		
		WebElement password = driver.findElement(By.xpath("//input[@id = 'password_step_input']"));
		if ( password.isDisplayed() == true && password.isEnabled() == true) {
			password.sendKeys("Mypassword123");
		}
		else { System.out.println("this password text box is not working");}
		}
		
		
		
		
		
	
	
	

}
