package student.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestSauceLabs {
	public static final String USERNAME = "Richa2603";
	public static final String ACCESS_KEY = "14edec9f-d404-4d0c-8c98-bce2a113d9af";
	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	 
	  public static void main(String[] args) throws Exception {
	 
	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability("platform", "Windows 10");
	    caps.setCapability("version", "latest");
	 
	    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
	    
	   
	 
	    driver.get("https://www.google.co.in/");
	    System.out.println("title of page is: " + driver.getTitle());
	 
	    driver.quit();
	  }
	}

