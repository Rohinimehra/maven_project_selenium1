package TestNG_PACKAGE;

import org.testng.annotations.*;

public class BeforeTestDemo {
  @Test
  public void abc() {
	  System.out.println("abc Class from BeforeTestDemo.");
  }
  
  @BeforeTest
  void m() {
	  System.out.println("Before Test");
  }
  
  @BeforeSuite
  void bs() {
	  System.out.println("Before Suite....");
  }
  
  @AfterSuite
  void as() {
	  System.out.println("After Suite....");

  }
}
