package Testing;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;


public class TestBase {

	
WebDriver driver;	
	
	

public void startBrowser(String browser) {
		
		
		if(browser.equalsIgnoreCase("chrome")) {
		driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");}
		
		if(browser.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/geckodriver");}
		
		driver.get("http://automationpractice.com/index.php");
		
		
		
	}
	
	
public void impliciteWait(int seconds) {
	
	driver.manage().timeouts().implicitlyWait(seconds,TimeUnit.SECONDS);
	
	
}


public void takeScreenShot(String methodName) {
	
	File screenShotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(screenShotFile, new File("/Users/Razzy/eclipse-workspace/ShopToolsFrameWork/ScreenShots"+methodName+"_"+".jpg"));
	    } 
	catch (IOException e) {
		e.printStackTrace();
	}
	
}
	
	
	
	
	
	
	
	
	
	
}
