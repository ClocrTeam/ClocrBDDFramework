package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

	public WebDriver driver;
	public DashboardPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[contains(text(),'Welcome')]")
	private WebElement pageHeader;
	
	@FindBy(xpath = "//span[contains(text(),'Dashboard')]")
	private WebElement dashboard;
	
	@FindBy(xpath = "//h3[contains(text(),'Emergency Card')]")
	private WebElement eCard;
	
	@FindBy(xpath = "//span[contains(text(),'×')]")
	private WebElement closeBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Create')]")
	private WebElement createNewECard;

	@FindBy(xpath = "//div[contains(text(), 'created successfully')]") 
	private WebElement ecardAlert;
	
	@FindBy(xpath = "//h6[contains(text(), 'QR code')]")
	private WebElement scanCodeTxt;
	
	@FindBy(tagName = "title")
	private WebElement pageTitle;
	
	@FindBy(xpath = "//span[contains(text(),'Personal')]//following::b[contains(text(),'Update Info')][1]")
	private WebElement updateInfoTxt;
	
	@FindBy(xpath = "//span[normalize-space()='Digital Vault']")
	private WebElement digitalVault;
	
	public String getHeaderText() {
		return getText(pageHeader);
	}
	public String getPageTitle() {
		return getText(pageTitle);
	}
	
	public DashboardPage clickCloseBtn() {
		click(closeBtn);
		return this;
	}
	public DashboardPage clickEmergencyCard() {
		click(eCard);
		return this;
	}
	public DashboardPage validatePageHeader() {
		isDisplayed(pageHeader);
		return this;
	}
	public PersonalinfoPage clickUpdateInfo() {
		click(updateInfoTxt);
		return new PersonalinfoPage(driver);
	}
	
	public DashboardPage clickDigitalVault() {
		click(digitalVault);
		return this;
		
	}
	
	public DashboardPage createEmergencyCard() throws Exception {
		click(dashboard);
		if(isDisplayed(eCard)) {
			log().info("Emergency card is created already");
			click(eCard);
		}
		else if (isDisplayed(createNewECard)) {
				click(createNewECard);
				new EmergencyCardPage(driver).clickPickContact();
				new EmergencyCardPage(driver).pickContact();
				new EmergencyCardPage(driver).createNewECard();
				if(isDisplayed(ecardAlert)) {
					log().info("New Emergency card is created successfully");
				}
		}else {
			log().info("Unknow Error: Could be created");
		}
		return new DashboardPage(driver);
	}
	
}
