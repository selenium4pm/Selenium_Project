package day14_Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login_Poi_Excel {
  @Test
  public void f() throws IOException {
	  
	  String path= "E:\\Workspace4pm_may\\testdata12.xlsx";
	  
	  FileInputStream fis=new FileInputStream(path);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet ws=wb.getSheetAt(0);
	  
	  // Launch App
	   
	   WebDriver driver=new FirefoxDriver();
		driver.get(ws.getRow(1).getCell(2).getStringCellValue());
		driver.manage().window().maximize();
		
		// Login App
		   
			// USername
		driver.findElement(By.id("txtUsername")).sendKeys(ws.getRow(1).getCell(0).getStringCellValue());
					//password
		driver.findElement(By.id("txtPassword")).sendKeys(ws.getRow(1).getCell(1).getStringCellValue());
					
					//login btn
	   driver.findElement(By.name("Submit")).click();
	  
	  
	  
  }
}
