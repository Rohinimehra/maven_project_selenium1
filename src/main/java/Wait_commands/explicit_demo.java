package Wait_commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_demo {
	
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		username.sendKeys("Admin");
		
		WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		password.sendKeys("admin123");
		
		WebElement login_btn=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		login_btn.click();
		
		String title=driver.getTitle();
		String actualTitle="OrangeHRM";
		if (title.equals(actualTitle)) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");

		}
		driver.close();
		}
		}