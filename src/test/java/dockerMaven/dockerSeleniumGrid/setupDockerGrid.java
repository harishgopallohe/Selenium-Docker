package dockerMaven.dockerSeleniumGrid;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class setupDockerGrid {
	
	
	@BeforeTest
	void startDocker() throws IOException, InterruptedException {
		
		Runtime.getRuntime().exec("cmd /c start start.bat");
		Thread.sleep(20000);
		
	}
	
	@AfterTest
	void stopDocker() throws IOException, InterruptedException {
		
		Runtime.getRuntime().exec("cmd /c start stop.bat");
		Thread.sleep(10000);
		
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe"); //close all command prompts
	}

}
