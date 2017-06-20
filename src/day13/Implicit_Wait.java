package day13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Implicit_Wait {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.get("http://paytm.com");
		driver.manage().window().maximize();
		
		// Implicit WAit 
		driver.manage().timeouts().implicitlyWait
		                             (50, TimeUnit.SECONDS);
		// search box
		driver.findElement(By.xpath(".//*[@id=..ut"))
		                               .sendKeys("iphone");
	  
  }
}
