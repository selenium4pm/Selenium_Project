package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown12 {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://newtours.demoaut.com/");
		d.manage().window().maximize();
		
		d.findElement(By.linkText("REGISTER")).click();
		
		// identify the Drop down
		WebElement drop=d.findElement(By.name("country"));
		
		// identify items from drop down
		List<WebElement> items=drop.findElements(By.tagName("option"));
		System.out.println(items.size());
		
		for (int i = 0; i < items.size(); i++) 
		{
			String str=items.get(i).getText();
			
			items.get(i).click();
			
			//  IF item is Selected
			if(items.get(i).isSelected())
			{
				System.out.println("Element is Working==="+str);
			}
			else
			{
				System.out.println("Element is not Working==="+str);
			}
		}
	
	}

}
