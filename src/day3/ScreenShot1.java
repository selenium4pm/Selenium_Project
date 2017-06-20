package day3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot1 {

	public static void main(String[] args) throws IOException  {

		WebDriver d=new FirefoxDriver();
		d.get("http://newtours.demoaut.com/");
		d.manage().window().maximize();
		
		// screen shot
File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	
FileUtils.copyFile(src, new File("E:\\Workspace4pm\\tours.png"));
		
	}

}










