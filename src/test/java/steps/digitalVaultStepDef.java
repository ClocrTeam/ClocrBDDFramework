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
	
	@Then("Create sub folder inside new_folder {string}")
	public void createSubFolderInNewFolder(String sub_folder_name) {
		new DigitalVaultPage(driver).createSubFolderInNewFolder(sub_folder_name);
	}
	
	@When("Upload document to sub folder")
	public void uploadDocumentToSubFolder() throws InterruptedException {
		new DigitalVaultPage(driver).uploadDocumentToSubFolder();
	}
	@Then("Add Notes to sub folder {string}")
	public void addNotesToSubFolder(String notes) throws InterruptedException {
		new DigitalVaultPage(driver).addNotesToSubFolder(notes); 
	}
	@When("Share sub_folder documents")
	public void shareSubFolderDocuments() throws InterruptedException {
		new DigitalVaultPage(driver).shareSubFolderDocuments();
	}
	
	@Then("Unshare sub_folder documents")
	public void unShareSubFolderDocuments() {
		new DigitalVaultPage(driver).unShareSubFolderDocuments();
	}
	
	@When("Make document emergency access of sub folder")
	public void makeDocumentEmergencyAccessSubFolder() throws InterruptedException {
		new DigitalVaultPage(driver).makeDocumentEmergencyAccessSubFolder();
	}
	
	@Then("Delete folder sub folder")
	public void deleteFolderSubFolder() {
		new DigitalVaultPage(driver).deleteFolderSubFolder();
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
	public void uploadDocumentsToIdDocuments() throws InterruptedException {
		new DigitalVaultPage(driver).uploadDocumentsToIdDocuments();
	}
	
	@When("Make Document Emergency Access of Id Documents")
	public void makeDocumentEmergencyAccessIdDocuments() throws InterruptedException {
		new DigitalVaultPage(driver).makeDocumentEmergencyAccessIdDocuments();
	}
	
	@Then("Add Notes to ID documents file {string}")
	public void addNotesIdDocumentsFile(String note) throws InterruptedException {
		new DigitalVaultPage(driver).addNotesToIdDocumentsFile(note);
	}
	
	@When("Download file inside ID documents")
	public void downloadFileInsideIdDocuments() throws InterruptedException {
		new DigitalVaultPage(driver).downloadFileInsideIdDocuments();
	}
	
	
	@Then("Delete uploaded document from ID documents folder")
	public void deleteUploadedDocumentsIdDocuments() throws InterruptedException {
		new DigitalVaultPage(driver).deleteUploadedDocumentsIdDocuments();
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
