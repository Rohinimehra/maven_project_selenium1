package TestNG_PACKAGE;

import org.testng.annotations.Test;

public class BeforeSuiteDemo {
  @Test
  public void abc() {
	  System.out.println("abc Class from BeforeSuite");
  }
  
  void m() {
	  System.out.println();
  }
}
