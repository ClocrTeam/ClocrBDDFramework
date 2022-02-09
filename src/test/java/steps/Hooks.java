package steps;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.DriverManager;

public class Hooks {

	@Before
	public static void initialize(){
		new DriverManager();
		DriverManager.setUp();
	}

	@After
	public static void captureScreenshot(Scenario scenario) throws IOException {

		if(scenario.isFailed()){
			try {
				String testName = scenario.getName();
				File source = ((TakesScreenshot) DriverManager.driver).getScreenshotAs(OutputType.FILE);
				File dest = new File("screenshots"+testName+getcurrentdateandtime()+".png");
				byte[] screenshot = ((TakesScreenshot) DriverManager.driver).getScreenshotAs(OutputType.BYTES);
				FileHandler.copy(source, dest);
				scenario.attach(screenshot, "image/png", testName+getcurrentdateandtime());
			}catch (WebDriverException e) {
				e.printStackTrace();
			}
			DriverManager.driver.quit();
		}else {
			DriverManager.driver.quit();
		}
	}

	private static String getcurrentdateandtime() {
		String str = null;
		try {
			DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy HH-mm-ss");
			Date date = new Date();
			str = dateFormat.format(date);
			str = str.replace(" ", "").replaceAll("/", "").replaceAll(":", "");
		} catch (Exception e) {
		}
		return str;
	}
}
