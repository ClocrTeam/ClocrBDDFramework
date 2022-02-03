package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.DigitalVaultPage;
import utilities.DriverManager;

public class digitalVaultStepDef extends DriverManager {
	
	@When("Click on Digital Vault menu")
    public void clickDigitalVault()  {
		new DashboardPage(driver).clickDigitalVault();
    }
	
	@Then("User should redirects to Digital Vault page")
    public void redirectToDigialVaultPage()  {
		new DigitalVaultPage(driver).validateHeader();
    }
	
	@When("Click Create folder button")
	public void clickCreateFolder()  {
		new DigitalVaultPage(driver).clickCreateFolder();
	}
	
	@Then("Creating folder popup should be open")
	public void createFolderOpen()  {
		new DigitalVaultPage(driver).validateCreateFolderPopup();
	}
	
	@When("Choose root option")
	public void chooseRootRadio()  {
		new DigitalVaultPage(driver).chooseRootRadio();
	}
	
	@When("Enter name of the folder {string}")
	public void enterNameOfFolder(String folder_name)  {
		new DigitalVaultPage(driver).enterNameOfFolder(folder_name);
	}
	
	@When("Click Create button")
	public void clickCreateFolderSubmit()  {
		new DigitalVaultPage(driver).clickCreateFolderSubmit();
	}
	
	@Then("Folder created alert should show")
	public void validateFolderCreatedAlert()  {
		new DigitalVaultPage(driver).validateFolderCreatedAlert();
	}
	
	@When("Click on Edit folder")
	public void clickOnEditFolderIcon() throws InterruptedException  {
		new DigitalVaultPage(driver).clickOnEditFolderIcon();
	}
	
	@Then("Edit menu should open")
	public void validateEditMenu() throws InterruptedException  {
		new DigitalVaultPage(driver).validateEditMenu();
	}
	
	@When("Click on Rename")
	public void clickOnRenameLink() throws InterruptedException  {
		new DigitalVaultPage(driver).clickOnRenameLink();
	}
	
	@Then("Rename my folder pop up should open")
	public void validateRenamePopup() throws InterruptedException{
		new DigitalVaultPage(driver).validateRenamePopup();
	}
	
	@When("Rename name of the folder {string}")
	public void renameFolder(String rename_folder) throws InterruptedException {
		new DigitalVaultPage(driver).renameFolder(rename_folder);
	}
	
	@Then("Rename folder alert should show")
	public void validateRenameAlert()  {
		new DigitalVaultPage(driver).validateRenameAlert();
	}
	
	@When("Click on My Docs icon")
	public void clickOnMyDocsIcon()  {
		new DigitalVaultPage(driver).clickOnMyDocsIcon();
	}
	
	@Then("Open expanded My Docs folders")
	public void validateMyDocsExpand() throws InterruptedException {
		new DigitalVaultPage(driver).validateMyDocsExpand();	
	}
	
	@When("Click on Edit of ID documents folder")
	public void clickOnEditIdDocuments() throws InterruptedException {
		new DigitalVaultPage(driver).clickOnEditIdDocuments();	
	}
	
	@Then("ID documents edit menu should open")
	public void validateIdDocumentsMenu() {
		new DigitalVaultPage(driver).validateIdDocumentsMenu();	
	}
	
	@When("Click on upload document of ID documents")
	public void clickOnUploadDocumentOfIdDocuments () {
		new DigitalVaultPage(driver).clickOnUploadDocumentsOfIdDocuments();
	}
	
	@Then("Add document pop up should open")
	public void validateAddDocumentPopUpIdDocuments() {
		new DigitalVaultPage(driver).validateAddDocumentsPopUpIdDocuments();
	}
	
	@When("Click on Browse of ID documents")
	public void clickOnBrowseIdDocuments(){
		String filePath = "C:/Users/Amalsan/Downloads/Adv.xlsx";
		new DigitalVaultPage(driver).uploadfile(filePath);
	}
	
	@When("Click on Edit of ID documents folder for notes")
	public void clickOnEditIdDocumentsForNotes() throws InterruptedException {
		Thread.sleep(2000);
		new DigitalVaultPage(driver).clickOnEditIdDocuments();	
	}
	
	@Then("ID documents edit menu should open for notes")
	public void validateIdDocumentsMenuForNotes() {
		new DigitalVaultPage(driver).validateIdDocumentsMenu();	
	}
	
	
	@When("Click on Notes of ID documents folder")
	public void clickOnNotesIdDocuments() throws InterruptedException {
		new DigitalVaultPage(driver).clickOnNotesIdDocuments();
		
	}
	@Then("Notes pop up should open")
	public void validateNotesPopUpIdDocuments() throws InterruptedException {
		new DigitalVaultPage(driver).validateNotesPopUpIdDocuments();
	}
	
	@When("Enter notes as {string}")
	public void enterNotesIdDocuments(String notes) throws InterruptedException {
		new DigitalVaultPage(driver).enterNotesIdDocuments(notes);
	}
	
	@Then("Notes updated alert should show")
	public void enterNotesIdDocuments() throws InterruptedException {
		new DigitalVaultPage(driver).notesUpdateAlertIdDocuments();
	}
	
	@When("Click on Share document of ID documents")
	public void clickShareIdDocuments() throws InterruptedException {
		new DigitalVaultPage(driver).clickShareIdDocuments();
	}
	
	@When("ID documents share pop up should open")
	public void validateShareIdDocumentsTitle() throws InterruptedException {
		new DigitalVaultPage(driver).validateShareIdDocumentsTitle();
	}
	
	@When("Choose contact from dropdown for Id Documents")
	public void chooseContactForIdDocuments() throws InterruptedException {
		new DigitalVaultPage(driver).chooseContactForIdDocuments();
	}
	
	@When("Check Upload and Download checkbox for Id Documents")
	public void checkUploadAndDownloadIdDocuments() throws InterruptedException {
		new DigitalVaultPage(driver).checkUploadAndDownloadIdDocuments();
	}
	
	@When("Click Share button ID documents popup")
	public void clickShareBtnIdDocuments() throws InterruptedException {
		new DigitalVaultPage(driver).clickShareBtnIdDocuments();
	}
	
	
	
//	@When("Click on Dashboard icon")
//	public void click_dashboard_icon()  {
//		// Thread.sleep(2000);
//		new DigitalVaultPage(driver).clickDashboard();
//    }
//	
//	@Then("User should redirects to Dashboard page")
//	public void redirect_to_dashboard()  {
//		Thread.sleep(2000);
//		new DashboardPage(driver).validatePageHeader();
//    }
	


}
