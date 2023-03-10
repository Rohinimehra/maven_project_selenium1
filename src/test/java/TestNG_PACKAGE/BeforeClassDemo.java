package TestNG_PACKAGE;

import org.testng.annotations.*;

public class BeforeClassDemo {
		@BeforeClass
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
	  
	  
	  @AfterClass
	  void logout() {
		  System.out.println("Logout....");
	  }
	}
