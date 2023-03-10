package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_Demo {
	public WebDriver driver;
	
	//constructor
	POM_Demo(WebDriver driver){
		this.driver=driver;
	}
	
	//locators
	
	By img_logo_loc=By.xpath("//img[@alt='company-branding']");
	By text_username_loc=By.xpath("//input[@placeholder='Username']");
	By text_password_loc=By.xpath("//input[@placeholder='Password']");
	By btn_submit_loc=By.xpath("//button[@type='submit']");
	
	//actions (to be defined inside methods)
	
	void img_logo() {
		driver.findElement(img_logo_loc).isDisplayed();
	}
	
	void setUsername(String username) {
		driver.findElement(text_username_loc).sendKeys(username);
	}
	
	
	void setPassword(String pwd) {
		driver.findElement(text_password_loc).sendKeys(pwd);
	}

	void btn_submit() {
		driver.findElement(btn_submit_loc).click();
	}
}
