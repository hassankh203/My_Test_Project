package udemy_Practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsCreations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsCreations meth1 = new MethodsCreations();
        meth1.method1();
        method2();
        
	}
	public void method1() {
		
		System.out.println("this is method1");
		//return  "this the return of method1";
		
	}
	public static void method2() {
		System.out.println("this is method2");
		
	}

}
