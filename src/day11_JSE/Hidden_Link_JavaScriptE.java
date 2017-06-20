package day11_JSE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Hidden_Link_JavaScriptE {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.get("http://www.bing.com/");
		driver.manage().window().maximize();
		
		// identify Excel hidden link
	WebElement src=	driver.findElement(By.xpath(".//*[@id='officemenu_excel_img']"));
	// identify calander hidden link
	WebElement src12=	driver.findElement(By.xpath(".//*[@id='officemenu_calendar_img']"));
	
	Sleeper.sleepTightInSeconds(2);
	
	JavascriptExecutor obj=(JavascriptExecutor)driver;
	obj.executeScript("arguments[0].click()", src);
	
	Sleeper.sleepTightInSeconds(2);
	obj.executeScript("arguments[0].click()", src12);
	
	
  }
}
