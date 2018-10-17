package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class TestBase {
	
	public static WebDriver driver = null;
	
	@BeforeSuite
	public void initialize()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khushboogupta\\Desktop\\SELENIUM JARS\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://saffiredev.devserver.ws/");
	}
	
	@AfterSuite
	public void TeardownTest()
	{
		TestBase.driver.quit();
	}
	
  
}
