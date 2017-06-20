package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;

public class RadioButton12 {
	WebDriver d;
	
  @Test
  public void f() 
  {
	List<WebElement> radio=  d.findElements(By.name("group1"));
	  System.out.println(radio.size());
	  
	  for (int i = 0; i < radio.size(); i++) 
	  {
		String str=(radio.get(i).getAttribute("value")+"----"+
	                       radio.get(i).getAttribute("checked"));
		System.out.println(str);
		
	  } 
  }
  @BeforeTest
  public void beforeTest() 
  {
	   d=new FirefoxDriver();
		d.get("http://echoecho.com/htmlforms10.htm");
		d.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  Sleeper.sleepTightInSeconds(2);
	  d.close();
	  
  }

}
