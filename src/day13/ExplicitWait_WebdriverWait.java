package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait_WebdriverWait {
  @Test
  public void f() 
  {
	  WebDriver driver=new FirefoxDriver();
		driver.get("https://www.24hourfitness.com/");
		driver.manage().window().maximize();
		
		// WebDriverWait
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		//Learn More Button
	  wait.until(ExpectedConditions.visibilityOfElementLocated
			     (By.xpath("html/...../div[3]/div/a"))).click();
	  
	  
  }
}






