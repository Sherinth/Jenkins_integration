package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium_JEnkins_Integration {

	WebDriver driver;
	@BeforeMethod
	public void setUp(){
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium_libs\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  }
	
@Test
	public void test(){
		WebElement search_box = driver.findElement(By.name("q"));
		search_box.sendKeys("Tesela" + Keys.ENTER);
		Assert.assertTrue(driver.getTitle().contains("TESELA"));
	  }
	
	
	
@AfterMethod
	public void teardown(){
		driver.quit();
	  }
}



