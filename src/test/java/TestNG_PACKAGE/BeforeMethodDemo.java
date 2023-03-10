package TestNG_PACKAGE;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class BeforeMethodDemo {
	@BeforeMethod
	void login()
	{
		  System.out.println("Login...");

	}
	
	  @Test(priority=1)
  public void Search() {
	  System.out.println("Search");
  }
  
	  @Test(priority=2)
  void Adv_search() {
	  System.out.println("Advanced Search");

  }
  
  
  @AfterMethod
  void logout() {
	  System.out.println("Logout....");
  }
}
