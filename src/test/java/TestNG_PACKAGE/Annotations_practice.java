package TestNG_PACKAGE;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Annotations_practice {
	@BeforeTest
	void bt() {
		System.out.println("before Test...");
	}
	@BeforeClass
	void bc() {
		System.out.println("before Class...");
	}
	
	@BeforeMethod
	void bm() {
		System.out.println("Before method...");
	}
	
  @Test(priority=1)
  public void mytest1() {
	  System.out.println("test1 executes");
  }
  
  @Test(priority=2)
  public void mytest2() {
	  System.out.println("test2 executes");
  }
  
  @AfterMethod
	void fm() {
		System.out.println("After method...");
	}
  
	@AfterClass
	void ac() {
		System.out.println("After Class...");
	}
	
	@AfterTest
	void at() {
		System.out.println("After Test...");
	}
	
}
