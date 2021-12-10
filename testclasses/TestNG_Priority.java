package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

/*
 * The priority feature allows TESTS to run in a
 * particular order starting from priority 0
 */

public class TestNG_Priority {
  @Test(priority=2)
  public void testMethod1() {
	  System.out.println("TestNG_Priority -> testMethod1");
  }
  @Test(priority=1)
  public void testMethod2() {
	  System.out.println("TestNG_Priority -> testMethod2");
  }
  @Test(priority=0)
  public void testMethod3() {
	  System.out.println("TestNG_Priority -> testMethod3");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("TestNG_Priority -> before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("TestNG_Priority -> after class");
  }

}
