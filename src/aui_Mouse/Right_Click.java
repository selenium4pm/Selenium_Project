package aui_Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Right_Click {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://jqueryui.com/droppable/");
		d.manage().window().maximize();
		
		//identify Download Button
		
WebElement src=d.findElement(By.xpath(".//*[@id='menu-top']/a"));

		Actions rc=new Actions(d);
		
		Sleeper.sleepTightInSeconds(2);
		
		//rc.contextClick(src).sendKeys(Keys.ARROW_DOWN).
		  //     sendKeys(Keys.ARROW_DOWN).click().build().perform();
		
		rc.contextClick(src).sendKeys("W").build().perform();
		
		
		
	}

}










