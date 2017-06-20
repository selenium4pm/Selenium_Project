package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element_Present {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://google.com");
		d.manage().window().maximize();
		
		String src= d.getPageSource();
		//System.out.println(src);
		
		if(src.contains("Gmail"))
		{
			System.out.println("Element is Present");
		}
		else
		{
			System.out.println("Element is not Present");
		}
	}

}
