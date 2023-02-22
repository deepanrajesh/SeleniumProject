package testScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;

public class FirstTest extends BaseClass {
	//skillrary
	@Test

	public void firstTest()
	{
		SoftAssert soft=new SoftAssert();
		home.clickGears();
		home.clickSkillrarydemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(skillraryDemo.getpageHeader().isDisplayed());
		skillraryDemo.mouseHoverTocourse(web);
		skillraryDemo.clickSeleniumTraining();
		
		soft.assertEquals(selenium.getPageHeader(), "Selenium Training");
		selenium.doubleClickPlusButton(web);
		selenium.clickAddtoCart();
		web.handleAlert();
		web.explicitWait(time,selenium.getItemAddedMessage());
		web.takeScreenShot();
		soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
		
		soft.assertAll();
	}
	

}
