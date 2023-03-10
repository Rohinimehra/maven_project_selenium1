package TestNG_PACKAGE;

import org.testng.annotations.*;

@Test(enabled=false)
public class AnnotationDemo {
	// test case 1
	 
	@Test(priority=0)
	public void testCase1() {
	System.out.println("Test case 1");
	}
	 
	// test case 2
	 
	@Test(priority=1)
	public void testCase2() {
	System.out.println("Test case 2");
	}
	
	@Test(priority=2)
	public void testCase3() {
	System.out.println("Test case 3");
	}
	 
}






