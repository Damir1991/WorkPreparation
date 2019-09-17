package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public static void SetUp() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","src\\test\\resourses\\Drivers\\chromedriver.exe");
	
	driver=new ChromeDriver(); //indirect object
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	
}
	
	public void CloseBrowser() {
		driver.quit();
	}
}