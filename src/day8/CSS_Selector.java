package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class CSS_Selector {
  @Test
  public void f() {
	  
	  WebDriver  d=new FirefoxDriver();
		d.get("http://amazon.com");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);;
		
		d.findElement(By.cssSelector("#twotabsearchtextbox")).
		                                        sendKeys("hello");
		
  }
}
