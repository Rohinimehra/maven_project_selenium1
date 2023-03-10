package TestNG_grouping;

import org.testng.annotations.Test;

public class InvocationCountDemo {
  @Test(invocationCount=10)
  public void func() {
	  System.out.println("Testing.....");
  }
}
