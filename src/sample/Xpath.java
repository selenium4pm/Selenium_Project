package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://amazon.com/");
		d.manage().window().maximize();
		
		d.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("books");
		
		//d.findElement(By.xpath(".//*[@id='box']")).sendKeys("java");
		
		//d.findElement(By.xpath(".//*[@id='..../input")).click();
		
		
	}

}


