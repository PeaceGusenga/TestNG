package testclasses;

//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProviders {
 /*
  * DataProviders provide sets of data to tests
  * in this example i will make use of a 2D array to
  * supply 2 inputs to my main test.
  * 
  * The test will run 3 times due to there being 3 sets of data
  */
	//@DataProvider(name = "inputs")
	//public Object[][] getData() {
		//return new Object[][] {
				// sets of data
			//	{ "bmw", "m3" }, { "audi", "a6" }, { "benz", "c300" } };
	//}

	@Test(dataProvider = "inputs" ,dataProviderClass = TestData.class)
	public void testMethod1(String input1, String input2) {
		System.out.println("Input 1: " + input1);
		System.out.println("Input 2: " + input2);
	}
}
