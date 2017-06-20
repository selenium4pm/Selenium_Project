package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class NewTest {
  
  @Test(priority=0)
  public void f() {
	  System.out.println("C/A");
  }
  
  @Test(priority=1)
  public void a() {
	  System.out.println("LOGIN");
  }
  
  @Test(priority=2)
  public void z() {
	  System.out.println("LOGIN12345");
  }
  
  @Test()
  public void c() {
	  System.out.println("LOGIN12345");
  }
  
  @BeforeMethod
  public void beforeTest() {
	  System.out.println("Launch");
  }

  @AfterMethod
  public void afterTest() {
	  System.out.println("Close");
  }

}





