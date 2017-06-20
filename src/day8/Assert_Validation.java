package day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Validation {
  @Test
  public void f() {
	  
	  WebDriver d=new FirefoxDriver();
		d.get("http://opensource.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		
		String exp= "OrangeHRM";
		
		String act= d.getTitle();
		System.out.println(act);
		
		// Validation
		Assert.assertEquals(act, exp);
		
	  System.out.println("Launch Done");
	    
  }
}
