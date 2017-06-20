package aui_Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Mouse_Hover {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.emirates.com/in/English/");
		d.manage().window().maximize();
		
		Sleeper.sleepTightInSeconds(2);
		
		// identify Experience Element
		WebElement exp= d.findElement(By.xpath(".//*[@id='/a/span[1]"));
		
		// identify Book element
		WebElement book= d.findElement(By.xpath(".//*[@id='book'][1]"));
		
		Actions mo=new Actions(d);
		
		Sleeper.sleepTightInSeconds(2);
		
		//mo.moveToElement(book).perform();
		Sleeper.sleepTightInSeconds(1);
		//mo.moveToElement(exp).perform();
		
		mo.moveToElement(book).moveToElement(exp).build().perform();
		
		Sleeper.sleepTightInSeconds(2);
		// Click Go button
		d.findElement(By.xpath(".//*[@id='inFlight']/span")).click();
	
	}

}
