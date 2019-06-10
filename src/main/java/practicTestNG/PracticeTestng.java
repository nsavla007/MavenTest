package practicTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTestng {
	
	
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("I am in before test");
	}
	
	@BeforeClass
	public void testBeforeClass() {
		System.out.println("This is my first testNG before class");
	}
	
	@BeforeMethod
	public void testBeforeMEthod() {
		System.out.println(" before method");
	}
	
	@Test(priority=0)
	public void testMethod1() {
		System.out.println("This is my first testNG method1");
	}
	
	@Test(priority=1)
	public void testMEthod2() {
		System.out.println("I am in testMethod2");
		
	}
	
	
	@AfterMethod
	public void testAfterMethod() {
		System.out.println(" after method");
	}
	@AfterClass
	
	public void afterClass() {
		System.out.println("This is my first testNG afterclass");
	}
	
	@AfterTest
	public void AfterTestMethod() {
		System.out.println("I am in After Test");
		
	}

}



//beforeSuite and AfterSuite

//group the test case ---- smoke test, regression test,...
//diable test cases

//listerners in testNG -- listerners is a interface from the testng library 
//and it lets us modify the behaviour in testng.

