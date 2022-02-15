package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.DigitalEstatePage;
import pages.EmergencyCardPage;
import utilities.DriverManager;

public class digitalestateStepDef extends DriverManager {
	
	@When("Click on Digital Estate menu")
    public void clickDigitalEstate()  {
		new DigitalEstatePage(driver).clickDigitalEstate();
    }
	
	@Then("User should redirects to Your Digital Estate page")
    public void redirectToDigialEstatePage()  {
		new DigitalEstatePage(driver).validateHeader();
    }
	
	@When("Click new account button")
	public void clickNewAccount()  {
		new DigitalEstatePage(driver).clickNewAccount();
	}
	
	@Then("Creating account page should be open")
	public void createAccountOpen()  {
		new DigitalEstatePage(driver).validateCreateAccountPage();
	}

	@When("Enter account name {string}")
	public void enterNameOfFolder(String account_name)  {
		new DigitalEstatePage(driver).enterAccountName(account_name);
	}
	
	@When("Enter account user id {string}")
	public void enterAccountUserId(String account_user_id)  {
		new DigitalEstatePage(driver).enterAccountUserId(account_user_id);
	}
	
	@When("Enter password {string}")
	public void enterPassword(String password)  {
		new DigitalEstatePage(driver).enterPassword(password);
	}
	
	@When("Enter url {string}")
	public void enterUrl(String url)  {
		new DigitalEstatePage(driver).enterUrl(url);
	}
	@When("Enter notes {string}")
	public void enterNotes(String notes)  {
		new DigitalEstatePage(driver).enterNotes(notes);
	}
	@When("Click create button")
	public void clickCreate()  {
		new DigitalEstatePage(driver).clickCreate();
	}
//	@Then("Account created alert should show")
//	public void validateAccountCreatedAlert()  {
//		new DigitalEstatePage(driver).validateAccountCreatedAlert();
//	}
//	@When("Click on menu button")
//	public void clickmenubtn()  {
//		new DigitalEstatePage(driver).clickMenubtn();
//	}
//	@When("Click on edit")
//	public void clickEdit()  {
//		new DigitalEstatePage(driver).clickEdit();
//	}
//	@Then("Edit account menu should be open")
//	public void editaccount()  {
//		new DigitalEstatePage(driver).validateEditAccount();
//	}
//	@When("Click on update button")
//	public void clickUpdate()  {
//		new DigitalEstatePage(driver).clickUpdate();
//	}
	@When("Click on accounts wizard button")
	public void clickAccountsWizard()  {
		new DigitalEstatePage(driver).clickAccountsWizard();
	}
	@Then("Check list page should be open")
	public void checkListOpen()  {
		new DigitalEstatePage(driver).validateCheckListPage();
	}
	@When("Click on travel menu")
    public void clicktravel()  {
		new DigitalEstatePage(driver).clickTravel();
    }
//	@When("Choose checkbox option")
//	public void chooseCheckbox()  {
//		new DigitalEstatePage(driver).chooseCheckbox();
//	}
	@When("Click on save button")
	public void clickSavebtn()  {
		new DigitalEstatePage(driver).clickSavebtn();
	}
   }