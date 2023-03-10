package TestNG_PACKAGE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestNG_class {
	 WebDriver driver=new ChromeDriver();
	 WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
	  
  @Test(priority=1)
  public void openapp() {
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  
  @Test(priority=2)
  public void login() {
	  WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		username.sendKeys("Admin");
		
		WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		password.sendKeys("admin123");
		
		WebElement login_btn=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		login_btn.click();
		
  }
  
  @Test(priority=3)
  public void closeapp() {
	 driver.close(); 
  }
}
