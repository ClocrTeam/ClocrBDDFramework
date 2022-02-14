package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Log;

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
	
	@FindBy(xpath = "//a[contains(text(),'Create or Register Your')]")
	private WebElement registerTxt;
	
	@FindBy(xpath ="//span[contains(text(),'Create or Register Your Emergency Card')]")
	private WebElement createOrRegisterPageHeader;
	
	@FindBy(xpath = "//app-wallet-card//following::div[1]/a[contains(text(),'Register')]")
	private WebElement registerYourCardLink;
	
	@FindBy(xpath ="//span[contains(text(),'Register Your Emergency Card')]")
	private WebElement registerPageHeader;
	
	@FindBy(xpath = "//span[contains(text(),' Jignesh Clocr ')]//preceding::div[1][@role='checkbox']")
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
	
//	@FindBy(xpath = "//span[contains(@class,'dropdown-trigger')]")
//	private WebElement dropdownButton;
//	
//	@FindBy(xpath ="//input[contains(@class,'dropdown-filter')]")
//	private WebElement countrySearchText;
	
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
	private WebElement registered;
	
	@FindBy(xpath = "//a[contains(text(),' click here ')]")
	WebElement clickHere;
	
	@FindBy(xpath = "//div[contains(text(),'Pay with card')]")
	WebElement payWithCardHeader;
	
	@FindBy(xpath = "//input[contains(@id,'cardNumber')]")
	WebElement creditCardId;
	
	@FindBy(xpath = "//input[contains(@id,'cardExpiry')]")
	WebElement cardExpiryDate;
	
	@FindBy(xpath = "//input[contains(@id,'cardCvc')]")
	WebElement cardCVCNumber;
	
	@FindBy(xpath = "//input[contains(@id,'billingName')]")
	WebElement billingName;
	
	@FindBy(xpath = "//div[contains(@class,'SubmitButton')]")
	WebElement payButton;
	
	@FindBy(xpath = "//span[contains(text(),'This card already registered')]")
	WebElement cardAlreadyRegisterAlert;
	
	@FindBy(xpath = "//button[contains(text(), 'Order New Card')]")
	private WebElement orderNewCardLink;
	
	@FindBy(xpath ="//h4[contains(@id, 'modal-basic-title')]")
	private WebElement orderEmergencyCardPageHeader;
	
	@FindBy(xpath = "//input[contains(@value,'None')]")
	private WebElement notInterestedOption;
	
	@FindBy(xpath = "//button[contains(text(),'Close')]")
	private WebElement closeButton;
	
	@FindBy(xpath ="//button[contains(text(),' Proceed To Checkout ')]")
	private WebElement proceedToCheckoutButton;
	
	@FindBy(xpath ="//button[contains(text(),' Back ')]")
	private WebElement backButton;
	
	@FindBy(xpath ="//input[contains(@id,'minmax-buttons')]")
	private WebElement numberOfCardsElement;
	
		
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
			Log.info("Successfully redirects to 'Your Emergency Card' page");
			
		}
		else
		{
			Log.error("Unknown Error");
		}
		
		return this;
	}
	
	public EmergencyCardPage clickOnCreateOrRegisterCardLink() throws Exception 
	{
		clickByJavaScript(registerTxt);
		return this;
	}
	
	public EmergencyCardPage validateIfCardAdded() throws Exception
	{
//		try
//		{
			if((registered.isDisplayed()) || (registerYourCardLink.isDisplayed()))
			{
				Log.info("I am in if");
				clickOnDeleteCard();
			}
//		}catch(Exception e){}
		
		return this;
	}
	
	public EmergencyCardPage validateCreateorRegisterYourEmergencyCardPage(String pageHeader)
	{
		if(isDisplayed(createOrRegisterPageHeader))
		{
			Log.info("Redirecting to 'Create or Register Your Emergency Card' page");
		}
		else
		{
			Log.error("Wrong redirection");
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
			Log.info("New Emergency card is created successfully");
		}
		else
		{
		Log.info("Unknow Error: Could be created");
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
			Log.info("Redirects to 'Update Your Emergency Card' successfully");			
		}
		else
		{
			Log.error("Wrong page redirection");
		}
		return this;
	}
	
//	public EmergencyCardPage selectCountry(String country) throws Exception
//	{
//		Thread.sleep(3000);
//		click(dropdownButton);
//		
//		sendKeys(countrySearchText, country);
//		submitKeys(countrySearchText, Keys.ARROW_DOWN);
//		submitKeys(countrySearchText, Keys.ENTER);
//		
//		return this;
//	}
	
	public EmergencyCardPage editContact()
	{
		click(addSecondContact);
		
		click(addBtn);
		return this;
	}
	
	public EmergencyCardPage validateContactsAdd()
	{
		try
		{
			Thread.sleep(1000);
			if(updateAlert.isDisplayed())
			{
				Log.info("Emergency card is updated successfully");
			}			
		}
		catch(Exception e)
		{
			Log.error("Unknow Error: Unable to update");
		}
		
		
		if(isDisplayed(validateContactAdd))
		{
			Log.info("Contacts added successfully");
		}
		else
		{
			Log.error("Unable to add contact");
		}
		return this;
	}
	
	public EmergencyCardPage updateMessage()
	{
		if(isDisplayed(updateAlert)) 	
		{
			Log.info("Emergency card is updated successfully");
		}
		else
		{
		Log.error("Unknow Error: Unable to update");
		}
		return this;
	}
	
	public EmergencyCardPage emergencyCardServicePageHeader() throws Exception
	{
		Thread.sleep(1000);
		try
		{
			if(updateAlert.isDisplayed())
			{
				Log.info("Emergency card updated successfully");
			}
		}
		catch(Exception e)
		{
			Log.error("Unable to update Emergency card.");
		}
			
//		try
//		{
//			if(isDisplayed(emergencyCardServicePageHeader))
//			{
//				Log.info("Emergency Card Service pop up is getting open successfully");
//			}
//			else
//			{
//				Log.error("Emergency Card Service pop up is not getting open");
//			}
//		}
//		catch(Exception e)
//		{
//			Log.error("Unknown Error");
//		}
		
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
			Log.info("Emergency Card updated Successfully.");
		}
		else
		{
			Log.error("Unable to update Emergency Card.");
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
		
		Thread.sleep(3000);
		clickByJavaScript(downloadMenu);
		
		return this;
	}
	
	public EmergencyCardPage clickOnStickerTab() throws Exception
	{
		Thread.sleep(2000);
		clickByJavaScript(stickerTab);
		return this;
	}
	
	public EmergencyCardPage validateDownloadPageValidation()
	{
		if(isDisplayed(emergencyCardServicePageHeader))
		{
			Log.info("Download Pop up open successfully");
		}
		else
		{
			Log.error("Unable to open Download pop up");
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
			Log.info("Redirecting to 'Register Your Emergency Card' page");
		}
		else
		{
			Log.error("Wrong redirection");
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
			Log.info("You have requested to Emergency card service for "+registerCountry+"");
		}
		else
		{
			Log.error("Unable to request a card.");
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
//		selectCountry(registerCountry);
		
//		ecardServiceOption();
		
//		validateRequestEmergencyCardService(registerCountry);
		
		clickPickContact();
		
		addContactForRegister();
		
		enterCardId(cardId);
		
		try
		{
			if(isDisplayed(cardAlreadyRegisterAlert))
			{
				Log.info("This card is already Registered.");
				
				click(backUpdateEcardPage);
			}
		}
		catch(Exception e) 
		{
			clickOnRegisterCardButton();
		}
			
		return this;
	}
	
	public EmergencyCardPage validateRegister()
	{
		if(isDisplayed(registered))
		{
			Log.info("Your Emergency Card Registered successfully");
		}
		else
		{
			Log.error("Unable to register a card");
		}
		return this;
	}
	
	public EmergencyCardPage clickOnDeleteCard() throws Exception
	{
		clickOnActions();
		
		clickByJavaScript(deleteMenu);
		
		clickByJavaScript(yesButtonElement);
		
		return this;
	}
	
	public EmergencyCardPage validateDeleteAlert()
	{
//		if(isDisplayed(deleteAlert))
//		{
//			Log.info("Card deleted successfully");
//		}
//		else
//		{
//			Log.error("Card can not delete.");
//		}
		
		try
		{
			if(isDisplayed(registerTxt))
				{
					Log.info("Emergency Card deleted successfully");
				}
		}
		catch(Exception e)
		{
			Log.error("Emergency Card can not delete.");
		}
		return this;
	}	
	
	public EmergencyCardPage clickOnClickHereCardLink()
	{
		clickByJavaScript(clickHere);
		return this;
	}
	
	public EmergencyCardPage validateStripePage()
	{
		if(isDisplayed(payWithCardHeader))
		{
			Log.info("Successfully redirects to Stripe Page");
		}
		else
		{
			Log.error("Unknown error");
		}
		return this;
	}
	
	public EmergencyCardPage enterAllDetailsOnStripePage()
	{
		sendKeys(creditCardId, "4242424242424242");
		
		sendKeys(cardExpiryDate, "02/30");
		
		sendKeys(cardCVCNumber, "528");
		
		sendKeys(billingName, "BN");
		
		clickByJavaScript(payButton);
		return this;
	}
	
	public EmergencyCardPage clickOnOrderNewCardLlink()
	{
		click(orderNewCardLink);
		return this;
	}
	
	public EmergencyCardPage validateOrderEmergencyCardPageHeader()
	{
		if(isDisplayed(orderEmergencyCardPageHeader))
		{
			Log.info("Successfully redirects to 'Order Emergency Cards' Page");
		}
		else
		{
			Log.error("Unable to redirects to 'Order Emergency Cards' page.");
		}
		return this;
	}
	
	public EmergencyCardPage selectNotInterestedOption()
	{
		click(notInterestedOption);
		
		click(closeButton);
		
		return this;
	}
	
	public EmergencyCardPage clickOnProceedToCheckOutButton()
	{
		click(proceedToCheckoutButton);
		
		return this;
	}
	
	public EmergencyCardPage clickOnBackButton()
	{
		return this;
	}
}
