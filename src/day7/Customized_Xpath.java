package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Customized_Xpath {
  @Test
  public void f() {
	  
	  WebDriver  d=new FirefoxDriver();
		d.get("http://amazon.com");
		
		
		d.findElement(By.xpath
		("//input[@name='field-keywords' and @type='text']"))
		                                     .sendKeys("selenium");
		
		
  }
}




