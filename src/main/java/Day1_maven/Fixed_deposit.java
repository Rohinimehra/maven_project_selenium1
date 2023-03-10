package Day1_maven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Data_driven_testing.Xutil;

public class Fixed_deposit {
public static void main(String args[]) throws Exception{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
	driver.manage().window().maximize();
	String file=System.getProperty("user.dir")+"\\\\test_dataset\\\\bank_data2.xlsx";
	int row=Xutil.getRowCount(file, "Sheet1");

	for(int i=1;i<=row;i++) {
		//read data from excel
		String princ=Xutil.getCellData(file, "Sheet1", i, 0);
		String rateofinterest=Xutil.getCellData(file, "Sheet1", i, 1);
		String per1=Xutil.getCellData(file, "Sheet1", i, 2);
		String per2=Xutil.getCellData(file, "Sheet1", i, 3);
		String fre=Xutil.getCellData(file, "Sheet1", i, 4);
		String exp_mvalue=Xutil.getCellData(file, "Sheet1", i, 5);
		 
		//pass data to the app
		driver.findElement(By.id("principal")).sendKeys(princ);
		driver.findElement(By.id("interest")).sendKeys(rateofinterest);
		driver.findElement(By.id("tenure")).sendKeys(per1);

		
		Select perdrp=new Select(driver.findElement(By.id("tenurePeriod")));
		perdrp.selectByVisibleText(per2);
		
		Select fredrp=new Select(driver.findElement(By.id("frequency")));
		fredrp.selectByVisibleText(fre);
		
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement calculate_btn=driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']"));
	js.executeScript("arguments[0].click();", calculate_btn);

	String act_mvalue=driver.findElement(By.id("resp_matval")).getText();
	if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue)) {
		System.out.println("Test Passed");
		Xutil.setCellData(file, "Sheet1", i, 7, "Passed");
//		Xutil.FillGreenColor(file, "Sheet1",i,7);

	}
	else {
		System.out.println("Test Failed");
		Xutil.setCellData(file, "Sheet1", i, 7, "Failed");
//		Xutil.FillRedColor(file, "Sheet1",i,7);

	}
	Thread.sleep(3000);
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	WebElement clear_btn=driver.findElement(By.xpath("//img[@class='PL5']"));
	js1.executeScript("arguments[0].click();", clear_btn);
	}
driver.close();
}
}

