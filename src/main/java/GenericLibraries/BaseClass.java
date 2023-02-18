package GenericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages.ContactUsPage;
import pompages.CoreJavaForSeleniumPage;
import pompages.TestinPage;
import pompages.coreJavaVideoPage;
import pompages.seleniumtrainingpage;
import pompages.skillRaryhomePages;
import pompages.skillrarydemoapppage;

public class BaseClass {

	protected PropertiesFileUtility property;
	protected Excelutility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;
	protected skillRaryhomePages home;
	protected skillrarydemoapppage skillraryDemo;
	protected CoreJavaForSeleniumPage coreJava;
	protected coreJavaVideoPage javaVideo;
	protected TestinPage testing;
	protected ContactUsPage contact;
	protected seleniumtrainingpage selenium;
	protected long time;
	//	@BeforeSuite (used for Db and configaartion not required)
	//@BeforeTest  (Used for parallel execution)
	@BeforeClass
	public void classConfiguration() {
		 property=new PropertiesFileUtility();
		excel=new Excelutility();
		 web=new WebDriverUtility();
		 
		 property.propertyFileInitialization(IConstantPath.PROPERTIES_FILE_PATH);
		 excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);
		
		 
	}
	@BeforeMethod
      public void methodConfiguration() {	
       time=Long.parseLong(property.fetchProperty("timeouts"));
		driver= web.openApplication(property.fetchProperty("browser"),property.fetchProperty("url"),time);
      
		 home=new skillRaryhomePages(driver);
		 Assert.assertTrue(home.getLogo().isDisplayed());
		 skillraryDemo=new skillrarydemoapppage(driver);
		 selenium=new seleniumtrainingpage(driver);
		 coreJava= new CoreJavaForSeleniumPage(driver);
		 javaVideo=new coreJavaVideoPage(driver);
		 testing =new TestinPage(driver);
		 contact=new ContactUsPage(driver);
	}
	@AfterMethod
	
	public void methodTearDown() {
		web.quitBrowser();
	}
	@AfterClass
	public void classTearDown() {
		excel.closeExcel();
	}
	//@AfterTest
//	@AfterSuite
	

}
