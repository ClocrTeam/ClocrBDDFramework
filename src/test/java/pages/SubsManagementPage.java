package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubsManagementPage extends BasePage{

	private WebDriver driver;
	public SubsManagementPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[contains(text(),'Dashboard')]")
	private WebElement dashBoard;

	@FindBy(xpath="//span[contains(text(),'Emergency Card')]")
	private WebElement emergencyCard;

	@FindBy(id="ice-nav")
	private WebElement iceVault;

	@FindBy(id="estate-nav")
	private WebElement digitalEstate;

	@FindBy(id="asset-nav")
	private WebElement digitalVault;

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
}
