package gitHubTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	public void loginTest() throws IOException{
		
		WebDriver web = new FirefoxDriver();
		web.manage().window().maximize();
		
		web.get("https://www.google.com/");
		File src = ((TakesScreenshot) web).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\SeleniumWorkspace\\GIT_HubTest\\Screeshot\\Google.jpeg"));
	}

}
