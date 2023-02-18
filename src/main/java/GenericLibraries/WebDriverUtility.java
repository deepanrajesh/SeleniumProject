package GenericLibraries;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * this class contains all the reusable webdriver methods
 * 
 * @author rajesh
 *
 */

public class WebDriverUtility {
	WebDriver driver;

	/**
	 * 
	 * This method is used to navigate to application
	 * 
	 * @param browser
	 * @param url
	 * @param time
	 * @return
	 */
	public WebDriver openApplication(String browser, String url, long time) {

		switch (browser) {

		case "chrome":
			driver = new ChromeDriver();
			break;
		// case "firefox":driver=new FirefoxDriver();break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid browser data");

		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		return driver;
	}
	
	/**
	 * This method is to mouse hover on particular element
	 * @param element
	 */

	public void mouseHover(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	
	/**this method is used for double click on the element 
	 * 
	 * @param element
	 */
	public void doubleClickonElement(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}
/**
 * THis method for drag and drop from src to dest
 * 
 * @param src
 * @param dest
 */
	public void dragAndDrop(WebElement src, WebElement dest) {
		Actions a = new Actions(driver);

		a.dragAndDrop(src,dest).perform();
	}
/**
 * 
 * This method is used to select an elementfrom dropdown based on text 
 * @param text
 * @param element
 */
	public void dropdown(String text, WebElement element) {
		Select s = new Select(element);
		s.selectByVisibleText(text);

	}
	
	/**
	 * 
	 * This method is used to select on element from dropdownbased on index
	 * @param element
	 * @param index
	 */

	public void dropdown(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	/**
	 * This method is used to select an element from drop down based on value
	 * @param element
	 * @param value
	 */
	public void dropdown(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	/**
	 * this method is used to frame 
	 * 
	 */
	
	
	public void switchToFrame() {
		driver.switchTo().frame(0);
	}
	
	/**
	 * this method is used to switch back from frame
	 * 
	 */

	public void switchBackFromFrame() {
		driver.switchTo().defaultContent();
	}
	
	/**
	 * this method is to handle alerts
	 * 
	 */

	public void handleAlert() {
		driver.switchTo().alert().accept();
	}

	/**
	 * 
	 * this method is used for child browser pop up
	 */
	
	public void handleChildBrowser() {
		Set<String> windowIDs = driver.getWindowHandles();
		for (String string : windowIDs) {
			driver.switchTo().window(string);

		}
	}
	
	/**
	 * this method is to switch to parent window
	 */

	public void switchToParentWindow() {
		
		driver.switchTo().window(driver.getWindowHandle());
	}
	/**
	 * 
	 * this method is for scroll till the element
	 * @param element
	 */
	public void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	/**
	 * this method is to take screen shot in project
	 * 
	 */
	public void takeScreenShot() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/pictures.png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
/**
 * this method is to synchronise webdriver methods
 * 
 * @param time
 * @param element
 */
	public void explicitWait(long time, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	/**
	 * this method is to close current window
	 * 
	 */
	public void closeCurrentWindow() {
		driver.close();
	}
/**
 * 
 *this method is to quit browser 
 */
public void quitBrowser() {
	driver.quit();
}

}
