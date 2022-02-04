package pages;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{

	private WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "email")
	private WebElement usernameTxt;

	@FindBy(xpath = "//a[contains(text(),'Sign up')]")
	private WebElement signup;
	
	@FindBy(id = "login")
	private WebElement yopMail;
	
	@FindBy(xpath = "//button[contains(text(),'Proceed')]")
	private WebElement proceedBtn;
	
	@FindBy(xpath="//button[@class='md']")
	private WebElement submit;

	@FindBy(name = "password")
	private WebElement passwordBtn;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	private WebElement loginBtn;

	@FindBy(xpath = "//form[contains(@class,'otp')]")
	private WebElement otpForm;

	public LoginPage enterUserName(String username) throws InterruptedException{
		sendKeys(usernameTxt, username);
		return this;
	}

	public LoginPage clickProceed() {
		click(proceedBtn);
		return this;
	}
	
	public LoginPage enterPassword(String password) throws Exception {
		Thread.sleep(3000);
		sendKeys(passwordBtn, password);
		return this;
	}

	public LoginPage enterOTP() {
		sendKeys(yopMail, "pankaj.clocr@yopmail.com");
		click(submit);
		log().info("Emergency card is created successfully");
		String otpNumber = new YopMailPage(driver).GetOTP();
		switchToPreviousTab();
		if(otpNumber!=null) {
			sendKeys(otpForm, otpNumber);
		}
		return this;
	}
	
	public DashboardPage pressLoginBtn() {
		click(loginBtn);
		log().info("Emergency card is created successfully");
		return new DashboardPage(driver);
	}

}
