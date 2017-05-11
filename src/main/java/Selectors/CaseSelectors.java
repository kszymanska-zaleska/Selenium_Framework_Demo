package Selectors;

import org.openqa.selenium.By;

public class CaseSelectors {
	public static By casesTab = By.cssSelector("#Case_Tab a");
	public static By newCaseButton = By.xpath("//input[@name='new']");
//  public static By caseSubjectInput = By.xpath("//input[@id='cas14']");
	public static By caseSubjectInput = By.xpath("//input[@tabindex='1']"); // example of using tab index attribute to make test reusable in different environment
//	public static By caseOriginatingCountry = By.xpath("//select[@id='00N20000009F0bE']");
	public static By caseOriginatingCountry = By.xpath("//select[@tabindex='9']"); // example of using tab index attribute to make test reusable in different environment
	public static By caseDivision = By.xpath("//select[@id='00N20000009cShZ']");
	public static By caseBU = By.xpath("//select[@id='00N20000009F0a1']");
	public static By caseSupportType = By.xpath("//select[@id='00N20000009cShW']");
	public static By caseType = By.xpath("//select[@id='00N20000009cShU']");
	public static By caseDescription = By.xpath("//textarea[@cols='75']");
	public static By caseContactNameInput = By.cssSelector("input[id='cas3']");
	public static By caseSaveCaseButton = By.name("save");
	
	
	
	
}
