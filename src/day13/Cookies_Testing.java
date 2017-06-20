package day13;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Cookies_Testing {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
			driver.get("http://paytm.com");
			driver.manage().window().maximize();
			
			// Get all cookies
			Set<Cookie> cookies=driver.manage().getCookies();
			System.out.println(cookies.size());
			
		Iterator<Cookie> ck =cookies.iterator();
		
		while (ck.hasNext()) 
		{
			Cookie cook=ck.next();
			
			System.out.println(cook.getName()+"----"
			           +cook.getDomain()+"----"+cook.getValue());
			
		}
		
		driver.manage().deleteAllCookies();
		
		 cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
		
		
	}
	  
  
}
