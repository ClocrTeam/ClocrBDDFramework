package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YopMailPage extends BasePage {

	public YopMailPage(WebDriver driver) {
		super(driver);
	}
	 @FindBy(xpath = "//div[contains(text(),'@yopmail.com')]")
	 private WebElement headerTxt;
	 
	 @FindBy(id = "refresh")
	 private WebElement refreshBtn;
	 
	 @FindBy(xpath = "//p[contains(text(),'Your one time password')]")
	 private WebElement otpNumber;
	 
	 public String GetOTP() {
		 waitForVisibility(refreshBtn);
		 System.out.println(getText(otpNumber));
		 return getText(otpNumber);
	 }
}
