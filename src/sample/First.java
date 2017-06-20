package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class First {

	public static void main(String[] args) {
		
		WebDriver d;
		
		// Launch App
		d=new FirefoxDriver();
		d.get("http://opensource.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		
		// USername
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		//password
		d.findElement(By.id("txtPassword")).sendKeys("admin");
		
		//login btn
		d.findElement(By.name("Submit")).click();
	}

}



















