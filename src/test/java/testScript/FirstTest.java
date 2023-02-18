package testScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;

public class FirstTest extends BaseClass {
	
	@Test

	public void firstTest() {
		SoftAssert soft=new SoftAssert();
		home.clickGears();
		home.clickSkillrarydemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(skillraryDemo.getpageHeader().isDisplayed());
		skillraryDemo.mouseHoverTocourse(web);
		skillraryDemo.clickSeleniumTraining();
		
		soft.assertEquals(selenium.getpageHeader(),"selenium Training");
		selenium.doubleClickPlusButton(web);
		selenium.clickAddtoCart();
		web.explicitWait(time,selenium.getItemAddedMessage());
		web.takeScreenShot();
		soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
		
		soft.assertAll();
	}
	

}
