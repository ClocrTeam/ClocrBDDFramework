package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmergencyCardPage extends BasePage 
{

	private WebDriver driver;
	public EmergencyCardPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	@FindBy(xpath = "//div[contains(text(),'Your Emergency Card')]")
	private WebElement pageHeader;
	
	@FindBy(xpath = "//button[contains(text(), 'Create')]")
	private WebElement createECard;
	
	@FindBy(xpath = "//button[contains(text(),'Pick')]")
	private WebElement pickContactBtn;
	
	@FindBy(xpath = "//span[contains(text(),'ACTIVE')]")
	private WebElement activeStatus;
	
	@FindBy(xpath = "//a[contains(text(),'Register Your')]")
	private WebElement registerTxt;
	
	@FindBy(xpath ="//span[contains(text(),'Create or Register Your Emergency Card')]")
	private WebElement createOrRegisterPageHeader;
	
	@FindBy(xpath = "//app-wallet-card//following::div[1]/a[contains(text(),'Register')]")
	private WebElement registerYourCardLink;
	
	@FindBy(xpath ="//span[contains(text(),'Register Your Emergency Card')]")
	private WebElement registerPageHeader;
	
	@FindBy(xpath = "//span[contains(text(),' Jignesh Clocr ')]//preceding::div[@role='checkbox']")
	private WebElement contactCheckbox;
	
	@FindBy(xpath = "//button[contains(text(), 'Add') and @type]")
	private WebElement addBtn;
	
	@FindBy(tagName = "title")
	private WebElement pageTitle;
	
	@FindBy(xpath = "//div[contains(text(), 'created successfully')]") 
	private WebElement ecardAlert;
	
	@FindBy(xpath = "//span[contains(text(),' Emergency Card ')]")
	private WebElement emergencyCardMenu;
	
	//Edit Emergency
	@FindBy(xpath = "//app-wallet-card//following::div[1]/clocr-icon")
	private WebElement moreOptionPersonal;
	
	@FindBy(xpath ="//span[contains(@class,'pencil')]")
	private WebElement edit;
	
	@FindBy(xpath = "//span[contains(text(),'Update Your Emergency Card')]")
	private WebElement updateEmergencyCardPageHeader;
	
	@FindBy(xpath = "//span[contains(@class,'dropdown-trigger')]")
	private WebElement dropdownButton;
	
	@FindBy(xpath ="//input[contains(@class,'dropdown-filter')]")
	private WebElement countrySearchText;
	
	@FindBy(xpath="//span[contains(text(),' Ambar Clocr ')]//preceding::div[1][@role='checkbox']")
	private WebElement addSecondContact;
	
	@FindBy(xpath = "//div[contains(text(), 'updated successfully')]")
	private WebElement updateAlert;
	
	@FindBy(xpath = "//h4[contains(@class,'modal-title')]")
	private WebElement emergencyCardServicePageHeader;
	
	@FindBy(xpath = "//input[contains(@name,'options')]")
	private WebElement clocrEmergencyCardOption;
	
	@FindBy(xpath ="//button[contains(text(),'Inform CLOCR')]")
	private WebElement informClocrButton;
	
	@FindBy(xpath ="//img[contains(@src,'back')]")
	private WebElement backUpdateEcardPage;
	
	@FindBy(xpath ="//div[contains(text(),'Ambar Clocr')]")
	private WebElement validateContactAdd;
	
	@FindBy(xpath = "//span[contains(@class,'download')]")
	private WebElement downloadMenu;
	
	@FindBy(xpath ="//span[contains(text(),'Sticker')]")
	WebElement stickerTab;
	
	@FindBy(xpath ="//span[contains(@class,'trash')]")
	private WebElement deleteMenu;
	
	@FindBy(xpath = "//div[contains(text(), 'deleted')]")
	private WebElement deleteAlert;
	
	@FindBy(xpath = "//button[contains(text(),' Download Card')]")
	private WebElement downloadCardButtonElement;
	
	@FindBy(xpath = "//button[contains(text(),' Download Sticker')]")
	private WebElement downloadStickerButtonElement;
	
	@FindBy(xpath = "//input[contains(@id,'cardNumber')]")
	WebElement cardIdNumber;
	
	@FindBy(xpath = "//clocr-icon[contains(@color,'success')]")
	WebElement successIcon;
	
	@FindBy(xpath = "//span[contains(text(),' Meera Clocr ')]//preceding::div[1][@role='checkbox']")
	WebElement contactMeera;
	
	@FindBy(xpath = "//button[contains(text(),'Yes ')]")
	private WebElement yesButtonElement;
	
	@FindBy(xpath = "//button[contains(text(),'Register Emergency Card')]")
	WebElement registerEmergencyCardButton;
	
	@FindBy(xpath = "//div[contains(text(),'Registered')]")
	WebElement registered;
	
	public String GetHeaderText() {
		return getText(pageHeader);
	}
	public String GetPageTitle() {
		return getText(pageTitle);
	}
	
	public EmergencyCardPage clickPickContact() throws Exception 
	{
		Thread.sleep(3000);
		click(pickContactBtn);
		return this;
	}
	
	public EmergencyCardPage pickContact() {
		click(contactCheckbox);
		click(addBtn);
		return this;
	}
	
	public EmergencyCardPage createNewECard() {
		click(createECard);
		return this;
	}	
	
	public EmergencyCardPage clickOnEmerencyMenu()
	{
		click(emergencyCardMenu);	
		
		return this;
	}
	
	public EmergencyCardPage pageHeaderEmergencyCardPage()
	{
		if(isDisplayed(pageHeader))
		{
			log().info("Successfully redirects to 'Your Emergency Card' page");
			
		}
		else
		{
			log().error("Unknown Error");
		}
		
		return this;
	}
	
	public EmergencyCardPage clickOnCreateOrRegisterCardLink() throws Exception 
	{
		Thread.sleep(3000);
		click(registerTxt);
		return this;
	}
	
	public EmergencyCardPage validateCreateorRegisterYourEmergencyCardPage(String pageHeader)
	{
		if(isDisplayed(createOrRegisterPageHeader))
		{
			log().info("Redirecting to 'Create or Register Your Emergency Card' page");
		}
		else
		{
			log().error("Wrong redirection");
		}
		return this;
	}
	
	
	public EmergencyCardPage createEmergencyCard() throws Exception 
	{
		clickPickContact();
		pickContact();
		createNewECard();
		
		return this;
	}
	
	public EmergencyCardPage validateCardGenerate()
	{
		if(isDisplayed(ecardAlert)) 	
		{
			log().info("New Emergency card is created successfully");
		}
		else
		{
		log().info("Unknow Error: Could be created");
		}
		return this;
	}
	
	public EmergencyCardPage clickOnActions() throws Exception
	{
		Thread.sleep(3000);
		clickByJavaScript(moreOptionPersonal);	
				
		return this;
	}
	
	public EmergencyCardPage clickOnEditMenu() throws Exception
	{
		Thread.sleep(3000);
		click(edit);
		return this;
	}
	
	public EmergencyCardPage validateUpdateEmeregencyPageHeader()
	{
		if(isDisplayed(updateEmergencyCardPageHeader))
		{
			log().info("Redirects to 'Update Your Emergency Card' successfully");			
		}
		else
		{
			log().error("Wrong page redirection");
		}
		return this;
	}
	
	public EmergencyCardPage selectCountry(String country) throws Exception
	{
		Thread.sleep(3000);
		click(dropdownButton);
		
		sendKeys(countrySearchText, country);
		submitKeys(countrySearchText, Keys.ARROW_DOWN);
		submitKeys(countrySearchText, Keys.ENTER);
		
		return this;
	}
	
	public EmergencyCardPage editContact()
	{
		click(addSecondContact);
		
		click(addBtn);
		return this;
	}
	
	public EmergencyCardPage validateContactsAdd()
	{
//		if(isDisplayed(updateAlert)) 	
//		{
//			log().info("Emergency card is updated successfully");
//		}
//		else
//		{
//		log().error("Unknow Error: Unable to update");
//		}
		
		if(isDisplayed(validateContactAdd))
		{
			log().info("Contacts added successfully");
		}
		else
		{
			log().error("Unable to add contact");
		}
		return this;
	}
	
	public EmergencyCardPage updateMessage()
	{
		if(isDisplayed(updateAlert)) 	
		{
			log().info("Emergency card is updated successfully");
		}
		else
		{
		log().error("Unknow Error: Unable to update");
		}
		return this;
	}
	
	public EmergencyCardPage emergencyCardServicePageHeader()
	{
		
		if(isDisplayed(emergencyCardServicePageHeader))
		{
			log().info("Emergency Card Service pop up is getting open successfully");
		}
		else
		{
			log().error("Emergency Card Service pop up is not getting open");
		}
		return this;
	}
	
	public EmergencyCardPage ecardServiceOption()
	{
		click(clocrEmergencyCardOption);
		
		click(informClocrButton);
		return this;
	}
	
	public EmergencyCardPage updateAlert() throws Exception
	{
		Thread.sleep(1000);
		if(updateAlert.isDisplayed())
		{
			log().info("Emergency Card updated Successfully.");
		}
		else
		{
			log().error("Unable to update Emergency Card.");
		}
		
		return this;
	}
	
	public EmergencyCardPage backButtonEcardPage()
	{
		click(backUpdateEcardPage);		
		
		return this;
	}
	
	public EmergencyCardPage clickOnDownloadCard() throws Exception
	{
		clickOnActions();
		
		Thread.sleep(2000);
		clickByJavaScript(downloadMenu);
		
		return this;
	}
	
	public EmergencyCardPage clickOnStickerTab()
	{
		click(stickerTab);
		return this;
	}
	
	public EmergencyCardPage validateDownloadPageValidation()
	{
		if(isDisplayed(emergencyCardServicePageHeader))
		{
			log().info("Download Pop up open successfully");
		}
		else
		{
			log().error("Unable to open Download pop up");
		}
		return this;
	}
	
	public EmergencyCardPage clickOnDownloadCardButton(String download) throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement downloadButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),' "+download+"')]")));
		downloadButton.click();
		return this;
	}
	
	public EmergencyCardPage clickOnRegisterYourCardLink()
	{
		click(registerYourCardLink);
		return this;
	}
	
	public EmergencyCardPage validateRegisterYourEmergencyCardPage()
	{
		if(isDisplayed(registerPageHeader))
		{
			log().info("Redirecting to 'Register Your Emergency Card' page");
		}
		else
		{
			log().error("Wrong redirection");
		}
		return this;
	}
	
	public EmergencyCardPage enterCardId(String cardId)
	{
		sendKeys(cardIdNumber, cardId);
		return this;
	}
	
	public EmergencyCardPage validateRequestEmergencyCardService(String registerCountry)
	{
		if(isDisplayed(successIcon))
		{
			log().info("You have requested to Emergency card service for "+registerCountry+"");
		}
		else
		{
			log().error("Unable to request a card.");
		}
		return this;
	}
	
	public EmergencyCardPage addContactForRegister()
	{
		click(contactMeera);
		click(addBtn);
		return this;
	}
	
	public EmergencyCardPage clickOnRegisterCardButton()
	{
		click(registerEmergencyCardButton);
		
		return this;
	}
	
	public EmergencyCardPage registerACard(String cardId, String registerCountry) throws Exception
	{
		selectCountry(registerCountry);
		
		ecardServiceOption();
		
		validateRequestEmergencyCardService(registerCountry);
		enterCardId(cardId);
		
		clickPickContact();
		
		addContactForRegister();
		
		clickOnRegisterCardButton();
		
		return this;
	}
	
	public EmergencyCardPage validateRegister()
	{
		if(isDisplayed(registered))
		{
			log().info("Your Emergency Card Registered successfully");
		}
		else
		{
			log().error("Unable to register a card");
		}
		return this;
	}
	
	public EmergencyCardPage clickOnDeleteCard() throws Exception
	{
		clickOnActions();
		
		click(deleteMenu);
		
		click(yesButtonElement);
		
		return this;
	}
	
	public EmergencyCardPage validateDeleteAlert()
	{
//		if(isDisplayed(deleteAlert))
//		{
//			log().info("Card deleted successfully");
//		}
//		else
//		{
//			log().error("Card can not delete.");
//		}
		
		try
		{
			if(isDisplayed(registerTxt))
				{
					log().info("Emergency Card deleted successfully");
				}
		}
		catch(Exception e)
		{
			log().error("Emergency Card can not delete.");
		}
		return this;
	} 
	
}
