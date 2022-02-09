package pages;

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
	
	@FindBy(xpath = "//input[@name='folderName']")
	private WebElement folderNameText;
	
	@FindBy(xpath = "//button[normalize-space()='Create']")
	private WebElement createFolderSubmitbtn;
	
	@FindBy(xpath = "//div[contains(text(), 'Folder created')]") 
	private WebElement folderCreateAlert;
	
	
	@FindBy(xpath = "//span[text()='My Kids']//ancestor::div[4]/descendant::clocr-icon[@icon='menu']")
	private WebElement folderEditIcon;
	
	@FindBy(xpath = "//div[1]//a[1]//span[contains(text(),'Rename')]")
	private WebElement editMenu;
	
	@FindBy(xpath = "//h5[contains(text(),'Rename My Kids')]")
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
	
	@FindBy(xpath = "//span[normalize-space()='Notes']")
	private WebElement notesIdDocument;
	
	
	@FindBy(xpath = "//h5[contains(text(),'Notes')]")
	private WebElement notesPopUpTitle;
	
	@FindBy(xpath = "//textarea[@id='notes']")
	private WebElement notesTextareaIdDocuments;
	
	@FindBy(xpath = "//span[normalize-space()='Share']")
	private WebElement shareIdDocuments;
	
	@FindBy(xpath = "//h5[contains(text(),'ID Documents')]")
	private WebElement shareIdocumentsTitle;
	
	@FindBy(xpath = "//label[contains(text(),'Select')]/preceding::p-dropdown/child::div[1]")
	private WebElement shareIdDocumentsDropDown;
	
	@FindBy(xpath = "//p-dropdownitem[1]//child::li[1]")
	private WebElement shareIdDocumentsContact;
	
	@FindBy(xpath = "//label[contains(text(),'Download')]//preceding::p-checkbox//descendant::input[@id='Download']")
	private WebElement shareDownloadBoxIdDocuments;
	
	@FindBy(xpath = "//label[contains(text(),'Upload')]//preceding::p-checkbox[1]/descendant::input[@id='Upload']")
	private WebElement shareUploadBoxIdDocuments;
	
	@FindBy(xpath = "//button[contains(text(),'Share')]")
	private WebElement sharePopUpBtn;
	
	
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
	
	public DigitalVaultPage clickCreateFolder() {
		click(createFolder);
		return this;
		
	}
	public DigitalVaultPage validateCreateFolderPopup() {
		
		if(isDisplayed(createFolderTitle)) {
			Log.info("Validate the title of create folder");
		}
		else
			Log.info("Not Validate the title of create folder");
		
	 return this;
	}

	public DigitalVaultPage chooseRootRadio() {
		click(rootRadio);
		return this;
		
	}

	public DigitalVaultPage enterNameOfFolder(String folder_name) {
		sendKeys(folderNameText, folder_name + Integer.toString((int)(Math.random() * 100)));
		return this;
		
	}

	public DigitalVaultPage clickCreateFolderSubmit() {
		click(createFolderSubmitbtn);
		return this;
		
	}


	public DigitalVaultPage validateFolderCreatedAlert() {
		
		if(isDisplayed(folderCreateAlert)) {
			Log.info("Validate the title of create folder");
		}
		else
			Log.info("Not Validate the title of create folder");
		
	 return this;
	}

	public DigitalVaultPage clickOnEditFolderIcon() {
		clickByJavaScript(folderEditIcon);
		return this;
		
	}

	public DigitalVaultPage validateEditMenu() {
		if(isDisplayed(editMenu)) {
			Log.info("Validate the title of create folder");
		}
		else
			Log.info("Not Validate the title of create folder");
		
	 return this;
		
	}

	public DigitalVaultPage clickOnRenameLink() {
		click(editMenu);
		return this;
		
	}

	public  DigitalVaultPage validateRenamePopup() {
		
		if(isDisplayed(renameFolderPopupTitle)) {
			Log.info("Validate the title of rename folder");
		}
		else
			Log.info("Not Validate the title of rename folder");
		
	 return this;
		
	}

	public DigitalVaultPage renameFolder(String rename_folder) {
		sendKeys(renameFolderText, rename_folder + Integer.toString((int)(Math.random() * 100)));
		click(renameSaveBtn);
		return this;
		
	}

	public DigitalVaultPage validateRenameAlert() {
		
		if(isDisplayed(folderRenameAlert)) {
			Log.info("Validate the alert rename folder");
		}
		else
			Log.info("Not Validate the alert rename folder");
		
	 return this;
		
	}

	public DigitalVaultPage clickOnMyDocsIcon() {
		 click(myDocsIcon);
         return this;
		
	}

	public DigitalVaultPage validateMyDocsExpand() {

		if(isDisplayed(idDocumentsFolder)) {
			Log.info("Validate the edit of ID Documents");
		}
		else
			Log.info("Not Validate the edit of ID Documents");
		
          return this;
		
	}

	public DigitalVaultPage clickOnEditIdDocuments() {
		 click(idDocumentsEdit);
         return this;
		
	}

	public DigitalVaultPage validateIdDocumentsMenu() {
		
		if(isDisplayed(uploadToIdDocuments)) {
			Log.info("Validate the upload option of ID Documents");
		}
		else
			Log.info("Not Validate the upload option of ID Documents");
         return this;
		
	}

	public DigitalVaultPage clickOnUploadDocumentsOfIdDocuments() {
		 click(uploadToIdDocuments);
         return this;
		
	}

	public DigitalVaultPage validateAddDocumentsPopUpIdDocuments() {
		
		if(isDisplayed(uploadPopUpTitle)) {
			Log.info("Validate the Add Document Popup of ID Documents");
		}
		else
			Log.info("Not Validate the Add Document Popup of ID Documents");
         return this;
		
	}

	public DigitalVaultPage uploadfile(String path) {
		String showInput = "document.getElementsByTagName('input')[1].style.display = 'block'";
		executeJavaScript(showInput);
		sendKeys(browseBtnOfIdDocuments, path);
		click(saveIdDocumentBtn);
		return this;
	}

	public DigitalVaultPage clickOnNotesIdDocuments() {
		click(notesIdDocument);
		return this;
		
	}

	public DigitalVaultPage validateNotesPopUpIdDocuments() {

		if(isDisplayed(notesPopUpTitle)) {
			Log.info("Validate the Notes Popup of ID Documents");
		}
		else
			Log.info("Not Validate the Notes Popup of ID Documents");
		
		return this;
		
	}

	public DigitalVaultPage enterNotesIdDocuments(String notes) {
		clear(notesTextareaIdDocuments);
		sendKeys(notesTextareaIdDocuments, notes);
		click(saveIdDocumentBtn);
		return this;
		
	}

	public DigitalVaultPage notesUpdateAlertIdDocuments() {
		if(isDisplayed(folderRenameAlert)) {
			Log.info("Validate the Notes update alert of ID Documents");
		}
		else
			Log.info("Not Validate the Notes update alert of ID Documents");
		
		return this;
		
	}

	public DigitalVaultPage clickShareIdDocuments() {
		click(shareIdDocuments);
		return this;
		
	}

	public DigitalVaultPage validateShareIdDocumentsTitle() {
		
		if(isDisplayed(shareIdocumentsTitle)) {
			Log.info("Validate Share popup ID Documents");
		}
		else
			Log.info("Not Validate the Share popup of ID Documents");
		
		return this;
		
		
	}

	public DigitalVaultPage chooseContactForIdDocuments() {
		click(shareIdDocumentsDropDown);
		click(shareIdDocumentsContact);
		return this;
		
		
	}

	public DigitalVaultPage checkUploadAndDownloadIdDocuments() {
		click(shareDownloadBoxIdDocuments);
		click(shareUploadBoxIdDocuments);
		return this;
		
		
	}

	public DigitalVaultPage clickShareBtnIdDocuments() {
		click(sharePopUpBtn);
		return this;
		
	}
	
	
}
