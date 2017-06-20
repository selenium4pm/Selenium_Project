package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest12 {
  @Test
  public void f() {
	  System.out.println("LOGIN");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Launch");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("CLose");
  }

}
