package TestCases;


import org.testng.annotations.*;

import PageObj.LoginPage;

public class LoginTestCase extends LoginPage{
	@BeforeSuite
	public void BrowsersetUp() {
		launchthebrwsr("chrome", "https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	@Test
	public void chkLoginFunc() {
		logiWithValidCred();
	}

}
