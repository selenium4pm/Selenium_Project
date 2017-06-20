package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CheckBox1 {
  @Test
  public void f() {
	  
	  WebDriver  d=new FirefoxDriver();
		d.get("http://echoecho.com/htmlforms09.htm");
		d.manage().window().maximize();
		
		List<WebElement> check=  d.findElements(By.xpath
				("//td[@class='table5']/input[@type='checkbox']"));
		System.out.println(check.size());
		
		for (int i = 0; i < check.size(); i++) 
		{
			// if check box is not selected
			if(  !  check.get(i).isSelected())
			{
				System.out.println(check.get(i).getAttribute("value"));
				check.get(i).click();
				
			}
		}	
  }
}
