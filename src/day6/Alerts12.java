package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Alerts12 {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://primusbank.qedgetech.com/");
		d.manage().window().maximize();
		
		// click Login button
		d.findElement(By.id("login")).click();
		
		Sleeper.sleepTightInSeconds(2);
		
		// Get Alert Message
		String amsg= d.switchTo().alert().getText();
		
		System.out.println(amsg);
		
		Sleeper.sleepTightInSeconds(2);
		
		// Click OK in Alert
		d.switchTo().alert().accept();
		

	}

}







