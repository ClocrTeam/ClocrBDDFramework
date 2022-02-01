package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimeCapsulePage extends BasePage {
private WebDriver driver;
	public TimeCapsulePage(WebDriver driver) {
	super(driver);
}
	@FindBy(xpath = "//span[contains(text(),'Time Capsule')]")
	private WebElement pageHeader;
	
	@FindBy(tagName = "title")
	private WebElement pageTitle;
	
	public String GetHeaderText() {
		return getText(pageHeader);
	}
	public String GetPageTitle() {
		return getText(pageTitle);
	}
}
