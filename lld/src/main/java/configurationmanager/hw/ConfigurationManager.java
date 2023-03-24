package configurationmanager.hw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class ConfigurationManager {

	private Properties props;
	private static ConfigurationManager configurationManager;
	
	private ConfigurationManager() {
		props=new Properties();
	}
	
	 public static ConfigurationManager getInstance() {
		 if(configurationManager==null) {
			 configurationManager=new ConfigurationManager();
		 }		 
		 return configurationManager;
	 }
	
	void loadConfigurationFromFile(String filepath) throws IOException {
		InputStream fs=new FileInputStream(new File(filepath));
		props.load(fs);
	}
	
	String getSetting(String key) {
		return props.getProperty(key);
	}
	
	void setSetting(String key,String value) {
		props.setProperty(key, value);
	}
	
	void saveConfigurationToFile(String filePath) throws IOException {
		OutputStream fos=new FileOutputStream(filePath);
		props.store(fos, filePath);
	}
}
