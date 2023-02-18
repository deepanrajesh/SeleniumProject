package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestinPage {
	
	//Declaration
		@FindBy(xpath = "//h1[@class='page-header']")
		private WebElement pageHeader;
		@FindBy(id = "Selenium Training")
		private WebElement seleniumImage;
		@FindBy(id = "cartArea")
		private WebElement cartArea;
		@FindBy(xpath = "//footer[@class='main-footer']/descendant::i[@class='fa fa-facebook']")
		private WebElement facebookIcon;
		
		//Initialization
		public TestinPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		public String getPageHeader() {
			return pageHeader.getText();
		}
		
		public WebElement getSeleniumImage() {
			return seleniumImage;
		}
		
		public WebElement getCartArea() {
			return cartArea;
		}
		
		public WebElement getFacebookIcon() {
			return facebookIcon;
		}
		
		public void clickFacebookIcon() {
			facebookIcon.click();
		}

	}



