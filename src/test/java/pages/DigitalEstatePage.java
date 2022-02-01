package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitalEstatePage extends BasePage {

	private WebDriver driver;
	public DigitalEstatePage(WebDriver driver){
		super(driver);
	}
	@FindBy(xpath = "//span[contains(text(),'Last Update')]")
	private WebElement pageHeader;
	
	@FindBy(tagName = "title")
	private WebElement pageTitle;
	
	public String getHeaderText() {
		return getText(pageHeader);
	}
	public String getPageTitle() {
		return getText(pageTitle);
	}
}
