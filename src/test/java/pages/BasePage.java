package pages;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
		log().info("Waiting for"+ e);
		wait.until(ExpectedConditions.visibilityOf(e));
		log().info(e+ "is visible");
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
		log().info("clicked on" + e);
	}
	public void executeJavaScript(String cmd) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(cmd);
	}
	public void clickByJavaScript(WebElement e) {
		waitForVisibility(e);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", e);
	}
	public void doubleClick(WebElement e) {
		Actions actions = new Actions(driver);
		waitForVisibility(e);
		actions.doubleClick().perform();	
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
	
	public Logger log() {
		return LogManager.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
	}
	
	public String dateTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		Date date = new Date();
		return dateFormat.format(date);
	}

	public void log(String txt) {
		String msg = Thread.currentThread().getId() +":"
				+ Thread.currentThread().getStackTrace()[2].getClassName() + ":" + txt;		
		System.out.println(msg);
		String strFile = "logs" + File.separator + "_" + File.separator + dateTime();
		File logFile = new File(strFile);
		if (!logFile.exists()) {
			logFile.mkdirs();
		}
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(logFile + File.separator + "log.txt",true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.println(msg);
		printWriter.close();
	}
	
	public void submitKeys(WebElement e, Keys k)
	{
		waitForVisibility(e);	
		e.sendKeys(k);
	}
}
