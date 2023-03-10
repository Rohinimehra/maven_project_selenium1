package FlipKart;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FlipKartDemo {
	
	WebDriver driver;	
	@BeforeClass
	@Parameters({"Browser","URL"})
	void setup(String br,String geturl) throws Exception
	{
		if(br.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(br.equals("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(geturl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void MaxWindow(){
		driver.manage().window().maximize();		
	}
	
}