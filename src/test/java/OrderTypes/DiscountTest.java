package OrderTypes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DiscountTest {
	
	WebDriver driver;
	
	@Test
	public void memberDiscount() throws Exception{
		driver = new  FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://www.freshflowers.com.au/home.aspx");
		
	//	driver.findElement(By.linkText("Prices")).click();
		driver.findElement(By.xpath("//*[@id='top-nav']/div/ul/li[4]/a")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='top-links']/div/ul/li[2]/a/div")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
		
	}

}
