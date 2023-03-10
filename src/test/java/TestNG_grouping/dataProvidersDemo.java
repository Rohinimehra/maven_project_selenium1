package TestNG_grouping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataProvidersDemo {
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	
	
  @Test(dataProvider="dp")
  public void login(String email,String password) {
	  driver.get("https;efwefeferfer");
	  driver.findElement(By.xpath("scsdfcs")).sendKeys(email);
	  driver.findElement(By.xpath("scsdfdcwdcs")).sendKeys(password);
	  driver.findElement(By.xpath("sfwedfcsdfcs")).click();
	  Assert.assertEquals(driver.getTitle(),"OrangeHRM","title not matched");

  }
  
  @AfterClass
  void closingapp() {
	  driver.close();
	  
  }
  
  @DataProvider(name="dp" ,indices= {0,1,4})
  String [][] loginData()
  {
  String data[][]= {
  { "abc11@gmail.coxdgdbstm", "test123" },
  { "pavanol@gmail.com", "test@123" },
  { "pavanoltraining@gmail.com", "test3" },
  { "pavanoltraining@gmail.com", "test@123" },
  { "pavanoltraining@gmail.com", "test@123" }
  };

  return data;
  }
  }
