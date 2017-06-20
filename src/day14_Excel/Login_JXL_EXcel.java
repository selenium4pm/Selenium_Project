package day14_Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login_JXL_EXcel {
  @Test
  public void f() throws BiffException, IOException 
  {
	  String path= "E:\\Workspace4pm_may\\Selenium_Proj\\testdata\\inputs.xls";
	  
	  FileInputStream fis=new FileInputStream(path);
	  Workbook wb= Workbook.getWorkbook(fis);
	   Sheet ws= wb.getSheet("Sheet1"); 
	   
	   // Launch App
	   
	   WebDriver driver=new FirefoxDriver();
		driver.get(ws.getCell(2, 1).getContents());
		driver.manage().window().maximize();
		
		// Login App
	   
		// USername
				driver.findElement(By.id("txtUsername")).sendKeys(ws.getCell(0,1).getContents());
				//password
				driver.findElement(By.id("txtPassword")).sendKeys(ws.getCell(0,1).getContents());
				
				//login btn
				driver.findElement(By.name("Submit")).click();
	  
  }
}




