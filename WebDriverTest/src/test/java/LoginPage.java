import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginPage {

	@Test
	public static void testLogInPage() {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://aut.doitoncloud.com");
			

	}

}
