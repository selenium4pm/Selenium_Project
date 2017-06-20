package day12_AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class SAVEFile_AutoIT {
  @Test
  public void f() throws IOException {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("3.4.0")).click();
		
		Sleeper.sleepTightInSeconds(2);
		
		Runtime.getRuntime().exec
		            ("E:\\Workspace4pm_may\\AutoIT\\SaveFile.exe");
	  
  }
}



