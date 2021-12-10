package testclasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import appcode.SomeClassToTest;
/*
 * Soft Asserts allow the test case to continue without
 * breaking out the lines of code in method.
 * 
 * the assertAll(); will let you know what tests failed.
 */
public class TestNG_SoftAssert {
 
	//Test should fail.
	@Test
  public void testSum() {
	  SoftAssert sa = new SoftAssert();
	  System.out.println("\nRunning Test -> testSum");
	  SomeClassToTest obj = new SomeClassToTest();
	  int result = obj.sumNumbers(1, 2);
	  sa.assertEquals(result, 2);
	  System.out.println("\nLine after assert 1");
	  sa.assertEquals(result,3);
	  System.out.println("\nLine after assert 2");
	  sa.assertAll();
  }
}
