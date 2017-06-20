package day12_AutoIT;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Mouse_Move {
  @Test
  public void f() throws AWTException {
	  
	  WebDriver driver=new FirefoxDriver();
	//	driver.get("http://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		
	Dimension	ss=Toolkit.getDefaultToolkit().getScreenSize();
	System.out.println(ss);
	
	Robot robo=new Robot();
	
	robo.mouseMove(1010, 45);
	
	robo.delay(2000);
	
	robo.mousePress(InputEvent.BUTTON1_MASK);
	robo.mouseRelease(InputEvent.BUTTON1_MASK);
			
	
		
  }
}









