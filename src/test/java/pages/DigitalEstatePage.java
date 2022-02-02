package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitalEstatePage extends BasePage {
	
private WebDriver driver;
	public DigitalEstatePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//span[@class='main-app-title']")
	private WebElement pageHeader;
	
	@FindBy(xpath = "//div[@class='subheading ng-star-inserted']")
	private WebElement DigitalEstatecaption;
	
	@FindBy(xpath = "//span[normalize-space()='Dashboard']")
	private WebElement dashboard;
	
	@FindBy(xpath = "//div[@class='text-center pt-3 pb-3 logo-section']")
	private WebElement NewAccount;
	
	@FindBy(tagName = "title")
	private WebElement pageTitle;
	
	@FindBy(xpath = "//h5[@class='modal-title']")
	private WebElement NewAccountTitle;
	
	public String getHeaderText() {
		return getText(pageHeader);
	}
	public String getPageTitle() {
		return getText(pageTitle);
	}
	
	public DashboardPage clickDashboard() {
		click(dashboard);
		return new DashboardPage(driver);
	}
	
	public DigitalEstatePage clickNewAccount() {
		click(NewAccount);
		return this;		
	}
  public DigitalEstatePage validateCreateAccountpage() {
		
		if(isDisplayed(NewAccountTitle)) {
			log().info("Validate the title of New Account");
		}
		else
			log().info("Not Validate the title of New Account");
		
	 return this;
	}
public DigitalEstatePage validateHeader() {
	
	if(isDisplayed(DigitalEstatecaption)) {
		log().info("Validate the title of DigitalEstatecaption");
	}
	else
		log().info("Not Validate the title of DigitalEstatecaption");
	
 return this;
	
}

}
