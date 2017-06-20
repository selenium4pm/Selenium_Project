package day11_JSE;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TextBox_JSE {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor obj=(JavascriptExecutor)driver;
		
		obj.executeScript
		     ("document.getElementById('lst-ib').value='kruthika'");
		
		obj.executeScript("document.getElementById('_fZl').click()");
		
	  
  }
}
