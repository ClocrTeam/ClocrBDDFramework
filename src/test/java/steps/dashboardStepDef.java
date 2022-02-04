package steps;

import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.DigitalEstatePage;
import pages.LoginPage;
import pages.PersonalinfoPage;
import utilities.DriverManager;

public class dashboardStepDef extends DriverManager{
	
	@When("Enter user name as {string}")
    public void i_enter_email_as(String username) throws InterruptedException {
		new LoginPage(driver).enterUserName(username);
    }

	@And("click on Proceed button")
    public void clickProceed() {
    new LoginPage(driver).clickProceed();   
    }
	
    @And("enter correct {string}")
    public void iEnterPasswordAs(String password) {
        new LoginPage(driver).enterPassword(password);
    }

    @And("Click on Login button")
    public void iLogin() {
        new LoginPage(driver).pressLoginBtn();
    }
    
    @Then("User should be redirected to dashboard page")
    public void nagivateDashboardPage() {
    	new DashboardPage(driver).ClickDashboard();
    }
    
    @Then("User should be redirected to 'Your Digital Estate' page")
    public void navigateDigitalEstatePage() {
    	new DashboardPage(driver).ClickDigitalEstate();
    	Assert.assertEquals( new DigitalEstatePage(driver).getHeaderText(),"Last Update:");
    }

    @Then("User should redirected to 'Digital Vault' page")
    public void navigateDigitalVaultPage() {
    	new DashboardPage(driver).ClickDigitalVault();
    	//Assert.assertEquals("Digital Vault clocr", new DigitalVaultPage(driver).GetPageTitle());
    }
    
    @Then("User should redirected to 'Time Capsule' page")
    public void navigateTimeCapsulePage() {
    	new DashboardPage(driver).ClickTimeCapsule();
    	//Assert.assertEquals("Time Capsule clocr", new TimeCapsulePage(driver).GetPageTitle());
    }
    
    @Then("User should redirected to 'My Contacts' page")
    public void navigateMyContactsPage() {
    	new DashboardPage(driver).ClickMyContacts();
    	//Assert.assertEquals("Contacts",new MyContactsPage(driver).GetHeaderText());
    }
    
    @Then("User creates new emergency card if not created")
    public void createNewEcard() throws Exception {
    	new DashboardPage(driver).createEmergencyCard();
    }
    @When("Click on Update Info of Personal menu")
    public void clickPersonalInfo() throws InterruptedException {
    	new DashboardPage(driver).clickUpdateInfo();
    }
    @Then("User should redirects to Personal workflow page")
    public void validatePageHeader() throws InterruptedException {
    	new PersonalinfoPage(driver).validatePageHeader();
    }
}
