package pkgListenersTesrNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(pkgListenersTesrNG.TestNGLisstnersDemo.class)
public class ListenersTestCases {

	
	@Test
	  public void GoogleTitleVerify(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		  
	  }
	
	public void dummyTest(){
		System.out.println("This dummy Test");
		Assert.assertTrue(false);
	}
	
	
}
