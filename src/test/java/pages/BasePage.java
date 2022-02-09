package pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	private WebDriver driver;
	public WebDriverWait wait;
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public void waitForVisibility(WebElement e) {
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		utilities.Log.info("Waiting for: "+ e);
		wait.until(ExpectedConditions.visibilityOf(e));
		utilities.Log.info(e+": is visible");
	}
	public boolean isDisplayed(WebElement e) {
		waitForVisibility(e);
		return e.isDisplayed();
	}
	public void clear(WebElement e) {
		waitForVisibility(e);
		e.clear();
	}
	public void click(WebElement e) {
		waitForVisibility(e);
		e.click();
		utilities.Log.info("clicked on: " + e);
	}
	public void executeJavaScript(String cmd) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(cmd);
	}
	public void clickByJavaScript(WebElement e) {
		waitForVisibility(e);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", e);
		utilities.Log.info("clicked by javascript on: " + e);
	}
	public void doubleClick(WebElement e) {
		Actions actions = new Actions(driver);
		waitForVisibility(e);
		actions.doubleClick().perform();
		utilities.Log.info("double clicked on: " + e);
	}
	public void rightClick(WebElement e) {
		Actions actions = new Actions(driver);
		waitForVisibility(e);
		actions.contextClick().perform();	
	}
	public void sendKeys(WebElement e, String txt) {
		waitForVisibility(e);
		e.clear();
		e.sendKeys(txt);
		utilities.Log.info(txt +" is entered");
	}
	public String getAttribute(WebElement e, String attribute) {
		waitForVisibility(e);
		return e.getAttribute(attribute);
	}
	public String getText(WebElement e) {
		waitForVisibility(e);
		return e.getText();
	}
	public void switchToNextTab() {
		ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
	}
	public void switchToPreviousTab() {
		ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(0));
	}
	public void ScrollToElement(WebElement e) {
		waitForVisibility(e);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",e);
	}
	public void OpenNewTab() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.open()");
	}
	public void switchToNewWindow() {
		driver.switchTo().newWindow(WindowType.WINDOW);
	}
	public void switchToParentWindow() {
		driver.switchTo().defaultContent();
	}
	public void selectByValue(WebElement e, String value) {
		waitForVisibility(e);
		Select selectElement = new Select(e);
		selectElement.selectByValue(value);
	}
	public void selectByText(WebElement e, String text) {
		waitForVisibility(e);
		Select selectElement = new Select(e);
		selectElement.selectByVisibleText(text);
	}
	public void selectByIndex(WebElement e, int number) {
		waitForVisibility(e);
		Select selectElement = new Select(e);
		selectElement.selectByIndex(number);
	}
	public void moveToElement(WebElement e) {
		Actions actions = new Actions(driver);
		waitForVisibility(e);
		actions.moveToElement(e).perform();	
	}
	public void fileUpload(String filepath, WebElement e) {
		String path = System.getProperty("user.dir")+"\\testData\\"+ "FilePaths";
		waitForVisibility(e);
		e.sendKeys(path);
	}
	public void dragnDrop(WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();		
	}
	
	public String dateTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		Date date = new Date();
		return dateFormat.format(date);
	}
	
	public void submitKeys(WebElement e, Keys k)
	{
		waitForVisibility(e);	
		e.sendKeys(k);
	}
}
