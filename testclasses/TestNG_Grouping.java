package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
/*
 * using the groups feature we can run only
 * certain tests based on their groups.
 * I can do this using an xml file.
 */
public class TestNG_Grouping {
  @Test(groups = {"cars","suv"})
  public void testBMWX6() {
	  System.out.println("Running Test -> BMW X6");
  }
  @Test(groups = {"cars","sedan"})
  public void testAudiA6() {
	  System.out.println("Running Test -> Audi A6");
  }
  @Test(groups = {"bikes"})
  public void testNinja() {
	  System.out.println("Running Test -> Kawasaki Ninja");
  }
  @Test(groups = {"bikes"})
  public void testHondaCBR() {
	  System.out.println("Running Test -> Honda CBR");
  }
  @BeforeClass(alwaysRun=true)
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @AfterClass(alwaysRun=true)
  public void afterClass() {
	  System.out.println("After class");
  }

}
