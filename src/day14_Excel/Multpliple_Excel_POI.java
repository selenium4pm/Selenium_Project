package day14_Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Multpliple_Excel_POI {
  @Test
  public void f() throws IOException {
	  
String path= "E:\\Workspace4pm_may\\Selenium_Proj\\testdata\\links.xlsx";
	  
	  FileInputStream fis=new FileInputStream(path);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet ws=wb.getSheetAt(0);
	  
	  // Launch App
	  
	  WebDriver d=new FirefoxDriver();
		d.get("http://newtours.demoaut.com/");
		d.manage().window().maximize();
		
		int rc=ws.getLastRowNum();
		
		for (int i = 1; i <= rc; i++) 
		{
			d.findElement(By.linkText(ws.getRow(i).getCell(0).getStringCellValue())).click();
		String	acturl=d.getCurrentUrl();
		
		ws.getRow(i).createCell(2).setCellValue(acturl);
		
	    String	expurl=ws.getRow(i).getCell(1).getStringCellValue();
		
			if (expurl.equals(acturl)) 
			{
				ws.getRow(i).createCell(3).setCellValue("PASS");
			} 
			else 
			{
				ws.getRow(i).createCell(3).setCellValue("FAIL");
			}
		}
		
		String Opath= "E:\\Workspace4pm_may\\Selenium_Proj\\testdata\\testoutput.xlsx";
		FileOutputStream fos=new FileOutputStream(Opath);
		
		wb.write(fos);
		fos.close();
		
		
  }
}





