package day13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ExplicitWait_Fluentwait {
	
	FirefoxDriver driver;
	
	@Test
	public void waitTest()
	{
		
		driver=new FirefoxDriver();
		driver.get("https://www.24hourfitness.com/");
		driver.manage().window().maximize();
		
		// Fluent Wait
		FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver)
				
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		        
		
	
		//FluentWait<WebDriver> fwait=new FluentWait<WebDriver>(driver).withTimeout(10,TimeUnit.SECONDS).pollingEvery(2,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		// Learn More Button
		fwait.until(ExpectedConditions.visibilityOfElementLocated
				 (By.xpath("html/body/.........v[3]/div/a"))).click();
		
		
	}

}



