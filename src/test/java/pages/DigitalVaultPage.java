package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitalVaultPage extends BasePage {
private WebDriver driver;
	public DigitalVaultPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//span[@class='main-app-title']")
	private WebElement pageHeader;
	
	@FindBy(tagName = "title")
	private WebElement pageTitle;
	
	@FindBy(xpath = "//span[normalize-space()='Dashboard']")
	private WebElement dashboard;
}
