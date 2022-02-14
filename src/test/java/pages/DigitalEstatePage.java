package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Log;

public class DigitalEstatePage extends BasePage {
private WebDriver driver;
	public DigitalEstatePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//span[@class='ng-star-inserted']")
	private WebElement pageHeader;
	
	@FindBy(tagName = "title")
	private WebElement pageTitle;
	
	@FindBy(xpath = "//span[normalize-space()='Dashboard']")
	private WebElement dashboard;
	
    @FindBy(xpath = "//span[normalize-space()='Digital Estate']")
    private WebElement DigitalEstate;
	
	@FindBy(xpath = "//a[@class='mt-1 text-danger left-bar c-pointer newAcc']")
	private WebElement newAccount;
	
	@FindBy(xpath = "//h5[@class='ng-star-inserted']")
	private WebElement createAccountTitle;
	
	@FindBy(xpath = "//input[@formcontrolname='asset_title']")
	private WebElement accountNameText;
	
	@FindBy(xpath = "//input[@formcontrolname='asset_account_num']")
	private WebElement accountUserIdText;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordText;
	
	@FindBy(xpath = "//input[@formcontrolname='asset_url']")
	private WebElement urlText;
	
	@FindBy(xpath = "//textarea[@type='text']")
	private WebElement notesText;
	
	@FindBy(xpath = "//button[normalize-space()='Create']")
	private WebElement createbtn;
	
//	@FindBy(xpath = "//div[contains(text(), 'Account created successfully']")
//	private WebElement accountCreatedAlert;
//	
//	@FindBy(xpath = "//button[@class='btn bg-transparent border-0']")
//	private WebElement menubtn;
//	
//	@FindBy(xpath = "//span[normalize-space()='Edit']")
//	private WebElement edit;
//	
//	@FindBy(xpath = "//h5[@class='ng-star-inserted']")
//	private WebElement editAccountTitle;
//	
//	@FindBy(xpath = "//button[normalize-space()='Update']")
//	private WebElement updatebtn;
	
	@FindBy(xpath = "//a[@class='mt-1 text-danger left-bar c-pointer espCheckList']")
	private WebElement accountsWizard;
	
	@FindBy(xpath = "//h5[@class='ml-2 pt-2']")
	private WebElement checkListTitle;
	
	@FindBy(xpath = "//p[normalize-space()='Travel']")
    private WebElement Travel;
	
//	@FindBy(xpath = "//span[@class='p-checkbox-icon pi pi-check']")
//	private WebElement checkbox;
	
	@FindBy(xpath = "//button[text()='Save']")
    private WebElement savebtn;
	
	public String getCreateAccountTitleText() {
		return getText(createAccountTitle);
	}
	
	public String GetHeaderText() {
		return getText(pageHeader);
	}
	public String GetPageTitle() {
		return getText(pageTitle);
	}
public DigitalEstatePage validateHeader() {
		
		if(isDisplayed(pageHeader)) {
			Log.info("Validate Digital Estate page header");
		}
		else {
			Log.info("Not Validate Digital Estate page header");
			
		}
		
		return this;
		
	}
	
	public DashboardPage clickDashboard() {
		click(dashboard);
		return new DashboardPage(driver);
	}
	
	public DigitalEstatePage clickDigitalEstate() {
		click(DigitalEstate);
		return new DigitalEstatePage(driver);
	}
	
	
	public DigitalEstatePage clickNewAccount() {
		click(newAccount);
		return this;
		
	}
	public DigitalEstatePage validateCreateAccountPage() {
		
		if(isDisplayed(createAccountTitle)) {
			Log.info("Validate the title of new account");
		}
		else
			Log.info("Not Validate the title of new account");
		
	 return this;
	}
//   public DigitalEstatePage validateAccountCreatedAlert() {
//		
//		if(isDisplayed(accountCreatedAlert)) {
//			log().info("Validate the title of create account");
//		}
//		else
//			log().info("Not Validate the title of create account");
//		
//	 return this;
//	}
//   public DigitalEstatePage validateEditAccount() {
//		
//		if(isDisplayed(editAccountTitle)) {
//			log().info("Validate the title of edit account");
//		}
//		else
//			log().info("Not Validate the title of edit account");
//		
//	 return this;
//	}
	
    

	public DigitalEstatePage enterAccountName(String account_name) {
		sendKeys(accountNameText, account_name + Integer.toString((int)(Math.random() * 100)));
		return this;
		
	}
	public DigitalEstatePage enterAccountUserId(String account_user_id) {
		sendKeys(accountUserIdText, account_user_id + Integer.toString((int)(Math.random() * 100)));
		return this;
		
	}
	public DigitalEstatePage enterPassword(String password) {
		sendKeys(passwordText, password + Integer.toString((int)(Math.random() * 100)));
		return this;
		
	}
	
	public DigitalEstatePage enterUrl(String url) {
		sendKeys(urlText, url + Integer.toString((int)(Math.random() * 100)));
		return this;
		
	}
	public DigitalEstatePage enterNotes(String notes) {
		sendKeys(notesText, notes + Integer.toString((int)(Math.random() * 100)));
		return this;
		
	}

	public DigitalEstatePage clickCreate() {
		click(createbtn);
		return new DigitalEstatePage(driver);
	}
	
//	public DigitalEstatePage clickMenubtn() {
//		click(menubtn);
//		return new DigitalEstatePage(driver);
//	}
//	
//	public DigitalEstatePage clickEdit() {
//		click(edit);
//		return new DigitalEstatePage(driver);
//	}
//	
//	public DigitalEstatePage clickUpdate() {
//		click(updatebtn);
//		return new DigitalEstatePage(driver);
//	}

	public DigitalEstatePage clickAccountsWizard() {
		click(accountsWizard);
		return this;
		
	}

     public DigitalEstatePage validateCheckListPage() {
		
		if(isDisplayed(checkListTitle)) {
			Log.info("Validate the title of check list");
		}
		else
			Log.info("Not Validate the title of check list");
		
	 return this;
	}
//     private Object log() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public DigitalEstatePage clickTravel() {
 		click(Travel);
 		return new DigitalEstatePage(driver);
 	}
//     public DigitalEstatePage chooseCheckbox() {
// 		click(checkbox);
// 		return this;
// 		
// 	}
     
     public DigitalEstatePage clickSavebtn() {
 		click(savebtn);
 		return new DigitalEstatePage(driver);
 	}

	
	
}
