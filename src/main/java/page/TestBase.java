package page;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	 static WebDriver driver;
	
	public static WebDriver initDriver() {
		
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.get("http://www.techfios.com/billing/?ng=admin/");
		return driver;
		
	}
	
	public void TakesScreenShot(WebDriver driver) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String currentDirectory = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currentDirectory + "/screenshot" + ".png"));
	}

}
