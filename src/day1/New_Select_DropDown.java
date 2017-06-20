package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class New_Select_DropDown {

	public static void main(String[] args) throws Exception {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://book2.spicejet.com/");
		d.manage().window().maximize();
		
		// one way 
		d.findElement(By.id("Cont......_OneWay")).click();
		
		Thread.sleep(2000);
		
		// Adults drop down
		new Select(d.findElement(By.id("Contr.....e_ADT"))).
                                    selectByVisibleText("3");
		
		//Child drop down
		new Select(d.findElement(By.id("Control..._CHD"))).
		                             selectByVisibleText("4");
		
	}

}
