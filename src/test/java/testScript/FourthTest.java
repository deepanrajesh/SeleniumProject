package testScript;


import java.util.List;

import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;


public class FourthTest extends BaseClass {

	public void fourthTest() {
	SoftAssert soft=new SoftAssert();
	home.clickGears();
	home.clickSkillrarydemoApp();
	web.handleChildBrowser();
	soft.assertTrue(skillraryDemo.getpageHeader().isDisplayed());

	web.scrollToElement(skillraryDemo.getContactUs());
	skillraryDemo.clickContactUs();
	
	soft.assertTrue(contact.getPageHeader().isDisplayed());
	List<String> data=excel.fetchDataFromExcel("sheet1");
	
	contact.submitDetails(data.get(0),data.get(1),data.get(2),data.get(3));
	soft.assertAll();

}
}