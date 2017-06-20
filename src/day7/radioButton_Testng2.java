package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class radioButton_Testng2 {
  @Test
  public void f() {
	  
	WebDriver  d=new FirefoxDriver();
		d.get("http://echoecho.com/htmlforms10.htm");
		d.manage().window().maximize();
		
		//loop for groups
		for (int i = 1; i <= 2; i++) 
		{
			List<WebElement> radio=d.findElements(By.name("group"+i));
		
			for (int j = 0; j < radio.size(); j++) 
			{
				Sleeper.sleepTightInSeconds(2);
				radio.get(j).click();
				
				for (int k = 0; k < radio.size(); k++) 
				{
					System.out.println(radio.get(k).getAttribute("value")
							+"----"+radio.get(k).getAttribute("checked"));
				}
				
				System.out.println("********************");
			}
		}  
  }
}









