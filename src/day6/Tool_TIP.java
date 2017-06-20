package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Tool_TIP {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://demoqa.com/tooltip/");
		d.manage().window().maximize();

		// identify Text box
	WebElement textb=	d.findElement(By.id("age"));
	Sleeper.sleepTightInSeconds(2);
	
	Actions tt=new Actions(d);
	tt.moveToElement(textb).perform();
	
	Sleeper.sleepTightInSeconds(2);
	
	// identify Tool Tip
	String msg=d.findElement(By.className("ui-tooltip-content")).getText();
	System.out.println(msg);
	
	}
}
