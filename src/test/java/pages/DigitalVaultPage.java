package pages;

import java.io.File;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Log;

public class DigitalVaultPage extends BasePage {
private WebDriver driver;
	public DigitalVaultPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//span[@class='main-app-title']")
	private WebElement pageHeader;
	
	@FindBy(tagName = "title")
	private WebElement pageTitle;
	
	@FindBy(xpath = "//span[normalize-space()='Dashboard']")
	private WebElement dashboard;
	
	
	@FindBy(xpath = "//button[normalize-space()='Create Folder']")
	private WebElement createFolder;
	
	@FindBy(xpath = "//h5[@class='modal-title']")
	private WebElement createFolderTitle;
	
	@FindBy(xpath = "//input[@id='inlineRadio1']")
	private WebElement rootRadio;
	
	@FindBy(xpath = "//input[@id='inlineRadio2']")
	private WebElement subFolderRadio;
	
	@FindBy(xpath = "//label[contains(text(),'Select the target folder')]/preceding::p-dropdown/child::div[1]")
	private WebElement subFolderTargetDropdown;
	
	@FindBy(xpath = "//p-dropdownitem[10]//child::li")
	private WebElement subFolderNewFolderOption;
	
	@FindBy(xpath = "//input[@name='folderName']")
	private WebElement folderNameText;
	
	@FindBy(xpath = "//button[normalize-space()='Create']")
	private WebElement createFolderSubmitbtn;
	
	@FindBy(xpath = "//div[contains(text(), 'Folder created')]") 
	private WebElement folderCreateAlert;
	
	@FindBy(xpath = "//div[contains(text(), 'Folder successfully added')]")
	private WebElement subFolderCreateAlert;
	
	@FindBy(xpath = "//span[normalize-space()='new_folder']//preceding::div[1]")
	private WebElement newFolderImageIcon;
	
	@FindBy(xpath = "//span[contains(text(),'sub_folder')]")
	private WebElement subFolderImageIcon;
	
	@FindBy(xpath = "//span[text()='sub_folder']//ancestor::div[4]/descendant::clocr-icon[@icon='menu']")
	private WebElement editIconOfSubFolder;
	
	@FindBy(xpath = "//span[text()='new_folder']//ancestor::div[4]/descendant::clocr-icon[@icon='menu']")
	private WebElement editIconOfNewFolder;
	
	
	@FindBy(xpath = "//div[1]//a[1]//span[contains(text(),'Delete')]")
	private WebElement deleteMenuOfNewFolder;
	
	@FindBy(xpath = "//h5[contains(text(),'Warning')]")
	private WebElement deletePopupOfNewFolderTitle;
	
	
	@FindBy(xpath = "//button[contains(text(),'Delete')]")
	private WebElement deletePopupOfNewFolderBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Folder removed')]")
	private WebElement deleteNewFolderAlert;
	
	
	@FindBy(xpath = "//span[text()='My Kids']//ancestor::div[4]/descendant::clocr-icon[@icon='menu']")
	private WebElement folderEditIcon;
	
	@FindBy(xpath = "//span[text()='rename_folder']//ancestor::div[4]/descendant::clocr-icon[@icon='menu']")
	private WebElement renameFolderIcon;
	
	@FindBy(xpath = "//div[1]//a[1]//span[contains(text(),'Rename')]")
	private WebElement editMenu;
	
	@FindBy(xpath = "//h5[contains(text(),'Rename')]")
	private WebElement renameFolderPopupTitle;
	
	@FindBy(xpath = "//input[@id='lastname-lname']")
	private WebElement renameFolderText;
	
	@FindBy(xpath = "//div[contains(text(), 'Folder successfully updated')]")
	private WebElement folderRenameAlert;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement renameSaveBtn;
	
	@FindBy(xpath = "//span[normalize-space()='My Docs']//preceding::div[1]")
	private WebElement myDocsIcon;
	
	@FindBy(xpath = "//span[normalize-space()='ID Documents']//preceding::div[1]//preceding::div[1]")
	private WebElement idDocumentsFolder;
	
	@FindBy(xpath = "//span[text()='ID Documents']/ancestor::div[4]/descendant::clocr-icon[@icon='menu']")
	private WebElement idDocumentsEdit;
	
	@FindBy(xpath = "//span[normalize-space()='Upload Document']")
	private WebElement uploadToIdDocuments;
	
	@FindBy(xpath = "//h5[@class='modal-title']")
	private WebElement uploadPopUpTitle;
	
	@FindBy(xpath = "//input[@type='file']")
	private WebElement browseBtnOfIdDocuments;
	
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	private WebElement saveIdDocumentBtn;
	
	
	@FindBy(xpath = "//span[text()='ID Documents']/ancestor::div[4]/descendant::clocr-icon[@icon='dv-folder']/child::img")
	private WebElement idDocumentsFolderIcon;
	
	@FindBy(xpath = "//span[text()='sub_folder']/ancestor::div[4]/descendant::clocr-icon[@icon='dv-folder']/child::img")
	private WebElement subFolderIcon;
	
	@FindBy(xpath = "//img[@src='../../assets/new/icons/file.svg']")
	private WebElement fileIconIdDocuments;
	
	@FindBy(xpath = "//span[contains(text(),'Adv.xlsx')]/ancestor::div[2]/descendant::span[contains(text(),'Emergency Access')]")
	private WebElement emergencyAccessboxIdDocumentTitle;
	
	@FindBy(xpath = "//span[contains(text(),'Adv.xlsx')]/ancestor::div[2]/descendant::div[@role='checkbox']")
	private WebElement emergencyAccessBoxIdDocument;
	
	
	@FindBy(xpath = "//div[contains(text(),'Document successfully updated')]")
	private WebElement emergencyAccessIdDocumentAlert;
	
	@FindBy(xpath = "//span[contains(text(),'Adv.xlsx')]//ancestor::div[4]/descendant::clocr-icon[@icon='menu']")
	private WebElement fileEditIdDocuments;
	
	@FindBy(xpath = "//span[contains(text(),'Delete Document')]")
	private WebElement fileDeleteOptionIdDocuments;
	
	@FindBy(xpath = "//span[contains(text(),'Notes')]")
	private WebElement fileNotesOptionIdDocuments;
	
	@FindBy(xpath = "//span[contains(text(),'Download')]")
	private WebElement fileDownloadOptionIdDocuments;
	
	@FindBy(xpath = "//h5[contains(text(),'Warning')]")
	private WebElement fileDeletePopUpWarningIdDocuments;
	
	@FindBy(xpath = "//button[contains(text(),'Delete')]")
	private WebElement deleteFilePopUpIdDocumentsBtn;
	
	@FindBy(xpath = "//span[text()='My Docs']//ancestor::div[1]//preceding::span[1]")
	private WebElement fileVaultLink;
	
	@FindBy(xpath = "//span[text()='new_folder']")
	private WebElement newFolderLink;
	
	@FindBy(xpath = "//span[normalize-space()='Notes']")
	private WebElement notesIdDocument;
	
	@FindBy(xpath = "//h5[contains(text(),'Notes')]")
	private WebElement notesPopUpTitle;
	
	@FindBy(xpath = "//textarea[@id='notes']")
	private WebElement notesTextareaIdDocuments;
	
	@FindBy(xpath = "//span[normalize-space()='Share']")
	private WebElement shareIdDocuments;
	
	@FindBy(xpath = "//h5[contains(text(),'ID Documents')]")
	private WebElement shareIdDocumentsTitle;
	
	@FindBy(xpath ="//h5[contains(text(),'sub_folder')]")
	private WebElement shareSubFolderTitle;
	
	@FindBy(xpath = "//label[contains(text(),'Select')]/preceding::p-dropdown/child::div[1]")
	private WebElement shareIdDocumentsDropDown;
	
	@FindBy(xpath = "//p-dropdownitem[1]//child::li[1]")
	private WebElement shareIdDocumentsContact;
	
	@FindBy(xpath = "//label[contains(text(),'Download')]//preceding::p-checkbox[1]//descendant::div[@role='checkbox']")
	private WebElement shareDownloadBoxIdDocuments;
	
	@FindBy(xpath = "//label[contains(text(),'Upload')]//preceding::p-checkbox[1]//descendant::div[@role='checkbox']")
	private WebElement shareUploadBoxIdDocuments;
	
	@FindBy(xpath = "//button[contains(text(),'Share')]")
	private WebElement sharePopUpBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Shared to')]")
	private WebElement shareIdDocumentsAlert;
	
	@FindBy(xpath = "//h5[contains(text(),'ID Documents')]//following-sibling::button")
	private WebElement sharePopUpCloseBtn;
	
	@FindBy(xpath = "//h5[contains(text(),'sub_folder')]//following-sibling::button")
	private WebElement sharePopUpSubFolderCloseBtn;
	
	@FindBy(xpath = "//span[contains(text(),'Sai Clocr')]//ancestor::app-shared-contacts-columns//ancestor::div[1]//ancestor::td//following::td[2]//descendant::clocr-icon")
	private WebElement deleteSharedIdDocumentsIcon;
	
	@FindBy(xpath = "//h4[contains(text(),'Confirm')]")
	private WebElement deleteShareContactPopUpTitle;
	
	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	private WebElement yesBtnDeleteContactIdDocuments;
	
	@FindBy(xpath = "//div[contains(text(),'Removed successfully')]")
	private WebElement deleteShareContactAlertIdDocuments;
	
	@FindBy(xpath = "//img[@src='../../assets/new/icons/list.svg']")
	private WebElement listViewIcon;
	
	@FindBy(xpath = "//th[contains(text(),'Notes')]")
	private WebElement listViewValidateTxt;
	
	
	public String getCreateFolderTitleText() {
		return getText(createFolderTitle);
	}
	
	public String GetHeaderText() {
		return getText(pageHeader);
	}
	public String GetPageTitle() {
		return getText(pageTitle);
	}
	public DigitalVaultPage validateHeader() {
		
		if(isDisplayed(pageHeader)) {
			Log.info("Validate Digital Vault page header");
		}
		else {
			Log.info("Not Validate Digital Vault page header");
			
		}
		
		return this;
		
	}
	public DashboardPage clickDashboard() {
		click(dashboard);
		return new DashboardPage(driver);
	}
	
	
	public void checkElementIsDisplayed(String str, WebElement el) {
		if(isDisplayed(el)) {
			Log.info("Validate  " + str);
		}
		else
			Log.info("Not Validate  " + str);
	}
	
	
	
	public DigitalVaultPage createFolderNewFolder(String folder_name) {
		click(createFolder);
		checkElementIsDisplayed("title of create folder",createFolderTitle);
		click(rootRadio);
		sendKeys(folderNameText, folder_name);
		click(createFolderSubmitbtn);
		checkElementIsDisplayed("create folder alert",folderCreateAlert);
		return this;
		
		
	}
	
	public DigitalVaultPage createSubFolderInNewFolder(String sub_folder_name) {
		click(createFolder);
		checkElementIsDisplayed("title of create folder",createFolderTitle);
		click(subFolderRadio);
		click(subFolderTargetDropdown);
		click(subFolderNewFolderOption);
		sendKeys(folderNameText, sub_folder_name);
		click(createFolderSubmitbtn);
		executeJavaScript("window.location.reload()");
//		checkElementIsDisplayed("create sub folder alert",subFolderCreateAlert);
		return this;
		
	}
	
	public DigitalVaultPage uploadDocumentToSubFolder() throws InterruptedException {
		executeJavaScript("window.location.reload()");
		click(newFolderImageIcon);
		checkElementIsDisplayed("sub folder exits inside new_folder",subFolderImageIcon);
		click(editIconOfSubFolder);
		checkElementIsDisplayed("Upload option of sub folder", uploadToIdDocuments);
		click(uploadToIdDocuments);
		checkElementIsDisplayed("Add Document popup sub folder", uploadPopUpTitle);
		String showInput = "document.getElementsByTagName('input')[1].style.display = 'block'";
		executeJavaScript(showInput);
		File file = new File("src/test/resources/data/Adv.xlsx");
		sendKeys(browseBtnOfIdDocuments,file.getAbsolutePath());
		click(saveIdDocumentBtn);
		Thread.sleep(5000);
		return this;
		
	}
	

	public DigitalVaultPage addNotesToSubFolder(String note) throws InterruptedException {
		Thread.sleep(6000);
		clickByJavaScript(editIconOfSubFolder);
		checkElementIsDisplayed("notes option popup sub folder", fileNotesOptionIdDocuments);
		click(fileNotesOptionIdDocuments);
		checkElementIsDisplayed("Notes popup sub folder", notesPopUpTitle);
		clear(notesTextareaIdDocuments);
		sendKeys(notesTextareaIdDocuments, note);
		click(saveIdDocumentBtn);
		return this;
		
	}

	public DigitalVaultPage shareSubFolderDocuments() throws InterruptedException {
		Thread.sleep(2000);
		clickByJavaScript(editIconOfSubFolder);
		checkElementIsDisplayed("share option popup sub folder", shareIdDocuments);
		click(shareIdDocuments);
		checkElementIsDisplayed("share title popup of sub folder", shareSubFolderTitle);
		click(shareIdDocumentsDropDown);
		click(shareIdDocumentsContact);
		click(shareDownloadBoxIdDocuments);
		click(shareUploadBoxIdDocuments);
		click(sharePopUpBtn);
//		checkElementIsDisplayed("share contact alert", shareIdDocumentsAlert);
		click(sharePopUpSubFolderCloseBtn);
		return this;
		
	}
	public DigitalVaultPage unShareSubFolderDocuments() {
		clickByJavaScript(editIconOfSubFolder);
		checkElementIsDisplayed("share option popup sub folder", shareIdDocuments);
		click(shareIdDocuments);
		checkElementIsDisplayed("share title popup of sub folder", shareSubFolderTitle);
		click(deleteSharedIdDocumentsIcon);
		checkElementIsDisplayed("Delete share contact popup", deleteShareContactPopUpTitle);
		click(yesBtnDeleteContactIdDocuments);
		click(sharePopUpSubFolderCloseBtn);
		return this;
		
	}
	

	public DigitalVaultPage makeDocumentEmergencyAccessSubFolder() throws InterruptedException {
		Thread.sleep(3000);
		click(subFolderIcon);
		checkElementIsDisplayed("file inside have emergency access ID documents", emergencyAccessboxIdDocumentTitle);
		click(emergencyAccessBoxIdDocument);
		checkElementIsDisplayed(" sub folder document file emergency access update alert", emergencyAccessIdDocumentAlert);
		click(newFolderLink);
		return this;
		
	}
	
	public DigitalVaultPage deleteFolderSubFolder() {
		clickByJavaScript(editIconOfSubFolder);
		checkElementIsDisplayed("edit of new folder",deleteMenuOfNewFolder);
		click(deleteMenuOfNewFolder);
		checkElementIsDisplayed("delete pop up of new folder", deletePopupOfNewFolderTitle);
		click(deletePopupOfNewFolderBtn);
		return this;
		
	}

	
	public DigitalVaultPage deleteFolderNewFolder(String folder_name) {
		executeJavaScript("window.location.reload()");
		clickByJavaScript(editIconOfNewFolder);
		checkElementIsDisplayed("edit of new folder",editMenu);
		click(deleteMenuOfNewFolder);
		checkElementIsDisplayed("delete pop up of new folder", deletePopupOfNewFolderTitle);
		click(deletePopupOfNewFolderBtn);
//		checkElementIsDisplayed("delete folder alert of new folder", deleteNewFolderAlert);
		return this;
		
	}
	
	public DigitalVaultPage renameMyKidsFolder(String folder_name) {
		clickByJavaScript(folderEditIcon);
		checkElementIsDisplayed("edit of My Kids folder",editMenu);
		click(editMenu);
		checkElementIsDisplayed("title of rename My Kids", renameFolderPopupTitle);
		sendKeys(renameFolderText, folder_name);
		click(renameSaveBtn);
//		checkElementIsDisplayed("rename alert of My Kids", folderRenameAlert);
		return this;
		
	}
	
	public DigitalVaultPage rollbackToMyKidsFolder(String folder_name) {
		clickByJavaScript(renameFolderIcon);
		checkElementIsDisplayed("edit of rename folder",editMenu);
		click(editMenu);
		checkElementIsDisplayed("title of rename folder", renameFolderPopupTitle);
		sendKeys(renameFolderText, folder_name);
		click(renameSaveBtn);
//		checkElementIsDisplayed("rename alert of rename folder", folderRenameAlert);
		return this;
		
	}
	
	public DigitalVaultPage uploadDocumentsToIdDocuments() throws InterruptedException {
		executeJavaScript("window.location.reload()");
		click(myDocsIcon);
		checkElementIsDisplayed("ID documents folder", idDocumentsFolder);
		click(idDocumentsEdit);
		checkElementIsDisplayed("Upload option of ID documents", uploadToIdDocuments);
		click(uploadToIdDocuments);
		checkElementIsDisplayed("Add Document popup ID documents", uploadPopUpTitle);
		String showInput = "document.getElementsByTagName('input')[1].style.display = 'block'";
		executeJavaScript(showInput);
		File file = new File("src/test/resources/data/Adv.xlsx");
		sendKeys(browseBtnOfIdDocuments,file.getAbsolutePath());
		click(saveIdDocumentBtn);
		return this;
		
	}
	
	public DigitalVaultPage makeDocumentEmergencyAccessIdDocuments() throws InterruptedException {
		Thread.sleep(3000);
		click(idDocumentsFolderIcon);
		checkElementIsDisplayed("file inside have emergency access ID documents", emergencyAccessboxIdDocumentTitle);
		click(emergencyAccessBoxIdDocument);
		checkElementIsDisplayed("Id Document file emergency access update alert", emergencyAccessIdDocumentAlert);
		click(fileVaultLink);
		return this;
	}
	
	public DigitalVaultPage addNotesToIdDocumentsFile(String note) {
		click(myDocsIcon);
		checkElementIsDisplayed("ID documents folder", idDocumentsFolder);
		click(idDocumentsFolderIcon);
		checkElementIsDisplayed("file icon inside ID documents", fileIconIdDocuments);
		click(fileEditIdDocuments);
		checkElementIsDisplayed("notes option popup Id Documents", fileNotesOptionIdDocuments);
		click(fileNotesOptionIdDocuments);
		checkElementIsDisplayed("Notes popup ID documents", notesPopUpTitle);
		clear(notesTextareaIdDocuments);
		sendKeys(notesTextareaIdDocuments, note);
		click(saveIdDocumentBtn);
		click(fileVaultLink);
//		checkElementIsDisplayed("Notes update alert of Id Documents", folderRenameAlert);
		return this;
		
	}
	

	public DigitalVaultPage downloadFileInsideIdDocuments() {
		click(myDocsIcon);
		checkElementIsDisplayed("ID documents folder", idDocumentsFolder);
		click(idDocumentsFolderIcon);
		checkElementIsDisplayed("file icon inside ID documents", fileIconIdDocuments);
		click(fileEditIdDocuments);
		checkElementIsDisplayed("download option popup Id Documents", fileDownloadOptionIdDocuments);
		click(fileDownloadOptionIdDocuments);
		click(fileVaultLink);
		return this;
		
	}


	

	
	public DigitalVaultPage deleteUploadedDocumentsIdDocuments() throws InterruptedException {
		executeJavaScript("window.location.reload()");
		click(myDocsIcon);
		checkElementIsDisplayed("ID documents folder", idDocumentsFolder);
		click(idDocumentsFolderIcon);
		checkElementIsDisplayed("file icon inside ID documents", fileIconIdDocuments);
		click(fileEditIdDocuments);
		checkElementIsDisplayed("delete edit option popup Id Documents", fileDeleteOptionIdDocuments);
		click(fileDeleteOptionIdDocuments);
		checkElementIsDisplayed("delete file warning Id Documents", fileDeletePopUpWarningIdDocuments);
		click(deleteFilePopUpIdDocumentsBtn);
		click(fileVaultLink);
		return this;
	}

	
	public DigitalVaultPage addNotesToIdDocuments(String note) {
		click(myDocsIcon);
		checkElementIsDisplayed("ID documents folder", idDocumentsFolder);
		click(idDocumentsEdit);
		checkElementIsDisplayed("Notes option of Id Documents", notesIdDocument);
		click(notesIdDocument);
		checkElementIsDisplayed("Notes popup ID documents", notesPopUpTitle);
		clear(notesTextareaIdDocuments);
		sendKeys(notesTextareaIdDocuments, note);
		click(saveIdDocumentBtn);
//		checkElementIsDisplayed("Notes update alert of Id Documents", folderRenameAlert);
		return this;
		
	}
	
	public DigitalVaultPage shareIdDocumentsFolder() throws InterruptedException {
		Thread.sleep(20000);
		click(idDocumentsEdit);
		checkElementIsDisplayed("Notes option of Id Documents", shareIdDocuments);
		click(shareIdDocuments);
		checkElementIsDisplayed("Share popup of ID Documents", shareIdDocumentsTitle);
		click(shareIdDocumentsDropDown);
		click(shareIdDocumentsContact);
		click(shareDownloadBoxIdDocuments);
		click(shareUploadBoxIdDocuments);
		click(sharePopUpBtn);
//		checkElementIsDisplayed("share contact alert", shareIdDocumentsAlert);
		click(sharePopUpCloseBtn);
		return this;
		
	}
	
	public DigitalVaultPage unShareIdDocumentsFolder() throws InterruptedException {
		Thread.sleep(20000);
		click(idDocumentsEdit);
		checkElementIsDisplayed("Notes option of Id Documents", shareIdDocuments);
		click(shareIdDocuments);
		checkElementIsDisplayed("Share popup of ID Documents", shareIdDocumentsTitle);
		click(deleteSharedIdDocumentsIcon);
		checkElementIsDisplayed("Delete share contact popup", deleteShareContactPopUpTitle);
		click(yesBtnDeleteContactIdDocuments);
		click(sharePopUpCloseBtn);
//		checkElementIsDisplayed("Delete share contact alert of ID Documents", deleteShareContactAlertIdDocuments);
		return this;
		
	}

	public DigitalVaultPage listViewOfDigitalVault() {
		checkElementIsDisplayed("list view icon in DV", listViewIcon);
		click(listViewIcon);
		checkElementIsDisplayed("list view of DV", listViewValidateTxt);
		return this;		
	}






	
	
}
