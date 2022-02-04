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
	
	@When("Create folder new folder {string}")
	public void createFolderNewFolder(String folder_name) {
		new DigitalVaultPage(driver).createFolderNewFolder(folder_name);
	}
	
	@Then("Delete folder new folder {string}")
	public void deleteFolderNewFolder(String folder_name) {
		new DigitalVaultPage(driver).deleteFolderNewFolder(folder_name);
	}
	
	@When("Rename My Kids folder to {string}")
	public void renameMyKidsFolder(String folder_name) {
		new DigitalVaultPage(driver).renameMyKidsFolder(folder_name);
	}
	
	@Then("Rollback to My Kids folder {string}")
	public void rollbackToMyKidsFolder(String folder_name) {
		new DigitalVaultPage(driver).rollbackToMyKidsFolder(folder_name);
	}
	
	@When("Upload documents to ID documents folder")
	public void uploadDocumentsToIdDocuments() {
		new DigitalVaultPage(driver).uploadDocumentsToIdDocuments();
	}
	
	@Then("Add Notes to ID documents folder {string}")
	public void addNotesToIdDocuments(String note) {
		new DigitalVaultPage(driver).addNotesToIdDocuments(note);
	}
	
	@When("Share ID documents folder")
	public void shareIdDocumentsFolder() throws InterruptedException {
		new DigitalVaultPage(driver).shareIdDocumentsFolder();
	}
	
	@Then("UnShare ID documents folder")
	public void unShareIdDocumentsFolder() throws InterruptedException {
		new DigitalVaultPage(driver).unShareIdDocumentsFolder();
	}
	


}
