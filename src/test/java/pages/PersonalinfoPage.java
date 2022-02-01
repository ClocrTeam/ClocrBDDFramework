package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalinfoPage extends BasePage {

	public PersonalinfoPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='title']")
	private WebElement pageHeader;
	
	
	public PersonalinfoPage validatePageHeader() {
		if(isDisplayed(pageHeader)) {
			log().info("Page header {pageHeader} is validated");
		}else {
			log().info("Page header {pageHeader} is not displayed");
		}
		return this;
	}

}
