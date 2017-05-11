package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Selectors.CaseSelectors;
import automationFramework.DataGenerator;
import automationFramework.Driver;
import automationFramework.WebElementsHandler;

public class CasesPage {
	
	public static boolean IsAt() {
		WebElement createdCaseSubject = Driver.instance.findElement(By.className("efhpTitle"));
		return createdCaseSubject.getText().equals(DataGenerator.caseSubjectValue);
	}
	
	public static void clickCreateNewCaseButton() {
		WebElementsHandler webElementsHandler = new WebElementsHandler();
		
// 		click New Case Button
		webElementsHandler.clickInputButtonByLocator(CaseSelectors.newCaseButton);
//		probably neccesary for Moz FF browser
//		JavascriptExecutor executor = (JavascriptExecutor)Driver.instance;
//		executor.executeScript("arguments[0].click();", newCaseButton);
	}

	public static void clickSaveCaseButton() {
		WebElementsHandler webElementsHandler = new WebElementsHandler();
		
		//click Save
		webElementsHandler.clickInputButtonByLocator(CaseSelectors.caseSaveCaseButton);
	}
}

