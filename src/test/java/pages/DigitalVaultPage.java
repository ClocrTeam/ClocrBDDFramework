package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
			log().info("Validate Digital Vault page header");
		}
		else {
			log().info("Not Validate Digital Vault page header");
			
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
			log().info("Validate the title of create folder");
		}
		else
			log().info("Not Validate the title of create folder");
		
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
			log().info("Validate the title of create folder");
		}
		else
			log().info("Not Validate the title of create folder");
		
	 return this;
	}

	public DigitalVaultPage clickOnEditFolderIcon() {
		clickByJavaScript(folderEditIcon);
		return this;
		
	}

	public DigitalVaultPage validateEditMenu() {
		if(isDisplayed(editMenu)) {
			log().info("Validate the title of create folder");
		}
		else
			log().info("Not Validate the title of create folder");
		
	 return this;
		
	}

	public DigitalVaultPage clickOnRenameLink() {
		click(editMenu);
		return this;
		
	}

	public  DigitalVaultPage validateRenamePopup() {
		
		if(isDisplayed(renameFolderPopupTitle)) {
			log().info("Validate the title of rename folder");
		}
		else
			log().info("Not Validate the title of rename folder");
		
	 return this;
		
	}

	public DigitalVaultPage renameFolder(String rename_folder) {
		sendKeys(renameFolderText, rename_folder + Integer.toString((int)(Math.random() * 100)));
		click(renameSaveBtn);
		return this;
		
	}

	public DigitalVaultPage validateRenameAlert() {
		
		if(isDisplayed(folderRenameAlert)) {
			log().info("Validate the alert rename folder");
		}
		else
			log().info("Not Validate the alert rename folder");
		
	 return this;
		
	}

	public DigitalVaultPage clickOnMyDocsIcon() {
		 click(myDocsIcon);
         return this;
		
	}

	public DigitalVaultPage validateMyDocsExpand() {

		if(isDisplayed(idDocumentsFolder)) {
			log().info("Validate the edit of ID Documents");
		}
		else
			log().info("Not Validate the edit of ID Documents");
		
          return this;
		
	}

	public DigitalVaultPage clickOnEditIdDocuments() {
		 click(idDocumentsEdit);
         return this;
		
	}

	public DigitalVaultPage validateIdDocumentsMenu() {
		
		if(isDisplayed(uploadToIdDocuments)) {
			log().info("Validate the upload option of ID Documents");
		}
		else
			log().info("Not Validate the upload option of ID Documents");
         return this;
		
	}

	public DigitalVaultPage clickOnUploadDocumentsOfIdDocuments() {
		 click(uploadToIdDocuments);
         return this;
		
	}

	public DigitalVaultPage validateAddDocumentsPopUpIdDocuments() {
		
		if(isDisplayed(uploadPopUpTitle)) {
			log().info("Validate the Add Document Popup of ID Documents");
		}
		else
			log().info("Not Validate the Add Document Popup of ID Documents");
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
			log().info("Validate the Notes Popup of ID Documents");
		}
		else
			log().info("Not Validate the Notes Popup of ID Documents");
		
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
			log().info("Validate the Notes update alert of ID Documents");
		}
		else
			log().info("Not Validate the Notes update alert of ID Documents");
		
		return this;
		
	}

	public DigitalVaultPage clickShareIdDocuments() {
		click(shareIdDocuments);
		return this;
		
	}
	
	
}
