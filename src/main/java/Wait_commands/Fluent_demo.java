package Wait_commands;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluent_demo {
	public static void main(String args[]) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	Wait<WebDriver> mywait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
	
	WebElement username=(WebElement) mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
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
