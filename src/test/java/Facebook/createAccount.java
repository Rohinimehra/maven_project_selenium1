package Facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class createAccount {
	 WebDriver driver=new ChromeDriver();
	 WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
	  
  @Test(priority=1)
  public void openfb() {
	  
	 driver.get("https://www.fb.com/");
	 driver.manage().window().maximize();

  }
  
  @Test(priority=2)
  public void VerifyingURL() {
	  String str=driver.getCurrentUrl();
	  Assert.assertEquals(str, "https://www.facebook.com/","URL not matched.");
  }
  
  
  @Test(priority=3)
  public void verifyingCreateAcc() {
	 boolean b=driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]")).isDisplayed();
	 Assert.assertEquals(b, true,"Create Account section not present.");
  }
  
  @Test(priority=4)
  public void creatingAcc() {
	  driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]")).click();
	  
	  //text boxes
	  driver.findElement(By.cssSelector("(//input[@id='u_13_b_KC'])[1]")).sendKeys("Rohini");
	  driver.findElement(By.xpath("(//input[@id='u_13_d_4A'])[1]")).sendKeys("Mehra");
	  driver.findElement(By.xpath("(//input[@id='u_13_g_GR'])[1]")).sendKeys("9914533387");
	  driver.findElement(By.xpath("(//input[@id='password_step_input'])[1]")).sendKeys("Rohini123m");
	  
	  //dropdowns
		Select drop=new Select(driver.findElement(By.xpath("(//select[@id='day'])[1]")));
		drop.selectByVisibleText("21");
		
		Select drop2=new Select(driver.findElement(By.xpath("(//select[@id='month'])[1]")));
		drop2.selectByVisibleText("jul");
		
		Select drop3=new Select(driver.findElement(By.xpath("(//select[@id='year'])[1]")));
		drop3.selectByVisibleText("2000");

		//checkboxes
		WebElement female= driver.findElement(By.xpath("(//label[normalize-space()='Female'])[1]"));
		female.click();
		
		driver.findElement(By.xpath("//button[@id='u_j_s_zQ']")).click();

  }
  
  @Test(priority=5)
  void verifyAccCreation() {
	  String acc_url=driver.getCurrentUrl();
	  Assert.assertEquals(acc_url, "https://www.facebook.com/getting_started/","Account not created successfully.");
  }
  
  @AfterClass
  void close() {
	  driver.close();
  }
  
}
