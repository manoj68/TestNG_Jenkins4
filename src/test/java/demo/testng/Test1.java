package demo.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Test1 {
  @Test
  public void show1() {
	  System.out.println("from Test1 class - test 1 method");
  }
  
  @Test
  public void show2() {
	  System.out.println("from Test1 class - test 2 method");
  }
	  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("from test1 class - before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("from test1 class - after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("from test1 class - beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("from test1 class - afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("from test1 class - beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("from test1 class - afterTest");
  }

}
