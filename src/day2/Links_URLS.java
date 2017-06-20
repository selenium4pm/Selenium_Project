package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Links_URLS {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://google.com");
		d.manage().window().maximize();
		
		// identify no.of links
		List<WebElement> link =d.findElements(By.tagName("a"));
		System.out.println(link.size());
		
		for (int i = 0; i < link.size(); i++) 
		{
			if(  !  link.get(i).getText().isEmpty())
			{
			
			link.get(i).click();
			
			String url= d.getCurrentUrl();
			System.out.println(url);
			
			d.navigate().back();
		
		    link=d.findElements(By.tagName("a"));
			}
			else
			{
				System.out.println("the link is invisible----"+i);
			}
	
		}
		

	}

}











