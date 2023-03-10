package TestNG_PACKAGE;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions_demo {
  @Test
  public void abc() {
	  int a=90;
	  int b=20;
	  
//	  Assert.assertEquals(a, b);
	  
	  //Assert.assertTrue(true);       //pass
	  //Assert.assertTrue(false);       //pass
	  //descriptions-------------will print if condition is false
	  //Assert.assertEquals(actual,expected,description);
	  Assert.assertEquals(a>b,true,"a is not greater than b.");  
	  
	  
	  
	  if(false) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.fail();
  }
}}
