package configurationmanager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConfigurationManager {
	private static ConfigurationManager cm;
	private Properties properties;
	private ConfigurationManager() {
		properties=new Properties();
	}
	
	public static ConfigurationManager getInstance() {
		if(cm==null)cm=new ConfigurationManager();		
		return cm;
	} 
	
	public void loadConfigurationFromFile(String filePath) throws IOException {
		
		FileInputStream inputStream=new FileInputStream(filePath);
		properties.load(inputStream);
	}
	
	public String getSetting(String key) {
		return properties.getProperty(key);
	}
		
	public void setSetting(String key,String value) {
		properties.setProperty(key, value);
	}
	
	public void saveConfigurationToFile(String filePath) throws IOException {
		FileOutputStream outputStream=new FileOutputStream(filePath);
		properties.store(outputStream, null);
	}
}
