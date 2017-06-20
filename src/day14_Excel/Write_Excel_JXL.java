package day14_Excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Write_Excel_JXL {
  @Test
  public void f() throws IOException, RowsExceededException, WriteException {
	  
	  String path= "E:\\Workspace4pm_may\\Selenium\\oouutt12.xls";
	  
	  FileOutputStream fos=new FileOutputStream(path);
	  WritableWorkbook wb=Workbook.createWorkbook(fos);
	  WritableSheet ws=wb.createSheet("output123", 0);
	  
	  Label un=new Label(0, 0, "username");
	  ws.addCell(un);
	  
	  Label psd=new Label(1, 0, "passswordddddd");
	  ws.addCell(psd);
	  
	  wb.write();
	  wb.close();
	  
	  
	  System.out.println("done");
	  
	  
  }
}

