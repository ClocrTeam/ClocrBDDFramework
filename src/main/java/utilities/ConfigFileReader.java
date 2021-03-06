package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath= "src\\main\\resources\\config.properties";

	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}

	public String getDriverPath(){
		String driverPath = properties.getProperty("driverPath");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("Driver Path not specified in the Config.properties file for the Key:driverPath");		
	}

	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("Application Url not specified in the Config.properties file for the Key:url");
	}
	public String getBrowserName(){
		String driverPath = properties.getProperty("browserName");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("Browser name is not specified in the Config.properties file for the Key:browserName");		
	}
	
	public String getEcardPromocodeUrl() {
		String ecardPromocodeUrl = properties.getProperty("ecardPromocodeUrl");
		if(ecardPromocodeUrl != null) return ecardPromocodeUrl;
		else throw new RuntimeException("EcardPromocode Url not specified in the Config.properties file for the Key:ecardPromocodeUrl");
	}
	
}
