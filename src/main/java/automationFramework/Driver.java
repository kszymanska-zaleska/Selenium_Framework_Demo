package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	public static WebDriver instance;
	
	public static void Initialize(){
		System.setProperty("webdriver.gecko.driver", "firefox_driver\\geckodriver.exe");
		instance = new FirefoxDriver();
		instance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void InitializeChrome(){
		System.setProperty("webdriver.chrome.driver", "chrome_driver\\chromedriver.exe");
		instance = new ChromeDriver();
		instance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void Cleanup(){
		instance.quit();
	}
}
