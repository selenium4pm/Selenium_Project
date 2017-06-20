package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_Browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", 
				                        "D://IEDriverServer.exe");
		
		WebDriver d=new InternetExplorerDriver();
		d.get("http://fb.com");

	}

}
