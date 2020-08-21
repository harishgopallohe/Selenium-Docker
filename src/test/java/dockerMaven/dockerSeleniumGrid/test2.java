package dockerMaven.dockerSeleniumGrid;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class test2  {
	
	@Test
	public  void Firefox() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities dc =  DesiredCapabilities.firefox();
		
		URL url = new URL("http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	
	
	
	
}
