package demo.testng;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test3 
{
	
  @Test
  public void display() {
	  System.out.println("from test3 class - test first");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("from test3 class - beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("from test3 class - afterTest");
  }
}
