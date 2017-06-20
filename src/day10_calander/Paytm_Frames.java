package day10_calander;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Paytm_Frames {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(1);
		 driver.findElement(By.xpath(".//*[@id='app']/div/div[2]/div[2]/div[3]/div[3]/div")).click();
		
		 Sleeper.sleepTightInSeconds(2);
		 
		 //identify frames
		 List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		for (int i = 0; i < frames.size(); i++) 
		{
			driver.switchTo().frame(i);
			
			try 
			{
				driver.findElement(By.id("input_0")).sendKeys("989878987");
				driver.findElement(By.id("input_1")).sendKeys("fgfgfgf");
				driver.findElement(By.className("input_1")).click();
			} 
			catch (Exception e)
			{
				driver.switchTo().defaultContent();
				
			}
		
		}
	
  }
}








