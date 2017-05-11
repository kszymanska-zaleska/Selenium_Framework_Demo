package testSuite;

import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automationFramework.ConfigReader;
import automationFramework.Driver;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginTest {
	Properties prop;
	
	@Before
	public void beforeTest() throws IOException {
		prop = ConfigReader.readConfigData();
		Driver.InitializeChrome();
	}

	@Test
	public void test() {
		Driver.instance.navigate().to(prop.getProperty("env_url"));
		LoginPage.LoginAs(prop.getProperty("sf3auto_username")).WithPassword(prop.getProperty("sf3auto_password")).Login();
		WebDriverWait wait = new WebDriverWait(Driver.instance, 10);
		wait.until(ExpectedConditions.titleIs("Salesforce - Unlimited Edition"));
		Assert.assertTrue("Username wrongly presented", HomePage.IsAt());
	}
	
	@After
	public void afterTest() {
		Driver.Cleanup();
	}

}