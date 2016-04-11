package pkgData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.screenShot.CaptureScreenShot;

public class SelectDropDown {
	
	@Test(dataProvider ="month", dataProviderClass = urlDataProvider.class)
	public void CreateFaceBookAccount(String user, String pass,String month) throws Exception{
		//initiate driver with firefox
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
	    //maximaize browser
		driver.manage().window().maximize();
		//wait for page load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//go to url
		driver.get("https://facebook.com");
		//find elements
		CaptureScreenShot shot = new CaptureScreenShot(driver);
		
		driver.findElement(By.id("u_0_1")).sendKeys(user);
		
		driver.findElement(By.id("u_0_3")).sendKeys(pass);
		
		driver.findElement(By.id("u_0_6")).sendKeys("7689067893");
		
		
		driver.findElement(By.id("u_0_9")).sendKeys("7689067893");
		
		driver.findElement(By.id("u_0_b")).sendKeys("passS12!Hbr");
		
		WebElement element = driver.findElement(By.id("month"));
		
		Select dropDown = new Select(element);
		
		dropDown.selectByVisibleText(month);
		shot.TakeAshot(driver, month);
		Thread.sleep(5000);
		
		//int listBoxSize = dropDown.getOptions().size();
		
		//dropDown.selectByIndex(listBoxSize-1);
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
