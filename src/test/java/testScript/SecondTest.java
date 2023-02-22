package testScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;

public class SecondTest extends BaseClass{
	@Test
	public void secondTest() {
		SoftAssert soft=new SoftAssert();
		
		home.clickGears();
		home.clickSkillrarydemoApp();
        web.handleChildBrowser();
        
        
        soft.assertTrue(skillraryDemo.getpageHeader().isDisplayed());
        skillraryDemo.selectCategory(web,1);
        soft.assertEquals(testing.getPageHeader(),"Testing");
        
        web.dragAndDrop(testing.getSeleniumImage(),testing.getCartArea());
        web.scrollToElement(testing.getFacebookIcon());
        
        soft.assertAll();
        
	}



}
