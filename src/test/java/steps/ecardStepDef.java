package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EmergencyCardPage;
import pages.MyContactsPage;
import utilities.DriverManager;

public class ecardStepDef extends DriverManager {

	@When("click on Emergency Card menu")
    public void emergencyCardMenu() {
		new EmergencyCardPage(driver).clickOnEmerencyMenu();
    }
	
	@Then("User should redirects to Your Emergency Card page")
    public void validateEmergencyPageHeader() throws InterruptedException {
		new EmergencyCardPage(driver).pageHeaderEmergencyCardPage();
    }
	
	@When("Click on Create your Emergency Card")
	public void createEmergnecy() throws Exception
	{
		new EmergencyCardPage(driver).validateIfCardAdded();
		new EmergencyCardPage(driver).clickOnCreateOrRegisterCardLink();
		
	}
	
	@Then("User should redirects to Create or Register Your Emergency Card page")
	public void validateCreateYourEmergencyCardPage()
	{
		new EmergencyCardPage(driver).validateCreateorRegisterYourEmergencyCardPage();
	}
	
	@When("Add details and click on Create Emergency Card button")
	public void addDetailsAndClickOnCreateEmergencyCardButton() throws Exception
	{
		new EmergencyCardPage(driver).createEmergencyCard();
	}
	@Then ("Emergency Card should generate")
	public void EmergencyCardGenerate()
	{
		new EmergencyCardPage(driver).validateCardGenerate();
	}
	
	@When("Modify the existing emrgency card") 
	public void clickOnEditEmergencyCard() throws Exception
	{
		new EmergencyCardPage(driver).clickOnActions();
		new EmergencyCardPage(driver).clickOnEditMenu();
	}
	
	@Then("It should redirects to Update Your Emergency Card page")
	public void editEmergencyCardPageValidation()
	{
		new EmergencyCardPage(driver).validateUpdateEmeregencyPageHeader();
	}
	
//	@When("Select another {string}")
//	public void selectCountry(String country) throws Exception
//	{
//		new EmergencyCardPage(driver).selectCountry(country);
//	}
//	
//	@Then("Emergency Card Service pop up should open")
//	public void emergencyCardServiceValidation() throws Exception
//	{
//		new EmergencyCardPage(driver).emergencyCardServicePageHeader();
//	}
//	
//	@When("Select Clocr Emergency Card option and Click on Inform Clocr button")
//	public void ecardServiceOption()
//	{
//		new EmergencyCardPage(driver).ecardServiceOption();
//	}
	
//	@Then("Emergency Card has been updated successfully message should show")
//	public void ecardServiceUpdate() throws Exception
//	{
//		new EmergencyCardPage(driver).updateAlert();
//	}
	
	@When("Click on Pick your Contacts button, select contact and then click on Add button")
	public void clickOnPickContact() throws Exception
	{
		new EmergencyCardPage(driver).clickPickContact();
		new EmergencyCardPage(driver).editContact();
	}
	
	@Then("Contacts should add")
	public void ecardContactsUpdate()
	{
		new EmergencyCardPage(driver).validateContactsAdd();
	}
	
	@When ("Click on Back button")
	public void backButtonUpdateEcard()
	{
		new EmergencyCardPage(driver).backButtonEcardPage();
	}
	
	@Then("After click on Back button it should redirects to Your Emergency Card page")
    public void validatePageAfterClickonBackButton() throws InterruptedException {
		new EmergencyCardPage(driver).pageHeaderEmergencyCardPage();
    }
	
	@When ("Click on Action, click on Download menu for Download Card")
	public void clickOnDownloadMenu() throws Exception
	{
		new EmergencyCardPage(driver).clickOnDownloadCard();
	}
	
	@Then ("Download pop up should open to Download Card")
	public void validateDownloadPopUp()
	{
		new EmergencyCardPage(driver).validateDownloadPageValidation();
	}
	
	@When ("Click on Download Card button, then it should download the Card")
	public void clickOnDownloadCardButton() throws Exception
	{
		new EmergencyCardPage(driver).clickOnDownloadCardButton("Download Card");
	}
	
	@When ("Click on Action, click on Download menu for Download Sticker")
	public void clickOnDownloadCardButtonAgain() throws Exception
	{
		new EmergencyCardPage(driver).clickOnDownloadCard();
		new EmergencyCardPage(driver).clickOnStickerTab();
	}
	@When ("Click on Download Sticker button, then it should download the Sticker")
	public void clickOnDownloadStickerButton() throws Exception
	{
		new EmergencyCardPage(driver).clickOnDownloadCardButton("Download Sticker");
	}
	
	@When("User click on Register Your Emergency Card")
	public void clickOnRegisterYourEmergencyCardLink() throws Exception
	{
		new EmergencyCardPage(driver).clickOnRegisterYourCardLink();
	}
	
	@Then("Register Your Emergency Card page should open")
	public void validateRegisterYourEmergencyCardPage()
	{
		new EmergencyCardPage(driver).validateRegisterYourEmergencyCardPage();
	}
	
	@When("User add details like card id {string}, country {string} for register card")
	public void registerACard(String cardId,String country) throws Exception
	{
		new EmergencyCardPage(driver).registerACard(cardId, country);
	}
	
	@Then("User should able to register a card")
	public void validateRegisteredCard()
	{
		new EmergencyCardPage(driver).validateRegister();
	}
	
	@When("Click on Order New Card link")
	public void click_on_order_new_card_link()
	{
		new EmergencyCardPage(driver).clickOnOrderNewCardLlink();
	}
	
	@Then("It should redirects to Order Emergency Cards page")
	public void validate_order_emergency_card_page()
	{
		new EmergencyCardPage(driver).validateOrderEmergencyCardPageHeader();
	}
	
	@When("Select Not Interested option and click on Close button")
	public void select_Not_Interested_Option()
	{
		new EmergencyCardPage(driver).selectNotInterestedOption();
	}
	
	@Then("User should redirects to Your Emergency Card page after click on Close button")
	public void validate_Emergnecy_Card_Page()
	{
		new EmergencyCardPage(driver).pageHeaderEmergencyCardPage();
	}
	
	@When("Click on click here to recharge")
	public void click_on_click_here_to_recharge() throws Exception
	{
		new EmergencyCardPage(driver).clickOnClickHereCardLink();
	}
	
	@Then("User redirects to Stripe page")
	public void user_redirects_to_stripe_page()
	{
		new EmergencyCardPage(driver).validateStripePage();
	}
	
	@When("Enter details and click on Pay button")
	public void enter_details_and_click_on_pay_button() 
	{
		new EmergencyCardPage(driver).enterAllDetailsOnStripePage();
	}
	
	@When("Click on Action, click on Delete menu and click on Yes button")
	public void clickOnDeleteButton() throws Exception
	{
		new EmergencyCardPage(driver).clickOnDeleteCard();
	}
	
	@Then ("Emergency Card should be deleted")
	public void validateAlert()
	{
		new EmergencyCardPage(driver).validateDeleteAlert();
	}	
	
	
	@When("click on Emergency Card menu after to add new contact")
	public void clickOnEmergencyCardMenu() throws Exception
	{
		new EmergencyCardPage(driver).clickOnEmerencyMenu();
		new EmergencyCardPage(driver).validateIfCardAdded();
		new MyContactsPage(driver).clickOnMyContactsMenu();
		new MyContactsPage(driver).validateContactsPageHeader();
		new MyContactsPage(driver).deleteContactIfAdded();
		new EmergencyCardPage(driver).clickOnEmerencyMenu();
	}
	
	@Then("It should redirects to Your Emergency Card page")
	public void validateYourEmergencyCardPageHeader()
	{
		new EmergencyCardPage(driver).pageHeaderEmergencyCardPage();
	}
	
	@When("Click on Create or Register Your contact link")
	public void clickOnCreteEcardLink() throws Exception
	{
		new EmergencyCardPage(driver).clickOnCreateOrRegisterCardLink();
	}
	
	@Then("It should redirects to Create or Register Emergency Card page")
	public void validateYourEmergencyCardPage()
	{
		new EmergencyCardPage(driver).validateCreateorRegisterYourEmergencyCardPage();
	}
	
	@When("click on Pick your contacts button")
	public void clickOnPickYourContactsButton() throws Exception
	{
		new EmergencyCardPage(driver).clickPickContact();
	}
	
	@Then("Choose your contacts for Emergency Card pop up is getting open")
	public void validateChooseContactPopUp()
	{
		new EmergencyCardPage(driver).validateChooseContactEcardPage();
	}
	
	@When("Click on Add New button")
	public void clickOnAddNewButton()
	{
		new EmergencyCardPage(driver).clickOnAddNewButton();
	}
	
	@Then("Create page will open")
	public void validateCreatePageHeader()
	{
		new EmergencyCardPage(driver).validateCreatePageHeader();
	}
	
	@When("Add details and click on Create button")
	public void addDetailsAndClickOnCreateButton() throws Exception
	{
		new EmergencyCardPage(driver).addDetailAndClickOnCreateButton();
	}
	
	@Then("contact should add")
	public void validateContactAdded() throws Exception
	{
		new EmergencyCardPage(driver).validateContactAdded();
	}
	
	@When("Select contact and click on Add button")
	public void selectContactAndClickOnAddButton()
	{
		new EmergencyCardPage(driver).selectAddedContactAndClickOnAddButton();
	}
	
	@Then("Contact should add on Ecard")
	public void validateContactAddedOnFront()
	{
		new EmergencyCardPage(driver).validateContactAddedOnFront();
	}
	
	@When("Click on Create Your Emergency Card button")
	public void clickOnCreateEmergencyCardButton()
	{
		new EmergencyCardPage(driver).createNewECard();
	}
	
	@Then("Added contact should show on card")
	public void validateContactAddedOncEcard()
	{
		new EmergencyCardPage(driver).validateContactAddedOnEcard();
	}
	
	
}
