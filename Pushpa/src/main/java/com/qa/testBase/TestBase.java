package com.qa.testBase;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	@BeforeMethod()
	public void setup() throws InterruptedException
	{
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide browser names from chrome, firefox or edge");
		}
		driver.get("https://www.imdb.com/title/tt9389998/releaseinfo?ref_=tt_dt_rdat");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		Thread.sleep(3000);
		
		
		
		
		//String oldTab = driver.getWindowHandle();
	//	ArrayList tabs = new ArrayList (driver.getWindowHandles());
	//	System.out.println(tabs.size());
	}
	//public String oldTab;
	
	@AfterMethod
	public void tearUp() throws InterruptedException
	{
		Thread.sleep(3000);
		//driver.quit();
	}


}
