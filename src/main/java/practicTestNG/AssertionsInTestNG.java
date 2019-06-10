package practicTestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AssertionsInTestNG {
	
	
	@DataProvider
	
	@Test
	public void test1() {
		Assert.assertTrue(true);
	}
	@Test
	public void test2() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3() {
		Assert.assertEquals("America", "American");;
	}

}


///@DataProvider provides data which can be in form of array, xml file,...