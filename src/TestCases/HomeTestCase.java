package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObj.HomePage;

public class HomeTestCase extends HomePage  {
	@Test
	public void verifyHomePageTC() {
		String expVal="Dashboard";
		String actualval=verifyhomePage();
		System.out.println("actual Result-"+actualval);
		Assert.assertEquals(actualval, expVal);
		
	}

}
