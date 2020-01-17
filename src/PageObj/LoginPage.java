package PageObj;

import commonProperties.Utilities;

public class LoginPage extends Utilities 
{
	public void logiWithValidCred()
	{
		sendData("id","txtUsername","Admin");
		sendData("id","txtPassword","admin123" );
		clckElement("id","btnLogin");
	}

	public void logiWithInValidCred()
	{

	}

}
