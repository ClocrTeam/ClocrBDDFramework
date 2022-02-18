package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.Log;

public class MyContactsPage extends BasePage {

	private WebDriver driver;
	public MyContactsPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//div[contains(text(),'Contacts')]")
	private WebElement pageHeader;
	
	@FindBy(tagName = "title")
	private WebElement pageTitle;
	
	@FindBy(xpath = "//span[contains(text(),' My Contacts ')]")
	WebElement myContactsMenu;
	
	@FindBy(xpath = "//h5[contains(text(),'Check Nominee')]")
	WebElement contactCheckNominee;
	
	@FindBy(xpath = "//span[contains(@title,'check.nominee@yopmail.com')]//following::div[2]//clocr-icon[contains(@icon,'delete')]")
	private WebElement deleteCheckNominee;
	
	@FindBy(xpath ="//button[contains(text(),'YES')]")
	private WebElement yesDeleteContactButton;
	
	public String GetHeaderText() {
		return getText(pageHeader);
	}
	public String GetPageTitle() {
		return getText(pageTitle);
	}
	
	public MyContactsPage clickOnMyContactsMenu()
	{
		click(myContactsMenu);
		return this;
	}
	
	public MyContactsPage validateContactsPageHeader()
	{
		if(isDisplayed(myContactsMenu))
		{
			Log.info("Redirects to 'Contacts' page successfully");
		}
		else
		{
			Log.error("Wrong page redirection.\n");
		}

		return this;
	}
	
	public MyContactsPage validateContactAdded()
	{
		if(contactCheckNominee.isDisplayed())
		{
			Log.info("Contact is added");
			
			click(deleteCheckNominee);
		}
		return this;
	}
	
	public MyContactsPage deleteContactIfAdded()
	{
		try
		{
			if(isDisplayed(contactCheckNominee))
			{
				click(deleteCheckNominee);
				
				click(yesDeleteContactButton);
			}
		}catch(Exception e) {}
		
		
		return this;
	}
}
