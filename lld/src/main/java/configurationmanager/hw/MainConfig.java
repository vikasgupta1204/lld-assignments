package configurationmanager.hw;

import java.io.IOException;

public class MainConfig {

	public static void main(String[] args) throws IOException {
		String path="E:\\java programming\\workspace java17\\lld\\src\\main\\java\\configurationmanager\\hw\\test.txt";
			ConfigurationManager cm=ConfigurationManager.getInstance();
			cm.setSetting("fname", "vikas");
			cm.setSetting("lname", "gupta");
			cm.setSetting("age", "28");
			cm.setSetting("organisation","Tata Consultancy Services");
			cm.saveConfigurationToFile(path);
			cm.loadConfigurationFromFile(path);
			String name=cm.getSetting("fname");
			System.out.println(name);
	}

}
