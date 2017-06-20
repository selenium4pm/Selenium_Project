package day11_JSE;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Alert_JSE {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor obj=(JavascriptExecutor)driver;
		
		obj.executeScript("alert('anjali')");
		Sleeper.sleepTightInSeconds(2);
		
		driver.switchTo().alert().accept();
		
		
  }
}
