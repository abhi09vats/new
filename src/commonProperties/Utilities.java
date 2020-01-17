package commonProperties;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utilities {
	WebDriver driver;
	public void readProperties() {
		String filePath= System.getProperty("user.dir")+"//src//TestData//config.properties";
		Properties prop=
	}

	public void launchthebrwsr(String browserName, String appurl) {
		if (browserName.equalsIgnoreCase("chrome")) {
			String driverPath = System.getProperty("user.dir") + "\\src\\BrowserDrivers\\chromedriver.exe";
			System.out.println(driverPath);
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			
			// driver.get(appurl);
			//launchApp(appurl);
		} else if (browserName.equalsIgnoreCase("firefox")) {
			String driverPath = System.getProperty("user.dir") + "\\src + \\BrowserDrivers + \\geckodriver.exe";
			System.out.println(driverPath);
			System.setProperty("webdriver.gecko.driver", driverPath);
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		launchApp(appurl);
	}

	public void launchApp(String appurl) {
		driver.get(appurl);
		//launchApp(appurl);

	}

	public By getlocator(String locName, String locValue) {
		By byobj;
		switch (locName) {

		case "id":
			byobj=By.id(locValue);
			break;
		case "name":
			byobj=By.name(locValue);
			break;
		case "xpath":
			byobj=By.xpath(locValue);
			break;
		case "linktext":
			byobj=By.linkText(locValue);
			break;
		case "Partiallinktext":
			byobj=By.partialLinkText(locValue);
			break;
		case "classname":
			byobj=By.className(locValue);
			break;
		case "tagname":
			byobj=By.tagName(locValue);
			break;
		default:
			byobj=null;
		}
		return byobj;
	}

	public void sendData(String locName, String locValue, String testData) {
		driver.findElement(getlocator(locName,locValue)).sendKeys(testData);
		

	}
	public void clckElement(String locName, String locValue) {
		driver.findElement(getlocator(locName,locValue)).click();
	}
	public boolean checkElementPresent(String locName, String locValue) {
		boolean res= driver.findElement(getlocator(locName,locValue)).isDisplayed();
		return res;
	}
	public String getText(String locName, String locValue) {
		String res= driver.findElement(getlocator(locName,locValue)).getText();
		return res;
	}

/*	public static void main(String[] args) {
		Utilities obj = new Utilities();
		obj.launchthebrwsr("chrome", "https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		obj.sendData("id","txtUsername","Admin");
		obj.sendData("id","txtPassword","admin123" );
		obj.clckElement("id","btnLogin");
	}*/
}
