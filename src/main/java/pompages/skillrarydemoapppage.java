package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GenericLibraries.WebDriverUtility;

public class skillrarydemoapppage {
	
	@FindBy(xpath="//a[@class='navbar-brand']")
	private WebElement pageHeader;
	@FindBy(id="course")
	private WebElement courseTab;
	@FindBy(xpath="//span[@class='wrappers']/a[text()='Selenium Training'] ")
	private WebElement seleniumTainingLink;
	@FindBy(name="addresstype")
	private WebElement categoryDropdown;
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactuslink;
	
//initialization
	public skillrarydemoapppage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public WebElement getpageHeader() {
		return pageHeader;
		
	}
	public void mouseHoverTocourse(WebDriverUtility web) {
		web.mouseHover(courseTab);
	}
	
	public void clickSeleniumTraining() {
		seleniumTainingLink.click();
	}
	
	public void selectCategory(WebDriverUtility web,int index) {
		web.dropdown(categoryDropdown,index);
	}
	public void clickContactUs() {
		contactuslink.click();
	
	}
		public WebElement getContactUs() {
			return getContactUs();
	}

}
