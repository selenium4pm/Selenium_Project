package day4;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multi_Screens {

	public static void main(String[] args) throws IOException {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://newtours.demoaut.com/");
		d.manage().window().maximize();
		
		// identify no.of links
		List<WebElement> link =d.findElements(By.tagName("a"));
		System.out.println(link.size());
		
		for (int i = 0; i < link.size(); i++) 
		{
			String name=link.get(i).getText();
			
			link.get(i).click();
			
			File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File
					("E:\\Workspace4pm_may\\screens\\"+name+".jpg"));
			
			d.navigate().back();
			
			link =d.findElements(By.tagName("a"));
			
		}
	}
}
