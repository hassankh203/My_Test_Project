package udemy_Practices;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExercise_createNewAccount {
	public static WebDriver driver;

	@BeforeTest
	public void WebdriverSetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

	}

	@Test(priority = 1)
	public void LaunchingHomePage() throws InterruptedException {
		String url = "https://automationexercise.com/";
		Thread.sleep(2000);
		driver.get(url);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}

	@Test(priority = 2)
	public void SigningUp() throws InterruptedException {
		driver.findElement(By.cssSelector("a[href='/login']")).click();
		String email = "seleniumpanda@rediffmail.com";
		String name = "Selenium";
		String password = "Selenium@123";
		driver.findElement(By.cssSelector("input[name ='name']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys(email);
		driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();
	}

	@Test(priority = 3)
	public void FillingSignupForm() throws InterruptedException {
		String email = "seleniumpanda@rediffmail.com";
		String first_name = "Selenium";
		String last_name = "Selenium";
		String password = "Selenium@123";

		driver.findElement(By.cssSelector("#id_gender1")).click();
		driver.findElement(By.cssSelector("#name")).sendKeys(first_name);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		WebElement dropdownDayEl = driver.findElement(By.id("days"));
		Select dropdownDay = new Select(dropdownDayEl);
		dropdownDay.selectByIndex(12);

		WebElement dropdownMonthEl = driver.findElement(By.cssSelector("#months"));
		Select dropdownMonth = new Select(dropdownMonthEl);
		dropdownMonth.selectByVisibleText("May");

		WebElement dropdownYearEl = driver.findElement(By.cssSelector("#years"));
		Select dropdownYear = new Select(dropdownYearEl);
		dropdownYear.selectByVisibleText("2018");

		// driver.findElement(By.xpath("(//input[@id='newsletter'])[1]")).click();
		driver.findElement(By.cssSelector("#first_name")).sendKeys(first_name);
		driver.findElement(By.cssSelector("#last_name")).sendKeys(last_name);
		driver.findElement(By.cssSelector("#company")).sendKeys("Piit");
		driver.findElement(By.cssSelector("#address1")).sendKeys("1200 oak st.");

		WebElement dropdownCountryEl = driver.findElement(By.cssSelector("#country"));
		Select dropdownCountry = new Select(dropdownCountryEl);
		dropdownCountry.selectByVisibleText("United States");
		driver.findElement(By.cssSelector("#state")).sendKeys("VA");
		driver.findElement(By.cssSelector("#city")).sendKeys("Sterling");
		driver.findElement(By.cssSelector("#zipcode")).sendKeys("24567");
		driver.findElement(By.cssSelector("#mobile_number")).sendKeys("703 456 6789");
		driver.findElement(By.xpath("//button[contains(text() , 'Create')]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
		driver.findElement(By.cssSelector("a[href='/delete_account']")).click();
		driver.quit();

	}

}
