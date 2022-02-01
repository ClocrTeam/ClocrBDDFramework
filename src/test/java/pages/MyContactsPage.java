package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyContactsPage extends BasePage {

	private WebDriver driver;
	public MyContactsPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//div[contains(text(),'Contacts')]")
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
