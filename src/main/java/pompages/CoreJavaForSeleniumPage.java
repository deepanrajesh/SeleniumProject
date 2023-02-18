package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSeleniumPage {
	
	//Declaration
	
	@FindBy(xpath="//h2[@class='list_title']")
	private WebElement pageHeader;
	@FindBy(xpath="//a[text()='Core Java ForSelenium Training']")
	private WebElement coreJavaForSeleniumLink;
	
	//Initialisation
	public CoreJavaForSeleniumPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Utilisation
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	public void clickCoreJavaForSeleniumLink() {
		coreJavaForSeleniumLink.click();
	}

}
