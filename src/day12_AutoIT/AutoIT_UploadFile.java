package day12_AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class AutoIT_UploadFile {
  @Test
  public void f() throws IOException {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		// Click Browse Button
		driver.findElement(By.id("photo")).click();
		
		Sleeper.sleepTightInSeconds(3);
		
		// AutoIt Script Execution
		Runtime.getRuntime().exec
		             ("E:\\Workspace4pm_may\\AutoIT\\Upload.exe");
		
		
  }
}



