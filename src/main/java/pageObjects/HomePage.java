package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Selectors.CaseSelectors;
import automationFramework.Driver;
import automationFramework.DriverWait;
import automationFramework.WebElementsHandler;

public class HomePage {
	
	public static boolean IsAt() {
		WebElement currentUserName = Driver.instance.findElement(By.cssSelector(".currentStatusUserName a"));
		return currentUserName.getText().equals("Katarzyna Szymanska-Zaleska");
	}
	
	public static void navigateToCases() {
		WebElementsHandler webElementsHandler = new WebElementsHandler();
		
		// navigate to CasesTab
		webElementsHandler.clickLinkByLocator(CaseSelectors.casesTab);
		DriverWait.instance.until(ExpectedConditions.titleIs("Cases: Home ~ Salesforce - Unlimited Edition"));
	}
}
