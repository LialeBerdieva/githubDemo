package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_demo {
	
	WebDriver driver = null;
	
@BeforeTest
public void setUpTest () {
	
	 System.setProperty("webdriver.chrome.driver", "C:\\data\\selenium\\driver\\chromedriver.exe");
	 driver = new ChromeDriver ();
   
}

@Test
public void googleSearch () {
	
	 // go to google.com
	 driver.get("https://www.google.com/");
	 
	 // search in search line
	 driver.findElement(By.name("q")).sendKeys("Enter something what you want to search");
	 
	 //click on search button
	 //driver.findElement(By.name("btnK")).click();
	 //driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	 driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).sendKeys(Keys.RETURN);
	 
}
@AfterTest
public void tearDown () {
	
//close browser
	 driver.close();
	 driver.quit();
	 System.out.println("Test completed successfully");
	 
	 
 }
 
 
}
