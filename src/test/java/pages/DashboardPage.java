package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Log;

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
	@FindBy(xpath = "//span[contains(text(),'Dashboard')]")
	private WebElement dashBoard;

	@FindBy(xpath="//span[contains(text(),'Emergency Card')]")
	private WebElement emergencyCard;

	@FindBy(id="ice-nav")
	private WebElement iceVault;

	@FindBy(id="estate-nav")
	private WebElement digitalEstate;

	@FindBy(id="capsule-nav")
	private WebElement timeCapsule;

	@FindBy(id="caretaker-nav")
	private WebElement myContacts;

	public DashboardPage ClickDashboard() {
		clickByJavaScript(dashBoard);
		return new DashboardPage(driver);
	}
	public EmergencyCardPage ClickEmergencyCard() {
		clickByJavaScript(emergencyCard);
		return new EmergencyCardPage(driver);
	}
	public DigitalEstatePage ClickDigitalEstate() {
		clickByJavaScript(digitalEstate);
		return new DigitalEstatePage(driver);
	}
	public DigitalVaultPage ClickDigitalVault() {
		clickByJavaScript(digitalVault);
	return new DigitalVaultPage(driver);
	}
	public TimeCapsulePage ClickTimeCapsule() {
		clickByJavaScript(timeCapsule);
		return new TimeCapsulePage(driver);
	}
	public MyContactsPage ClickMyContacts() {
		clickByJavaScript(myContacts);
		return new MyContactsPage(driver);
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
			Log.info("Emergency card is created already");
			click(eCard);
		}
		else if (isDisplayed(createNewECard)) {
				click(createNewECard);
				new EmergencyCardPage(driver).clickPickContact();
				new EmergencyCardPage(driver).pickContact();
				new EmergencyCardPage(driver).createNewECard();
				if(isDisplayed(ecardAlert)) {
					Log.info("New Emergency card is created successfully!");
				}
		}else {
			Log.info("Unknow Error: Could be created");
		}
		return new DashboardPage(driver);
	}
	
}
