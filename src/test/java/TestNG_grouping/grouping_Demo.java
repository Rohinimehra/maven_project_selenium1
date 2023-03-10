package TestNG_grouping;

import org.testng.annotations.*;

public class grouping_Demo {
  @Test(priority=1, groups= {"sanity","regression"})
  public void loginByEmail () {
	  System.out.println("This is login by email.");
  }
  
  @Test(priority=2, groups= {"sanity"})
  public void loginByFacebook () {
	  System.out.println("This is login by facebook.");
  }
  
  @Test(priority=3, groups= {"sanity","regression"})
  public void signupByMobileNumber () {
	  System.out.println("This is login by mobile number.");
  }
  
  @Test(priority=4, groups= {"regression"})
  public void signupemail () {
	  System.out.println("This is signup by email.");
  }
  

  
  @Test(priority=5, groups= {"sanity"})
  public void signupByfacebook () {
	  System.out.println("This is signup by facebook.");
  }
  
  @Test(priority=6, groups= {"sanity","regression"})
  public void loginignupByMobileNumber () {
	  System.out.println("This is signup by mobile number.");
  }
}
