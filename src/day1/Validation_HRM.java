package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validation_HRM {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://opensource.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		
		String exp= "Orangehrm";
		
		String act= d.getTitle();
		System.out.println(act);
		
		if(exp.equalsIgnoreCase(act))
		{
			System.out.println("Launch App is Sucessss");
		}
		else
		{
			System.out.println("Launch App is not Sucessss");
		}
		
		// Login App
		
		
		d.get("http://primusbank.qedgetech.com");
		
		
		d.findElement(By.id("txtuId")).sendKeys("Admin");
		d.findElement(By.id("txtPword")).sendKeys("Admin");
		d.findElement(By.id("login")).click();
		
		String explog="welcome to admin";
		
String	path=	"html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font";
		
	
	String actlog= d.findElement(By.xpath(path)).getText();
		
		 if (explog.equals(actlog)) 
		 {
			System.out.println("Login sucesss");
		}
		 else
		 {
			 System.out.println("login not sucesss");
		 }
		 
	}

}










