package testNG;

import org.testng.annotations.*;

public class First_testNG {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("A");
		
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("B");
		
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("C");
		
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("D");
		
	}
	@Test
	public void testcase() {
		System.out.println("test");
		
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("AA");
		
	}
	@AfterTest
	public void aftertest() {
		System.out.println("BB");
		
	}
	@AfterClass
	public void afterclass() {
		System.out.println("CC");
		
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("DD");
		
	}
	
	
	
	

	
	
	
	
	
	
	}


