package automationFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	public static Properties readConfigData() throws IOException {
		Properties prop = new Properties();
		InputStream input = null;
		
		input = new FileInputStream("config.properties");
	
		// load a properties file
		prop.load(input);
		return prop;
	}
}
