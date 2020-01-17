package PageObj;

import commonProperties.Utilities;

public class HomePage extends Utilities
 {
	public String verifyhomePage() {
		String textval=null;
		boolean res = checkElementPresent("xpath","//h1[text()='Dashboard']");
		if(res) {
			textval=getText("xpath","//h1[text()='Dashboard']");
		}
		return textval;
	}

}
