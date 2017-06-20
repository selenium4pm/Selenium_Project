package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", 
				      "E:\\Workspace4pm_may\\geckodriver.exe");
		
		WebDriver d=new FirefoxDriver();
		d.get("http://fb.com");
		

	}

}





