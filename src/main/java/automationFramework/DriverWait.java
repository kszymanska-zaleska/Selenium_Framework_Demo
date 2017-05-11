package automationFramework;

import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverWait {
	
	public static WebDriverWait instance;
	
	public static void InitializeWait(){
		instance = new WebDriverWait(Driver.instance,30);
	}
}
