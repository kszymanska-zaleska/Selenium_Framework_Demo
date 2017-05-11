package testSuite;

import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import automationFramework.ConfigReader;
import automationFramework.DataGenerator;
import automationFramework.Driver;
import automationFramework.DriverWait;
import pageObjects.CasesPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class CreateCaseTest {
	Properties prop;

	@Before
	public void beforeTest() throws IOException {
		Driver.InitializeChrome();
		DriverWait.InitializeWait();
		prop = ConfigReader.readConfigData();
		Driver.instance.navigate().to(prop.getProperty("env_url"));
		LoginPage.LoginAs(prop.getProperty("sf3auto_username")).WithPassword(prop.getProperty("sf3auto_password")).Login();
		DriverWait.instance.until(ExpectedConditions.titleIs("Salesforce - Unlimited Edition")); //TODO: check if the correct EC is used
	}
	
	@Test
	public void test() {
		HomePage.navigateToCases();
		CasesPage.clickCreateNewCaseButton();
		DataGenerator.generateData("Case");
		//CasesPage.clickSaveCaseButton();
		//Assert.assertTrue("Case not created", true);
	}
	
	@After
	public void afterTest() {
		Driver.Cleanup();
	}
}
