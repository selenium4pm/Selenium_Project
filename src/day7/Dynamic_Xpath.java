package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Dynamic_Xpath {
  @Test
  public void f() {
	  
	  WebDriver  d=new FirefoxDriver();
		d.get("http://yahoo.com");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(3);
		
		// Search box
		d.findElement(By.id("uh-search-box")).sendKeys("selenium");
	
		// identify ajax controll elements
	List<WebElement> dynamic=	d.findElements(By.xpath
			     ("//*[starts-with(@id,'yui_3_18_0_3_14957')]/li"));
		System.out.println(dynamic.size());
	
		Sleeper.sleepTightInSeconds(3);
		
		// clcik selenium tutorial link
		dynamic.get(2).click();
	
		// OR
	
		for (int i = 0; i < dynamic.size() ;  i++) 
		{
			if(dynamic.get(i).getText().equals("Selenium tutorial"))
			{
				dynamic.get(i).click();
			}
		}  
  }
}
