package demo.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Test4 
{
	
  @Test
  public void firstDemo() {
	  System.out.println("from Test4 class - test method one");
  }
  
  @Test
  public void secondDemo() {
	  System.out.println("from Test4 class - test method two");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("from Test4 class - beforeMethod method ");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("from Test4 class - afterMethod method");
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("from Test4 class - beforeSuite method ");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("from Test4 class - afterSuite method");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("from Test4 class - beforeClass method ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("from Test4 class - afterClass method");
  }
  

}
