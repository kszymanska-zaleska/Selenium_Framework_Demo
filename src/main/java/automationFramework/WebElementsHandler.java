package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class WebElementsHandler {
	
	public void selectDropDownByValue(By selector, String value) {
		WebElement dropDown = Driver.instance.findElement(selector);
		DriverWait.instance.until(ExpectedConditions.elementToBeClickable(dropDown)); // TODO: possibly to remove
		Select selectDropDown= new Select(dropDown);
		selectDropDown.selectByValue(value);
	}
	
	public void typeInputText(By selector, String inputText) {
		WebElement inputField = Driver.instance.findElement(selector);
		inputField.click();
		inputField.clear();
		inputField.sendKeys(inputText);	
	}
	
	public void clickInputButtonByLocator(By selector) {
		WebElement inputButtonField = Driver.instance.findElement(selector);
		inputButtonField.click();
	}
	public void clickLinkByLocator(By selector) {
		WebElement link = Driver.instance.findElement(selector);
		link.click();
	}
}
