package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibraries.WebDriverUtility;

public class seleniumtrainingpage {
	
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageheader;
	
	@FindBy(id="add")
	private WebElement plusButton;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath="//div[@id='callout']/span")
	private WebElement itemAddedMessage;
	
	//initilization
	
	public seleniumtrainingpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	
	public WebElement getPageHeader() {
		return pageheader;
	}
public void doubleClickPlusButton(WebDriverUtility web) {
	web.doubleClickonElement(plusButton);
	
}
	
	public void clickAddtoCart() {
		addToCartButton.click();
	}
	//public String getItemAddedMessage() {
		//return itemAddedMessage.getText();
	//}
	
public WebElement getItemAddedMessage() {
	return itemAddedMessage;
}

}

