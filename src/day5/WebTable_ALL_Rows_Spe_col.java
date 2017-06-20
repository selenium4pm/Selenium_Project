package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable_ALL_Rows_Spe_col {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		
		for (int i = 1; i < 37; i++) 
		{
			String path = "html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr["+i+"]/td[5]";
		
			String names=d.findElement(By.xpath(path)).getText();
			System.out.println(names);
			
		}

	}

}






