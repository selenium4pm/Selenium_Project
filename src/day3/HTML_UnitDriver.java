package day3;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HTML_UnitDriver {

	public static void main(String[] args) {
		
		HtmlUnitDriver driver=new HtmlUnitDriver
				                 (BrowserVersion.FIREFOX_38);
		
		driver.get("http://fb.com");
		
		System.out.println(driver.getTitle());

	}

}







