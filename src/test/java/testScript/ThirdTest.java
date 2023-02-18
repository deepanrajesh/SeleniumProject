package testScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;

public class ThirdTest extends BaseClass{
	@Test
	
	
	public void ThirdTest() throws InterruptedException{
		SoftAssert soft =new SoftAssert();
		home.searchFor("core java for the selenium");
		soft.assertEquals(coreJava.getPageHeader(),"CORE JAVA FOR SELENIUM");
		
		coreJava.clickCoreJavaForSeleniumLink();
		soft.assertEquals(javaVideo.getPageHeader(), "core Java For Selenium Training");
		
		javaVideo.clickclosecookies();
		web.switchToFrame();
		javaVideo.clickPlayButton();
		Thread.sleep(2000);
		javaVideo.clickPauseButton();
		
		web.switchBackFromFrame();
		
		javaVideo.addWishListTab();
		soft.assertAll();
	}

}
