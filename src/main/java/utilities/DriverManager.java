package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	private static ConfigFileReader configReader;
	public static WebDriver driver;

	@BeforeMethod
	public static void  setUp() {
		configReader = new ConfigFileReader();
		switch(configReader.getBrowserName()){
		case "chrome":
			WebDriverManager.chromedriver().cachePath("src/test/resources/drivers").setup(); 
			driver = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().cachePath("src/test/resources/drivers").setup();
			driver = new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().cachePath("src/test/resources/drivers").setup();
			driver = new FirefoxDriver();
			break;
		default:
			throw new IllegalStateException("Invalid browser name: " +configReader.getBrowserName());
		}
		driver.manage().window().maximize();
		driver.get(configReader.getApplicationUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@AfterMethod
	public static void tearDown() {
		driver.quit();
	}
}


