package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Links_All {

	@Test
	public void ff(){
		
		WebDriver d=new FirefoxDriver();
		d.get("http://www.hdfcbank.com/");
		d.manage().window().maximize();
		
		// identify the no.of links
	 List<WebElement>  links=	d.findElements(By.tagName("a"));
	int	count=links.size();
	
	System.out.println(count);
	
	for (int i = 0; i < count; i++) 
	{
		String name= links.get(i).getText();
		System.out.println(name);
	}
	}

}










