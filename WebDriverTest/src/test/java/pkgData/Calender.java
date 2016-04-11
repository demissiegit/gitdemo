package pkgData;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender {
	
     static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.tripadvisor.com/");		
		driver.findElement(By.xpath("//*[@id='rdoFlights']/span")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='metaFlightFrom']")).clear();
		driver.findElement(By.xpath("//input[@id='metaFlightFrom']")).sendKeys("MIA");
		driver.findElement(By.id("metaFlightTo")).clear();
		driver.findElement(By.id("metaFlightTo")).sendKeys("MSP");
		driver.findElement(By.xpath("//*[@id='checkIn']")).click();
		//driver.findElement(By.id("fadults")).click();
		Select select = new Select(driver.findElement(By.id("fadults")));
		select.selectByVisibleText("4 travelers");
		//driver.findElement(By.cssSelector("option[value=\"4\"]")).click();
		
		List<WebElement> elements=driver.findElements(By.xpath("//div[@class='calendar']/div[@class='month']/table/thead/tr/th[@class ='caption']"));
		for(WebElement  e:elements)
		System.out.println(e.getText());
		List<WebElement> days= driver.findElements(By.xpath("//div[@class='calendar']/div[@class='month']/table/tbody/tr/td"));
		int count =  driver.findElements(By.xpath("//div[@class='calendar']/div[@class='month']/table/tbody/tr/td")).size();
		System.out.println(count);
		for(WebElement d:days){
			String x = d.getText();
			if (x.equals("12")){				
			//System.out.println(x);
			d.click();
			break;
			}
		
		}
		driver.findElement(By.id("checkOut")).click();	
		driver.findElement(By.xpath(".//*[@id='overlayInnerDiv']/div/div[1]/span[2]/a")).click();
		//driver.findElement(By.xpath(".//*[@id='overlayInnerDiv']/div/div[3]/table/tbody/tr[3]/td[6]/a")).click();
		List<WebElement> returnDate=driver.findElements(By.xpath("//div[@class = 'calendar']/div[@class='month'][2]/table/tbody[1]/tr/td"));
		int CalCount = returnDate.size();
		for(WebElement r:returnDate){
			String x = r.getText();
			if (x.equals("17")){				
			//System.out.println(x);
			r.click();
			break;
			}
		
		}
		driver.findElement(By.xpath("//button[@id='SUBMIT_VRS']")).click();
		Thread.sleep(9000);
		String FromCity = driver.findElement(By.id("fromTxt1")).getText();
		System.out.println(FromCity);
        
	}

}
