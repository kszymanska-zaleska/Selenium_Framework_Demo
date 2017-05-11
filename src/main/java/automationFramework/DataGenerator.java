package automationFramework;

import java.text.SimpleDateFormat;
import java.util.Date;

import Selectors.CaseSelectors;

public class DataGenerator {
	//utils
	public static String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	//field values
	public static String caseSubjectValue = "Test" + timeStamp;
	public static String caseOriginatingCountryName = "Poland";
	public static String caseDivisionName = "EP";
	public static String caseBUName = "EPBP - Building Products";
	public static String caseSupportTypeValue = "Pre Sales";
	public static String caseTypeValue = "Homologation";
	public static String caseDescriptionValue = "test" + timeStamp;
	public static String caseContactNameInputValue = "Katarzyna Szymanska";
	
	public static void generateData(String object) {
		switch(object) {
			case "Case": setCaseRequiredValues();
				break;
		}
	}
	
	public static void setCaseRequiredValues() {
		WebElementsHandler caseValues = new WebElementsHandler();
		//Subject
		caseValues.typeInputText(CaseSelectors.caseSubjectInput, caseSubjectValue);
		//Country
		caseValues.selectDropDownByValue(CaseSelectors.caseOriginatingCountry, caseOriginatingCountryName);
		//division
		caseValues.selectDropDownByValue(CaseSelectors.caseDivision, caseDivisionName);
		//BU
		caseValues.selectDropDownByValue(CaseSelectors.caseBU, caseBUName);
		//supportType
		caseValues.selectDropDownByValue(CaseSelectors.caseSupportType, caseSupportTypeValue);
		//CaseTyepe
		caseValues.selectDropDownByValue(CaseSelectors.caseType, caseTypeValue);
		//Description
		caseValues.typeInputText(CaseSelectors.caseDescription, caseDescriptionValue);
		//ContactName
		caseValues.typeInputText(CaseSelectors.caseContactNameInput, caseContactNameInputValue);
	}
}
