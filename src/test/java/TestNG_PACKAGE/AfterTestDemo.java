package TestNG_PACKAGE;

import org.testng.annotations.*;

public class AfterTestDemo {
  @Test
  public void xyz() {
	  System.out.println("xyz Class from AfterTestDemo.");
  }
  
  @AfterTest
  void m() {
	  System.out.println("After Test");
  }
}
