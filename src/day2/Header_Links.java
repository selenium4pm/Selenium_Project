package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Header_Links {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://bing.com/");
		d.manage().window().maximize();
		
		//identify Header block
	   WebElement block=	d.findElement(By.id("sc_hdu"));
	   
	   //identify links from header
	   List<WebElement> headerlinks= block.findElements(By.tagName("a"));
	   
	   System.out.println(headerlinks.size());
	   
	   for (int i = 0; i < headerlinks.size(); i++) 
	   {
		  System.out.println(headerlinks.get(i).getText());
	   }
	}
}





