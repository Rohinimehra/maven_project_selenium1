package TestNG_PACKAGE;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;

public class HardAssertions_Demo {
  @Test
  public void hard_assertions() {
	  System.out.println("testing...");
	  System.out.println("testing...");
	  System.out.println("testing...");
	  System.out.println("testing...");
	  
	  //Hard Assertions
	  Assert.assertEquals(1, 2);
	  System.out.println("Hard Assertion completed...");
  }
	  @Test
	  public void soft_assertions() {
	  //SOFT ASSERTIONS
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals(1, 2);
	  System.out.println("Soft Asserion completed...");
	  sa.assertAll();  //mandatory

  }
}


