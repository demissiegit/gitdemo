import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args) {
		//"C:\Users\Admin\workspace\WebDriverTest\config.properties"
		Properties prop = new Properties();
		InputStream input = ReadProperties.class.getClassLoader().getResourceAsStream("WebDriverTest/config.properties");

	}

}
