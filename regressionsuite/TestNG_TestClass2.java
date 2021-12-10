package regressionsuite;

import org.testng.annotations.Test;

import base.BaseTestSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_TestClass2 extends BaseTestSuite{
  @Test
  public void testMethod1() {
	  System.out.println("\nRunning Test -> TestNG_TestClass2 -> testMethod1");
  }
  @Test
  public void testMethod2() {
	  System.out.println("\nRunning Test -> TestNG_TestClass2 -> testMethod2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("\nTestNG_TestClass2 -> This runs once before every method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("\nTestNG_TestClass2 -> This runs once after every method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("\nTestNG_TestClass2 -> This runs before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("\nTestNg_TestClass2 -> This runs after class");
  }

}
