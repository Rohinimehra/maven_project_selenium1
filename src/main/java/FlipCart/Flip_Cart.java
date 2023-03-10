package FlipCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip_Cart {
	public static void main(String args[]) throws Exception{
		//opening browser
		WebDriver driver=new ChromeDriver();
		
		//opening URL "www.flipkart.com"
		driver.get("https://www.flipkart.com");
		
		//maximizing window
		driver.manage().window().maximize();
		
		//Getting and validating Page title
		String act_title=driver.getTitle();
		System.out.println(act_title);
		String exp_title="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		if(act_title.equals(exp_title)) {
			System.out.println(" Title Validated");
		}
		else {
			System.out.println("Title not validated");
		}
		
		
		//Getting and validating URL
		String act_url=driver.getCurrentUrl();
		System.out.println(act_url);
		String exp_url="https://www.flipkart.com/";
		if(act_url.equals(exp_url)) {
			System.out.println(" URL Validated");
		}
		else {
			System.out.println("URL not validated");
		}
		
		//getting Page source
		String page_source=driver.getPageSource();
		
		if(page_source.contains("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!")) {
			System.out.println("Title is present in page source.");
		}
		else {
			System.out.println("Title is not present in page source.");

		}
		Thread.sleep(2000);
		
		//Exiting the browser
		driver.close();
	}
}
