package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.EmergencyCardPage;
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
		new EmergencyCardPage(driver).createEmergencyCard();
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
	
	@When("Select another {string}")
	public void selectCountry(String country) throws Exception
	{
		new EmergencyCardPage(driver).selectCountry(country);
	}
	
	@Then("Emergency Card Service pop up should open")
	public void emergencyCardServiceValidation()
	{
		new EmergencyCardPage(driver).emergencyCardServicePageHeader();
	}
	
	@When("Select Clocr Emergency Card option and Click on Inform Clocr button")
	public void ecardServiceOption()
	{
		new EmergencyCardPage(driver).ecardServiceOption();
	}
	
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
	
	@When ("Click on Action, click on Download menu")
	public void clickOnDownloadMenu() throws Exception
	{
		new EmergencyCardPage(driver).clickOnDownloadCard();
	}
	
	@Then ("Download pop up should open")
	public void validateDownloadPopUp()
	{
		new EmergencyCardPage(driver).validateDownloadPageValidation();
	}
	
	@When ("Click on Download Card button, then it should download the Card")
	public void clickOnDownloadCardButton() throws Exception
	{
		new EmergencyCardPage(driver).clickOnDownloadCardButton();
	}
	
	@When("Click on Action, click on Delete menu and click on Yes button")
	public void clickOnDeleteButton() throws Exception
	{
		new EmergencyCardPage(driver).clickOnDeleteCard();
	}
	
	@Then ("Emergency Card deleted alert should show")
	public void validateAlert()
	{
		new EmergencyCardPage(driver).validateDeleteAlert();
	}
	
}
