package day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screens_Validation {

	public static void main(String[] args) throws IOException {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://opensource.demo.orangehrmlive.com/");
		d.manage().window().maximize();
		
		String exp= "Orangehrm";
		
		String act= d.getTitle();
		System.out.println(act);
		
		if(exp.equals(act))
		{
			System.out.println("Launch App is Sucessss");
		}
		else
		{
			File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(src, new File("E:\\Workspace4pm_may\\screens\\LaunchApp.png"));
		
		    System.out.println("Launch App is not Sucessss");
		
		}

	}

}






